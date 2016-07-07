package com.Nikita.plane.planes;

import com.Nikita.person.abstractPerson.AbstractPersonal;
import com.Nikita.person.persons.Mechanic;
import com.Nikita.person.persons.Pilot;
import com.Nikita.person.persons.Stewardess;
import com.Nikita.plane.abstractPlane.AbstractPlane;

import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public class Civil extends AbstractPlane {
    protected Integer people;
    protected String category;

    public Civil(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer people) {
        super(length, heigth, maxFligth, maxSpeed);
        this.people = people;
        this.category = "civil";
    }

    public Civil(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer people, Stewardess stewardess, Mechanic mechanic, Pilot pilot) {
        super(length, heigth, maxFligth, maxSpeed);
        this.people = people;
        super.addAllPersonal(stewardess, mechanic, pilot);
    }

    public Civil(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer people, ArrayList<AbstractPersonal> personals) {
        super(length, heigth, maxFligth, maxSpeed);
        this.people = people;
        super.setPersonals(personals);
    }


    @Override
    public String toString() {

        return "Civil{" +
                "people=" + people +super.toString()+'}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Civil civil = (Civil) o;

        return people != null ? people.equals(civil.people) : civil.people == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (people != null ? people.hashCode() : 0);
        return result;
    }

    public Integer getPeople() {
        return people;
    }

    public void setPeople(Integer people) {
        this.people = people;
    }

    @Override
    public void fly() {

    }
}
