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
public class CargoPlane extends AbstractPlane {
    protected Integer weigth;
    protected String type;

    public CargoPlane(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer weigth) {
        super(length, heigth, maxFligth, maxSpeed);
        this.weigth = weigth;
        this.type = "cargo";
    }

    public CargoPlane(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer weigth, Stewardess stewardess, Mechanic mechanic, Pilot pilot) {
        super(length, heigth, maxFligth, maxSpeed);
        this.weigth = weigth;
        super.addAllPersonal(stewardess,mechanic,pilot);
    }

    public CargoPlane(Integer length, Integer heigth, Integer maxFligth, Integer maxSpeed, Integer weigth, ArrayList<AbstractPersonal> personals) {
        super(length, heigth, maxFligth, maxSpeed);
        this.weigth = weigth;
        super.setPersonals(personals);
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "weigth=" + weigth +super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CargoPlane that = (CargoPlane) o;

        return weigth != null ? weigth.equals(that.weigth) : that.weigth == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (weigth != null ? weigth.hashCode() : 0);
        return result;
    }

    public Integer getWeigth() {
        return weigth;
    }

    public void setWeigth(Integer weigth) {
        this.weigth = weigth;
    }

    @Override
    public void fly() {

    }
}
