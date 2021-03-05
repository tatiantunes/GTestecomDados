package com.Testecomdados.Unit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Testecomdados.Unit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

	}

