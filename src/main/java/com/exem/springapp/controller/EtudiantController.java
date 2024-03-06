package com.exem.springapp.controller;

import com.exem.springapp.entities.Etudiant;
import com.exem.springapp.service.EtudiantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/etudiant")
@Slf4j
public class EtudiantController {
   private  final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping("/create")
    @PreAuthorize("hasRole('client_admin')")
   public Etudiant create(@RequestBody Etudiant etudiant){
        LocalDateTime localDateTime= LocalDateTime.now();
        log.info("Welcome created method" + localDateTime);
       return etudiantService.creer(etudiant);
   }
   @GetMapping("/read")

   public List<Etudiant> read(){
       LocalDateTime localDateTime= LocalDateTime.now();
       log.info("Welcome created method" + localDateTime);
        return etudiantService.lire();
   }
   @PutMapping("/update/{id}")
   public Etudiant update(Long id, Etudiant etudiant){
       return  etudiantService.modifier(id,etudiant);
   }
   @DeleteMapping("/delete")
   public String delete(@PathVariable Long id){
       return  etudiantService.supprimer(id);
   }

}
