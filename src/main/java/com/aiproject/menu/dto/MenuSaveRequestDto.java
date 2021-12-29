package com.aiproject.menu.dto;

import com.aiproject.menu.domain.menu.Menu;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MenuSaveRequestDto {
    private int ranking;
    private String title;
    private String singer;
    private String album;

    @Builder
    public MenuSaveRequestDto(int ranking, String title, String singer, String album) {
        this.ranking = ranking;
        this.title = title;
        this.singer = singer;
        this.album = album;
    }

    public Menu toEntity() {
        return Menu.builder()
            .ranking(ranking)
            .title(title)
            .singer(singer)
            .album(album)
            .build();
    }
}
