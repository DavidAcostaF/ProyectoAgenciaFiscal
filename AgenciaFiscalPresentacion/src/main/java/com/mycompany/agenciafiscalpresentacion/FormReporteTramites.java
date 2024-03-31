/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.agenciafiscalpresentacion;

import com.mycompany.agenciafiscaldtos.TramiteDTO;
import com.mycompany.agenciafiscalnegocio.IReporteTramitesBO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Berry
 */
public class FormReporteTramites extends javax.swing.JFrame {

    IReporteTramitesBO reporteTramitesBO;
    private List<TramiteDTO> listaTramites;

    /**
     * Creates new form FormReporteTramites
     */
    public FormReporteTramites(IReporteTramitesBO reporteTramitesBO) {
        initComponents();
        this.reporteTramitesBO = reporteTramitesBO;
        listaTramites = reporteTramitesBO.consultarTramites();
        llenarTabla(listaTramites);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabConsultas = new javax.swing.JTable();
        btnGenerarReporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte tramites realizados");

        panFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        panHeader.setBackground(new java.awt.Color(217, 217, 217));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/multimedia/AgenciaFiscal.png"))); // NOI18N

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        txtTitulo.setText("Tramites realizados");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
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

        tabConsultas.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tabConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Fecha", "Cliente", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tabConsultas);

        btnGenerarReporte.setText("Generar reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEntrarLayout = new javax.swing.GroupLayout(panEntrar);
        panEntrar.setLayout(panEntrarLayout);
        panEntrarLayout.setHorizontalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerarReporte)
                .addGap(46, 46, 46))
        );
        panEntrarLayout.setVerticalGroup(
            panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntrarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGenerarReporte)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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
        FormFiltroReporte ffr = new FormFiltroReporte();

        ffr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        /* Output file location to create report in pdf form */
        String outputFile = System.getProperty("user.home") + "\\Downloads\\" + "Tramites.pdf";

        if (this.listaTramites == null) {
            JOptionPane.showMessageDialog(this, "No hay tramites");
            return;
        }


        /* Convert List to JRBeanCollectionDataSource */
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(this.listaTramites);

        /* Map to hold Jasper report Parameters */
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("CollectionBeanParam", itemsJRBean);

        //read jrxml file and creating jasperdesign object
        InputStream input = null;
        try {
            input = new FileInputStream(new File("src\\main\\resources\\JasperFile\\ReportesTramites.jrxml"));

            JasperDesign jasperDesign = JRXmlLoader.load(input);

            /*compiling jrxml with help of JasperReport class*/
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

            /* Using jasperReport object to generate PDF */
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

            OutputStream outputStream = new FileOutputStream(new File(outputFile));

            JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);

            /*call jasper engine to display report in jasperviewer window*/
            JasperViewer.viewReport(jasperPrint,false);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormReporteTramites.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(FormReporteTramites.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed
    private void llenarTabla(List<TramiteDTO> listaTramites) {
        DefaultTableModel modelo = (DefaultTableModel) tabConsultas.getModel();

        if (listaTramites != null) {
            listaTramites.forEach(t -> modelo.addRow(new Object[]{t.getTipo(), t.getFecha(), t.getNombre(), t.getCosto()}));
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panEntrar;
    private javax.swing.JPanel panFondoBlanco;
    private javax.swing.JPanel panHeader;
    private javax.swing.JTable tabConsultas;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
