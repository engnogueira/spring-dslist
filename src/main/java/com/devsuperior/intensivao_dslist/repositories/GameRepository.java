package com.devsuperior.intensivao_dslist.repositories;

import com.devsuperior.intensivao_dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
