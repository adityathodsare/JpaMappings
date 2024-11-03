package com.SpringDataJPAMappings.JpaMappings.repository;

import com.SpringDataJPAMappings.JpaMappings.entity.laptop;
import com.SpringDataJPAMappings.JpaMappings.entity.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class studentRepoTest {

    @Autowired
    studentRepo studentRepo;

    @Test
    public void AddDetails(){

        laptop laptop1 = laptop.builder()
                .laptopBrand("REALME")
                .build();

        student student1 = student.builder()
                .studentFullName("rohit gurunath sharma")
                .build();

        student1.setLaptop(laptop1);
        laptop1.setStudent(student1);
        studentRepo.save(student1);
    }

}