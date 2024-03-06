package com.exem.springapp.service;

import com.exem.springapp.entities.Etudiant;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
public interface EtudiantService {
    Etudiant creer(@RequestBody Etudiant etudiant);
    List<Etudiant> lire();
    Etudiant modifier(Long id, Etudiant etudiant);
    String supprimer(Long id);
}
