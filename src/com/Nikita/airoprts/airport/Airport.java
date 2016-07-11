package com.Nikita.airoprts.airport;

import com.Nikita.plane.abstractPlane.AbstractPlane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Ananyeu_NA on 11.07.2016.
 */
public class Airport {
    private ArrayList<AbstractPlane> plains = new ArrayList<>();

    public Airport(ArrayList<AbstractPlane> plains) {
        this.plains = plains;
    }

    public ArrayList<AbstractPlane> getPlains() {
        return plains;
    }

    public void setPlains(ArrayList<AbstractPlane> plains) {
        this.plains = plains;
    }

    @Override
    public String toString() {
        String result = "Airport{" +
                "plains=" + "\n";

        for (AbstractPlane aaaa : plains) {
            result += aaaa;
            result += "\n";
        }
        return result + '}';
    }

   /*
*    sorting of planes of the company according to range of flight.
*  */

    public void sort() {
//        ArrayList<AbstractPlane> list = new ArrayList<>();
        Collections.sort(plains, new Comparator<AbstractPlane>() {
            public int compare(AbstractPlane o1, AbstractPlane o2) {
                return o1.getMaxFligth().toString().compareTo(o2.getMaxFligth().toString());
            }
        });
    }

    public void findSpeed(int min, int max) {
        ArrayList<AbstractPlane> list = new ArrayList<>();
        for (AbstractPlane value : plains) {
            Integer maxSpeed = value.getMaxSpeed();
            if (maxSpeed > min && maxSpeed < max) {
                list.add(value);
            }
        }
        System.out.println(list);
    }
}
