package com.Nikita.person.abstractPerson.persons;

import com.Nikita.person.abstractPerson.AbstractPersonal;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public class Stewardess extends AbstractPersonal {
   private String position;
    public Stewardess(String name, Integer age, boolean hasChildren, String position) {
        super(name, age, hasChildren);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Stewardess{" +
                "position='" + position + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Stewardess that = (Stewardess) o;

        return position != null ? position.equals(that.position) : that.position == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    public void giveFood(){}

    public void takeSmile(){}
}
