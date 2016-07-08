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
public class Military extends AbstractPlane {
    protected Integer maxBomb;
    protected String type;

    public Military(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer maxBomb) {
        super(length, heigth, maxFligth, maxSpeed);
        this.maxBomb = maxBomb;
        this.type = "military";
    }

    public Military(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer maxBomb, Stewardess stewardess, Mechanic mechanic, Pilot pilot) {
        super(length, heigth, maxFligth, maxSpeed);
        this.maxBomb = maxBomb;
        super.addAllPersonal(stewardess, mechanic, pilot);
    }

    public Military(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer maxBomb, ArrayList<AbstractPersonal> personals) {
        super(length, heigth, maxFligth, maxSpeed);
        this.maxBomb = maxBomb;
        super.setPersonals(personals);
    }

    @Override
    public String toString() {
        return "Military{" +
                "maxBomb=" + maxBomb + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Military military = (Military) o;

        return maxBomb != null ? maxBomb.equals(military.maxBomb) : military.maxBomb == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (maxBomb != null ? maxBomb.hashCode() : 0);
        return result;
    }

    public Integer getMaxBomb() {
        return maxBomb;
    }

    public void setMaxBomb(Integer maxBomb) {
        this.maxBomb = maxBomb;
    }

    @Override
    public void fly() {

    }
}
