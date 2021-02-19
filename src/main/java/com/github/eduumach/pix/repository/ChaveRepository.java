package com.github.eduumach.pix.repository;

import com.github.eduumach.pix.model.Chave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaveRepository extends JpaRepository<Chave, Long> {

    Chave findByChave(String chave);
}
