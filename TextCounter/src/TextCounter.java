import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/textCounter")
public class TextCounter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String t = request.getParameter("t");

        //wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<body>");
        writer.println("<it>"+t +"</it></br>");
        writer.println("<h3>ilość słów: " + allWords(t)+ "</br>");
        writer.println("Ilość znaków: " + allSigns(t)+ "</br>");
        writer.println("Ilość znaków (bez spacji): " + withoutBlanks(t) + "</br>");
        writer.println("Palindrom: : " +isPalindrom(t)+ "</br></h3>");
        writer.println("</body>");
        writer.println("</html>");


    }

    int allSigns(String s){
        return s.length();
    }

    int withoutBlanks(String s){
        int counter=0;
        for (int i = 0 ; i < s.length() ; i++){
            char x = s.charAt(i); // pobieramy pojedynczy znak z napisu
            if(x == ' ') // porównanie ze znakiem
            {                           // przekazywanym jako parametr
                counter++; // zwiększamy wartość zmiennej
            }
        }
        return s.length()-counter;
    }

    int allWords(String s){
        String [] words = s.split(" ");
        return words.length;
    }

    boolean isPalindrom(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String reverse = sb.reverse().toString();
        return (reverse).equals(s);
    }


}
