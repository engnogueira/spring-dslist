package com.devsuperior.intensivao_dslist.controllers;

import com.devsuperior.intensivao_dslist.dto.GameDTO;
import com.devsuperior.intensivao_dslist.dto.GameListDTO;
import com.devsuperior.intensivao_dslist.dto.GameMinDTO;
import com.devsuperior.intensivao_dslist.dto.ReplacementDTO;
import com.devsuperior.intensivao_dslist.services.GameListService;
import com.devsuperior.intensivao_dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  
  @Autowired
  private GameListService gameListService;
  
  @Autowired
  private GameService gameService;
  
  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListService.findAll();
    return result;
  }
  
  @GetMapping(value ="/{id}/games")
  public List<GameMinDTO> findByGameList(@PathVariable Long id) {
    List<GameMinDTO> result = gameService.findByGameList(id);
    return result;
  }
  
  @PostMapping(value ="/{listId}/replacement")
  public void move(@PathVariable Long listId,@RequestBody ReplacementDTO body) {
    gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
  
  }
}
