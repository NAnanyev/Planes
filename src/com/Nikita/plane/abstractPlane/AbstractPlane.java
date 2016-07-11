package com.Nikita.plane.abstractPlane;

import com.Nikita.person.abstractPerson.AbstractPersonal;
import com.Nikita.person.persons.Mechanic;
import com.Nikita.person.persons.Pilot;
import com.Nikita.person.persons.Stewardess;
import com.Nikita.plane.interfacePlane.Plane;

import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public abstract class AbstractPlane implements Plane {
    protected Integer length;
    protected Integer heigth;
    protected Integer maxFligth;
    protected Integer maxSpeed;
    protected ArrayList<AbstractPersonal> personals = new ArrayList<>();

    public AbstractPlane(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed) {
        this.length = length;
        this.heigth = heigth;
        this.maxFligth = maxFligth;
        this.maxSpeed = maxSpeed;
    }

    public void addAllPersonal(Stewardess stewardess, Mechanic mechanic, Pilot pilot) {
        personals.add(stewardess);
        personals.add(mechanic);
        personals.add(pilot);
    }

    public void addPersonal(AbstractPersonal person) {
        personals.add(person);
    }

    public void addStewardress(Stewardess stewardess) {
        personals.add(stewardess);
    }

    public void addMechanik(Mechanic mechanic) {
        personals.add(mechanic);
    }

    public void addPilot(Pilot pilot) {
        personals.add(pilot);
    }

    public ArrayList<AbstractPersonal> getPersonals() {
        return personals;
    }

    public void setPersonals(ArrayList<AbstractPersonal> personals) {
        this.personals = personals;
    }

    @Override
    public String toString() {
        return ", " +
                "length=" + length +
                ", heigth=" + heigth +
                ", maxFligth=" + maxFligth +
                ", maxSpeed=" + maxSpeed + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractPlane that = (AbstractPlane) o;

        if (length != null ? !length.equals(that.length) : that.length != null) return false;
        if (heigth != null ? !heigth.equals(that.heigth) : that.heigth != null) return false;
        if (maxFligth != null ? !maxFligth.equals(that.maxFligth) : that.maxFligth != null) return false;
        return maxSpeed != null ? maxSpeed.equals(that.maxSpeed) : that.maxSpeed == null;
    }

    @Override
    public int hashCode() {
        int result = length != null ? length.hashCode() : 0;
        result = 31 * result + (heigth != null ? heigth.hashCode() : 0);
        result = 31 * result + (maxFligth != null ? maxFligth.hashCode() : 0);
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        return result;
    }

    public Integer getLenhth() {
        return length;
    }

    public void setLenhth(Integer lenhth) {
        this.length = lenhth;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public Integer getMaxFligth() {
        return maxFligth;
    }

    public void setMaxFligth(Integer maxFligth) {
        this.maxFligth = maxFligth;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void fly() {}
}
