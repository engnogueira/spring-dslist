package com.devsuperior.intensivao_dslist.controllers;

import com.devsuperior.intensivao_dslist.dto.GameDTO;
import com.devsuperior.intensivao_dslist.dto.GameListDTO;
import com.devsuperior.intensivao_dslist.dto.GameMinDTO;
import com.devsuperior.intensivao_dslist.services.GameListService;
import com.devsuperior.intensivao_dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  
  @Autowired
  private GameListService gameListService;
  
  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListService.findAll();
    return result;
  }
  
//  @GetMapping(value ="/{id}")
//  public GameDTO findById(@PathVariable Long id) {
//    GameDTO result = gameService.findById(id);
//    return result;
//  }
}
