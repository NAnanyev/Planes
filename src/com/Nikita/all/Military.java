package com.Nikita.all;

import com.Nikita.AbstractPlane;
import com.Nikita.Plane;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public abstract class Military implements Plane, AbstractPlane {

   private int maxBomb;
    private int weight;
    private int maxSpeed;
    private int lenhth ;
    private int heigth;
    private String country ;
    private int maxFligth ;
    private int people;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Military military = (Military) o;

        if (maxBomb != military.maxBomb) return false;
        if (weight != military.weight) return false;
        if (maxSpeed != military.maxSpeed) return false;
        if (lenhth != military.lenhth) return false;
        if (heigth != military.heigth) return false;
        if (maxFligth != military.maxFligth) return false;
        if (people != military.people) return false;
        return country != null ? country.equals(military.country) : military.country == null;

    }

    @Override
    public int hashCode() {
        int result = maxBomb;
        result = 31 * result + weight;
        result = 31 * result + maxSpeed;
        result = 31 * result + lenhth;
        result = 31 * result + heigth;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + maxFligth;
        result = 31 * result + people;
        return result;
    }

    public int getMaxBomb() {
        return maxBomb;
    }

    public void setMaxBomb(int maxBomb) {
        this.maxBomb = maxBomb;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLenhth() {
        return lenhth;
    }

    public void setLenhth(int lenhth) {
        this.lenhth = lenhth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getMaxFligth() {
        return maxFligth;
    }

    public void setMaxFligth(int maxFligth) {
        this.maxFligth = maxFligth;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Military{" +
                "maxBomb"+ maxBomb+
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", lenhth=" + lenhth +
                ", heigth=" + heigth +
                ", country='" + country + '\'' +
                ", maxFligth=" + maxFligth +
                ", people=" + people +
                '}';
    }
}
