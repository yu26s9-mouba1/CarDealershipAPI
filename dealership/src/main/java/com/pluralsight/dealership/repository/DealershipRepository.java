package com.pluralsight.dealership.repository;

import com.pluralsight.dealership.model.Dealership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DealershipRepository extends JpaRepository<Dealership, Long> {

}
