package tn.esprit.kharroubihazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.kharroubihazem.entities.Plat;

import java.util.List;

public interface PlatRepository extends JpaRepository<Plat, Integer> {
    @Query("SELECT p  FROM Plat p join p.client c where c.nom=: nom and c.prenom=: prenom ")
    List<Plat> findAllBy_Nom_Prenom(@Param("nom")String nom,@Param("prenom") String prenom );




}