package com.Nikita.airoprts.airport;

import com.Nikita.plane.abstractPlane.AbstractPlane;

import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 06.07.2016.
 */
public class Airport {
    private ArrayList<AbstractPlane> plains = new ArrayList<>();

    public ArrayList<AbstractPlane> getPlains() {
        return plains;
    }

    public void setPlains(ArrayList<AbstractPlane> plains) {
        this.plains = plains;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "plains=" + plains.iterator().next()+"\n" +
                '}';
    }
}
