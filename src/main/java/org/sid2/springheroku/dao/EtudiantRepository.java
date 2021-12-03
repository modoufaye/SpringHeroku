package org.sid2.springheroku.dao;

import org.sid2.springheroku.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
