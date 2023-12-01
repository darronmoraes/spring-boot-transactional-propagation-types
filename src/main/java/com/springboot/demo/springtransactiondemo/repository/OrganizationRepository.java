package com.springboot.demo.springtransactiondemo.repository;

import com.springboot.demo.springtransactiondemo.models.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {

}
