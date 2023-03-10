package fr.wcs.harrypotterjpahibernate.controller;

import fr.wcs.harrypotterjpahibernate.entity.Wizard;
import fr.wcs.harrypotterjpahibernate.repository.WizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class WizardController {

    @Autowired
    private WizardRepository wizardRepository;

    @GetMapping("/wizard")
    public String getWizard(Model model,
                            @RequestParam(required = false) Long id) {

        Wizard wizard = new Wizard();
        if (id != null) {
            Optional<Wizard> optionalWizard = wizardRepository.findById(id);
            if (optionalWizard.isPresent()) {
                wizard = optionalWizard.get();
            }
        }
        model.addAttribute("wizard", wizard);

        return "wizard";
    }

    @GetMapping("/wizards")
    public String getAll(Model model) {

        model.addAttribute("wizards", wizardRepository.findAll());

        return "wizards";
    }

    @PostMapping("/wizard")
    public String postWizard(@ModelAttribute Wizard wizard) {

        wizardRepository.save(wizard);
        return "redirect:/wizards";
    }

    @GetMapping("/wizard/delete")
    public String deleteWizard(@RequestParam Long id) {

        wizardRepository.deleteById(id);

        return "redirect:/wizards";
    }

}
