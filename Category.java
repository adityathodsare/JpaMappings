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
@Table(name = "categoryTable")
public class Category {

    @Id
    private String CategoryId;
    private String categoryTitle;



}
