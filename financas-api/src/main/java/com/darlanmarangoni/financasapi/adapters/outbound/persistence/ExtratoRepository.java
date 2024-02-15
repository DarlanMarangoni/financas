package com.darlanmarangoni.financasapi.adapters.outbound.persistence;

import com.darlanmarangoni.financasapi.adapters.outbound.persistence.entities.Extrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtratoRepository extends JpaRepository<Extrato, Long> { }
