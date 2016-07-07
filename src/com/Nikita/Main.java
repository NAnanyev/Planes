package com.Nikita;

import com.Nikita.person.abstractPerson.persons.Mechanic;
import com.Nikita.person.abstractPerson.persons.Pilot;
import com.Nikita.person.abstractPerson.persons.Stewardess;
import com.Nikita.plane.abstractPlane.planes.CargoPlane;
import com.Nikita.plane.abstractPlane.planes.Civil;
import com.Nikita.plane.abstractPlane.planes.Military;
import java.util.ArrayList;
/**
 * Created by Ananyeu_NA on 07.07.2016.
 */
public class Main {
    static ArrayList<Civil> civilPlains = new ArrayList<>();
    static ArrayList<Military> militaryPlanes = new ArrayList<>();
    static ArrayList<CargoPlane> cargoPlanes = new ArrayList<>();
    static ArrayList<Object> personalsWorkingOnMilitary = new ArrayList<>();
    static ArrayList<Stewardess> stewardesses = new ArrayList<>();
    static ArrayList<Pilot> pilots = new ArrayList<>();
    static ArrayList<Mechanic> mechanics = new ArrayList<>();
    static ArrayList<Object> aiport = new ArrayList<>();

    public static void main(String[] args) {
        civilPlains.add(new Civil(23, 20000, 990, 25, 4000, "Russia", 1600));
        militaryPlanes.add(new Military(10, 14, 2500, 11, 6500, "USA", 1600, 3));
        cargoPlanes.add(new CargoPlane(35000, 600, 45, 30, "KNR", 3000, 11));

        stewardesses.add(new Stewardess("Vika", 22, false, "last"));
        pilots.add(new Pilot("Mike", 43, true, "left pilot"));
        mechanics.add(new Mechanic("Vova", 35, true, "down mechanik"));

        aiport.add(civilPlains);
        aiport.add(militaryPlanes);
        aiport.add(cargoPlanes);

        personalsWorkingOnMilitary.add(stewardesses);
        personalsWorkingOnMilitary.add(pilots);
        personalsWorkingOnMilitary.add(mechanics);

        getInformationAboutPlanes(aiport);
        getInformationAboutPersonal(personalsWorkingOnMilitary);
    }

    public static void getInformationAboutPlanes(ArrayList<Object> list) {
        System.out.println(list);
    }


    public static void getInformationAboutPersonal(ArrayList<Object> list) {
        System.out.println(list);
    }
}
