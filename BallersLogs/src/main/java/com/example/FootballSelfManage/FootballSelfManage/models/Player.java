package com.example.FootballSelfManage.FootballSelfManage.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;
    @Column(name = "position")
    private String position;
    @Column(name = "nbr_but")
    private int nbrBut;
    @Column(name = "nbr_assist")
    private int nbrAssist;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Long idTeam;
    //@ManyToMany
    //@JoinColumn(name = "play_id")
    //private Long idPlay;
}
