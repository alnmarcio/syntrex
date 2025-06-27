package com.mycompany.syntrex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Syntrex_BD", "root", "");
        } catch (Exception e) {
                e.printStackTrace();;
        }
        return null;
    }
    
}