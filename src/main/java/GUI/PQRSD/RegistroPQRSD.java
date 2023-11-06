package GUI.PQRSD;

import Coneccion.CConexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RegistroPQRSD extends javax.swing.JFrame {

    public CConexion con = new CConexion();
    boolean ArchivoSubido = false;
    boolean FormularioEnviado = false;
    
    public RegistroPQRSD() {
        con.establecerConexion();
        initComponents();
        //Comprobar si se subieron archivos
        btnSubirArchivo.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ArchivoSubido = true;
            }
        });
        //Comprobar que se envió el formulario
        btnEnviar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                FormularioEnviado = true;
            }
        });
    }
    
    public void ReiniciarFormulario(){
        if(FormularioEnviado){
            NApartamento.setText("");
            Torre.setText("");
            NIdentificacion.setText("");
            Nombres.setText("");
            Apellidos.setText("");
            Correo.setText("");
            Telefono.setText("");
            Asunto.setText("");
            Mensaje.setText("");
            ArchivoSubido=false;
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RespuestaPQRSD = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NApartamento = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NIdentificacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Correo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TipoIdentificacion = new javax.swing.JComboBox<>();
        TipoPQRSD = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Asunto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSubirArchivo = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Escrita = new javax.swing.JRadioButton();
        CorreoElectronico = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Torre = new javax.swing.JTextField();
        btnListado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro PQRSD");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("N° Apartamento");

        NApartamento.setForeground(new java.awt.Color(51, 51, 51));
        NApartamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de identificación");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Nombres");

        Nombres.setForeground(new java.awt.Color(51, 51, 51));
        Nombres.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Apellidos");

        Apellidos.setForeground(new java.awt.Color(51, 51, 51));
        Apellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("N° Identificación");

        NIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        NIdentificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Correo electrónico");

        Correo.setForeground(new java.awt.Color(51, 51, 51));
        Correo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Telefóno");

        Telefono.setForeground(new java.awt.Color(51, 51, 51));
        Telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tipo de PQRSD");

        TipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de Ciudadanía", "Pasaporte", "Cedula de extranjería", "Tarjeta de Identidad" }));

        TipoPQRSD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Petición", "Queja", "Reclamo", "Solicitud", "Denuncia", "Felicitaciones" }));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Asunto");

        Asunto.setForeground(new java.awt.Color(51, 51, 51));
        Asunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Mensaje");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Ajuntar documento");

        btnSubirArchivo.setBackground(new java.awt.Color(204, 204, 204));
        btnSubirArchivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubirArchivo.setText("SELECCIONAR");
        btnSubirArchivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubirArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirArchivoActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(51, 153, 0));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("ENVIAR");
        btnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("¿Cómo desea recibir respuesta?");

        RespuestaPQRSD.add(Escrita);
        Escrita.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Escrita.setText("Escrita");

        RespuestaPQRSD.add(CorreoElectronico);
        CorreoElectronico.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CorreoElectronico.setText("Correo electrónico");

        Mensaje.setColumns(20);
        Mensaje.setForeground(new java.awt.Color(51, 51, 51));
        Mensaje.setLineWrap(true);
        Mensaje.setRows(5);
        jScrollPane1.setViewportView(Mensaje);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Torre");

        Torre.setForeground(new java.awt.Color(51, 51, 51));
        Torre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnListado.setBackground(new java.awt.Color(153, 153, 153));
        btnListado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListado.setForeground(new java.awt.Color(255, 255, 255));
        btnListado.setText("LISTADO DE PQRSD");
        btnListado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnListado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(161, 161, 161))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(Apellidos)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Torre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TipoPQRSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel13))
                                        .addComponent(Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(CorreoElectronico)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Escrita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSubirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))
                                .addComponent(jSeparator1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NApartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Torre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(TipoPQRSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoElectronico)
                    .addComponent(Escrita)
                    .addComponent(btnSubirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
    }//GEN-LAST:event_btnEnviarActionPerformed


    private void btnSubirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirArchivoActionPerformed
        JFrame CuadroArchivo = new JFrame("Subir archivo");
        JFileChooser SubirArchivo = new JFileChooser();

        SubirArchivo.setFileFilter(new FileNameExtensionFilter("Archivos PDF", "pdf"));
        int result = SubirArchivo.showOpenDialog(CuadroArchivo);

        try {
            if (result == JFileChooser.APPROVE_OPTION) {
                //Obtener PDF seleccionado
                File archivo = SubirArchivo.getSelectedFile();

                //Leeer contenido de PDF
                FileInputStream entrada = new FileInputStream(archivo);
                byte[] bytes = new byte[(int) archivo.length()];
                entrada.read(bytes);
                entrada.close();

                //Ingreso a la tabla ArchivosPQRSD
                try {
                    PreparedStatement pst = con.establecerConexion().prepareStatement("INSERT INTO tblArchivosPQRSD VALUES(?)");
                    pst.setBytes(1, bytes);
                    pst.executeUpdate();
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSubirArchivoActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        ListadoPQRSD ventana = new ListadoPQRSD();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        //Llena la tabla de datos personales
        if (NIdentificacion.getText().length() > 0 && Nombres.getText().length() > 0 && Apellidos.getText().length() > 0) {
            if (Correo.getText().length() > 0 && Telefono.getText().length() > 0) {
                String query = "INSERT INTO tblDatosPQRSD VALUES('" + NIdentificacion.getText() + "', '" + String.valueOf(TipoIdentificacion.getSelectedItem()) + "', '" + Nombres.getText() + "', '" + Apellidos.getText() + "', '" + Correo.getText() + "', '" + Telefono.getText() + "')";
                try {
                    Statement st = con.establecerConexion().createStatement();
                    st.execute(query);
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBE COMPLETAR SUS DATOS PERSONALES");
        }

        //Llena dato sobre el medio de respuesta
        String MRespuesta = "";
        if (CorreoElectronico.isSelected()) {
            MRespuesta = "Correo Electrónico";
        }
        if (Escrita.isSelected()) {
            MRespuesta = "Escrita";
        }
        
        //Insercion de datos y validacion
        if (NApartamento.getText().length() > 0 && Torre.getText().length() > 0) {
            if (Asunto.getText().length() > 0 && Mensaje.getText().length() > 0) {
                try {
                    if (ArchivoSubido) {
                        System.out.println("Sube archivo");
                        String query = "EXEC sp_IngresoPQRS " + NApartamento.getText() + ", " + Torre.getText() + ", '" + String.valueOf(TipoPQRSD.getSelectedItem()) + "', '" + NIdentificacion.getText() + "', '" + Asunto.getText() + "', '" + Mensaje.getText() + "', '" + MRespuesta + "' ";
                        Statement st = con.establecerConexion().createStatement();
                        st.execute(query);
                        ReiniciarFormulario();
                    } else {
                        System.out.println("No sube archivo");
                        String query = "INSERT INTO tblPQRSD VALUES(SYSDATETIME()," + NApartamento.getText() + ", "  + Torre.getText() + ", '" + String.valueOf(TipoPQRSD.getSelectedItem()) + "', '" + NIdentificacion.getText() + "', '" + Asunto.getText() + "', '" + Mensaje.getText() + "', '" + MRespuesta + "', 0, 1)";
                        Statement st = con.establecerConexion().createStatement();
                        st.execute(query);
                        ReiniciarFormulario();
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "DEBES COMPLETAR LA PQRSD");
        }
    }//GEN-LAST:event_btnEnviarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Asunto;
    private javax.swing.JTextField Correo;
    private javax.swing.JRadioButton CorreoElectronico;
    private javax.swing.JRadioButton Escrita;
    private javax.swing.JTextArea Mensaje;
    private javax.swing.JTextField NApartamento;
    private javax.swing.JTextField NIdentificacion;
    private javax.swing.JTextField Nombres;
    private javax.swing.ButtonGroup RespuestaPQRSD;
    private javax.swing.JTextField Telefono;
    private javax.swing.JComboBox<String> TipoIdentificacion;
    private javax.swing.JComboBox<String> TipoPQRSD;
    private javax.swing.JTextField Torre;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnSubirArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
