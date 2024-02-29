/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mywork.radiobuttondemoui;

/**
 *
 * @author Eng Tracy Chao P Kazungu
 */

import javax.swing.JOptionPane;

public class RadioButtonDemoUI extends javax.swing.JFrame {
    
    public RadioButtonDemoUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        birdRadioButton = new javax.swing.JRadioButton();
        catRadioButton = new javax.swing.JRadioButton();
        dogRadioButton = new javax.swing.JRadioButton();
        rabbitRadioButton = new javax.swing.JRadioButton();
        pigRadioButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(birdRadioButton);
        birdRadioButton.setText("Bird");
        birdRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(catRadioButton);
        catRadioButton.setText("Cat");
        catRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(dogRadioButton);
        dogRadioButton.setText("Dog");
        dogRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(rabbitRadioButton);
        rabbitRadioButton.setText("Rabbit");
        rabbitRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbitRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(pigRadioButton);
        pigRadioButton.setText("Pig");
        pigRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pigRadioButton)
                    .addComponent(rabbitRadioButton)
                    .addComponent(dogRadioButton)
                    .addComponent(catRadioButton)
                    .addComponent(birdRadioButton))
                .addContainerGap(255, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(birdRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(catRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dogRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rabbitRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pigRadioButton)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }                    

    private void birdRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JOptionPane.showMessageDialog(this, "Displaying Bird");
    }                                               

    private void catRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Cat");
    }                                              

    private void dogRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Dog");
    }                                              

    private void rabbitRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        JOptionPane.showMessageDialog(this, "Displaying Rabbit");
    }                                                 

    private void pigRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        JOptionPane.showMessageDialog(this, "Displaying Pig");
    }                           

    public static void main(String[] args) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RadioButtonDemoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonDemoUI().setVisible(true);
            }
        });
    }

     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton birdRadioButton;
    private javax.swing.JRadioButton catRadioButton;
    private javax.swing.JRadioButton dogRadioButton;
    private javax.swing.JRadioButton pigRadioButton;
    private javax.swing.JRadioButton rabbitRadioButton;
                    
}

