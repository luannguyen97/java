/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3sw;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author luannguyen
 */
public class Jlist3 extends javax.swing.JFrame {

    /**
     * Creates new form Jlist3
     */
    public Jlist3() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JlistTrai = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlistPhai = new javax.swing.JList<>();
        btnPhai = new javax.swing.JButton();
        btnAllPhai = new javax.swing.JButton();
        btnTrai = new javax.swing.JButton();
        btnAllTrai = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(JlistTrai);

        jScrollPane2.setViewportView(jlistPhai);

        btnPhai.setText(">");
        btnPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhaiActionPerformed(evt);
            }
        });

        btnAllPhai.setText(">>");
        btnAllPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllPhaiActionPerformed(evt);
            }
        });

        btnTrai.setText("<");
        btnTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraiActionPerformed(evt);
            }
        });

        btnAllTrai.setText("<<");
        btnAllTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllTraiActionPerformed(evt);
            }
        });

        btnThem.setText("+");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel1.setText("Ds mon the thao");

        jLabel2.setText("Mon yeu thich");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPhai)
                            .addComponent(btnAllPhai)
                            .addComponent(btnAllTrai)
                            .addComponent(btnTrai))
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnThem))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnPhai)
                                .addGap(18, 18, 18)
                                .addComponent(btnAllPhai)
                                .addGap(18, 18, 18)
                                .addComponent(btnTrai)
                                .addGap(27, 27, 27)
                                .addComponent(btnAllTrai))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String sThem = JOptionPane.showInputDialog(this,"Nhap mon the thao");
        ListModel dsMonTT = JlistTrai.getModel();
        ArrayList<String> listTrai = new ArrayList<>();
        for(int i=0;i<dsMonTT.getSize();i++)
        {
            listTrai.add(dsMonTT.getElementAt(i).toString());
        }
        listTrai.add(sThem);
        String[] arrData = listTrai.toArray(new String[0]);
        JlistTrai.setListData(arrData);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhaiActionPerformed

        ListModel mPhai = jlistPhai.getModel();
        ArrayList<String> arrPhai = new ArrayList<>();
        ListModel mTrai = JlistTrai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        
        for( int i = 0; i<mTrai.getSize(); i++)
        {
            String ten =mTrai.getElementAt(i).toString();
            arrTrai.add(ten);
        }
        int i = JlistTrai.getSelectedIndex();
        arrTrai.remove(i);
        String [] dataTrai = arrTrai.toArray(new String[0]);
        JlistTrai.setListData(dataTrai);
        for( int j = 0; j<mPhai.getSize(); j++)
        {
            String ten1 = mPhai.getElementAt(j).toString();
            arrPhai.add(ten1);
        }
        arrPhai.add(mTrai.getElementAt(i).toString());
        String[] dataPhai =arrPhai.toArray(new String[0]);
        jlistPhai.setListData(dataPhai);
    }//GEN-LAST:event_btnPhaiActionPerformed

    private void btnAllPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllPhaiActionPerformed
        ListModel mPhai = jlistPhai.getModel();
        ListModel mTrai = JlistTrai.getModel();
        ArrayList<String> arr = new ArrayList<>();
        
        for( int i = 0; i<mTrai.getSize(); i++)
        {
            String ten =mTrai.getElementAt(i).toString();
            arr.add(ten);
        }
        for( int j = 0; j<mPhai.getSize(); j++)
        {
            String ten = mPhai.getElementAt(j).toString();
            arr.add(ten);
        }
        String [] data =arr.toArray(new String[0]);
        jlistPhai.setListData(data);
        arr.removeAll(arr);
        data = arr.toArray(new String[0]);
        JlistTrai.setListData(data);
    }//GEN-LAST:event_btnAllPhaiActionPerformed

    private void btnTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraiActionPerformed
        ListModel mPhai = jlistPhai.getModel();
        ArrayList<String> arrPhai = new ArrayList<>();
        ListModel mTrai = JlistTrai.getModel();
        ArrayList<String> arrTrai = new ArrayList<>();
        
        for( int i = 0; i<mPhai.getSize(); i++)
        {
            String ten =mPhai.getElementAt(i).toString();
            arrPhai.add(ten);
        }
        int i = jlistPhai.getSelectedIndex();
        arrPhai.remove(i);
        String [] dataPhai = arrPhai.toArray(new String[0]);
        jlistPhai.setListData(dataPhai);
        for( int j = 0; j<mTrai.getSize(); j++)
        {
            String ten1 = mTrai.getElementAt(j).toString();
            arrTrai.add(ten1);
        }
        arrTrai.add(mPhai.getElementAt(i).toString());
        String[] dataTrai =arrTrai.toArray(new String[0]);
        JlistTrai.setListData(dataTrai);
    }//GEN-LAST:event_btnTraiActionPerformed

    private void btnAllTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllTraiActionPerformed
        ListModel mPhai = jlistPhai.getModel();
        ListModel mTrai = JlistTrai.getModel();
        ArrayList<String> arr = new ArrayList<>();
        
        for( int i = 0; i<mTrai.getSize(); i++)
        {
            String ten =mTrai.getElementAt(i).toString();
            arr.add(ten);
        }
        for( int j = 0; j<mPhai.getSize(); j++)
        {
            String ten = mPhai.getElementAt(j).toString();
            arr.add(ten);
        }
        String [] data = arr.toArray(new String[0]);
        JlistTrai.setListData(data);
        arr.removeAll(arr);
        data =arr.toArray(new String[0]);
        jlistPhai.setListData(data);
        arr.removeAll(arr);
        
    }//GEN-LAST:event_btnAllTraiActionPerformed

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
            java.util.logging.Logger.getLogger(Jlist3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jlist3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jlist3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jlist3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jlist3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistTrai;
    private javax.swing.JButton btnAllPhai;
    private javax.swing.JButton btnAllTrai;
    private javax.swing.JButton btnPhai;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTrai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlistPhai;
    // End of variables declaration//GEN-END:variables
}
