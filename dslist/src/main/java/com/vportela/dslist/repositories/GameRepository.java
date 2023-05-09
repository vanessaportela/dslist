package com.vportela.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vportela.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
