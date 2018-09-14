package com.weShop.allPackage.servicePackage;

import com.weShop.allPackage.jdbcPackage.JDBCOracle;

public class UserService {
  public String getResult() {
    String result = null;
    JDBCOracle jdbc = new JDBCOracle();
    result = jdbc.excuteSql("select user_name from book_user");
    return result;

  }
}
