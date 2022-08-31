package org.alicoder.lesson30;

import java.sql.*;

public class JDBCMain {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mariadb://database-1.clicssmtjld8.ap-northeast-2.rds.amazonaws.com/classicmodels", "administrator", "6i6Z&9ooKjFK");
            String selectQuery = "select cus.customernumber, cus.customername, cus.phone, cus.country from customers cus";
            String deleteQuery = "DELETE FROM customers WHERE customerNumber=361";
            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(deleteQuery); // for select
            statement.executeQuery(deleteQuery);// for del nad update & insert
            // print with format table
            String leftAlignFormat = "| %-17d | %-29s | %-16s | %-13s |%n";

            System.out.format("+-----------------+---------------------------+---------------+-------------+%n");
            System.out.format("| Customer Number |       Customer Name       |      Phone    |   Country   |%n");
            System.out.format("+-----------------+---------------------------+---------------+-------------+%n");
            /*while (resultSet.next()){ // for select
                System.out.format(leftAlignFormat,
                        resultSet.getInt("customernumber"),
                        resultSet.getString("customername"),
                        resultSet.getString("phone"),
                        resultSet.getString("country"));
                System.out.format("+-----------------+---------------------------+---------------+-------------+%n");
            }*/
            System.out.format("+-----------------+---------------------------+---------------+-------------+%n");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert connection != null;
            connection.close();
        }
    }
}
