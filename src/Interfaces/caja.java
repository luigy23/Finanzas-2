/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Datos.Caja;
import Datos.Egresos;
import Datos.Ingresos;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultKeyedValuesDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCPieDataset;

/**
 *
 * @author EMPRESA
 */
public class caja extends javax.swing.JFrame {

private Caja caj;
private Inicio ini;
private Ingresos Dat;
    public caja() {
        initComponents();
        this.setLocationRelativeTo(null);
        caj= new Caja();
        ini=new Inicio();
        Dat = new Ingresos();
        
        try {
            // cargarEgresos();
             cargarIngresos();
             Cargarcaja();
        } catch (Exception e) {
            System.err.println(e);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopMenuTabla = new javax.swing.JPopupMenu();
        MenuBorrar = new javax.swing.JMenuItem();
        Menu = new javax.swing.JTabbedPane();
        PanelTablas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_ingresos = new javax.swing.JTable();
        Panel_Filtro = new javax.swing.JPanel();
        BTN_FechaAuto = new javax.swing.JButton();
        Tf_VT = new javax.swing.JTextField();
        Tf_Fecha = new javax.swing.JTextField();
        Btn_VT = new javax.swing.JButton();
        Btn_2filtros = new javax.swing.JButton();
        Btn_Fecha = new javax.swing.JButton();
        Fondo_Filtro = new javax.swing.JLabel();
        Panel_Estadisticas = new javax.swing.JPanel();
        Tf_Egresost = new javax.swing.JTextField();
        Tf_TotalG = new javax.swing.JTextField();
        Tf_Total = new javax.swing.JTextField();
        Tf_Ingresost = new javax.swing.JTextField();
        Porcentaje = new javax.swing.JLabel();
        Fondo_Estadisticas = new javax.swing.JLabel();
        Panel_Principal = new javax.swing.JPanel();
        Label_Saldo = new javax.swing.JLabel();
        BTN_guardar = new javax.swing.JButton();
        BTN_Volver = new javax.swing.JButton();
        Tf_Caja = new javax.swing.JTextField();
        Label_Fondo = new javax.swing.JLabel();

        MenuBorrar.setBackground(new java.awt.Color(255, 102, 102));
        MenuBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        MenuBorrar.setForeground(new java.awt.Color(255, 255, 255));
        MenuBorrar.setText("Borrar");
        MenuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBorrarActionPerformed(evt);
            }
        });
        PopMenuTabla.add(MenuBorrar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N

        PanelTablas.setBackground(new java.awt.Color(255, 255, 255));
        PanelTablas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N

        T_ingresos.setBackground(new java.awt.Color(255, 255, 255));
        T_ingresos.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        T_ingresos.setComponentPopupMenu(PopMenuTabla);
        T_ingresos.setDragEnabled(false);
        T_ingresos.setEditingColumn(0);
        T_ingresos.setEditingRow(0);
        T_ingresos.setFocusable(false);
        T_ingresos.setGridColor(new java.awt.Color(255, 255, 255));
        T_ingresos.setSelectionBackground(new java.awt.Color(0, 153, 153));
        T_ingresos.setSelectionForeground(new java.awt.Color(255, 255, 0));
        jScrollPane2.setViewportView(T_ingresos);

        PanelTablas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 270));

        Menu.addTab("Movimientos", PanelTablas);

        Panel_Filtro.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Filtro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_FechaAuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón fechaauto.png"))); // NOI18N
        BTN_FechaAuto.setBorder(null);
        BTN_FechaAuto.setContentAreaFilled(false);
        BTN_FechaAuto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_FechaAuto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón fechaauto ON.png"))); // NOI18N
        BTN_FechaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_FechaAutoActionPerformed(evt);
            }
        });
        Panel_Filtro.add(BTN_FechaAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 150, 30));

        Tf_VT.setBackground(new Color(0,0,0,0));
        Tf_VT.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        Tf_VT.setForeground(new java.awt.Color(0, 0, 0));
        Tf_VT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_VT.setToolTipText("");
        Tf_VT.setBorder(null);
        Tf_VT.setCaretColor(new java.awt.Color(255, 255, 255));
        Tf_VT.setOpaque(false);
        Panel_Filtro.add(Tf_VT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, 30));

        Tf_Fecha.setBackground(new Color(0,0,0,0));
        Tf_Fecha.setFont(new java.awt.Font("Bebas Neue", 0, 26)); // NOI18N
        Tf_Fecha.setForeground(new java.awt.Color(0, 0, 0));
        Tf_Fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Fecha.setToolTipText("");
        Tf_Fecha.setBorder(null);
        Tf_Fecha.setCaretColor(new java.awt.Color(255, 255, 255));
        Tf_Fecha.setOpaque(false);
        Panel_Filtro.add(Tf_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, 30));

        Btn_VT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn V_T.png"))); // NOI18N
        Btn_VT.setBorder(null);
        Btn_VT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_VT.setOpaque(false);
        Btn_VT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn V_T on.png"))); // NOI18N
        Btn_VT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_VTActionPerformed(evt);
            }
        });
        Panel_Filtro.add(Btn_VT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 120, 40));

        Btn_2filtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn todos.png"))); // NOI18N
        Btn_2filtros.setBorder(null);
        Btn_2filtros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_2filtros.setOpaque(false);
        Btn_2filtros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn todos on.png"))); // NOI18N
        Btn_2filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_2filtrosActionPerformed(evt);
            }
        });
        Panel_Filtro.add(Btn_2filtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 40));

        Btn_Fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn FEcha.png"))); // NOI18N
        Btn_Fecha.setBorder(null);
        Btn_Fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Fecha.setOpaque(false);
        Btn_Fecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Btn FEcha on.png"))); // NOI18N
        Btn_Fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FechaActionPerformed(evt);
            }
        });
        Panel_Filtro.add(Btn_Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 120, 40));

        Fondo_Filtro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo filtro.png"))); // NOI18N
        Panel_Filtro.add(Fondo_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        Menu.addTab("Filtar", Panel_Filtro);

        Panel_Estadisticas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Estadisticas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tf_Egresost.setEditable(false);
        Tf_Egresost.setBackground(new Color(0,0,0,0));
        Tf_Egresost.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        Tf_Egresost.setForeground(new java.awt.Color(0, 0, 0));
        Tf_Egresost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Egresost.setBorder(null);
        Tf_Egresost.setOpaque(false);
        Tf_Egresost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tf_EgresostKeyReleased(evt);
            }
        });
        Panel_Estadisticas.add(Tf_Egresost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 230, 40));

        Tf_TotalG.setEditable(false);
        Tf_TotalG.setBackground(new Color(0,0,0,0));
        Tf_TotalG.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        Tf_TotalG.setForeground(new java.awt.Color(0, 0, 0));
        Tf_TotalG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_TotalG.setBorder(null);
        Tf_TotalG.setOpaque(false);
        Tf_TotalG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tf_TotalGKeyReleased(evt);
            }
        });
        Panel_Estadisticas.add(Tf_TotalG, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 165, 230, 30));

        Tf_Total.setEditable(false);
        Tf_Total.setBackground(new Color(0,0,0,0));
        Tf_Total.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        Tf_Total.setForeground(new java.awt.Color(0, 0, 0));
        Tf_Total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Total.setBorder(null);
        Tf_Total.setOpaque(false);
        Tf_Total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tf_TotalKeyReleased(evt);
            }
        });
        Panel_Estadisticas.add(Tf_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 230, 40));

        Tf_Ingresost.setEditable(false);
        Tf_Ingresost.setBackground(new Color(0,0,0,0));
        Tf_Ingresost.setFont(new java.awt.Font("Bebas Neue", 0, 30)); // NOI18N
        Tf_Ingresost.setForeground(new java.awt.Color(0, 0, 0));
        Tf_Ingresost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Ingresost.setBorder(null);
        Tf_Ingresost.setOpaque(false);
        Tf_Ingresost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tf_IngresostKeyReleased(evt);
            }
        });
        Panel_Estadisticas.add(Tf_Ingresost, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 16, 230, 40));

        Porcentaje.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        Porcentaje.setText("0%");
        Panel_Estadisticas.add(Porcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, 20));

        Fondo_Estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/interfaz Estadisticas.png"))); // NOI18N
        Panel_Estadisticas.add(Fondo_Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        Menu.addTab("Estadisticas", Panel_Estadisticas);

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 750, 390));

        Panel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Saldo.setBackground(new java.awt.Color(183, 238, 195));
        Label_Saldo.setFont(new java.awt.Font("Bebas Neue", 0, 38)); // NOI18N
        Label_Saldo.setForeground(new java.awt.Color(53, 173, 88));
        Label_Saldo.setText("0");
        Panel_Principal.add(Label_Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        BTN_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón guardar.png"))); // NOI18N
        BTN_guardar.setBorder(null);
        BTN_guardar.setContentAreaFilled(false);
        BTN_guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón guardar ON.png"))); // NOI18N
        BTN_guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón guardar ON.png"))); // NOI18N
        BTN_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_guardarActionPerformed(evt);
            }
        });
        Panel_Principal.add(BTN_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, 50));

        BTN_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón volver.png"))); // NOI18N
        BTN_Volver.setBorder(null);
        BTN_Volver.setContentAreaFilled(false);
        BTN_Volver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_Volver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Botón volver ON.png"))); // NOI18N
        BTN_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_VolverActionPerformed(evt);
            }
        });
        Panel_Principal.add(BTN_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 130, 50));

        Tf_Caja.setBackground(new Color(0,0,0,0));
        Tf_Caja.setFont(new java.awt.Font("Bebas Neue", 0, 34)); // NOI18N
        Tf_Caja.setForeground(new java.awt.Color(0, 0, 0));
        Tf_Caja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tf_Caja.setBorder(null);
        Tf_Caja.setCaretColor(new java.awt.Color(0, 153, 153));
        Tf_Caja.setOpaque(false);
        Tf_Caja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tf_CajaKeyReleased(evt);
            }
        });
        Panel_Principal.add(Tf_Caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 290, 30));

        Label_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo Caja.png"))); // NOI18N
        Panel_Principal.add(Label_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(Panel_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //Actualizar Tablas
 
    
//todas    

 String selecitem(int dato){

DefaultTableModel t = (DefaultTableModel) T_ingresos.getModel();
int fselec= T_ingresos.getSelectedRow();
String valor = t.getValueAt(fselec, dato).toString();

return valor;

}
 void Cargarcaja(){
    DecimalFormat df = new DecimalFormat("#,###");
    caj.ObtenerDatos();
        
        String saldo= caj.obtenerTextInfo("Saldo");
        int saldo2= Integer.parseInt(saldo);
        Label_Saldo.setText("$ "+df.format(saldo2));
        char simbol = saldo.charAt(0);
        if (simbol=='-') {
            Label_Saldo.setForeground(Color.red);
     
     

        }

}
     public void borrarregistro() {

        try {

            int id = Integer.parseInt(selecitem(7));
            int ganancia = Integer.parseInt(selecitem(3).replace("$ ", ""));

            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este ingreso?");
            if (resp == 0) {

                caj.ObtenerDatos();

                int Saldoac = Integer.parseInt(caj.obtenerTextInfo("Saldo"));
                System.out.println("saldo actual= " + Saldoac);
                int ingreso = Saldoac - ganancia;

                caj.ActualizarCaja(Integer.toString(ingreso));
                Dat.Eliminaringreso(id);
                Cargarcaja();
                cargarIngresos();

            }
        } catch (HeadlessException | NumberFormatException e) {

            System.out.println("el eerror al dar borrar es : " + e);
        }


 
 } 
    
    
    
 void cargarIngresos(){

Ingresos a = new Ingresos();
a.tabla();
T_ingresos.setModel(a.model);
estilotabla();
/*JTableHeader th; 
th = T_ingresos.getTableHeader();
th.setForeground(Color.BLACK);
Font fuente = new Font("Bebas Neue", Font.PLAIN, 18);  
th.setFont(fuente); 
th.setForeground(Color.WHITE);
th.setBackground(new Color(199,226,123));*/
}
   
//Fechas 
 void estilotabla(){
 
 
 JTableHeader th; 
th = T_ingresos.getTableHeader();
th.setForeground(Color.BLACK);
Font fuente = new Font("Bebas Neue", Font.PLAIN, 18);  
th.setFont(fuente); 
th.setForeground(Color.WHITE);
th.setBackground(new Color(199,226,123));
 
 }
    
//V/T 
  void cargarIngresosVT(){

Ingresos a = new Ingresos();
a.tablaVT(Tf_VT.getText());
T_ingresos.setModel(a.model);
estilotabla();

}  

// 2Filtros
  void cargarIngresos2F(){

Ingresos a = new Ingresos();
a.tabla2F(Tf_VT.getText(),Tf_Fecha.getText());
T_ingresos.setModel(a.model);

JTableHeader th; 
th = T_ingresos.getTableHeader();
th.setForeground(Color.BLACK);
Font fuente = new Font("Bebas Neue", Font.PLAIN, 18);  
th.setFont(fuente); 
th.setForeground(Color.WHITE);
th.setBackground(new Color(199,226,123));
} 

 
  
    //Estadisticas
  
 int TotalIn = 0; //valor total de los ingresos
 int TotalEg=0; //valor total de los Egresos
 int Totalegin=0;//valor de ingresos+egresos
 int TotalG=0;
 float Tporcenaje = 0;
 private void Estadisticas(){
  DecimalFormat df = new DecimalFormat("#,###");
         TotalizarIngresos();
     
        Totalizar();
        TotalizarGanancias();
        Tporcenaje();
        Tf_Ingresost.setText("$ "+df.format(TotalIn));
        Tf_Egresost.setText("$ "+df.format(TotalEg));
        Tf_Total.setText("$ "+df.format(Totalegin));
        Tf_TotalG.setText("$ "+df.format(TotalG));
        Porcentaje.setText("%"+Tporcenaje);
        
  TotalIn = 0; //valor total de los ingresos
 TotalEg=0; //valor total de los Egresos
 Totalegin=0;//valor de ingresos+egresos
  TotalG=0;
  Tporcenaje=0;
  
 }
 private void TotalizarIngresos(){

int p = 0;
if(T_ingresos.getRowCount()>0){
for (int i = 0; i < T_ingresos.getRowCount(); i++) {
p = Integer.parseInt(T_ingresos.getValueAt(i, 0).toString().replace("$ ", ""));
TotalIn+=p;
}

}else{

}




} // Metodo para Totalizar Ingresos

private void Totalizar(){
Totalegin=TotalIn+TotalEg;

}
private void TotalizarGanancias(){

TotalG= TotalIn-TotalEg;
}

private void Tporcenaje(){

 Tporcenaje= (TotalG/TotalIn);

System.out.println("el porcentaj es : %"+ Tporcenaje);


}
        

// Metodo para Totalizar Egresos
 
 
 private void Graficar(){
 
		DefaultPieDataset dataset = new DefaultPieDataset();
		//dataset.addValue("Ingresos", TotalIn);
		dataset.setValue("Egresos", TotalEg);
		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, // legend?
				true, // tooltips?
				false // URLs?
		);
     ChartPanel cp=new ChartPanel(chart);
      //jPanel2.add(cp);
     cp.setBounds(7,5,180,160);
   
 }
 
 
 
    private void BTN_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_VolverActionPerformed
        Inicio inicio= new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BTN_VolverActionPerformed

    private void BTN_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_guardarActionPerformed
int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de Guardar el saldo");
if (resp==0) {
   String valorS =Tf_Caja.getText().replace(".", "");
caj.ActualizarCaja(valorS);
Cargarcaja();
JOptionPane.showMessageDialog(null,"Caja Actualizada");

}
 
    }//GEN-LAST:event_BTN_guardarActionPerformed

    private void Btn_VTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_VTActionPerformed


