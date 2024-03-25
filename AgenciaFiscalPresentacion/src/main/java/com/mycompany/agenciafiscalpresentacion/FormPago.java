/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import javax.swing.JOptionPane;

/**
 *
 * @author lv1821
 */
public class FormPago extends javax.swing.JFrame {

    //private ClienteDTO clienteDTO;
    // private VehiculoDTO vehiculoDTO;
    /**
     * Creates new form FormPago
     */
    public FormPago( /*ClienteDTO clienteDTO /*, VehiculoDTO vehiculoDTO*/) {
        //this.clienteDTO = clienteDTO;
        //this.vehiculoDTO = vehiculoDTO;
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
        btnAceptar = new javax.swing.JButton();
        txtTituloTramite = new javax.swing.JLabel();
        txtTramite = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListDatosCarros = new javax.swing.JList<>();
        panCosto = new javax.swing.JPanel();
        txtCosto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        panHeader.setBackground(new java.awt.Color(217, 217, 217));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscal.png"))); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTitulo.setText("Pago");

        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCerrar.setText("Atras");
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 404, Short.MAX_VALUE)
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

        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        txtTituloTramite.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTituloTramite.setText("Tramite:");

        txtTramite.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtTramite.setText("Tramite");

        ListDatosCarros.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ListDatosCarros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Numero de serie:", "Marca:", "Linea:", "Modelo:", "Color:", "RFC del dueño:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListDatosCarros);

        panCosto.setBackground(new java.awt.Color(217, 217, 217));

        txtCosto.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtCosto.setText("Costo:");

        txtMonto.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        txtMonto.setText("$0.0");

        javax.swing.GroupLayout panCostoLayout = new javax.swing.GroupLayout(panCosto);
        panCosto.setLayout(panCostoLayout);
        panCostoLayout.setHorizontalGroup(
            panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCostoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtCosto)
                .addGap(243, 243, 243)
                .addComponent(txtMonto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCostoLayout.setVerticalGroup(
            panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCostoLayout.createSequentialGroup()
                .addGroup(panCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCostoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtCosto))
                    .addGroup(panCostoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMonto)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panEntrarLayout = new javax.swing.GroupLayout(panEntrar);
        panEntrar.setLayout(panEntrarLayout);
        panEntrarLayout.setHorizontalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEntrarLayout.createSequentialGroup()
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtTituloTramite))
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAceptar))
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(txtTramite)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panEntrarLayout.setVerticalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addComponent(txtTituloTramite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTramite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
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
        FormPlacas fp = new FormPlacas();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Pago Completado \n¿Quieres registrar otra placa?", "Pago Completado!", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            FormPlacas fp = new FormPlacas();
            fp.setVisible(true);
            this.dispose();
        } else {
            FormMenuPrincipal fmp = new FormMenuPrincipal();
            fmp.setVisible(true);
            this.dispose();
        }  
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListDatosCarros;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panCosto;
    private javax.swing.JPanel panEntrar;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panHeader;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtMonto;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTituloTramite;
    private javax.swing.JLabel txtTramite;
    // End of variables declaration//GEN-END:variables
}
