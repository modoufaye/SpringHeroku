package org.sid2.springheroku;

import org.sid2.springheroku.dao.EtudiantRepository;
import org.sid2.springheroku.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringHerokuApplication implements CommandLineRunner {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringHerokuApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        etudiantRepository.save(new Etudiant("Mor", "Seck"));
        etudiantRepository.save(new Etudiant("Abdou", "faye"));
        etudiantRepository.save(new Etudiant("Soda", "Diatta"));
        etudiantRepository.save(new Etudiant("Rama", "Diop"));

    }
}
