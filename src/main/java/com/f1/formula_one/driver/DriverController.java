// Program: DriverController.java
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

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/driver")
public class DriverController
{
    private final DriverService driverService;
    @Autowired
    public DriverController(DriverService driverService)
    {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getDrivers(@RequestParam(required = false) String team, @RequestParam(required = false) String driverName,  @RequestParam(required = false) String number, @RequestParam(required = false) String placeOfBirth, @RequestParam(required = false) String Abbreviation, @RequestParam(required = false) String base, @RequestParam(required = false) String teamChief)
    {
        if (team != null)
        {
            return driverService.getDriversFromTeam(team);
        }
        else if (driverName != null)
        {
            return driverService.getDriversByName(driverName);
        }
        else if (number != null)
        {
            return driverService.getDriversByNumber(number);
        }
        else if (placeOfBirth != null)
        {
            return driverService.getDriverByCountry(placeOfBirth);
        }
        else if (Abbreviation != null)
        {
            return driverService.getDriverByAbbrievation(Abbreviation);
        }
        else if (base != null)
        {
            return driverService.getBase(base);
        }
        else if (teamChief != null)
        {
            return driverService.getTeamChief(teamChief);
        }
        else
        {
            return driverService.getDrivers();
        }
    }

    @PostMapping
    public ResponseEntity<Driver> addDriver(@RequestBody Driver driver)
    {
        Driver createdDriver = driverService.addDriver(driver);
        return new ResponseEntity<>(createdDriver, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Driver> updateDriver(@RequestBody Driver driver)
    {
        Driver resultDriver =  driverService.updateDriver(driver);
        if  (resultDriver != null)
        {
            return new ResponseEntity<>(resultDriver, HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{driver_id}")
    public ResponseEntity<String> deleteDriver(@PathVariable("driver_id") Integer driver_id)
    {
        driverService.deleteDriver(driver_id);
        return  new ResponseEntity<>("Driver Has Been Deleted Successfully", HttpStatus.OK);
    }
}
