// Program: Driver.java
// Author: T-Kalv
// Module:
// Email:
// Student Number:
// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// About:
// A full-stack F1 Statistics Web Application that has a Spring-Boot Java backend with a HTML/JS Frontend Web interface using a Postgres SQL Database so user can query infomation about F1 Drivers/Teams

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Requirements
// - Implement a Postgres SQL database using Postgres to create a table from a csv dataset that has the relevant tables such as Driver,Abbreviation,No,Team,Country,Podiums,Points,World Championships,Highest Race Finish,Highest Grid Position of Birth,Team Name,Base,Team Chief,Technical Chief...
// - Implement a basic java spring-boot backend application that connects to the Postgres SQL DB for query data/real-time data manipulation using SQL queriers as well as using the REST API to GET,POST DELETE
// - Implement a basic frontend html web interface so that users can query information using FETCH with REST API

// -------------------------------------------------------------------------------------------------------------------------------------------------------------
// Code
package com.f1.formula_one.driver;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "driver_statistic")
public class Driver
{
    @Id
    @Column(name = "driver_id", unique = true)
    private Integer driverId;
    private String driverName;
    private String abbreviation;
    private Integer number;
    private String team;
    private String country;
    private Integer podiums;
    private Integer points;
    private Integer grandsPrixEntered;
    private Integer worldChampionships;
    private String highestRaceFinish;
    private Integer highestGridPosition;
    private String dateOfBirth;
    private String placeOfBirth;
    private String fullTeamName;
    private String base;
    private String teamChief;
    private String technicalChief;
    private String chassis;
    private String powerUnit;
    private Short firstTeamEntry;
    private Short teamWorldChampionships;
    private String teamHighestRaceFinish;
    private Integer polePositions;
    private Integer fastestLaps;

    public Driver()
    {

    }

    public Driver(String abbreviation, Integer driver_id, String driverName, Integer number, String team, String country, Integer podiums, Integer points, Integer grandsPrixEntered, Integer worldChampionships, String highestRaceFinish, Integer highestGridPosition, String dateOfBirth, String placeOfBirth, String fullTeamName, String base, String teamChief, String technicalChief, String chassis, String powerUnit, Short firstTeamEntry, Short teamWorldChampionships, String teamHighestRaceFinish, Integer polePositions, Integer fastestLaps)
    {
        this.abbreviation = abbreviation;
        this.driverId = driver_id;
        this.driverName = driverName;
        this.number = number;
        this.team = team;
        this.country = country;
        this.podiums = podiums;
        this.points = points;
        this.grandsPrixEntered = grandsPrixEntered;
        this.worldChampionships = worldChampionships;
        this.highestRaceFinish = highestRaceFinish;
        this.highestGridPosition = highestGridPosition;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.fullTeamName = fullTeamName;
        this.base = base;
        this.teamChief = teamChief;
        this.technicalChief = technicalChief;
        this.chassis = chassis;
        this.powerUnit = powerUnit;
        this.firstTeamEntry = firstTeamEntry;
        this.teamWorldChampionships = teamWorldChampionships;
        this.teamHighestRaceFinish = teamHighestRaceFinish;
        this.polePositions = polePositions;
        this.fastestLaps = fastestLaps;
    }

    public Driver(Integer driver_id)
    {
        this.driverId = driver_id;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverid) {
        this.driverId = driverid;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPodiums() {
        return podiums;
    }

    public void setPodiums(Integer podiums) {
        this.podiums = podiums;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGrandsPrixEntered() {
        return grandsPrixEntered;
    }

    public void setGrandsPrixEntered(Integer grandsPrixEntered) {
        this.grandsPrixEntered = grandsPrixEntered;
    }

    public Integer getWorldChampionships() {
        return worldChampionships;
    }

    public void setWorldChampionships(Integer worldChampionships) {
        this.worldChampionships = worldChampionships;
    }

    public String getHighestRaceFinish() {
        return highestRaceFinish;
    }

    public void setHighestRaceFinish(String highestRaceFinish) {
        this.highestRaceFinish = highestRaceFinish;
    }

    public Integer getHighestGridPosition() {
        return highestGridPosition;
    }

    public void setHighestGridPosition(Integer highestGridPosition) {
        this.highestGridPosition = highestGridPosition;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getFullTeamName() {
        return fullTeamName;
    }

    public void setFullTeamName(String fullTeamName) {
        this.fullTeamName = fullTeamName;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getTeamChief() {
        return teamChief;
    }

    public void setTeamChief(String teamChief) {
        this.teamChief = teamChief;
    }

    public String getTechnicalChief() {
        return technicalChief;
    }

    public void setTechnicalChief(String technicalChief) {
        this.technicalChief = technicalChief;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getPowerUnit() {
        return powerUnit;
    }

    public void setPowerUnit(String powerUnit) {
        this.powerUnit = powerUnit;
    }

    public Short getFirstTeamEntry() {
        return firstTeamEntry;
    }

    public void setFirstTeamEntry(Short firstTeamEntry) {
        this.firstTeamEntry = firstTeamEntry;
    }

    public Short getTeamWorldChampionships() {
        return teamWorldChampionships;
    }

    public void setTeamWorldChampionships(Short teamWorldChampionships) {
        this.teamWorldChampionships = teamWorldChampionships;
    }

    public String getTeamHighestRaceFinish() {
        return teamHighestRaceFinish;
    }

    public void setTeamHighestRaceFinish(String teamHighestRaceFinish) {
        this.teamHighestRaceFinish = teamHighestRaceFinish;
    }

    public Integer getPolePositions() {
        return polePositions;
    }

    public void setPolePositions(Integer polePositions) {
        this.polePositions = polePositions;
    }

    public Integer getFastestLaps() {
        return fastestLaps;
    }

    public void setFastestLaps(Integer fastestLaps) {
        this.fastestLaps = fastestLaps;
    }
}
