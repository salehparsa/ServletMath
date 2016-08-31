import java.io.IOException;
import java.io.*;

/**
 * Created by saleh on 8/28/16.
 */
public class Servlet extends javax.servlet.http.HttpServlet {

    Fibonacci fibonacci = new Fibonacci();
    Factorial fact = new Factorial();
    OddEven isEven = new OddEven();
    isPrime prime = new isPrime();
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
            writer.println("<title>"+radio+"</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Result of " + radio + " </h1>");
            if(radio.equals("Fibonacci")) {
                for (int i = 1; i <= number; i++) {
                    writer.println(fibonacci.Fibonacci(i) + " ");
                }
            }
            else if (radio.equals("Factorial")){
                writer.println(fact.Factorial(number));
            }
            else if (radio.equals("isEven"))
            {
                if (isEven.OddEven(number) == true)
                {
                    writer.println(number+ " is Even");
                }
                else {
                    writer.println(number+ " is odd");
                }
            }
            else if (radio.equals("isPrime")){
                if (prime.isPrime(number) == true)
                {
                    writer.println(number + " is Prime");
                }
                else {
                    writer.println(number + " is not Prime");
                }
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
