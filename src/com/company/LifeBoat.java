package com.company;

import java.util.*;

public class LifeBoat {
    private  int id;
    Zone zone;
    final int seatNumbers = 6;
    List<ArrayList<Passenger>> PassengersInBoat = Arrays.asList ((ArrayList<Passenger>[])new ArrayList[6]);





    public static List<Passenger> evacuatedPassengersData = new ArrayList<Passenger>();

//    public LifeBoat(int id, Zone zone) {
//
//        this.id = id;
//        this.zone = zone;
//
//
//        //  Passenger.DAOPersons();4
//
//
//    }


    public static void Evacuate()
    {

        List<Passenger> passenger = Passenger.passengersData;



        passenger.sort(Comparator.comparing(Passenger::getBirthDay));
        Collections.reverse(passenger);



        for (int i = 0; i < passenger.size(); i++) {



            if(passenger.get(i).calculateAge() < 18 )
            {


                for (int j = 0; j < findFamily(passenger.get(i).getName()).size(); j++)
                {
                    evacuatedPassengersData.add(findFamily(passenger.get(i).getName()).get(j));


                }



                //   passenger.remove(passenger.get(i));
            }

            else if (passenger.get(i).getRank() == 0 && !evacuatedPassengersData.contains(passenger.get(i)))  {
                evacuatedPassengersData.add(passenger.get(i));

            }

        }
            // ahora para extraer los tripulantes:
        for (int i = 0; i < passenger.size(); i++) {
            passenger.sort(Comparator.comparing(Passenger::getRank));

            if (passenger.get(i).getRank() != 0)  {
                evacuatedPassengersData.add(passenger.get(i));

            }

        }


        int bowEvacuee = 0;
        int seternEvacuee = 0 ;

        for (Passenger ep : evacuatedPassengersData) {
            if (ep.getZone().equals(Zone.BOW))
            {
                bowEvacuee++;
            }

            if (bowEvacuee==7)
            {
                System.out.println("the seventh: " + ep.getName());
                break;
            }
            System.out.println(ep.getName() + " with id: " + ep.getIdCard() +
                    " please evacuate to boat number: " + "" + " of section: " + " " + " using exit number: "  + " " );

            System.out.println("*************************");


        }

        System.out.println("bowEvacuee"+bowEvacuee);



    }




    public static void DAOBotes(){

        for (Passenger ep : evacuatedPassengersData) {
            System.out.println("evacuated passengers in order are: ");
            System.out.println("birth day: " + ep.getBirthDay());
            System.out.println(ep.getName());
            System.out.println("roomNimber: " + ep.getZone());
            System.out.println("*************************");


        }





    }

// metodo para encontrar todos los miembros de un minor
    private static List<Passenger> findFamily(String childName){

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
