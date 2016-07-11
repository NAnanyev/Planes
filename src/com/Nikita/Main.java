package com.Nikita;

import com.Nikita.airoprts.airport.Airport;

import static com.Nikita.Log.log;

import com.Nikita.inputs.InputStream;
import com.Nikita.person.persons.Mechanic;
import com.Nikita.person.persons.Pilot;
import com.Nikita.person.persons.Stewardess;
import com.Nikita.plane.abstractPlane.AbstractPlane;
import com.Nikita.plane.planes.CargoPlane;


import java.sql.Connection;
import java.util.ArrayList;

import static com.Nikita.MySqlAccess.collectionPlanes;

/**
 * Created by Ananyeu_NA on 07.07.2016.
 */
/*
* To define hierarchy of planes. To create airline. To count the general capacity and loading capacity.
* To define hierarchy of planes.
Create class diagram using(for example) - https://www.draw.io/
*To carry out sorting of planes of the company according to range of flight.
*To find the plane in the company, corresponding to the set range of parameters.
*/

public class Main {


    public static void main(String[] args) {
      /*
      *read from database and write to the screan
         *  Airport airport = new Airport();
        InputStream inputStream = new InputStream("src/com/Nikita/input.txt", airport.getPlains());
        airport = inputStream.readDataFromFile(airport);
        System.out.println(airport.getPlains());
        */


        // read from database and write to the file
        Airport airport = new Airport(collectionPlanes);
        MySqlAccess mySqlAccess = new MySqlAccess();
        airport = mySqlAccess.readDataBase(airport);

        airport.sort();
        log(airport.toString());
    }
}
