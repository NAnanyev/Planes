package com.Nikita.all;

import com.Nikita.AbstractPlane;
import com.Nikita.Plane;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public abstract class Civil implements Plane, AbstractPlane {

    int weight;
    int maxSpeed;
    int lenhth ;
    int heigth;
    String country ;
    int maxFligth ;
    int people;

    @Override
    public String toString() {
        return "Civil{" +
                "people="+people+
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", lenhth=" + lenhth +
                ", heigth=" + heigth +
                ", country='" + country + '\'' +
                ", maxFligth=" + maxFligth +
                '}';
    }
}
