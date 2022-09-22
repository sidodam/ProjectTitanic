package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Passenger {

    private String idCard;
    private  Country country;
    private  Zone zone;
    private  String name;
    private  boolean handicap;
    private  LocalDate birthDay;
    private  int roomNumber;


    public static List<Passenger> passengersData = new ArrayList<Passenger>();


    public static int numberOfPassengers;



    private Country getCountry() {
        return country;
    }



    public Passenger(String idCard, Country country, Zone zone, String name, boolean handicap, LocalDate birthDay, int roomNumber) {

        setIdCard(idCard);
        this.country = country;
        this.zone = zone;
       setName(name);
        this.handicap = handicap;
        this.birthDay = birthDay;
        this.roomNumber = roomNumber;
        numberOfPassengers++;


        passengersData.add(this);
        passengersData.sort(Comparator.comparing(Passenger::getCountry)); //ordenar por pais , esto sigue el orden del ENUM


    }





    private void setIdCard(String idCard) {
        this.idCard = idCard; // como YA es el primero no puede ser duplicado

        for (Passenger p : passengersData) {


            if (p.idCard.equals(idCard))
            {
                throw new IllegalArgumentException("el usuario ya existe");
            }
                this.idCard = idCard;
        }
    }



    private void setName(String name) {
        if (name.length() > 0)
        {
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Nombre no puede ser vacio");
        }
    }

    private void setRoomNumber(int roomNumber) {
        if (roomNumber > 0)
        {
            this.roomNumber = roomNumber;
        }
        else
        {
            throw new IllegalArgumentException("ELige numero valido");
        }
    }


    public static void DAOPersons() {

        for (Passenger p : passengersData) {
            System.out.println("ID: " + p.idCard);
            System.out.println("Country: " + p.country);
            System.out.println("bDay: " + p.birthDay);
            System.out.println("*****************");

        }

    }

    public String getIdCard() {
        return idCard;
    }

    public Zone getZone() {
        return zone;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {

        return name.split(" ")[1];
    }

    public String getLastName() {
        return name.split(" ")[2];
    }

    public boolean isHandicap() {
        return handicap;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public static void passengerNumbers() {
        System.out.println(numberOfPassengers);

    }

    public static List<Passenger> getPassengersData() {
        return passengersData;
    }

    public  int calculateAge() {
        LocalDate today = LocalDate.now();
        if ((this.birthDay != null) && (today != null)) {
            return Period.between(this.birthDay, today).getYears();
        } else {
            return 0;
        }
    }






}




