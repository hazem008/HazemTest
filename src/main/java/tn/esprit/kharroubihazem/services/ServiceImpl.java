package tn.esprit.kharroubihazem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.kharroubihazem.entities.Client;
import tn.esprit.kharroubihazem.entities.Cuisinier;
import tn.esprit.kharroubihazem.entities.Plat;
import tn.esprit.kharroubihazem.repositories.ClientRepository;
import tn.esprit.kharroubihazem.repositories.CuisinierRepository;
import tn.esprit.kharroubihazem.repositories.PlatRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceImpl implements IService{

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PlatRepository platRepository;
    @Autowired
    private CuisinierRepository cuisinierRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void ajouterCuisinier(Cuisinier cuisinier) {
        cuisinierRepository.save(cuisinier);
    }

    @Override
    @Transactional
    public void ajouterPlatAffecterClientEtCuisinier(Plat plat, Integer idClient, Integer idCuisinier) {
        Client client = clientRepository.findById(idClient).get();
        Cuisinier cuisinier = cuisinierRepository.findById(idCuisinier).get();

        List <Plat> plats = new ArrayList<>();
        for (Plat plat1: plats) {
            plat1.setClient(client);
            plat1.getCuisiniers().add(cuisinier);
            plats.add(plat1);
            platRepository.save(plat1);
        }
        platRepository.saveAll(plats);



    }

    @Override
    public List<Plat> AfficherListePlatsParClient(String nom, String prenom) {
        return platRepository.findAllBy_Nom_Prenom(nom,prenom);
    }

    @Override
    public float MontantApayerParClient(Integer idClient) {
        Client client = clientRepository.findById(idClient).get();

        List<Plat> plats = platRepository.findAll();
        float Montant = 0;
        for (Plat pl: plats) {

        }
        return 0;
    }
}
