package tn.esprit.kharroubihazem.services;

import tn.esprit.kharroubihazem.entities.*;

import java.io.Serializable;
import java.util.List;

public interface IService extends Serializable {

    public Client ajouterClient(Client client);
    public void ajouterCuisinier(Cuisinier cuisinier);

    public  void ajouterPlatAffecterClientEtCuisinier(Plat plat, Integer idClient, Integer idCuisinier);

    List<Plat> AfficherListePlatsParClient(String nom, String prenom);

    public float MontantApayerParClient(Integer idClient);


}
