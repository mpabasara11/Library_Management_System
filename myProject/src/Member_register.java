




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Malindu
 */import java.sql.*;
 import javax.swing.*;
public class Member_register extends javax.swing.JFrame {
    myConnection mycon;
    Connection conn;


    /**
     * Creates new form Member_register
     */
    public Member_register() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        memid = new javax.swing.JTextField();
        memname = new javax.swing.JTextField();
        memaddress = new javax.swing.JTextField();
        expate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Member ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Member Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 86, -1, 27));

        jLabel3.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 124, -1, 27));

        jLabel5.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Expire Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 162, -1, 34));
        getContentPane().add(memid, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 51, 133, -1));
        getContentPane().add(memname, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 88, 133, -1));

        memaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memaddressActionPerformed(evt);
            }
        });
        getContentPane().add(memaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 126, 133, -1));
        getContentPane().add(expate, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 168, 133, -1));

        jButton1.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton1.setText("Add Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 235, 115, 41));

        jButton2.setFont(new java.awt.Font("Tunga", 1, 14)); // NOI18N
        jButton2.setText("Update Record");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 235, -1, 41));

        jLabel4.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("                    Member Register");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/umbrella-bg.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memaddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   mycon=new myConnection();
   conn=mycon.getConnection();
   try{
       Statement st;
       st=conn.createStatement();
       String m_id,m_name,m_add,m_exp_date;
       m_id=memid.getText();
       m_name=memname.getText();
       m_add=memaddress.getText();
       m_exp_date=expate.getText();
       int record;
       record=st.executeUpdate("insert into member values('"+m_id+"','"+m_name+"','"+m_add+"','"+m_exp_date+"')");
       if(record==1)
            {JOptionPane.showMessageDialog(rootPane,"record sucessfully submitted","Success",JOptionPane.INFORMATION_MESSAGE);}
       conn.close();
   }catch(SQLException e)
           {System.out.print("sql error");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       mycon=new myConnection();
       conn=mycon.getConnection();
   try{
       Statement st;
       st=conn.createStatement();
       String m_id,m_name,m_add,m_exp_date;
       m_id=memid.getText();
       m_name=memname.getText();
       m_add=memaddress.getText();
       m_exp_date=expate.getText();
        int record;
       record=st.executeUpdate("update member set m_id='"+m_id+"',name='"+m_name+"',address='"+m_add+"',exp_date='"+m_exp_date+"'where m_id='"+m_id+"'");
       if(record==1)
        {JOptionPane.showMessageDialog(rootPane,"record sucessfully Updated","Success",JOptionPane.INFORMATION_MESSAGE);}
       conn.close();
      
       
   }catch(SQLException e)
   {System.out.print("sql error");
   
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
            java.util.logging.Logger.getLogger(Member_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField expate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField memaddress;
    private javax.swing.JTextField memid;
    private javax.swing.JTextField memname;
    // End of variables declaration//GEN-END:variables
}
