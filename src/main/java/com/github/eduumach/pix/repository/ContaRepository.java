package com.github.eduumach.pix.repository;

import com.github.eduumach.pix.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    Conta findByConta(String conta);
    Conta findByAgencia(String agencia);
}
