/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

/**
 *
 * @author HP
 */
public class LoginServlet extends HttpServlet {
  public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      request.getRequestDispatcher("link.html").include(request,response);
      
      String name=request.getParameter("name");
      String password=request.getParameter("password");
      
        if(password.equals("admin123")){
            
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, "+name);
            
            Cookie ck=new Cookie("name",name);
            response.addCookie(ck);
            
            
        }
        
        else{
            out.print("sorry, username or password error!");
            request.getRequestDispatcher("login.html").include(request,response);
            
        }
        
        out.close();
      
  }
    
}
