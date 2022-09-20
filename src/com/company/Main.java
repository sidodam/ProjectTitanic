package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Zone.BOW.exits));

      Passenger p = new Passenger("12345" , Country.GERMANY  ,Zone.BOW ,"Sido" , false  ,LocalDate.of(2017, 1, 13) , 5 );
        Passenger p2 = new Passenger("1234" , Country.SPAIN  ,Zone.BOW ,"Sido" , false ,LocalDate.of(2017, 1, 13), 5 );
       Passenger p3 = new Passenger("123454" , Country.BELGIUM   ,Zone.BOW ,"Sido" , false ,LocalDate.of(2017, 1, 13) , 5 );
//        Passenger p4 = new Passenger("123456" , Country.BELGIUM  ,Zone.BOW ,"Sido" , false ,LocalDate.of(2017, 1, 13) , 5 );
//
//       Passenger.passengerNumbers();
//       Passenger.DAOPersons();
        //System.out.println( "AGE IS: " + p.calculateAge());


        LifeBoat lb = new LifeBoat(1  , Zone.BOW );






    }
}
