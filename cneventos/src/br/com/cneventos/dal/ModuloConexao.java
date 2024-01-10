/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cneventos.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author André
 */
public class ModuloConexao {
    // Metodo responsavel por estabelexer a conexão com o banco

        public static Connection conector() throws ClassNotFoundException, SQLException{
        Connection conexao = null;
        // A linha abaixo "chama" o driver
            String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco
        String url="jdbc:mysql://localhost:3306/dbcneventos";
        String user="root";
        String password = "suporte@123";
        // Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //A linha abaixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            //e.printStackTrace();
            return null;
        }    
    }
}
