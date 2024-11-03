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
@Table(name = "studentTable")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String studentFullName;


    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private laptop laptop;

}
