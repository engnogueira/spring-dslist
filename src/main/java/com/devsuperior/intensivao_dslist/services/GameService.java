package com.devsuperior.intensivao_dslist.services;

import com.devsuperior.intensivao_dslist.dto.GameMinDTO;
import com.devsuperior.intensivao_dslist.entities.Game;
import com.devsuperior.intensivao_dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
  
  @Autowired
  private GameRepository gameRepository;
  
  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
