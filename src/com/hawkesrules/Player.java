package com.hawkesrules;

public class Player {

    private String  firstName;
    private String  lastName;
    private Integer number;
    private Integer goals;
    private Integer assists;
    private Integer points;
    private Integer plusMinus;
    private Integer fights;

    public Player(String firstName, String lastName, Integer number, Integer goals, Integer assists, Integer plusMinus, Integer fights) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.goals = goals;
        this.assists = assists;
        this.points = goals + assists;
        this.plusMinus = plusMinus;
        this.fights = fights;
    }

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void calculatePoints() {
        this.points = this.goals + this.assists;
    }

    public Integer getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public Integer getFights() {
        return fights;
    }

    public void setFights(Integer fights) {
        this.fights = fights;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", goals=" + goals +
                ", assists=" + assists +
                ", points=" + points +
                ", plusMinus=" + plusMinus +
                ",fights=" + fights +
                '}';
    }
}
