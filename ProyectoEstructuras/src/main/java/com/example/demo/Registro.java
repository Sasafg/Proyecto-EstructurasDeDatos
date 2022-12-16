
package com.example.demo;

import static com.example.demo.Orden.md;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.RowSorter;

/**
 *
 * @author Saryf
 */
public class Registro extends javax.swing.JFrame {
    ListaCarro lc = new ListaCarro();
    //estoy creando un fichero txt para poder guardar el registro del carro y posteriormente mostrarlo en otra seccion 
    static File fichero = new File("REGISTRO.txt");
    static DefaultTableModel md;
    String data[][] = {};
    String Detalles[] = {"Placa", "Marca", "Tipo", "Modelo", "Año", "Color", "Pasajeros", "Gas/Dies", "Motor", "ESTADO"};
    static ArrayList<carro> arregloCliente;
    static ArrayList<carro> arreglo;
    private TableRowSorter buscar;
    String filtro;

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(this);
        md = new DefaultTableModel(data, Detalles);
        tabla.setModel(md);
    }
    public Registro(ListaCarro liCa) {
        this.lc= liCa;
        initComponents();
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
        btnBuscarPl = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        CCLIENTE = new javax.swing.JButton();

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

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });

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
                "PLACA", "MARCA", "TIPO", "MODELO", "AÑO", "COLOR", "PASAJEROS", "COMBUSTIBLE", "EXTRAS"
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

        btnBuscarPl.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscarPl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscarPl.setText("BUSCAR POR PLACA");
        btnBuscarPl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscarPl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPlActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("EL PRECIO DE CADA EXTRA DE VEHÍCULO EQUIVALE  A ₡3000 EXTRA DEL MONTO TOTAL");

        btnInfo.setBackground(new java.awt.Color(204, 204, 255));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInfo.setText("INFO DEl VEHICULO");
        btnInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        CCLIENTE.setBackground(new java.awt.Color(102, 102, 255));
        CCLIENTE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CCLIENTE.setText("CREAR CLIENTE");
        CCLIENTE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CCLIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCLIENTEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(69, 69, 69)
                                        .addComponent(jComboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8))
                                        .addGap(122, 122, 122)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboGAS, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcGPS)
                                    .addComponent(jcRACKS))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcBOTON)
                                    .addComponent(jcRADIO))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcCANASTA)
                                    .addComponent(jcALARMA)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel13))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrdenAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscarPl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdenAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jComboPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboGAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jComboMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcRADIO)
                                    .addComponent(jcCANASTA)
                                    .addComponent(jcGPS))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcALARMA)
                                    .addComponent(jcBOTON)
                                    .addComponent(jcRACKS))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jComboESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(165, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     JOptionPane.showMessageDialog(null,"Seleccione en la tabla, la fila que deseas editar!");
    
     int select = tabla.getRowCount();
     if(select!=0){
         int seleccion=tabla.getSelectedRow();
      String pl= tabla.getValueAt(seleccion, 0).toString();
      String tip= tabla.getValueAt(seleccion, 1).toString();
      String gas= tabla.getValueAt(seleccion, 2).toString();
      String mrc= tabla.getValueAt(seleccion, 3).toString();
      String mod= tabla.getValueAt(seleccion, 4).toString();
      String mot= tabla.getValueAt(seleccion, 5).toString();
      String psj= tabla.getValueAt(seleccion, 6).toString();
      String tp= tabla.getValueAt(seleccion, 7).toString();
      String ann= tabla.getValueAt(seleccion, 8).toString();
      String cl= tabla.getValueAt(seleccion, 9).toString();
      String est= tabla.getValueAt(seleccion, 10).toString();
      
      
              txtPlaca.setText(pl);
        jComboTipo.setSelectedItem(tip);
        jComboGAS.setSelectedItem(gas);
        jComboMarca.setSelectedItem(mrc);
        jComboModelo.setSelectedItem(mod);
        jComboMotor.setSelectedItem(mot);
        jComboPasajeros.setSelectedItem(psj);
        jComboTipo.setSelectedItem(tp);
        jComboAño.setSelectedItem(ann);
        jComboColor.setSelectedItem(cl);
        jComboESTADO.setSelectedItem(est);
     }
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

    private void jComboMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboMotorActionPerformed

    private void jComboESTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboESTADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboESTADOActionPerformed

    private void btnBuscarPlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPlActionPerformed
        // TODO add your handling code here:
      
       txtPlaca.addKeyListener(new KeyAdapter(){
        
             public void KeyReleased(final KeyEvent e){
            String cadena = txtPlaca.getText();
            txtPlaca.setText(cadena);
            repaint();
            filtro();
           } 
        });
    
        
         limpiar();
    }//GEN-LAST:event_btnBuscarPlActionPerformed

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

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void CCLIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCLIENTEActionPerformed
        // TODO add your handling code here:
         registrarClientes Registro = new registrarClientes();
        // Método setVisible para mostrar formulario
        Registro.setVisible(true);
        
    }//GEN-LAST:event_CCLIENTEActionPerformed

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        // TODO add your handling code here:
        buscar = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(buscar);
        
    
   
    }//GEN-LAST:event_txtPlacaKeyTyped
 public void filtro(){
        filtro = txtPlaca.getText();
        buscar.setRowFilter(RowFilter.regexFilter(txtPlaca.getText(), 0));
        }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
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
    private javax.swing.JButton CCLIENTE;
    private javax.swing.JButton btnBuscarPl;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnOrdenAlq;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerRegistro;
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
