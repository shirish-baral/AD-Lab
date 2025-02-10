import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FormServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter(); 
        
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String message = req.getParameter("message");
        
        pw.println("<html><body>");
        pw.println("<h2>Form Submission Results:</h2>");
        pw.println("<p>Name: " + name + "</p>");
        pw.println("<p>Email: " + email + "</p>");
        pw.println("<p>Message: " + message + "</p>");
        pw.println("</body></html>");
    }
} 
