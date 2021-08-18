package kz.ferius_057.ruminebot.database;

import kz.ferius_057.ruminebot.data.Config;

import java.sql.*;
import java.util.ArrayList;

public class Manager {
    private static Connection connection;

    public void open() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + Config.getFileNameDataBase());

            System.out.println("Connected to DataBase!");
        } catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
        }
    }

    public void executeUpdate(String query) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(query);
        }
    }

    public Object executeQuery(String method, String query) {
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            ArrayList<Integer> peerIds = new ArrayList<>();
            switch (method) {
                case "getChats":
                    Data.peerIds.clear();
                    while (resultSet.next()) {
                        Data.peerIds.add(resultSet.getInt(1));
                    }
                    break;
            }

            return peerIds;
        } catch (SQLException throwable) {
            System.err.println(throwable.getMessage());
        }

        return null;
    }
}