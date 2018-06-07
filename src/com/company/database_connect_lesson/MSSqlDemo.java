package com.company.database_connect_lesson;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import javafx.scene.input.DragEvent;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class MSSqlDemo {
    private static final String SelectAll = "Select * from Students";
    private static final String Insert = "Insert into Students values ('Misha', 'Savateev', 'Vladimirovich', null)";

    public static void main(String[] args) throws SQLException {


       /* SQLServerDriver sqlServerDriver = new SQLServerDriver();
        DriverManager.registerDriver(sqlServerDriver);
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://172.27.61.83;databaseName=PEP_161;integratedSecurity=true");


        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(SelectAll);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }*/

        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setIntegratedSecurity(true);
        dataSource.setURL("jdbc:sqlserver://172.27.61.83");
        dataSource.setDatabaseName("PEP_161");

        Connection connection = dataSource.getConnection();
       /*
        Statement statement = connection.createStatement();
        statement.executeUpdate(Insert);*/


      /*  while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }*/
       /* PreparedStatement preparedStatement =
                connection.prepareStatement(" select firstName from Students where LEN(firstName) >= ?"
                        ,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        preparedStatement.setString(1, Integer.toString(new Scanner(System.in).nextInt()));
        preparedStatement.execute();

        ResultSet resultSet = preparedStatement.getResultSet();


        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
//            resultSet.updateString(1, "Egor");

        }*/

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        statement.execute("Select * from Students");
        ResultSet resultSet1 = statement.getResultSet();

        resultSet1.moveToInsertRow();
        resultSet1.updateString(1, "Kairat");
        resultSet1.updateString(2, "Meirmanov");
        resultSet1.updateString(3, "Kairatovich");
        resultSet1.updateTimestamp(4, null);

        resultSet1.insertRow();

    }


}
