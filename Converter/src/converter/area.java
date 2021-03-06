/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author JOHN
 */
public class area extends javax.swing.JFrame {

    /**
     * Creates new form area
     */
    public area() {
        initComponents();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_area = new javax.swing.JTextField();
        txt_area_display = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 420, 90, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(400, 420, 90, 30);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square meter", "Suqare kilometer", "Square foot", "Suqare inch" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(400, 210, 200, 40);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suqare kilometer", "Suqare meter", "Square foot", "Square inch" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(90, 210, 200, 40);

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 310, 140, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Area Converter");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 20, 700, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 150, 110, 40);

        txt_area.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_area.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_area);
        txt_area.setBounds(90, 150, 200, 40);

        txt_area_display.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_area_display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_area_display);
        txt_area_display.setBounds(400, 150, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter/backC.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 514);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double area = Double.parseDouble(txt_area.getText());
        
        if (jComboBox1.getSelectedItem().equals("Suqare kilometer")) {

             if (jComboBox2.getSelectedItem().equals("Suqare meter")) {
                String cConvert1 = String.format("%.2f", area * 0.386102);
                txt_area_display.setText(cConvert1);
            }
             
            if (jComboBox2.getSelectedItem().equals("Square foot")) {
                String cConvert2 = String.format("%.2f", area * 10760000);
                txt_area_display.setText(cConvert2);
            }
            
             if (jComboBox2.getSelectedItem().equals("Square inch")) {
                String cConvert3 = String.format("%.2f", area * 1550000000);
                txt_area_display.setText(cConvert3);
            }
        }

        if (jComboBox1.getSelectedItem().equals("Suqare meter")) {

            if (jComboBox2.getSelectedItem().equals("Suqare kilometer")) {
                String cConvert1 = String.format("%.2f", area * 0.00001);
                txt_area_display.setText(cConvert1);
            }
            
            if (jComboBox2.getSelectedItem().equals("Square foot")) {
                String cConvert2 = String.format("%.2f", area * 10.7639);
                txt_area_display.setText(cConvert2);
            }
            
            if (jComboBox2.getSelectedItem().equals("Square inch")) {
                String cConvert3 = String.format("%.2f", area * 1550);
                txt_area_display.setText(cConvert3);
            }
        }

        if (jComboBox1.getSelectedItem().equals("Square foot")) {

            if (jComboBox2.getSelectedItem().equals("Suqare kilometer")) {
                String cConvert1 = String.format("%.2f", area * 0.00);
                txt_area_display.setText(cConvert1);
            }
            
            if (jComboBox2.getSelectedItem().equals("Suqare meter")) {
                String cConvert2 = String.format("%.2f", area * 0.092903);
                txt_area_display.setText(cConvert2);
            }
            
            if (jComboBox2.getSelectedItem().equals("Square inch")) {
                String cConvert3 = String.format("%.2f", area * 144);
                txt_area_display.setText(cConvert3);
            }
            
            if (jComboBox1.getSelectedItem().equals("Square inch")) {

            if (jComboBox2.getSelectedItem().equals("Suqare kilometer")) {
                String cConvert1 = String.format("%.2f", area * 0.00);
                txt_area_display.setText(cConvert1);
            }
            
            if (jComboBox2.getSelectedItem().equals("Suqare meter")) {
                String cConvert2 = String.format("%.2f", area * 0.00064516);
                txt_area_display.setText(cConvert2);
            }
            
            if (jComboBox2.getSelectedItem().equals("Square foot")) {
                String cConvert3 = String.format("%.2f", area * 0.00694444);
                txt_area_display.setText(cConvert3);
            }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        manupage p = new manupage();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        txt_area.setText(null);
        txt_area_display.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(area.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new area().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_area_display;
    // End of variables declaration//GEN-END:variables
}
