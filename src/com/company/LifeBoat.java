package com.company;

public class LifeBoat {
    int id ;
    Zone zone ;
    private int [] seatNumbers = new int[25] ;


    public LifeBoat(int id, Zone zone) {
        this.id = id;
        this.zone = zone;
        setSeatNumbers();

       Passenger.DAOPersons();

    }

    private void setSeatNumbers() {
        int j = 0 ;
        for(int i=0; i<seatNumbers.length ; i++){
            seatNumbers[i] = ++j;

        }
    }


}