cargarIngresosVT();
JOptionPane.showMessageDialog(null, "tablas actualizadas");
Estadisticas();

    }//GEN-LAST:event_Btn_VTActionPerformed

    private void BTN_FechaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_FechaAutoActionPerformed
        Date date = new Date();
        DateFormat HoraFechaFormat = new SimpleDateFormat("h:mm a - dd/MM/YYYY");
        Tf_Fecha.setText(HoraFechaFormat.format(date));
        DateFormat Timeformat = new SimpleDateFormat("YYYYMMDDHHMM");
      

    }//GEN-LAST:event_BTN_FechaAutoActionPerformed

    private void Btn_FechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FechaActionPerformed

        JOptionPane.showMessageDialog(null, "tablas actualizadas");
        Estadisticas();
        
    }//GEN-LAST:event_Btn_FechaActionPerformed

    private void Btn_2filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_2filtrosActionPerformed

        cargarIngresos2F();

        JOptionPane.showMessageDialog(null, "tablas actualizadas");
        Estadisticas();

    }//GEN-LAST:event_Btn_2filtrosActionPerformed

    private void Tf_CajaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_CajaKeyReleased
 DecimalFormat df = new DecimalFormat("#,###");
        
        if (Tf_Caja.getText().length() >= 1) {
 
            Tf_Caja.setText( df.format(Integer.valueOf(Tf_Caja.getText().replace(".", "").replace(",", ""))) );}    }//GEN-LAST:event_Tf_CajaKeyReleased

    private void Tf_IngresostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_IngresostKeyReleased

    }//GEN-LAST:event_Tf_IngresostKeyReleased

    private void Tf_EgresostKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_EgresostKeyReleased
    }//GEN-LAST:event_Tf_EgresostKeyReleased

    private void Tf_TotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_TotalKeyReleased

        
          }//GEN-LAST:event_Tf_TotalKeyReleased

    private void Tf_TotalGKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf_TotalGKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_TotalGKeyReleased

    private void MenuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBorrarActionPerformed

        borrarregistro();

    }//GEN-LAST:event_MenuBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_FechaAuto;
    private javax.swing.JButton BTN_Volver;
    private javax.swing.JButton BTN_guardar;
    private javax.swing.JButton Btn_2filtros;
    private javax.swing.JButton Btn_Fecha;
    private javax.swing.JButton Btn_VT;
    private javax.swing.JLabel Fondo_Estadisticas;
    private javax.swing.JLabel Fondo_Filtro;
    private javax.swing.JLabel Label_Fondo;
    private javax.swing.JLabel Label_Saldo;
    private javax.swing.JTabbedPane Menu;
    private javax.swing.JMenuItem MenuBorrar;
    private javax.swing.JPanel PanelTablas;
    private javax.swing.JPanel Panel_Estadisticas;
    private javax.swing.JPanel Panel_Filtro;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JPopupMenu PopMenuTabla;
    private javax.swing.JLabel Porcentaje;
    private javax.swing.JTable T_ingresos;
    private javax.swing.JTextField Tf_Caja;
    private javax.swing.JTextField Tf_Egresost;
    private javax.swing.JTextField Tf_Fecha;
    private javax.swing.JTextField Tf_Ingresost;
    private javax.swing.JTextField Tf_Total;
    private javax.swing.JTextField Tf_TotalG;
    private javax.swing.JTextField Tf_VT;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
