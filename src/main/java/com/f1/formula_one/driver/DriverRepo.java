// Program: DriverRepo.java
// Author: T-Kalv
// Module:
// Email:
// Student Number:
// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// About:

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Requirements

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Code
package com.f1.formula_one.driver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer>
{
    void deleteByDriverId(Integer driverId);
    Optional<Driver> findById(Integer integer);
}


