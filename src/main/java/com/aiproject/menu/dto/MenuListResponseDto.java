package com.aiproject.menu.dto;

import com.aiproject.menu.domain.menu.Menu;

import lombok.Getter;

@Getter
public class MenuListResponseDto {
    private Long id;
    private int ranking;
    private String title;
    private String singer;
    private String album;

    public MenuListResponseDto(Menu entity) {
        this.id = entity.getId();
        this.ranking = entity.getRanking();
        this.title = entity.getTitle();
        this.singer = entity.getSinger();
        this.album = entity.getAlbum();

    }
}
