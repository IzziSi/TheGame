package com.e.thegame;

public class Race {
    private static final String[] race = {"Human", "Dwarf", "Elf", "Catpeople", "Crabpeople", "Gelatinous Cube"};

    public boolean checkRace(String input) {
        if (input.length() > 0) {
            input = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        }
        boolean findMatch = race.equals(input);
        return findMatch;
    }
}
