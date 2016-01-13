/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author HP
 */
public class ProfileServlet extends HttpServlet {
 public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException{
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
     
     request.getRequestDispatcher("link.html").include(request, response);
     
     Cookie[]ck=request.getCookies();
     if(ck!=null){
          String name=ck[0].getValue();
          if(!name.equals("")||name!=null){
              out.print("<b>Welcome to Profile!</b>");
              out.print("<br>Welcome,"+name);
              
          }
     }
     else{
         
         out.print("Please login first");
         request.getRequestDispatcher("login.html").include(request,response);
     }
     out.close();
     
 }
   
}
