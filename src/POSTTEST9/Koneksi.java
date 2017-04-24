/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST9;

import POSTTEST8.*;
import POSTTEST7.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Koneksi 
{
    private static Connection Koneksi;
    
    public static Connection Buka_Koneksi() {
       try
       {
           Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/fkti","root","");
           JOptionPane.showMessageDialog(null, "Berhasil Terhubung");
       }
       catch (SQLException e)
       {
            JOptionPane.showMessageDialog(null, "Gagal Terhubung"+e.getMessage());
       }
    return Koneksi;
    }    
}
