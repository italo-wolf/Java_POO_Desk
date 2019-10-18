/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_de_.n2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CNN {

    String databaseURL = "jdbc:postgresql://localhost/loca_veiculo";
    String usuario = "postgres";
    String senha = "italo210597";
    String driverName = "org.postgresql.Driver";

    Statement stm;

    public void conect() {

        try {
            Class.forName(driverName).newInstance();
            Connection cn = DriverManager.getConnection(databaseURL, usuario, senha);
            stm = cn.createStatement();

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
        }
    }

}
