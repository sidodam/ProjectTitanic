package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class LifeBoat {


    public static List<Passenger> evacuatedPassengers = new ArrayList<Passenger>();


    public static void Evacuate() throws InterruptedException {

        int bowEvacuee = 0;
        int sternEvacuee = 0;
        int portEvacuee = 0;
        int starboardEvacuee = 0;

        List<Passenger> passenger = Passenger.passengersData;


        passenger.sort(Comparator.comparing(Passenger::getBirthDay));
        Collections.reverse(passenger);


        System.out.println("          _____/______|           \n" +
                "  _______/_____\\_______\\_____     \n" +
                "  \\              < < <       |    \n" +
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("  _   _ _              _      \n" +
                " | | (_) |            (_)     \n" +
                " | |_ _| |_ __ _ _ __  _  ___ \n" +
                " | __| | __/ _` | '_ \\| |/ __|\n" +
                " | |_| | || (_| | | | | | (__ \n" +
                "  \\__|_|\\__\\__,_|_| |_|_|\\___|\n" +
                "                              \n" +
                "                              ");

        TimeUnit.SECONDS.sleep(3);

        for (int i = 0; i < passenger.size(); i++) {


            if (passenger.get(i).calculateAge() < 18) {


                for (int j = 0; j < findFamily(passenger.get(i).getName()).size(); j++) {
                    evacuatedPassengers.add(findFamily(passenger.get(i).getName()).get(j));


                }


                //   passenger.remove(passenger.get(i));
            } else if (passenger.get(i).getRank() == 0 && !evacuatedPassengers.contains(passenger.get(i))) {
                evacuatedPassengers.add(passenger.get(i));

            }

        }
        // ahora para extraer los tripulantes:
        for (int i = 0; i < passenger.size(); i++) {
            passenger.sort(Comparator.comparing(Passenger::getRank));

            if (passenger.get(i).getRank() != 0) {
                evacuatedPassengers.add(passenger.get(i));


            }

        }


        List<Passenger> ep = evacuatedPassengers;


// loop to set variables

        for (int i = 0; i < ep.size(); i++) {


            if (ep.get(i).getZone().equals(Zone.BOW)) {
                bowEvacuee++;
                if (bowEvacuee <= 24) // 4 botes, 6 personas cada bote  , 24 personas cada zona

                {

                    ;

                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(bowEvacuee) + " de zona: " + ep.get(i).getZone() + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(bowEvacuee)]);


                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }


                } else {

                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(bowEvacuee % 24) + " de zona: " + Zone.PORT + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(bowEvacuee % 24)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }


                }

            } else if (ep.get(i).getZone().equals(Zone.PORT)) {
                portEvacuee++;


                if (portEvacuee <= 24) {
                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(portEvacuee) + " de zona: " + ep.get(i).getZone() + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(portEvacuee)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }

                } else {

                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(bowEvacuee % 24) + " de zona: " + Zone.STERN + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(portEvacuee % 24)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }


                }


            } else if (ep.get(i).getZone().equals(Zone.STERN)) {
                sternEvacuee++;

                if (sternEvacuee <= 24) {
                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(sternEvacuee) + " de zona: " + ep.get(i).getZone() + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(sternEvacuee)]);


                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }

                } else {

                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(sternEvacuee % 24) + " de zona: " + Zone.STARBOARD + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(sternEvacuee % 24)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }


                }


            } else if (ep.get(i).getZone().equals(Zone.STARBOARD)) {
                starboardEvacuee++;

                if (starboardEvacuee <= 24) {
                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(starboardEvacuee) + " de zona: " + ep.get(i).getZone() + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(starboardEvacuee)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }

                } else {

                    System.out.println(ep.get(i).getName() + " con ID: " + ep.get(i).getIdCard() +
                            " por favor, evacue a bote numero: " + boatAssigned(starboardEvacuee % 24) + " de zona: " + Zone.BOW + " usando la salida numero: " +
                            ep.get(i).getZone().exits[exitAssigned(starboardEvacuee % 24)]);

                    if (i != 0) {


                        if (!areFamily(ep.get(i - 1).getName(), ep.get(i).getName())) {
                            System.out.println("####################");
                            TimeUnit.SECONDS.sleep(3);
                        }

                    } else {
                        System.out.println("*************************");
                        TimeUnit.SECONDS.sleep(3);
                    }


                }

            }

        }


    }


    public static void DAOBotes() {

        for (Passenger ep : evacuatedPassengers) {
            System.out.println("evacuated passengers in order are: ");
            System.out.println("birth day: " + ep.getBirthDay());
            System.out.println(ep.getName());
            System.out.println("roomNimber: " + ep.getZone());
            System.out.println("*************************");


        }


    }

    // metodo para encontrar todos los miembros de un minor
    private static List<Passenger> findFamily(String childName) {

        List<Passenger> passenger = Passenger.passengersData;
        String middleName = childName.split(" ")[1];
        String LastName = childName.split(" ")[2];

        List<Passenger> family = new ArrayList<Passenger>();

        for (int i = 0; i < passenger.size(); i++) {

            if (middleName.equals(passenger.get(i).getMiddleName())
                    || LastName.equals(passenger.get(i).getLastName())) {
                family.add(passenger.get(i));

            }

        }


        return family;
    }

    private static boolean areFamily(String peroson1, String peroson2) {
        if (peroson1.split(" ")[1].equals(peroson2.split(" ")[1]) || peroson1.split(" ")[2].equals(peroson2.split(" ")[2])) {

            return true;
        }

        return false;
    }

    private static int boatAssigned(int num) {
        if (num % 6 != 0) {
            return (num / 6) + 1;
        }
        return (num / 6);
    }

    private static int exitAssigned(int num) {
        if (num % 2 == 0) {
            return 0; // poruqe solo tenemos 2 salidas
        }
        return 1;
    }
}
