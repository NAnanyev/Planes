package com.Nikita.plane.abstractPlane.planes;

import com.Nikita.plane.abstractPlane.AbstractPlane;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
 public  class CargoPlane extends   AbstractPlane {
    private Integer weight;
    private Integer maxSpeed;
    private Integer lenhth ;
    private Integer heigth;
    String country ;
    private Integer maxFligth ;
    private Integer people;

    public CargoPlane(Integer weight, Integer maxSpeed, Integer lenhth, Integer heigth, String country, Integer maxFligth, Integer people) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.lenhth = lenhth;
        this.heigth = heigth;
        this.country = country;
        this.maxFligth = maxFligth;
        this.people = people;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", lenhth=" + lenhth +
                ", heigth=" + heigth +
                ", country='" + country + '\'' +
                ", maxFligth=" + maxFligth +
                ", people=" + people +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CargoPlane that = (CargoPlane) o;

        if (weight != null ? !weight.equals(that.weight) : that.weight != null) return false;
        if (maxSpeed != null ? !maxSpeed.equals(that.maxSpeed) : that.maxSpeed != null) return false;
        if (lenhth != null ? !lenhth.equals(that.lenhth) : that.lenhth != null) return false;
        if (heigth != null ? !heigth.equals(that.heigth) : that.heigth != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (maxFligth != null ? !maxFligth.equals(that.maxFligth) : that.maxFligth != null) return false;
        return people != null ? people.equals(that.people) : that.people == null;
    }

    @Override
    public int hashCode() {
        int result = weight != null ? weight.hashCode() : 0;
        result = 31 * result + (maxSpeed != null ? maxSpeed.hashCode() : 0);
        result = 31 * result + (lenhth != null ? lenhth.hashCode() : 0);
        result = 31 * result + (heigth != null ? heigth.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (maxFligth != null ? maxFligth.hashCode() : 0);
        result = 31 * result + (people != null ? people.hashCode() : 0);
        return result;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getLenhth() {
        return lenhth;
    }

    public void setLenhth(Integer lenhth) {
        this.lenhth = lenhth;
    }

    public Integer getHeigth() {
        return heigth;
    }

    public void setHeigth(Integer heigth) {
        this.heigth = heigth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getMaxFligth() {
        return maxFligth;
    }

    public void setMaxFligth(Integer maxFligth) {
        this.maxFligth = maxFligth;
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
