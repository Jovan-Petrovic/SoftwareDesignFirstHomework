/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Bron Zilar
 */
public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
        setTitle("Simple calculator");
        setLocationRelativeTo(null);
        setListener();
    }
    
    private javax.swing.JPanel panel;
    
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    
    private javax.swing.JButton btnSum;
    private javax.swing.JButton btnSub;
    
    private void initComponents() {
        lab1 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        
        btnSum = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        
        panel = new javax.swing.JPanel();
        
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter values:"));
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        lab1.setText("first number:");
        lab2.setText("Second number:");
        lab3.setText("Result:");
        
        txt3.setEditable(false);
        
        btnSum.setText("Addition");
        btnSub.setText("Substraction");
        
        javax.swing.GroupLayout panelCalculationLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelCalculationLayout);
        panelCalculationLayout.setHorizontalGroup(
            panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCalculationLayout.createSequentialGroup()
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculationLayout.createSequentialGroup()
                        .addComponent(lab2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCalculationLayout.createSequentialGroup()
                        .addComponent(lab3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCalculationLayout.setVerticalGroup(
            panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCalculationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCalculationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //sum();
            }
        });
        
       
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(277, Short.MAX_VALUE)
                        .addComponent(btnSum)
                        .addGap(18, 18, 18)
                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSum)
                    .addComponent(btnSub))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        
        pack();
    }
    
    private void setListener() {
 
     btnSub.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
            int a = Integer.parseInt(txt1.getText().trim());
            int b = Integer.parseInt(txt2.getText().trim());
            txt3.setText(String.valueOf(a-b));
         }
     });
     
     btnSum.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
            int a = Integer.parseInt(txt1.getText().trim());
            int b = Integer.parseInt(txt2.getText().trim());
            txt3.setText(String.valueOf(a+b)); 
         }
     });
    }
    
}
