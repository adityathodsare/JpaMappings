package com.SpringDataJPAMappings.JpaMappings.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jerseyNo;
    private String playerName;



//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "jerseyNo", referencedColumnName = "jerseyNo")
//    public List<PlayerRecords> playerRecordsListList ;


}
