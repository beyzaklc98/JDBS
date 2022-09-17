package pratic;

import java.sql.*;

public class C1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/calisma02", "postgres", "nunix123");
        Statement st = con.createStatement();
        String studentshow = "select * from ogrenci";
        boolean ss1 = st.execute(studentshow);
        System.out.println(ss1); // true return oldu. neden??
        ResultSet resutltogrenci = st.executeQuery(studentshow);
        while (resutltogrenci.next()) {
            System.out.println(resutltogrenci.getInt("student_number")
                    + "--" + resutltogrenci.getString("student_name")
                    + "--" + resutltogrenci.getInt("student_age")
                    + "--" + resutltogrenci.getString("course"));
        }
    }
}
