package jdbcPractise;

import java.sql.*;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1) Driver Yukle
        Class.forName("org.postgresql.Driver");

        //2) Baglantı Olustur
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed", "postgres", "beyza0571.");

        //3) Statement
        Statement st=con.createStatement();

        //4) ResultSet
        ResultSet veri=st.executeQuery("select * from ogrenciler");

        //5) Sonucları Al
        while (veri.next()){
            //index kullanarak
            //System.out.println(veri.getInt(1)+" "+veri.getString(2)+" "
            //      +veri.getString(3)+" "+veri.getString(4));

            //sutun ismi kullanarak
            //System.out.println(veri.getInt("okul_no")+" "+veri.getString("ogrenci_ismi")+" "
            //       +veri.getString("sinif")+" "+veri.getString("cinsiyet"));

            System.out.printf("%-6d %-15.15s %-8s %-8s\n", veri.getInt(1), veri.getString(2), veri.getString(3), veri.getString(4));
        }

        //6) close kapatma
        con.close();
        st.close();
        veri.close();
    }
}