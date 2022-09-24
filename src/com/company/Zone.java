package com.company;



public enum Zone {
    BOW(new int[] {1  , 2}),
    STERN(new int[] {3  , 4}),
    PORT(new int[] {5  , 6}),
    STARBOARD(new int[] {7  , 8}) ;


    final int[] exits;


     Zone(int[] exits) {
        this.exits = exits;
    }
}
