/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import com.mycompany.agenciafiscaldtos.ClienteDTO;

/**
 *
 * @author Berry
 */
public class FormFiltroReporte extends javax.swing.JFrame {

    /**
     * Creates new form FormConsultas
     */
    public FormFiltroReporte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondoBlanco = new javax.swing.JPanel();
        panHeader = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        panEntrar = new javax.swing.JPanel();
        txfTipoTramite = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JLabel();
        txtRfc = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        txtFechaNacimiento1 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        panHeader.setBackground(new java.awt.Color(217, 217, 217));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscal.png"))); // NOI18N

        txtTitulo.setText("Consultas");
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N

        btnCerrar.setText("Atras");
        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(22, 22, 22))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgLogo)
                    .addGroup(panHeaderLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panHeaderLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnCerrar))
                            .addComponent(txtTitulo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panEntrar.setBackground(new java.awt.Color(236, 236, 236));

        txfTipoTramite.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        txfNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        txtNombre.setText("Nombre:");
        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        txtFechaNacimiento.setText("Desde");
        txtFechaNacimiento.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        txtRfc.setText("Tipo tramite");
        txtRfc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        btnAceptar.setText("Aceptar");
        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtFechaNacimiento1.setText("Hasta");
        txtFechaNacimiento1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        datePicker2.setName(""); // NOI18N
        datePicker2.setToolTipText("");

        javax.swing.GroupLayout panEntrarLayout = new javax.swing.GroupLayout(panEntrar);
        panEntrar.setLayout(panEntrarLayout);
        panEntrarLayout.setHorizontalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panEntrarLayout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEntrarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRfc, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtFechaNacimiento1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfTipoTramite, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(btnAceptar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panEntrarLayout.setVerticalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfTipoTramite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRfc))
                .addGap(14, 14, 14)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(txtFechaNacimiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFechaNacimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panFondoBlancoLayout = new javax.swing.GroupLayout(panFondoBlanco);
        panFondoBlanco.setLayout(panFondoBlancoLayout);
        panFondoBlancoLayout.setHorizontalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panFondoBlancoLayout.setVerticalGroup(
            panFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoBlancoLayout.createSequentialGroup()
                .addComponent(panHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondoBlanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        FormMenuPrincipal fmp = new FormMenuPrincipal();
        fmp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        FormReporteTramites frp = new FormReporteTramites();
        frp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel panEntrar;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panHeader;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfTipoTramite;
    private javax.swing.JLabel txtFechaNacimiento;
    private javax.swing.JLabel txtFechaNacimiento1;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtRfc;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
