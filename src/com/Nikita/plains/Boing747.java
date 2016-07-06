package com.Nikita.plains;

import com.Nikita.Plane;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public class Boing747 implements Plane {

        int weight = 178;
        int maxSpeed = 955;
        int lenhth = 70;
        int heigth = 19;
        String country = "USA";
        int maxFligth = 13450;

    public Boing747(int weight, int maxSpeed, int lenhth, int heigth, String country, int maxFligth) {
        this.weight = 178;
        this.maxSpeed = maxSpeed;
        this.lenhth = lenhth;
        this.heigth = heigth;
        this.country = country;
        this.maxFligth = maxFligth;
    }

    @Override
    public String toString() {
        return "Boing747{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", lenhth=" + lenhth +
                ", heigth=" + heigth +
                ", country='" + country + '\'' +
                ", maxFligth=" + maxFligth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Boing747 boing747 = (Boing747) o;

        if (weight != boing747.weight) return false;
        if (maxSpeed != boing747.maxSpeed) return false;
        if (lenhth != boing747.lenhth) return false;
        if (heigth != boing747.heigth) return false;
        if (maxFligth != boing747.maxFligth) return false;
        return country != null ? country.equals(boing747.country) : boing747.country == null;

    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + maxSpeed;
        result = 31 * result + lenhth;
        result = 31 * result + heigth;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + maxFligth;
        return result;
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

    @Override
    public void fly() {

    }
}
