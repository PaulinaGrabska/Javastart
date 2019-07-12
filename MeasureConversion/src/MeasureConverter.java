import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/converter")
public class MeasureConverter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mm = request.getParameter("mm");
        String cm = request.getParameter("cm");
        String m = request.getParameter("m");

        String kg = request.getParameter("kg");
        String g = request.getParameter("g");
        String mg = request.getParameter("mg");


        //wysyłamy odpowiedź
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();


        if (!mm.isEmpty() && cm.isEmpty() && m.isEmpty()) {
            Double toCm = Double.valueOf(Double.valueOf(mm) / 10);
            Double toM = Double.valueOf(Double.valueOf(mm) / 1000);

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>metry: " + toM + "</br>");
            writer.println("centymetry: " + toCm + "</br>");
            writer.println("milimetry: " + mm + "</br> </h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if (mm.isEmpty() && !cm.isEmpty() && m.isEmpty()) {
            Double toMm = Double.valueOf(Double.valueOf(cm) * 10);
            Double toM = Double.valueOf(Double.valueOf(cm) / 100);


            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>metry: " + toM+ "</br>");
            writer.println("centymetry: " + cm+ "</br>");
            writer.println("milimetry: " + toMm + " </h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if (mm.isEmpty() && cm.isEmpty() && !m.isEmpty()) {
            Double toCm = Double.valueOf(Double.valueOf(m) * 100);
            Double toMm = Double.valueOf(Double.valueOf(m) * 1000);

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>metry: " + m + "</br>");
            writer.println("centymetry: " + toCm + "</br>");
            writer.println("milimetry: " + toMm +"</h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if(mm.isEmpty() && cm.isEmpty() && m.isEmpty()){

        }else{
            writer.println("<h2>Należy wypełnić tylko 1 pole</h2></br></br>");
        }


        //waga
        if (!kg.isEmpty() && g.isEmpty() && mg.isEmpty()) {
            Double toG = Double.valueOf(Double.valueOf(kg) * 1000);
            Double toMg = Double.valueOf(Double.valueOf(kg) * 1000000);

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>kilogramy: " + kg + "</br>");
            writer.println("gramy: " + toG+ "</br>");
            writer.println("miligramy: " + toMg+"</h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if (kg.isEmpty() && !g.isEmpty() && mg.isEmpty()) {
            Double toKg = Double.valueOf(Double.valueOf(g) / 1000);
            Double toMg = Double.valueOf(Double.valueOf(g) * 1000);

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>kilogramy: " + toKg + "</br>");
            writer.println("gramy: " + g + "</br>");
            writer.println("miligramy: " + toMg +"</h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if (kg.isEmpty() && g.isEmpty() && !mg.isEmpty()) {
            Double toKg = Double.valueOf(Double.valueOf(mg) / 1000000);
            Double toG = Double.valueOf(Double.valueOf(mg) / 1000);

            writer.println("<html>");
            writer.println("<body>");
            writer.println("<h2>Podana wartość w przeliczeniu na:</h2>");
            writer.println("<h3>kilogramy: " + toKg + "</br>");
            writer.println("gramy: " + toG + "</br>");
            writer.println("miligramy: " + mg +"</h3>");
            writer.println("</body>");
            writer.println("</html>");
        } else if(kg.isEmpty() && g.isEmpty() && mg.isEmpty()){

        }else{
            writer.println("<h2>Należy wypełnić tylko 1 pole</h2>");
        }

    }

}
