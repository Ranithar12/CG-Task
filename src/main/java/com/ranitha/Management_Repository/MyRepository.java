package com.ranitha.Management_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranitha.Management_DTO.Management;

public interface MyRepository extends JpaRepository<Management, Long> {

}
