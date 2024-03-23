/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;


/**
 *
 * @author lv1821
 */
public class FormPlacasCarroRegistrado extends javax.swing.JFrame {

    /**
     * Creates new form FormPlacasCarroRegistrado
     */
    public FormPlacasCarroRegistrado() {
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
        txtTitulo1 = new javax.swing.JLabel();
        panEntrar = new javax.swing.JPanel();
        txfNumPlacasAnteriores = new javax.swing.JTextField();
        txtNumPlacasAnteriores = new javax.swing.JLabel();
        txfRfcNuevoDueño = new javax.swing.JTextField();
        txtRfcNuevoDueño = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        panHeader.setBackground(new java.awt.Color(217, 217, 217));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscal.png"))); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTitulo.setText("Placas");

        btnCerrar.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnCerrar.setText("Atras");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        txtTitulo1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo1.setText("Carro registrado");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addComponent(txtTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
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
                            .addGroup(panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTitulo)
                                .addComponent(txtTitulo1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panEntrar.setBackground(new java.awt.Color(236, 236, 236));

        txfNumPlacasAnteriores.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        txtNumPlacasAnteriores.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtNumPlacasAnteriores.setText("Numero de placas anteriores:");

        txfRfcNuevoDueño.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        txtRfcNuevoDueño.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        txtRfcNuevoDueño.setText("Rfc del Nuevo dueño:");

        btnAceptar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEntrarLayout = new javax.swing.GroupLayout(panEntrar);
        panEntrar.setLayout(panEntrarLayout);
        panEntrarLayout.setHorizontalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnAceptar))
                    .addGroup(panEntrarLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRfcNuevoDueño)
                            .addComponent(txtNumPlacasAnteriores))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfRfcNuevoDueño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNumPlacasAnteriores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        panEntrarLayout.setVerticalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtNumPlacasAnteriores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfNumPlacasAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRfcNuevoDueño)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfRfcNuevoDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(26, 26, 26))
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
        FormPago fpa = new FormPago();
        fpa.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel panEntrar;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panHeader;
    private javax.swing.JTextField txfNumPlacasAnteriores;
    private javax.swing.JTextField txfRfcNuevoDueño;
    private javax.swing.JLabel txtNumPlacasAnteriores;
    private javax.swing.JLabel txtRfcNuevoDueño;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo1;
    // End of variables declaration//GEN-END:variables
}
