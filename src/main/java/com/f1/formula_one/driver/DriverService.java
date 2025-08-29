// Program: DriverService.java
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

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class DriverService
{
    private final DriverRepo driverRepo;
    @Autowired
    public DriverService(DriverRepo driverRepo)
    {
        this.driverRepo = driverRepo;
    }

    public List<Driver> getDrivers()
    {
        return driverRepo.findAll();
    }

    public List<Driver> getDriversFromTeam(String team)
    {
        return driverRepo.findAll().stream().filter(driver -> team.equals(driver.getTeam())).collect(Collectors.toList());
    }

    public List<Driver> getDriversByName(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getDriverName().toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Driver> getTeamByCountry(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getCountry().toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Driver> getDriverByCountry(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getPlaceOfBirth().toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Driver> getDriversByNumber(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> Objects.equals(driver.getNumber(), searchText)).collect(Collectors.toList());
    }

    public List<Driver> getTeamChief(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getTeamChief().toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public List<Driver> getBase(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getBase() != null).collect(Collectors.toList());
    }

    public List<Driver> getDriverByAbbrievation(String searchText)
    {
        return driverRepo.findAll().stream().filter(driver -> driver.getAbbreviation().toLowerCase().contains(searchText.toLowerCase())).collect(Collectors.toList());
    }

    public Driver addDriver(Driver driver)
    {
        driverRepo.save(driver);
        return driver;
    }

    public Driver updateDriver(Driver updateDriver)
    {
        Optional<Driver> optionalDriver = driverRepo.findById(updateDriver.getDriverId());
        if (optionalDriver.isPresent())
        {
            Driver driver = optionalDriver.get();
            driver.setDriverName(updateDriver.getDriverName());
            driver.setCountry(updateDriver.getCountry());
            driver.setNumber(updateDriver.getNumber());
            driver.setAbbreviation(updateDriver.getAbbreviation());
            driver.setBase(updateDriver.getBase());
            driver.setTeamChief(updateDriver.getTeamChief());
            driver.setTeam(updateDriver.getTeam());
            driverRepo.save(driver);
            return driver;
        }
        return null;
    }

    @Transactional
    public void deleteDriver(Integer driver_id)
    {
        driverRepo.deleteById(driver_id);
    }
}
