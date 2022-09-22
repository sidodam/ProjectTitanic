package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LifeBoat {
    int id;
    Zone zone;
    private int[] seatNumbers = new int[6];


    public static List<Passenger> evacuatedPassengersData = new ArrayList<Passenger>();

    public LifeBoat(int id, Zone zone) {

        this.id = id;
        this.zone = zone;
        setSeatNumbers(); // llenar numeros de 1 a 6

        //  Passenger.DAOPersons();


    }


    public void Evacuate() // cada barco va a tener su propio evecuacion asi que no puede ser static
    {

        List<Passenger> passenger = Passenger.passengersData;
        passenger.sort(Comparator.comparing(Passenger::getBirthDay));
        Collections.reverse(passenger);

        List<Passenger> family = findFamily("adrian kouki garcia");

//        for (int i = 0; i < family.size(); i++) {
//            System.out.print("the name is: ");
//            System.out.println(family.get(i).getName());
//        }

        for (int i = 0; i < passenger.size(); i++) {

            while (passenger.get(i).calculateAge() < 18 && evacuatedPassengersData.size() < 3)
            // como solo tenemos 6 plazas y cada minor tiene que
            // tener un madre/padre con el,  no podemos llenar el barco con mas de 3 minores
            {

                for (int j = 0; j < findFamily(passenger.get(i).getName()).size(); j++) {
                    System.out.println("J" + j);
                    evacuatedPassengersData.add(findFamily(passenger.get(i).getName()).get(j));

                }
                passenger.remove(passenger.get(i));

            }

        }


        for (Passenger ep : evacuatedPassengersData) {

            System.out.println("birth day: " + ep.getBirthDay());
            System.out.println(ep.getName());
            System.out.println("roomNimber: " + ep.getRoomNumber());
            System.out.println("*************************");


        }


    }


    private void setSeatNumbers() {
        int j = 0;
        for (int i = 0; i < seatNumbers.length; i++) {
            seatNumbers[i] = ++j;

        }
    }

    private List<Passenger> findFamily(String childName){

        List<Passenger> passenger = Passenger.passengersData;
        String middleName = childName.split(" ")[1];
        String LastName = childName.split(" ")[2];

        List<Passenger> family = new ArrayList<Passenger>();

        for (int i = 0; i <passenger.size(); i++) {

            if(middleName.equals(passenger.get(i).getMiddleName())
                    ||LastName.equals(passenger.get(i).getLastName()) )

            {
                family.add(passenger.get(i));

            }
        }

        return family;
    }


}
