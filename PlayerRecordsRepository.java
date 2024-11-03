package com.SpringDataJPAMappings.JpaMappings.repository;

import com.SpringDataJPAMappings.JpaMappings.entity.PlayerRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRecordsRepository extends JpaRepository<PlayerRecords,Long> {

}
