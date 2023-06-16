package com.example.FootballSelfManage.FootballSelfManage.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="Stadium")
public class Stadium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stadium_id")
    private Long id;
    @Column(name = "name_stadium")
    private String nameStadium;
    @Column(name = "type_stadium")
    private String type;
    @ManyToMany
    @JoinColumn(name = "play_id")
    private Long idPlay;
}
