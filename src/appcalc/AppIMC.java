/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appcalc;

import java.awt.event.KeyEvent;
import java.awt.Color;

/**
 *
 * @author Dell
 */
public class AppIMC extends javax.swing.JFrame {

    /**
     * Creates new form AppIMC
     */
    public AppIMC() {
        initComponents();
        setLocationRelativeTo(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        jLabel1 = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        campoResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 38, 233));

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PESO");

        campoPeso.setBackground(new java.awt.Color(153, 153, 153));
        campoPeso.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        campoPeso.setForeground(new java.awt.Color(0, 51, 255));
        campoPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoPeso.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(204, 204, 204)));
        campoPeso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });
        campoPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesoKeyPressed(evt);
            }
        });

        campoAltura.setBackground(new java.awt.Color(153, 153, 153));
        campoAltura.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        campoAltura.setForeground(new java.awt.Color(0, 51, 255));
        campoAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoAltura.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(204, 204, 204)));
        campoAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAlturaActionPerformed(evt);
            }
        });
        campoAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoAlturaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALTURA");

        areaTexto.setEditable(false);
        areaTexto.setBackground(new java.awt.Color(153, 153, 153));
        areaTexto.setColumns(20);
        areaTexto.setLineWrap(true);
        areaTexto.setRows(10);
        areaTexto.setToolTipText("");
        areaTexto.setWrapStyleWord(true);
        areaTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        areaTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaTextoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(areaTexto);

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESULTADO");

        campoResultado.setEditable(false);
        campoResultado.setBackground(new java.awt.Color(153, 153, 153));
        campoResultado.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        campoResultado.setForeground(new java.awt.Color(0, 51, 255));
        campoResultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(204, 204, 204)));
        campoResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoResultadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "ÍNDICE DE MASSA CORPORAL", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("MV Boli", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoResultado)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesoActionPerformed

    private void campoAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAlturaActionPerformed

    private void campoPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            campoAltura.requestFocus();
        }
    }//GEN-LAST:event_campoPesoKeyPressed

    private void campoAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoAlturaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            double peso = Double.parseDouble(campoPeso.getText().replace(",", "."));
            double altura = Double.parseDouble(campoAltura.getText().replace(",", "."));
            double calcular = peso / (Math.pow(altura, 2));
            campoResultado.setText(String.valueOf(calcular).format("%.2f", calcular));
            requestFocus(false);
            if (calcular < 18.5) {
                areaTexto.setBackground(new Color(255,255,204));
                areaTexto.setText("IMC: Abaixo do peso\n"
                        + "Implicações e Risco: Transtornos digestivos,"
                        + " debilidade, fadiga crónica, estresse, ansiedade e disfunção hormonal.\n\n"
                        + "O IMC (Índice de Massa Corporal) é um indicador que serve para avaliar"
                        + " o peso do individuo, permitindo avaliar se está com excesso de peso ou obesidade.");
            }else
            if (calcular >= 18.6 && calcular <= 24.9) {
                areaTexto.setBackground(new Color(51,255,51));
                areaTexto.setText("IMC: Peso Normal\n\n"
                        + "Implicações e Risco: Estado normal, bom nível de energia,"
                        + " vitalidade e boa condição física.\n\n"
                        + "O IMC (Índice de Massa Corporal) é um indicador que serve para avaliar"
                        + " o peso do individuo, permitindo avaliar se está com excesso de peso ou obesidade.");
            }else
            if (calcular >= 25 && calcular <= 29.9) {
                areaTexto.setBackground(new Color(204,204,0));
                areaTexto.setText("IMC: Acima do peso\n\n"
                        + "Implicações e Risco: Fadiga, problemas digestivos,"
                        + " problemas circulatórios e varizes.\n\n"
                        + "O IMC (Índice de Massa Corporal) é um indicador que serve para avaliar"
                        + " o peso do individuo, permitindo avaliar se está com excesso de peso ou obesidade.");
            }else
            if (calcular >= 30 && calcular <= 39.9) {
                areaTexto.setBackground(new Color(152,102,0));
                areaTexto.setText("IMC: Obsidade\n\n"
                        + "Implicações e Risco: Diabete, angina de peito, infartos, trombo flebites,"
                        + " arterosclerose, embolias, alterações menstruais.\n\n"
                        + "O IMC (Índice de Massa Corporal) é um indicador que serve para avaliar"
                        + " o peso do individuo, permitindo avaliar se está com excesso de peso ou obesidade.");
            }else
            if (calcular >= 40) {
                areaTexto.setBackground(new Color(204,0,0));
                areaTexto.setText("IMC: Obsidade Mórbida\n\n"
                        + "Implicações e Risco: Falta de ar, apneia, sonolência, trombose muscular, úlceras varicosas,"
                        + " cancro do cólon, uterino e mamário e refluxo esofágico.\n\n"
                        + "O IMC (Índice de Massa Corporal) é um indicador que serve para avaliar"
                        + " o peso do individuo, permitindo avaliar se está com excesso de peso ou obesidade.");
            }
            
        }
    }//GEN-LAST:event_campoAlturaKeyPressed

    private void areaTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaTextoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextoKeyPressed

    private void campoResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoResultadoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_campoResultadoActionPerformed

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
            java.util.logging.Logger.getLogger(AppIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppIMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
