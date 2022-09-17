package jdbcPractise;

import java.sql.*;

public class Query04 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","beyza0571.");

        //Statement st = con.createStatement();

        /*
        Statement ve Prestatement arasindaki fark nedir?
        prestatement;
        1-daha dinamik
        2-daha az yer kapliyor
        */

        PreparedStatement ps = con.prepareStatement("insert into ogrenciler values(?, ?, ?, ?)");
        ps.setInt(1, 201);
        ps.setString(2, "Veli Can");
        ps.setString(3, "12");
        ps.setString(4, "E");

        ps.executeUpdate();

        System.out.println("Veri girişi yapıldı.");
    }
}