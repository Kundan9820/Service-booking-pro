
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class GetBookingsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        JSONArray bookingsArray = new JSONArray();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/service_booking", "root", "yourpassword");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM bookings");

            while (rs.next()) {
                JSONObject booking = new JSONObject();
                booking.put("id", rs.getInt("id"));
                booking.put("fullName", rs.getString("full_name"));
                booking.put("email", rs.getString("email"));
                booking.put("serviceType", rs.getString("service_type"));
                booking.put("date", rs.getString("date"));
                booking.put("message", rs.getString("message"));
                bookingsArray.put(booking);
            }

            rs.close();
            stmt.close();
            conn.close();

            response.getWriter().print(bookingsArray.toString());
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().print("[]");
        }
    }
}
