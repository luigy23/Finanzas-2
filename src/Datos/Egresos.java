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
public class Egresos {
   

private PreparedStatement PS;
private conexion CN;
ResultSet rs;

    public Egresos() {
        PS=null;
CN= new conexion();
    }

public int InsertarIngreso (int Valor,String Descripción,String V_T,String Fecha ) {
    try{
    String SQL = "INSERT INTO egresos (Valor,Descripción,V_T,Fecha) Values (?,?,?,?)";
    PS= CN.getConnection().prepareStatement(SQL);
    PS.setInt(1, Valor);
    PS.setNString(2, Descripción);
    PS.setNString(3, V_T);
    PS.setNString(4, Fecha);
   
        int res =    PS.executeUpdate();
        if(res>0){ JOptionPane.showMessageDialog(null,"Ingresos Guardados: "+ res);
            }
    }
    catch(SQLException e){
    
    System.err.println("Error al Guardar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
    
return 0;

}

public DefaultTableModel model;
public void tabla (){
  String [] titulos = {"Valor","Descripción","V/T","Fecha"};  
  String [] registros =new String[4];
String slq= "SELECT * FROM egresos";
model = new DefaultTableModel(null,titulos);

    try {
        PS= CN.getConnection().prepareStatement("SELECT * FROM `egresos` ORDER BY `egresos`.`IdEgresos` DESC");
        rs= PS.executeQuery();
        
        while (rs.next()) {            
            registros[0]="$ "+rs.getString("Valor");
            registros[1]=rs.getString("Descripción");
            registros[2]=rs.getString("V_T");
            registros[3]=rs.getString("Fecha");
            model.addRow(registros);
        }
        
    } catch (SQLException ex) {

        System.err.println("error: "+ex);
    }


}

public void tablaFecha (String fecha){
  String [] titulos = {"Valor","Descripción","V/T","Fecha"};  
  String [] registros =new String[4];
String slq= "SELECT * FROM egresos";
model = new DefaultTableModel(null,titulos);

    try {
        PS= CN.getConnection().prepareStatement("SELECT * FROM `egresos` WHERE Fecha LIKE '%"+fecha+"%'");
        rs= PS.executeQuery();
        
        while (rs.next()) {            
            registros[0]="$ "+rs.getString("Valor");
            registros[1]=rs.getString("Descripción");
            registros[2]=rs.getString("V_T");
            registros[3]=rs.getString("Fecha");
            model.addRow(registros);
        }
        
    } catch (SQLException ex) {

        System.err.println("error: "+ex);
    }


}

public void tablaVT (String VT){
  String [] titulos = {"Valor","Descripción","V/T","Fecha"};  
  String [] registros =new String[4];

model = new DefaultTableModel(null,titulos);

    try {
        PS= CN.getConnection().prepareStatement("SELECT * FROM `egresos` WHERE V_T LIKE '%"+VT+"%'");
        rs= PS.executeQuery();
        
        while (rs.next()) {            
            registros[0]="$ "+rs.getString("Valor");
            registros[1]=rs.getString("Descripción");
            registros[2]=rs.getString("V_T");
            registros[3]=rs.getString("Fecha");
            model.addRow(registros);
          
        }
        
    } catch (SQLException ex) {

        System.err.println("error: "+ex);
    }


}
public void tabla2F (String VT, String fecha){
  String [] titulos = {"Valor","Descripción","V/T","Fecha"};  
  String [] registros =new String[4];

model = new DefaultTableModel(null,titulos);

    try {
        PS= CN.getConnection().prepareStatement("SELECT * FROM `egresos` WHERE V_T LIKE '%"+VT+"%' AND Fecha LIKE '%"+fecha+"%'");
        rs= PS.executeQuery();
        
        while (rs.next()) {            
            registros[0]="$ "+rs.getString("Valor");
            registros[1]=rs.getString("Descripción");
            registros[2]=rs.getString("V_T");
            registros[3]=rs.getString("Fecha");
            model.addRow(registros);
          
        }
        
    } catch (SQLException ex) {

        System.err.println("error: "+ex);
    }


}

}