package com.company.database_connect_lesson;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class MySql_test {
    public static void main(String[]args) throws SQLException {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("food_db");
        dataSource.setURL("jdbc:mysql://localhost:3306/food_db");
        dataSource.setUser("root");
        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet resultSet = statement.executeQuery("SELECT * FROM `categories` WHERE id = 4");

        while (resultSet.next()){
            System.out.println(resultSet.getString(2));

          /*  resultSet.updateString(2, "Выпечка");
            resultSet.rowUpdated();*/
        }
    }
}
