package com.Nikita;

import com.Nikita.person.abstractPerson.AbstractPersonal;
import com.Nikita.person.abstractPerson.persons.Mechanic;
import com.Nikita.person.abstractPerson.persons.Pilot;
import com.Nikita.person.abstractPerson.persons.Stewardess;
import com.Nikita.plane.abstractPlane.planes.CargoPlane;
import com.Nikita.plane.abstractPlane.planes.Civil;
import com.Nikita.plane.abstractPlane.planes.Military;


import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public class Airport {
    static ArrayList<Civil> civilPlains = new ArrayList<>();
    static ArrayList<Military> militaryPlanes = new ArrayList<>();
    static ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();
    static ArrayList<AbstractPersonal> personals = new ArrayList<>();

    public static void main(String[] args) {
        civilPlains.add(new Civil(23, 20000, 990, 25, 4000, "Russia", 1600));
        militaryPlanes.add(new Military(10, 14, 2500, 11, 6500, "USA", 1600, 3));
        cargoPlanes.add(new CargoPlane(35000, 600, 45, 30, "KNR", 3000, 11));
        personals.add(new Stewardess());
        personals.add(new Mechanic("Boris", 44, true));
        personals.add(new Pilot("Mike", 60, true));
    }
}
