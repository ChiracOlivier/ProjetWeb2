package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Main", urlPatterns = "/Main")
public class Main extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String message = "Transmission de variables : OK !";
    request.setAttribute("test", message);
    this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
  }


}
