/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import ConexionSQL.conexion;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ingresos {

    private PreparedStatement PS;
    private conexion CN;
    ResultSet rs;

    public Ingresos() {
        PS = null;
        CN = new conexion();
    }

    public int InsertarIngreso(int Valor, int Costo, int PagoT, int Ganancia, String Descripción, String V_T, String Fecha) {
        try {
            String SQL = "INSERT INTO ingresos (Valor,Costo,PagoT,Ganancia,Descripción,V_T,Fecha) Values (?, ?, ?, ?, ?, ?, ?) ";

            PS = CN.getConnection().prepareStatement(SQL);

            PS.setInt(1, Valor);
            PS.setInt(2, Costo);
            PS.setInt(3, PagoT);
            PS.setInt(4, Ganancia);
            PS.setNString(5, Descripción);
            PS.setNString(6, V_T);
            PS.setNString(7, Fecha);

            int res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Ingresos Guardados: " + res);
            }
        } catch (SQLException e) {

            System.err.println("Error al Guardar los datos en la db: " + e.getMessage());
        } finally {
            PS = null;
            CN.desconectar();
        }

        return 0;

    }

    public int Eliminaringreso(int id) {

        try {
            
            String SQL = "DELETE FROM `ingresos` WHERE `ingresos`.`IdIngresos` = ?";
            PS = CN.getConnection().prepareStatement(SQL);
            PS.setInt(1, id);

            int res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Ingreso Eliminado : " + res);
            }
            
            
        } catch (HeadlessException | SQLException e) {
            System.err.println("Error al Guardar los datos en la db: " + e.getMessage());
        }finally {
            PS = null;
            CN.desconectar();
        }
        
        
    return 0;
    }
    
    
    
    /// DESDE AQUI EMPIEZA EL CODIGO DE LA TABLA
    //
    //
    
    public DefaultTableModel model;
    String[] titulos = {"Valor", "Costo", "PagoT", "Ganancia",
        "Descripción", "V/T", "Fecha", "ID"};

    String[] registros = new String[8];

    void rellenar() {

        try {
            while (rs.next()) {
                registros[0] = "$ " + rs.getString("Valor");
                registros[1] = "$ " + rs.getString("Costo");
                registros[2] = "$ " + rs.getString("PagoT");
                registros[3] = "$ " + rs.getString("Ganancia");
                registros[4] = rs.getString("Descripción");
                registros[5] = rs.getString("V_T");
                registros[6] = rs.getString("Fecha");
                registros[7] = rs.getString("IdIngresos");
                model.addRow(registros);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void tabla() {

        model = new DefaultTableModel(null, titulos);

        try {
            PS = CN.getConnection().prepareStatement("SELECT * FROM `ingresos` ORDER BY `ingresos`.`IdIngresos` DESC");
            rs = PS.executeQuery();
            rellenar();

        } catch (SQLException ex) {

            System.err.println("error: " + ex);
        }

    }

    public void tablaFecha(String fecha) {

        model = new DefaultTableModel(null, titulos);

        try {
            PS = CN.getConnection().prepareStatement("SELECT * FROM `ingresos` WHERE Fecha LIKE '%" + fecha + "%' ");
            rs = PS.executeQuery();

            rellenar();

        } catch (SQLException ex) {

            System.err.println("error: " + ex);
        }

    }

    
    public void tablanegativo(String fecha) {

        model = new DefaultTableModel(null, titulos);

        try {
            PS = CN.getConnection().prepareStatement("SELECT * FROM `ingresos` WHERE Ganancia LIKE '%-%'");
            rs = PS.executeQuery();

            rellenar();

        } catch (SQLException ex) {

            System.err.println("error: " + ex);
        }

    }
    
    
    
    
    
    
    public void tablaVT(String VT) {

        model = new DefaultTableModel(null, titulos);

        try {
            PS = CN.getConnection().prepareStatement("SELECT * FROM `ingresos` WHERE V_T LIKE '%" + VT + "%' ");
            rs = PS.executeQuery();

            rellenar();

        } catch (SQLException ex) {

            System.err.println("error: " + ex);
        }

    }

    public void tabla2F(String VT, String fecha) {

        model = new DefaultTableModel(null, titulos);

        try {
            PS = CN.getConnection().prepareStatement("SELECT * FROM `ingresos` WHERE V_T LIKE '%" + VT + "%' AND Fecha LIKE '%" + fecha + "%'");
            rs = PS.executeQuery();
            rellenar();
        } catch (SQLException ex) {

            System.err.println("error: " + ex);
        }

    }
}
