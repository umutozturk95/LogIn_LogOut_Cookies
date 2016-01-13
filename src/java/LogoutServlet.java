/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.*;
/**
 *
 * @author HP
 */
public class LogoutServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        
        request.getRequestDispatcher("link.html").include(request,response);
        
        Cookie ck=new Cookie("name","");
        ck.setMaxAge(0);
        response.addCookie(ck);
        out.print("You are successfully logged out!");
    }
    
}
