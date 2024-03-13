package com.model.dto;

public class PersonDTO implements java.io.Serializable {
    private int entranceCode;
    private int ticketCode;
    private String personName;
    private int personAge;
    private String personGender;
    private double personHeight;


    public PersonDTO() {}

    public PersonDTO(int entranceCode, int ticketCode, String personName, int personAge, String personGender, double personHeight) {
        this.entranceCode = entranceCode;
        this.ticketCode = ticketCode;
        this.personName = personName;
        this.personAge = personAge;
        this.personGender = personGender;
        this.personHeight = personHeight;
    }

    public int getEntranceCode() {
        return entranceCode;
    }

    public void setEntranceCode(int entranceCode) {
        this.entranceCode = entranceCode;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public double getPersonHeight() {
        return personHeight;
    }

    public void setPersonHeight(double personHeight) {
        this.personHeight = personHeight;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "entranceCode=" + entranceCode +
                ", ticketCode=" + ticketCode +
                ", personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personGender='" + personGender + '\'' +
                ", personHeight=" + personHeight +
                '}';
    }
}
