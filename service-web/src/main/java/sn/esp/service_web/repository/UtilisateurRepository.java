package sn.esp.service_web.repository;


import sn.esp.service_web.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> 
{
    Optional<Utilisateur> findByEmail(String email);
}

