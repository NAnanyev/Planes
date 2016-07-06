package com.Nikita.plane.abstractPlane.planes;

import com.Nikita.plane.abstractPlane.AbstractPlane;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public  class Civil extends AbstractPlane {
    private Integer people;
    private Integer weight;
    private Integer maxSpeed;
    private Integer lenhth ;
    private Integer heigth;
    String country ;
    private Integer maxFligth ;

    public Civil(Integer people, Integer weight, Integer maxSpeed, Integer lenhth, Integer heigth, String country, Integer maxFligth) {
        this.people = people;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.lenhth = lenhth;
        this.heigth = heigth;
        this.country = country;
        this.maxFligth = maxFligth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Civil civil = (Civil) o;

        if (weight != null ? !weight.equals(civil.weight) : civil.weight != null) return false;
        if (maxSpeed != null ? !maxSpeed.equals(civil.maxSpeed) : civil.maxSpeed != null) return false;
        if (lenhth != null ? !lenhth.equals(civil.lenhth) : civil.lenhth != null) return false;
        if (heigth != null ? !heigth.equals(civil.heigth) : civil.heigth != null) return false;
        if (country != null ? !country.equals(civil.country) : civil.country != null) return false;
        if (maxFligth != null ? !maxFligth.equals(civil.maxFligth) : civil.maxFligth != null) return false;
        return people != null ? people.equals(civil.people) : civil.people == null;

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
    public String toString() {
        return "Civil{" +
                "people=" + people +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", lenhth=" + lenhth +
                ", heigth=" + heigth +
                ", country='" + country + '\'' +
                ", maxFligth=" + maxFligth +
                '}';
    }

    @Override
    public void fly() {

    }
}
