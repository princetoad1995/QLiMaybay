/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.TimkiemChangbayController;
import ControllerImpl.TimkiemChangbayControllerImpl;
import Model.Changbay;
import Model.Sanbay;
import Model.Thanhpho;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author PRINCE D. TOAD
 */
public class TimKiemChangbayFrm extends javax.swing.JFrame {

    private TimkiemChangbayController ctrl;
    private Changbay cb;
    private Sanbay sbDi, sbDen;

    /**
     * Creates new form TimKiemChangbayFrm
     */
    public TimKiemChangbayFrm() {
        initComponents();

        ctrl = new TimkiemChangbayControllerImpl();
        viewTimkiem.setVisible(false);
        cb = new Changbay();
        sbDi = new Sanbay();
        sbDen = new Sanbay();
        
        cbTPDi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbSBDi.removeAllItems();
                Thanhpho t = (Thanhpho) cbTPDi.getSelectedItem();
                if(t != null)
                    getListSB(cbSBDi, t.getMaThanhpho());
            }
        });
        cbTPDen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbSBDen.removeAllItems();
                Thanhpho t = (Thanhpho) cbTPDen.getSelectedItem();
                if(t != null)
                    getListSB(cbSBDen, t.getMaThanhpho());
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTimMaChangbay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewTimkiem = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbSBDi = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbSBDen = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtMaChangbay = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbTPDi = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cbTPDen = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tìm kiếm chặng bay");

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ma san bay : ");

        jLabel6.setText("Sân bay đi :");

        jLabel7.setText("Sân bay đến :");

        cbSBDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSBDenActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa chặng bay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa chặng bay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Thành phố đi :");

        jLabel9.setText("Thành phố đến :");

        javax.swing.GroupLayout viewTimkiemLayout = new javax.swing.GroupLayout(viewTimkiem);
        viewTimkiem.setLayout(viewTimkiemLayout);
        viewTimkiemLayout.setHorizontalGroup(
            viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTimkiemLayout.createSequentialGroup()
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTimkiemLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(123, 123, 123)
                        .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbSBDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaChangbay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSBDen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTPDi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTPDen, 0, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewTimkiemLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2)
                        .addGap(150, 150, 150)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewTimkiemLayout.setVerticalGroup(
            viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewTimkiemLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtMaChangbay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbTPDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbSBDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewTimkiemLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewTimkiemLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTPDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(cbSBDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(viewTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(txtTimMaChangbay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(viewTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimMaChangbay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtTimMaChangbay.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa điền mã chặng bay",
                    "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                cb = ctrl.timkiemChangbay(Integer.parseInt(txtTimMaChangbay.getText()));

                if (cb.getSanbayDi() == null) {
                    viewTimkiem.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Không tìm thấy mã chặng bay phù hợp",
                            "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                    cbTPDi.removeAllItems();
                    cbTPDen.removeAllItems();
                    cbSBDi.removeAllItems();
                    cbSBDen.removeAllItems();
                    txtMaChangbay.setText("");
                    
                    sbDi = ctrl.getSanbay(cb.getSanbayDi().getMaSanbay());
                    sbDen = ctrl.getSanbay(cb.getSanbayDen().getMaSanbay());
                    viewTimkiem.setVisible(true);
                    txtMaChangbay.setText(cb.getMaChangbay() + "");

                    init();

                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Mã chuyến bay là số tự nhiên",
                        "Thông báo", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void init() {
        List<Thanhpho> listTP = ctrl.getListThanhpho();
        for (Thanhpho tp : listTP) {
            cbTPDi.addItem(tp);
            cbTPDen.addItem(tp);
        }

        for (Thanhpho tp : listTP) {
            if (tp.getMaThanhpho() == sbDi.getThanhpho().getMaThanhpho()) {
                cbTPDi.setSelectedItem(tp);
                
                List<Sanbay> listSB = ctrl.getListSanbayTuThanhPho(tp.getMaThanhpho());
                int dem = -1;
                for(Sanbay sb : listSB){
                    dem++;
                    if(sb.getMaSanbay() == sbDi.getMaSanbay()){
                        cbSBDi.setSelectedIndex(dem);
                    }
                }
            }
            if (tp.getMaThanhpho() == sbDen.getThanhpho().getMaThanhpho()) {
                cbTPDen.setSelectedItem(tp);
                
                List<Sanbay> listSB = ctrl.getListSanbayTuThanhPho(tp.getMaThanhpho());
                int dem = -1;
                for(Sanbay sb : listSB){
                    dem++;
                    if(sb.getMaSanbay() == sbDen.getMaSanbay()){
                        cbSBDen.setSelectedIndex(dem);
                    }
                }
            }
        }
        
        
        

//        Thanhpho tDi = (Thanhpho) cbTPDi.getSelectedItem();
//        Thanhpho tDen = (Thanhpho) cbTPDen.getSelectedItem();
//        getListSB(cbSBDi, tDi.getMaThanhpho());
//        getListSB(cbSBDen, tDen.getMaThanhpho());
    
    }

    private void getListSB(JComboBox cb, int maThanhpho) {
        List<Sanbay> listSB = ctrl.getListSanbayTuThanhPho(maThanhpho);
        for (Sanbay sb : listSB) {
            cb.addItem(sb);
        }

    }

    private void cbSBDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSBDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSBDenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ctrl.xoaChangbay(Integer.parseInt(txtTimMaChangbay.getText()));
        JOptionPane.showMessageDialog(null, "Xóa chặng bay thành công",
                            "Thông báo", JOptionPane.OK_OPTION);
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Thanhpho tpDi = (Thanhpho) cbTPDi.getSelectedItem();
        Thanhpho tpDen = (Thanhpho) cbTPDen.getSelectedItem();
        if (tpDi.getMaThanhpho() == tpDen.getMaThanhpho()) {
            JOptionPane.showMessageDialog(null, "Không để thành phố đi và đến "
                    + "trùng nhau", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            Sanbay sbDi = (Sanbay) cbSBDi.getSelectedItem();
            Sanbay sbDen = (Sanbay) cbSBDen.getSelectedItem();
            cb.setSanbayDi(sbDi);
            cb.setSanbayDen(sbDen);
            ctrl.suaChangbay(cb);
            
            JOptionPane.showMessageDialog(null, "Sửa chặng bay thành công", 
                    "Thông báo", NORMAL);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(TimKiemChangbayFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimKiemChangbayFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimKiemChangbayFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimKiemChangbayFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimKiemChangbayFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbSBDen;
    private javax.swing.JComboBox cbSBDi;
    private javax.swing.JComboBox cbTPDen;
    private javax.swing.JComboBox cbTPDi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtMaChangbay;
    private javax.swing.JTextField txtTimMaChangbay;
    private javax.swing.JPanel viewTimkiem;
    // End of variables declaration//GEN-END:variables
}
