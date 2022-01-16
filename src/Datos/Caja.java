/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import ConexionSQL.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author EMPRESA
 */
public class Caja {
    
private PreparedStatement PS;
private conexion CN;
ResultSet rs;

 public Caja() {
    PS=null;
    CN= new conexion();
    }

public int ActualizarCaja (String saldo){
    
    String SQL = "UPDATE `caja` SET `Saldo` = '"+saldo+"' WHERE `caja`.`IdCaja` = 1";
     
    try{
        PS= CN.getConnection().prepareStatement(SQL);
        
        int res =   PS.executeUpdate();
        if (res>0){ System.out.println("Caja Actualizada: "+res);
            
        }
        
    }
    catch(Exception e){
        System.err.println("Error al actualizar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
        
     
    
    
    
    return 0;
}

public int ObtenerDatos(){
    
    try{
        PS= CN.getConnection().prepareStatement("SELECT * FROM caja WHERE IdCaja = 1");
        
       rs = PS.executeQuery();
        
       if(rs.next()){
           
            }
    }
    catch(Exception e){
    
    System.err.println("Error al Guardar los datos en la db: "+e.getMessage() );
    }finally{
        PS=null;
        CN.desconectar();
            }
    
return 0;




}

public int obtenerIntInfo(String datoI){
    
    int Datoint = 0;
    
    try {
        if (rs.getInt(datoI)>0){
           Datoint= rs.getInt(datoI);
        } else {JOptionPane.showMessageDialog(null, "no hay info en campo: "+datoI);
        }
      
        
    } catch (Exception e) {
     System.err.println("No se encontró ese dato "+e.getMessage() );
CN.desconectar();
    }
   
    
 return Datoint; 



}
public String obtenerTextInfo(String datoT){
    
 
    
 String Sdato=null;
    try {
        Sdato= rs.getString(datoT);
        if (Sdato!=null) {
           
        }else{JOptionPane.showMessageDialog(null, "no hay info en el campo: "+ datoT);}
        
        
    } catch (Exception e) {
     
    JOptionPane.showMessageDialog(null, "no se ha encontrado ningún resultado");
    System.err.println("No se encontró ese dato "+e.getMessage() );

    }
    
 return Sdato; 
}
}
