package tn.esprit.kharroubihazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.kharroubihazem.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}