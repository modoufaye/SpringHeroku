package org.sid2.springheroku.web;

import org.sid2.springheroku.dao.EtudiantRepository;
import org.sid2.springheroku.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EtudiantController {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @GetMapping(value="/listEtudiant")
    public String index(Model model) {
        List<Etudiant> tab = etudiantRepository.findAll();
        model.addAttribute("list", tab);
        return "listEtudiant";
    }
}
