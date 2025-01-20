import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*;  
import java.util.Date;
public class myServlet extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res)  
throws ServletException,IOException  
{  
res.setContentType("text/html");//setting the content type  
PrintWriter pw=res.getWriter();//get the stream to write the data  
  
Date d=new Date();
pw.println("Welcome to Java Servlet");  
pw.println("Today date and time is "+d.toString()); 
pw.close();//closing the stream  
}}  