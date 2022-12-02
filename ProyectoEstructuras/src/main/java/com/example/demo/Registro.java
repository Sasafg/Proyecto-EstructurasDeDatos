/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.demo;

import static com.example.demo.Orden.md;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Saryf
 */
public class Registro extends javax.swing.JFrame {
    //estoy creando un fichero txt para poder guardar el registro del carro y posteriormente mostrarlo en otra seccion 
    static File fichero = new File("REGISTRO.txt");
    static DefaultTableModel md;
    String data[][] = {};
    String Detalles[] = {"Placa", "Marca", "Tipo", "Modelo", "Año", "Color", "Pasajeros", "Gas/Dies", "Motor", "ESTADO"};
    static ArrayList<carro> arregloCliente;
    static ArrayList<carro> arreglo;
    

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(this);
        md = new DefaultTableModel(data, Detalles);
        tabla.setModel(md);
    }

 
        /**
     * Reestablece los valores en las cajas de texto mostradas al usuario
     */
    public void limpiar() {
        //Limpia los campos
        this.txtPlaca.setText("");
        this.jComboTipo.setSelectedIndex(0);
        this.jComboGAS.setSelectedIndex(0);
        this.jComboMarca.setSelectedIndex(0);
        this.jComboModelo.setSelectedIndex(0);
        this.jComboMotor.setSelectedIndex(0);
        this.jComboPasajeros.setSelectedIndex(0);
        this.jComboTipo.setSelectedIndex(0);
        this.jComboAño.setSelectedIndex(0);
        this.jComboColor.setSelectedIndex(0);
        this.jComboESTADO.setSelectedIndex(0);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboMarca = new javax.swing.JComboBox<>();
        jComboColor = new javax.swing.JComboBox<>();
        jComboAño = new javax.swing.JComboBox<>();
        jComboModelo = new javax.swing.JComboBox<>();
        jComboPasajeros = new javax.swing.JComboBox<>();
        jComboGAS = new javax.swing.JComboBox<>();
        jComboMotor = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        btnVerRegistro = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        IDREGISTRO = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jcGPS = new javax.swing.JCheckBox();
        jcCANASTA = new javax.swing.JCheckBox();
        jcRADIO = new javax.swing.JCheckBox();
        jcBOTON = new javax.swing.JCheckBox();
        jcRACKS = new javax.swing.JCheckBox();
        jcALARMA = new javax.swing.JCheckBox();
        btnOrdenAlq = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jComboESTADO = new javax.swing.JComboBox<>();
        btnVerRegistro1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("HENZ RENT A CAR");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("REGISTRO DE VEHICULO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("PLACA:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("MARCA:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("MODELO:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("AÑO:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("COLOR:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("CILINDRAGE:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("COMBUSTIBLE:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("CAPACIDAD PASAJEROS:");

        jComboMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "TOYOTA", "NISSAN", "KIA", "BMW", "MERCEDES BENZ", " " }));

        jComboColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "NEGRO", "GRIS PLATA", "AZUL REY", "ROJO VINO", "BLANCO", " ", " " }));

        jComboAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "2016", "2017", "2018", "2019", "2020", "2021", "2022", " ", " " }));
        jComboAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAñoActionPerformed(evt);
            }
        });

        jComboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "COROLLA ", "YARIS", "COROLLA CROSS", "RAV4", "HILUX", "SENTRA", "PATHFINDER", "FRONTIER", "RIO", "SPORTAGE", "SORENTO", "X1", "X4", "X6", "GLA", "COUPÉ", "CLASE G", " ", " " }));

        jComboPasajeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "5", "7" }));

        jComboGAS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "DIESEL", "GASOLINA", " " }));

        jComboMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "1333cc", "1500cc", "1800cc", "2500cc", "3600cc", " " }));
        jComboMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMotorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("TIPO:");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "SEDAN", "SUV", "PICK UP", " " }));
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });

        btnVerRegistro.setBackground(new java.awt.Color(204, 204, 255));
        btnVerRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerRegistro.setText("EDITAR CAMPOS");
        btnVerRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistroActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("ID DE REGISTRO");

        IDREGISTRO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IDREGISTRO.setEnabled(false);
        IDREGISTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDREGISTROActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("EXTRAS DEL VEHICULO");

        jcGPS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcGPS.setText("GPS");

        jcCANASTA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcCANASTA.setText("CANASTA");

        jcRADIO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcRADIO.setText("RADIO DE PANTALLA");

        jcBOTON.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcBOTON.setText("ARRANQUE CON BOTON ");

        jcRACKS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcRACKS.setText("RACKS");

        jcALARMA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jcALARMA.setText("ALARMA");

        btnOrdenAlq.setBackground(new java.awt.Color(102, 102, 255));
        btnOrdenAlq.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrdenAlq.setText("CREAR ORDEN \nDE ALQUILER");
        btnOrdenAlq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrdenAlq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenAlqActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "MARCA", "TIPO", "MODELO", "AÑO", "COLOR", "PASAJEROS", "COMBUSTIBLE"
            }
        ));
        tabla.setColumnSelectionAllowed(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        tabla.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tablaInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR VEHICULO ");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("ESTADO DEL VEHICULO");

        jComboESTADO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE UNA OPCION", "DISPONIBLE", "ALQUILADO", "EN REPARACION", "FUERA DE CIRCULACION", " " }));
        jComboESTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboESTADOActionPerformed(evt);
            }
        });

        btnVerRegistro1.setBackground(new java.awt.Color(204, 204, 255));
        btnVerRegistro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerRegistro1.setText("BUSCAR POR PLACA");
        btnVerRegistro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVerRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegistro1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("EL PRECIO DE CADA EXTRA DE VEHÍCULO EQUIVALE  A ₡3000 EXTRA DEL MONTO TOTAL");

        btnInfo.setBackground(new java.awt.Color(204, 204, 255));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInfo.setText("VER INFORMACION DE VEHICULO");
        btnInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(89, 89, 89)))
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel8))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboGAS, 0, 181, Short.MAX_VALUE)
                                            .addComponent(jComboPasajeros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboMotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcRADIO)
                                            .addComponent(jcBOTON))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jcCANASTA)
                                            .addComponent(jcALARMA)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(26, 26, 26)
                                        .addComponent(jComboESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcGPS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addGap(195, 195, 195))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jcRACKS)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(133, 133, 133)
                                .addComponent(btnOrdenAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(IDREGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addGap(133, 133, 133))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDREGISTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboGAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcRADIO)
                                    .addComponent(jcCANASTA))))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcRACKS)
                            .addComponent(jcBOTON)
                            .addComponent(jcALARMA))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(jComboESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jcGPS)
                            .addGap(109, 109, 109))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerRegistro1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnOrdenAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoActionPerformed

    private void jComboAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboAñoActionPerformed

    private void btnVerRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroActionPerformed
     JOptionPane.showInputDialog("Ingrese el numero de placa que para editar campo");

    }//GEN-LAST:event_btnVerRegistroActionPerformed

    private void btnOrdenAlqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenAlqActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Orden Registro = new Orden();
        // Método setVisible para mostrar formulario
        Registro.setVisible(true);
        // Declaración para ocultar formulario:

        String estado = JOptionPane.showInputDialog("Ingrese placa del vehiculo deseado para continuar con la orden");
        
        if (!txtPlaca.getText().equals(estado)) {
            JOptionPane.showMessageDialog(rootPane, "VEHICULO NO REGISTRADO EN EL SISTEMA");
        
          
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "El estado del vehículo es:"+jComboESTADO.getSelectedItem());
        }
        
        
    }//GEN-LAST:event_btnOrdenAlqActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      
        
    

      
      
                String placa = txtPlaca.getText();
                String marca = (String) jComboMarca.getSelectedItem();
                String tipo = (String) jComboTipo.getSelectedItem();
                String modelo = (String) jComboModelo.getSelectedItem();
                String anio = (String) jComboAño.getSelectedItem();
                String color = (String) jComboColor.getSelectedItem();
                String pasajeros = (String) jComboPasajeros.getSelectedItem();
                String gas = (String) jComboGAS.getSelectedItem();
                String motor = (String) jComboMotor.getSelectedItem();
                String estado = (String) jComboESTADO.getSelectedItem();

                

                if (this.txtPlaca.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboMarca.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboTipo.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboModelo.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboAño.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboColor.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboPasajeros.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboAño.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");
                } else if (this.jComboESTADO.getSelectedItem().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informacion Incompleta");

                } else {
                    Object datos[] = {placa, marca, tipo, modelo, anio, color, pasajeros, gas, motor, estado};
                    md.addRow(datos);
                    {
                JOptionPane.showMessageDialog(null, "Informacion guardada satisfactoriamente");
               
               
               }
                    
               }
               
    
      
       
            
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void IDREGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDREGISTROActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < data.length; i++) {
            String[] strings = data[i];
            
        }
    
    }//GEN-LAST:event_IDREGISTROActionPerformed

    private void jComboMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboMotorActionPerformed

    private void jComboESTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboESTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboESTADOActionPerformed

    private void btnVerRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerRegistro1ActionPerformed

    private void tablaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tablaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaInputMethodTextChanged

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
      //esto es para que cuando uno seleccine la tabla 
        int select = tabla.rowAtPoint(evt.getPoint());
        
        
    }//GEN-LAST:event_tablaMouseClicked

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        String estado = JOptionPane.showInputDialog("Ingrese placa del vehiculo para ver su informacion");
        
        if (!txtPlaca.getText().equals(estado)) {
            JOptionPane.showMessageDialog(rootPane, "VEHICULO NO REGISTRADO EN EL SISTEMA");
        
          
            
        }else{
            JOptionPane.showMessageDialog(null,"Informacion del vehiculo:"+
                    jComboMarca.getSelectedItem()+"\n"+
                    jComboTipo.getSelectedItem()+"\n"+
                    jComboModelo.getSelectedItem()+"\n"+
                    jComboAño.getSelectedItem()+"\n"+
                    jComboColor.getSelectedItem()+"\n"+
                    jComboPasajeros.getSelectedItem()+"\n"+
                    jComboGAS.getSelectedItem()+"\n"+
                    jComboMotor.getSelectedItem()+"\n"+
                    jComboESTADO.getSelectedItem()+"\n");
        }
         limpiar(); 
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDREGISTRO;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnOrdenAlq;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerRegistro;
    private javax.swing.JButton btnVerRegistro1;
    private javax.swing.JComboBox<String> jComboAño;
    private javax.swing.JComboBox<String> jComboColor;
    private javax.swing.JComboBox<String> jComboESTADO;
    private javax.swing.JComboBox<String> jComboGAS;
    private javax.swing.JComboBox<String> jComboMarca;
    private javax.swing.JComboBox<String> jComboModelo;
    private javax.swing.JComboBox<String> jComboMotor;
    private javax.swing.JComboBox<String> jComboPasajeros;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcALARMA;
    private javax.swing.JCheckBox jcBOTON;
    private javax.swing.JCheckBox jcCANASTA;
    private javax.swing.JCheckBox jcGPS;
    private javax.swing.JCheckBox jcRACKS;
    private javax.swing.JCheckBox jcRADIO;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
