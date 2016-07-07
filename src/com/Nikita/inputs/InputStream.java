package com.Nikita.inputs;

import com.Nikita.airoprts.airport.Airport;
import com.Nikita.plane.abstractPlane.AbstractPlane;
import com.Nikita.plane.planes.CargoPlane;
import com.Nikita.plane.planes.Civil;
import com.Nikita.plane.planes.Military;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by Ananyeu_NA on 07.07.2016.
 */
public class InputStream {
    private String inputFile = "src/com/Nikita/input.txt";
    static String delimiters = "\t\n\r,. ";

    private static FileInputStream fis = null;
    private static BufferedReader input = null;

    public  ArrayList<AbstractPlane> planesFromFile;


    public InputStream(String inputFile, ArrayList<AbstractPlane> planesFromFile) {
        this.inputFile = inputFile;
        this.planesFromFile = planesFromFile;
    }

    public Airport readDataFromFile(Airport airport) {
        Airport airp = airport;
        try {
            fis = new FileInputStream(inputFile);
            input = new BufferedReader(new InputStreamReader(fis));
            while (input.ready()) {
                String line = input.readLine();
                airp.setPlains(processData(line, delimiters));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return airp;
    }

    public ArrayList<AbstractPlane> processData(String line, String delim) {

        StringTokenizer st = new StringTokenizer(line, delim);
        try {

            Integer length = new Integer(st.nextToken());
            Integer heigth = new Integer(st.nextToken());
            Integer maxFligth = new Integer(st.nextToken());
            Integer maxSpeed = new Integer(st.nextToken());
            Integer lastString = new Integer(st.nextToken());

            String category = st.nextToken();

            if (category.equalsIgnoreCase("civil")) {
                planesFromFile.add(new Civil(length, heigth, maxFligth, maxSpeed, lastString));
            } else if (category.equalsIgnoreCase("cargo")) {
                planesFromFile.add(new CargoPlane(length, heigth, maxFligth, maxSpeed, lastString));
            } else if (category.equalsIgnoreCase("military")) {
                planesFromFile.add(new Military(length, heigth, maxFligth, maxSpeed, lastString));
            } else {
                System.out.println("Smth falled");
            }
        } catch (NullPointerException e) {
            System.out.println("No Data");
        }
        return planesFromFile;

    }
}