package com.aiproject.menu.domain.menu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int ranking;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 50, nullable = false)
    private String singer;

    @Column(length = 50, nullable = false)
    private String album;


@Builder
    public Menu(int ranking, String title, String singer, String album) {
    this.ranking = ranking;
    this.title = title;
    this.singer = singer;
    this.album = album;
    }

    public void update(int ranking, String title, String singer, String album) {
    this.ranking = ranking;
    this.title = title;
    this.singer = singer;
    this.album = album;
    }
}
