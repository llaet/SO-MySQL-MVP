/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.canvas;

import br.com.infox.dal.ConnectionModule;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Lucas Laet
 */
public class MainCanvas extends javax.swing.JFrame {

    private Connection connection = null;

    /**
     * Creates new form MainCanvas
     */
    public MainCanvas() {
        initComponents();
        connection = ConnectionModule.connector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPanel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        registerBar = new javax.swing.JMenu();
        registerBarClient = new javax.swing.JMenuItem();
        registerBarSO = new javax.swing.JMenuItem();
        registerBarUser = new javax.swing.JMenuItem();
        reportBar = new javax.swing.JMenu();
        reportBarSR = new javax.swing.JMenuItem();
        reportBarCR = new javax.swing.JMenuItem();
        helpBar = new javax.swing.JMenu();
        helpBarAbout = new javax.swing.JMenuItem();
        optionsBar = new javax.swing.JMenu();
        optionsBarExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("X - OS control system");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        desktopPanel.setBackground(new java.awt.Color(0, 0, 0));
        desktopPanel.setPreferredSize(new java.awt.Dimension(550, 450));
        desktopPanel.setLayout(new javax.swing.OverlayLayout(desktopPanel));
        getContentPane().add(desktopPanel);
        desktopPanel.setBounds(10, 11, 600, 501);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/x-logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(643, 11, 128, 83);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setText("User");
        getContentPane().add(lblUser);
        lblUser.setBounds(643, 122, 140, 17);

        lblDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDate.setText("Date");
        getContentPane().add(lblDate);
        lblDate.setBounds(641, 162, 140, 17);

        menuBar.setBackground(new java.awt.Color(0, 51, 51));
        menuBar.setForeground(new java.awt.Color(255, 255, 255));

        registerBar.setBackground(new java.awt.Color(255, 255, 255));
        registerBar.setText("Register");

        registerBarClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        registerBarClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/client.png"))); // NOI18N
        registerBarClient.setText("Customer");
        registerBarClient.setPreferredSize(new java.awt.Dimension(203, 26));
        registerBarClient.setRolloverEnabled(true);
        registerBarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBarClientActionPerformed(evt);
            }
        });
        registerBar.add(registerBarClient);

        registerBarSO.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        registerBarSO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/service-order.png"))); // NOI18N
        registerBarSO.setText("Service Order");
        registerBarSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBarSOActionPerformed(evt);
            }
        });
        registerBar.add(registerBarSO);

        registerBarUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        registerBarUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/user.png"))); // NOI18N
        registerBarUser.setText("User");
        registerBarUser.setEnabled(false);
        registerBarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBarUserActionPerformed(evt);
            }
        });
        registerBar.add(registerBarUser);

        menuBar.add(registerBar);

        reportBar.setText("Report");
        reportBar.setEnabled(false);

        reportBarSR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        reportBarSR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/report.png"))); // NOI18N
        reportBarSR.setText("Services Report");
        reportBarSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBarSRActionPerformed(evt);
            }
        });
        reportBar.add(reportBarSR);

        reportBarCR.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        reportBarCR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/customer.png"))); // NOI18N
        reportBarCR.setText("Customers Report");
        reportBarCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBarCRActionPerformed(evt);
            }
        });
        reportBar.add(reportBarCR);

        menuBar.add(reportBar);

        helpBar.setText("Help");

        helpBarAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        helpBarAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/about.png"))); // NOI18N
        helpBarAbout.setText("About");
        helpBarAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBarAboutActionPerformed(evt);
            }
        });
        helpBar.add(helpBarAbout);

        menuBar.add(helpBar);

        optionsBar.setText("Options");

        optionsBarExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        optionsBarExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/exit.png"))); // NOI18N
        optionsBarExit.setText("Exit");
        optionsBarExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsBarExitActionPerformed(evt);
            }
        });
        optionsBar.add(optionsBarExit);

        menuBar.add(optionsBar);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(816, 584));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerBarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBarClientActionPerformed
        // Opens the CustomerCanvas inside the MainCanvas desktop
        CustomerCanvas clientCanvas = new CustomerCanvas();
        clientCanvas.setVisible(true);
        desktopPanel.add(clientCanvas);
    }//GEN-LAST:event_registerBarClientActionPerformed

    private void helpBarAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBarAboutActionPerformed
        // show about screen
        AboutCanvas about = new AboutCanvas();
        about.setVisible(true);
    }//GEN-LAST:event_helpBarAboutActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // change the date label for the actual system date
        Date date = new Date();
        DateFormat formatDate = DateFormat.getDateInstance(DateFormat.SHORT);
        lblDate.setText(formatDate.format(date));
    }//GEN-LAST:event_formWindowActivated

    private void optionsBarExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsBarExitActionPerformed
        // shows a dialog box
        int exit = JOptionPane.showConfirmDialog(null, "Are you sure, do you want exit?", "Attention", JOptionPane.YES_NO_OPTION);
        if (exit == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_optionsBarExitActionPerformed

    private void registerBarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBarUserActionPerformed
        // Opens the UserCanvas inside the MainCanvas desktop
        UserCanvas userCanvas = new UserCanvas();
        userCanvas.setVisible(true);
        desktopPanel.add(userCanvas);
    }//GEN-LAST:event_registerBarUserActionPerformed

    private void registerBarSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBarSOActionPerformed
        // Opens the SOCanvas inside the MainCanvas desktop
        SOCanvas sOCanvas = new SOCanvas();
        sOCanvas.setVisible(true);
        desktopPanel.add(sOCanvas);
    }//GEN-LAST:event_registerBarSOActionPerformed

    private void reportBarCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBarCRActionPerformed
        // generate a customers report
        int confirmationPane = JOptionPane.showConfirmDialog(null, "Confirm a customers report emission?", "Attention", JOptionPane.YES_NO_OPTION);
        if (confirmationPane == JOptionPane.YES_OPTION) {
            // print the report with the jasper report framework
            try {
                //the jasper print class is used bellow
                JasperPrint print = JasperFillManager.fillReport("C:src/br/com/infox/reports/customers.jasper", null, connection);
                // the JasperViewer shows the report
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_reportBarCRActionPerformed

    private void reportBarSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBarSRActionPerformed
        // generate a services order report
        int confirmationPane = JOptionPane.showConfirmDialog(null, "Confirm a services order report emission?", "Attention", JOptionPane.YES_NO_OPTION);
        if (confirmationPane == JOptionPane.YES_OPTION) {
            // print the report with the jasper report framework
            try {
                //the jasper print class is used bellow
                JasperPrint print = JasperFillManager.fillReport("C:src/br/com/infox/reports/services.jasper", null, connection);
                // the JasperViewer shows the report
                JasperViewer.viewReport(print, false);
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, e);
            }
        }
    }//GEN-LAST:event_reportBarSRActionPerformed

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
            java.util.logging.Logger.getLogger(MainCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCanvas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenu helpBar;
    private javax.swing.JMenuItem helpBarAbout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDate;
    public static javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu optionsBar;
    private javax.swing.JMenuItem optionsBarExit;
    private javax.swing.JMenu registerBar;
    private javax.swing.JMenuItem registerBarClient;
    private javax.swing.JMenuItem registerBarSO;
    public static javax.swing.JMenuItem registerBarUser;
    public static javax.swing.JMenu reportBar;
    private javax.swing.JMenuItem reportBarCR;
    private javax.swing.JMenuItem reportBarSR;
    // End of variables declaration//GEN-END:variables
}
