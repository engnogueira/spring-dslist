package com.devsuperior.intensivao_dslist.dto;

import com.devsuperior.intensivao_dslist.entities.GameList;

public class GameListDTO {
  
  private Long id;
  private String name;
  
  public GameListDTO() {
  }
  
  public GameListDTO(GameList entity) {
    id = entity.getId();
    name = entity.getName();
  }
  
  public Long getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
}
