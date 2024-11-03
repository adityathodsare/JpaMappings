package com.SpringDataJPAMappings.JpaMappings.repository;


import com.SpringDataJPAMappings.JpaMappings.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepo extends JpaRepository<student,Long> {


}
