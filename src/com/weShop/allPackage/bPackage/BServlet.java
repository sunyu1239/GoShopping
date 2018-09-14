package com.weShop.allPackage.bPackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BServlet implements Servlet {

  @Override
  public void init(ServletConfig config) throws ServletException {
    // TODO Auto-generated method stub
    System.out.println("BServlet init!");
  }

  @Override
  public ServletConfig getServletConfig() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    // TODO Auto-generated method stub
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.write("<div>你说呢</div>");
    out.flush();
    out.close();
  }

  @Override
  public String getServletInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    System.out.println("BServlet destroy!");
  }

}
