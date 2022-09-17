package jdbcPractise;

import java.sql.*;

public class Query03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/techproed","postgres","beyza0571.");


        //Statement st = con.createStatement();

        PreparedStatement ps = con.prepareStatement("select * from ogrenciler");

        ResultSet rs = ps.executeQuery();

        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("stun sayisi = " + rsmd.getColumnCount());

        System.out.println("1. Stunun ismi : " + rsmd.getColumnName(1));
        System.out.println("2. Stunun ismi : " + rsmd.getColumnName(2));
        System.out.println("3. Stunun ismi : " + rsmd.getColumnName(3));
        System.out.println("4. Stunun ismi : " + rsmd.getColumnName(4));

        System.out.println();

        System.out.println("1. Stunun ismi : " + rsmd.getColumnTypeName(1));
        System.out.println("2. Stunun ismi : " + rsmd.getColumnTypeName(2));
        System.out.println("3. Stunun ismi : " + rsmd.getColumnTypeName(3));
        System.out.println("4. Stunun ismi : " + rsmd.getColumnTypeName(4));

        System.out.println("4. Stunun ismi : " + rsmd.getTableName(2));
    }
}