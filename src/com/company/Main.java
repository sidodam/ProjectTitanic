package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Arrays.toString(Zone.BOW.exits));

        Passenger p3 = new Passenger("123454", Country.BELGIUM, Zone.BOW, "adrian kouki ruiz", false, LocalDate.of(2010, 1, 13), 4);
        Passenger p2 = new Passenger("1234", Country.SPAIN, Zone.BOW, "david ruiz bocanegra", false, LocalDate.of(2009, 1, 13), 4);
        Passenger p = new Passenger("12345", Country.GERMANY, Zone.BOW, "Sido kouki aiwaz", false, LocalDate.of(1996, 1, 13), 4);
        Passenger p4 = new Passenger("123456756", Country.GERMANY, Zone.BOW, "Ahmad kouki matte", false, LocalDate.of(1997, 1, 13), 4);
        Passenger p5 = new Passenger("123234234324456", Country.BELGIUM, Zone.BOW, "Sido nido rido", false, LocalDate.of(2017, 1, 13), 5);


        Passenger p6 = new Passenger("1234rew54", Country.BELGIUM, Zone.BOW, "adriano koukio ruizo", false, LocalDate.of(2011, 1, 13), 4);
        Passenger p7 = new Passenger("1wer234", Country.SPAIN, Zone.PORT, "davidi ruizi bocanegrai", false, LocalDate.of(2005, 1, 13), 5);
        Passenger p8 = new Passenger("1234sdf5", Country.GERMANY, Zone.PORT, "Sidowa koukiwa aiwazwa", false, LocalDate.of(2004, 1, 13), 4);
        Passenger p9 = new Passenger("1234567sdf56", Country.GERMANY, Zone.PORT, "Zhmadru koukiru matteru", false, LocalDate.of(1986, 1, 12), 4);
        Passenger p10 = new Passenger("123234sdfs234324456", Country.BELGIUM, Zone.BOW, "Sidoov nido ridov", false, LocalDate.of(1986, 1, 12), 5);
        Passenger p11 = new Passenger("123234sdfs234324456sd", Country.BELGIUM, Zone.PORT, "crew2 f x", false, LocalDate.of(1986, 1, 12), 5, 2);
        Passenger p12 = new Passenger("123234sdfs2343244asdasd56sd", Country.BELGIUM, Zone.PORT, "crew1 c v", false, LocalDate.of(1986, 1, 12), 5, 5);

//
//       Passenger.passengerNumbers();
        // Passenger.DAOPersons();
        //System.out.println( "AGE IS: " + p.calculateAge());


        //LifeBoat lb = new LifeBoat(1  , Zone.BOW );

        LifeBoat.Evacuate();
        //  LifeBoat.DAOBotes();


    }
}
