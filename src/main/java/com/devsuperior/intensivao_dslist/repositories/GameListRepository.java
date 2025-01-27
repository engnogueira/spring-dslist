package com.devsuperior.intensivao_dslist.repositories;

import com.devsuperior.intensivao_dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
  
}
