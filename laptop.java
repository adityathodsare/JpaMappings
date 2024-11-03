package com.SpringDataJPAMappings.JpaMappings.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "laptopTable")
public class laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long laptopId;
    private String laptopBrand;


    @OneToOne
    @JoinColumn(name = "studentId")
    private student student;


}
