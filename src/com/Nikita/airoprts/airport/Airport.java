package com.Nikita.airoprts.airport;

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

    private int howManyPeopleWork;
    private int howManyPlanes;
    private int howMuchRunway;

    @Override
    public String toString() {
        return "Airport{" +
                "howManyPeopleWork=" + howManyPeopleWork +
                ", howManyPlanes=" + howManyPlanes +
                ", howMuchRunway=" + howMuchRunway +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airport airport = (Airport) o;

        if (howManyPeopleWork != airport.howManyPeopleWork) return false;
        if (howManyPlanes != airport.howManyPlanes) return false;
        return howMuchRunway == airport.howMuchRunway;

    }

    @Override
    public int hashCode() {
        int result = howManyPeopleWork;
        result = 31 * result + howManyPlanes;
        result = 31 * result + howMuchRunway;
        return result;
    }

    public int getHowManyPeopleWork() {
        return howManyPeopleWork;
    }

    public void setHowManyPeopleWork(int howManyPeopleWork) {
        this.howManyPeopleWork = howManyPeopleWork;
    }

    public int getHowManyPlanes() {
        return howManyPlanes;
    }

    public void setHowManyPlanes(int howManyPlanes) {
        this.howManyPlanes = howManyPlanes;
    }

    public int getHowMuchRunway() {
        return howMuchRunway;
    }

    public void setHowMuchRunway(int howMuchRunway) {
        this.howMuchRunway = howMuchRunway;
    }

    public Airport(int howManyPeopleWork, int howManyPlanes, int howMuchRunway) {
        this.howManyPeopleWork = howManyPeopleWork;
        this.howManyPlanes = howManyPlanes;
        this.howMuchRunway = howMuchRunway;
    }
}
