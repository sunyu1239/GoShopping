package com.weShop.allPackage.jdbcPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class JDBCOracle {

  private static final String driver = "oracle.jdbc.driver.OracleDriver";
  private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
  private static final String username = "root";
  private static final String password = "root";
  private Connection connection = null;
  private Statement statement = null;
  private ResultSet resultSet = null;
  static {
    try {
      Class.forName(driver);
    } catch (ClassNotFoundException e) {
      System.out.println("加载驱动失败");
    }
  }

  private Connection getConnection() {
    if (connection == null) {
      try {
        connection = DriverManager.getConnection(url, username, password);
      } catch (SQLException e) {
        System.out.println("connection获取失败");
      }
    }
    return connection;
  }

  private void closeAll() {
    if (resultSet != null) {
      try {
        resultSet.close();
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }

    if (statement != null) {
      try {
        statement.close();
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }

    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  public String excuteSql(String sql) {
    Connection con = getConnection();
    String message = null;
    try {
      statement = con.createStatement();
      resultSet = statement.executeQuery(sql);
      System.out.println(con);
      System.out.println(connection);
      System.out.println(statement);
      System.out.println(resultSet);
      while (resultSet.next()) {
        message = "有这个人";
        break;
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      closeAll();
      System.out.println(con);
      System.out.println(connection);
      System.out.println(statement);
      System.out.println(resultSet);
    }
    return message;

  }
}
