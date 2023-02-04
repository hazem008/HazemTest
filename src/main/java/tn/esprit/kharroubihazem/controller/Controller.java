package tn.esprit.kharroubihazem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.kharroubihazem.entities.*;
import tn.esprit.kharroubihazem.services.IService;

import java.util.List;

@RestController
@RequestMapping("Traiteur")
public class Controller {

    @Autowired
    private IService iService;

    @PostMapping("ajouterClient")
    public Client ajouterClient(@RequestBody Client client) {
        return iService.ajouterClient(client);
    }

    @PostMapping("ajouterCuisinier")
    public void ajouterCuisinier(@RequestBody Cuisinier cuisinier) {
        iService.ajouterCuisinier(cuisinier);
    }

    @PostMapping("ajouterPlatAffecterClientEtCuisinier/{idClient}/{idCuisinier}")
    public void ajouterPlatAffecterClientEtCuisinier(@RequestBody Plat plat,@PathVariable("idClient") Integer idClient,@PathVariable("idCuisinier") Integer idCuisinier) {
        iService.ajouterPlatAffecterClientEtCuisinier(plat, idClient, idCuisinier);
    }

    @GetMapping("AfficherListePlatsParClient/{nom}/{prenom}")
    public List<Plat> AfficherListePlatsParClient(@PathVariable("nom") String nom,@PathVariable("prenom") String prenom) {
        return iService.AfficherListePlatsParClient(nom, prenom);
    }
}

