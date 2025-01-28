package com.devsuperior.intensivao_dslist.services;

import com.devsuperior.intensivao_dslist.dto.GameDTO;
import com.devsuperior.intensivao_dslist.dto.GameListDTO;
import com.devsuperior.intensivao_dslist.entities.Game;
import com.devsuperior.intensivao_dslist.entities.GameList;
import com.devsuperior.intensivao_dslist.repositories.GameListRepository;
import com.devsuperior.intensivao_dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
  
  @Autowired
  private GameListRepository gameListRepository;
  
  @Autowired
  private GameRepository gameRepository;
  
  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).orElseThrow();
    return new GameDTO(result);
  }
  
  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
    return dto;
  }
}
