package com.SpringDataJPAMappings.JpaMappings.repository;


import com.SpringDataJPAMappings.JpaMappings.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface playerRepo extends JpaRepository<Player,Long> {


}
