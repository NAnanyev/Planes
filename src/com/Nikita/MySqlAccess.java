package com.Nikita;

import com.Nikita.airoprts.airport.Airport;
import com.Nikita.plane.abstractPlane.AbstractPlane;
import com.Nikita.plane.planes.CargoPlane;
import com.Nikita.plane.planes.Civil;
import com.Nikita.plane.planes.Military;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


/**
 * Created by Ananyeu_NA on 08.07.2016.
 */
public class MySqlAccess {

    private static FileWriter writer = null;
    private String outputFile;

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public static ArrayList<AbstractPlane> collectionPlanes = new ArrayList<>();

    private static final String DB_URL = "jdbc:mysql://localhost:3306/Project2?autoReconnect=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "root";

    public MySqlAccess(String outputFile) {
        this.outputFile = outputFile;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Airport readDataBase(Airport airport) {
        Airport air = airport;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT  * FROM Plains");
            while (resultSet.next()) {
                air.setPlains(processData());
                writeResultSet(resultSet);
            }
            writeResultSet(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return air;
    }

    public ArrayList<AbstractPlane> processData() {
        try {
            Integer length = resultSet.getInt("length");
            Integer heigth = resultSet.getInt("heigth");
            Integer maxFligth = resultSet.getInt("maxFligth");
            Integer maxSpeed = resultSet.getInt("maxSpeed");
            Integer people = resultSet.getInt("people");
            Integer bomb = resultSet.getInt("bomb");
            Integer weigth = resultSet.getInt("weigth");
            String type = resultSet.getString("type");

            if (type.equalsIgnoreCase("civil")) {
                collectionPlanes.add(new Civil(length, heigth, maxFligth, maxSpeed, people, type));
            } else if (type.equalsIgnoreCase("cargo")) {
                collectionPlanes.add(new CargoPlane(length, heigth, maxFligth, maxSpeed, weigth));
            } else if (type.equalsIgnoreCase("military")) {
                collectionPlanes.add(new Military(length, heigth, maxFligth, maxSpeed, bomb));
            } else {
                System.out.println("Smth falled");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return collectionPlanes;
    }

    public void writeResultSet(ResultSet resultSet) {
        try {
            writer = new FileWriter(outputFile);
            writer.write(collectionPlanes.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
