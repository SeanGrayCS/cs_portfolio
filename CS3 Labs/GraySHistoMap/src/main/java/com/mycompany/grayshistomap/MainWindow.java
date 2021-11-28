/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.grayshistomap;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author seanp
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
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

        text_input = new javax.swing.JTextField();
        panel_histogram = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_histogram.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout panel_histogramLayout = new javax.swing.GroupLayout(panel_histogram);
        panel_histogram.setLayout(panel_histogramLayout);
        panel_histogramLayout.setHorizontalGroup(
            panel_histogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_histogramLayout.setVerticalGroup(
            panel_histogramLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        jLabel1.setText("Input Grades:");

        jButton1.setText("Show HistoGram");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_histogram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_input, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_input)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_histogram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] input = text_input.getText().split(" ");
        HistoMap histoMap = new HistoMap();
        for (String grade : input) {
            histoMap.put(Integer.parseInt(grade));
        }
        makeHistogram(histoMap);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void makeHistogram(HistoMap histoMap) {
        
        int width = panel_histogram.getWidth();
        int height = panel_histogram.getHeight();
        
        Graphics g = panel_histogram.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        
        int maxCount = 0;
        int[] letterCount = {histoMap.get('A'), histoMap.get('B'),
            histoMap.get('C'), histoMap.get('F')};
        for (int count : letterCount) {
            maxCount = maxCount > count ? maxCount : count;
        }
        
        int xScaleFactor = width / 9;
        int yScaleFactor = height / (maxCount * 2);
        
        Color[] colors = {Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
        String[] letters = {"A", "B", "C", "F"};
        
        g.setColor(Color.BLACK);
        for (int i = maxCount + 1; i >= 0; i--) {
            int x = xScaleFactor / 4;
            int y = yScaleFactor * (2 + (maxCount - i));
            g.drawString("" + i, x, y + 4);
            g.drawLine(x * 2, y, x * 34, y);
        }
        
        for (int i = 0; i < 4; i++) {
            int x = xScaleFactor * ((2 * i) + 1);
            int y = yScaleFactor * (2 + (maxCount - letterCount[i]));
            g.setColor(colors[i]);
            g.fillRect(x, y, xScaleFactor, yScaleFactor * letterCount[i]);
            g.setColor(Color.GRAY);
            g.drawRect(x, y, xScaleFactor, yScaleFactor * letterCount[i]);
            g.setColor(Color.BLACK);
            g.drawString(letters[i], x + (xScaleFactor / 2) - 3,
                    height - (yScaleFactor * 4));
            g.drawString("(" + letterCount[i] + ")", x + (xScaleFactor / 2) - 6,
                    height - (yScaleFactor * 2));
        }
        
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel_histogram;
    private javax.swing.JTextField text_input;
    // End of variables declaration//GEN-END:variables
}
