package com.Nikita;

import com.Nikita.plane.planes.CargoPlane;
import com.Nikita.plane.planes.Civil;
import com.Nikita.plane.planes.Military;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

import static com.Nikita.inputs.InputStream.planesFromFile;

/**
 * Created by Ananyeu_NA on 08.07.2016.
 */
public class MySqlAccess {

    private static FileWriter writer = null;
    private static String outputFile = "src/com/Nikita/output.txt";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    static final String DB_URL = "jdbc:mysql://localhost:3306/Project2?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "root";

    public void readDataBase() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT  * FROM Plains");

            writeResultSet(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void writeResultSet(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                Integer length = resultSet.getInt("length");
                Integer heigth = resultSet.getInt("heigth");
                Integer maxFligth = resultSet.getInt("maxFligth");
                Integer maxSpeed = resultSet.getInt("maxSpeed");

                Integer people = resultSet.getInt("people");
                Integer bomb = resultSet.getInt("bomb");
                Integer weigth = resultSet.getInt("weigth");

                String type = resultSet.getString("type");

                System.out.println(length + " length");
                System.out.println(heigth + " heigth");
                System.out.println(maxFligth + " maxFligth");
                System.out.println(maxSpeed + " maxSpeed");
                System.out.println(people + " people");
                System.out.println(bomb + " bomb");
                System.out.println(weigth + " weigth");
                System.out.println(type + " type");

             /*   if (type.equalsIgnoreCase("civil")) {
                    planesFromFile.add(new Civil(length, heigth, maxFligth, maxSpeed, people, type));
                } else if (type.equalsIgnoreCase("cargo")) {
                    planesFromFile.add(new CargoPlane(length, heigth, maxFligth, maxSpeed, weigth));
                } else if (type.equalsIgnoreCase("military")) {
                    planesFromFile.add(new Military(length, heigth, maxFligth, maxSpeed, bomb));
                } else {
                    System.out.println("Smth falled");
                }
                try {
                    writer = new FileWriter(outputFile);
                    writer.write(planesFromFile.toString() + "\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }*/


            }
        } catch (SQLException e) {
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
        } catch (Exception e) {

        }
    }
}
