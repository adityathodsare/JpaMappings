package com.SpringDataJPAMappings.JpaMappings.repository;

import com.SpringDataJPAMappings.JpaMappings.entity.Player;
import com.SpringDataJPAMappings.JpaMappings.entity.PlayerRecords;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PlayerRecordsRepositoryTest {

    @Autowired
    PlayerRecordsRepository playerRecordsRepository;


    @Test
    public void ManyToOneMap(){
        Player player= Player.builder()
                .playerName("virat")
                .build();

       PlayerRecords playerRecords =PlayerRecords.builder()
                .recordTitle("centuries most")
                .player(player)
                .build();

        PlayerRecords playerRecords1=PlayerRecords.builder()
                .recordTitle("run machine")
                .player(player)
                .build();
        playerRecordsRepository.saveAll(List.of(playerRecords1,playerRecords));

    }
  
}