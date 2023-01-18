package com.Register;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends  HttpServlet{
   public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
         response.setContentType("text/html");
        PrintWriter  out=response.getWriter();
        out.println("<h2>Welcome to Regiter Servlet</h2>");
        String name=request.getParameter("user_name");
         String password=request.getParameter("user_passowrd");
          String email=request.getParameter("user_email");
           String gender=request.getParameter("user_gender");
            String course=request.getParameter("user_Course");
             String cond=request.getParameter("condition");
             if(cond!=null){
            if(cond.equals("checked")){
                out.println("<h2> Name:"+name+"</h2>");
                 out.println("<h2>password:"+password+"</h2>");
                  out.println("<h2>email:"+email+"</h2>");
                   out.println("<h2>gender:"+gender+"</h2>");
                    out.println("<h2>course:"+course+"</h2>");
            }else{
                out.println("<h2>You have not accepted terms and Condition</h2>"); 
            }
             }else{
                out.println("<h2>You have not accepted terms and Condition</h2>");  
             }
   }
   }

