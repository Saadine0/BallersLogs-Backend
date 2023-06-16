package com.example.FootballSelfManage.FootballSelfManage.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Play")
public class Play {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "play_id")
    private Long id;
    @Column(name = "date_play")
    private Date Date;
    @Column(name = "name_adver")
    private String nameAdver;
    //@ManyToMany
    //@JoinColumn(name = "player_id")
    //private Long idPlayer;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private Long idTeam;
}
