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
@Table(name = "recordsTable")
public class PlayerRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordNo;
    private String recordTitle;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "jerseyNo",
            referencedColumnName = "jerseyNo"
    )
    private Player player;

}
