package com.example.FootballSelfManage.FootballSelfManage.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Long id;
    @Column(name = "name_team")
    private String nameTeam;
    @Column(name = "nbr_players")
    private int nbrPlayers;
    @ManyToMany
    @JoinColumn(name = "play_id")
    private Long idPlay;
    @ManyToMany
    @JoinColumn(name = "player_id")
    private Long idPlayer;
}
