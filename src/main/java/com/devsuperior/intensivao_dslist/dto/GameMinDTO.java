package com.devsuperior.intensivao_dslist.dto;

import com.devsuperior.intensivao_dslist.entities.Game;
import com.devsuperior.intensivao_dslist.projections.GameMinProjection;
import org.jetbrains.annotations.NotNull;

public class GameMinDTO {

  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO() {
  }

  public GameMinDTO(@NotNull Game entity) {
    id = entity.getId();
    title = entity.getTitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    shortDescription = entity.getShortDescription();
  }
  
  public GameMinDTO(@NotNull GameMinProjection projection) {
    id = projection.getId();
    title = projection.getTitle();
    year = projection.getYear();
    imgUrl = projection.getImgUrl();
    shortDescription = projection.getShortDescription();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }
}
