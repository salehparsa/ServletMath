import java.io.IOException;
import java.io.*;
import java.util.Arrays;

/**
 * Created by saleh on 8/28/16.
 */
public class Servlet extends javax.servlet.http.HttpServlet {

    Fibonacci fibonacci = new Fibonacci();
    Factorial fact = new Factorial();
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        int number;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        String radio = request.getParameter("radio");
        String value = request.getParameter("number");
        number = Integer.parseInt(value);

        try (PrintWriter writer = response.getWriter()) {

            writer.println("<!DOCTYPE html><html>");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\" />");
            writer.println("<title>MyServlet.java:doGet(): Servlet code!</title>"); // Edit to add Equation as a title
            writer.println("</head>");
            writer.println("<body>");
          //  writer.println(radio + number);
            if(radio.equals("Fibonacci")) {
                for (int i = 1; i <= number; i++) {
                    writer.println(fibonacci.Fibonacci(i) + " ");
                }
            }
            else if (radio.equals("Factorial")){
                writer.println(fact.Factorial(number));
            }
            else
            {
                writer.println("Please Select Something");
            }
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
