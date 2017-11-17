
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class FacultyFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public FacultyFrame() {
        initComponents();
        setTitle("FACULTY FRAME");
        setBounds(0,0,width,height);
        getFaculty();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fac_id_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fac_name_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fac_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        fac_list = new javax.swing.JList();
        fac_add_bt = new javax.swing.JButton();
        fac_update_bt = new javax.swing.JButton();
        fac_delete_bt = new javax.swing.JButton();
        fac_clear_bt = new javax.swing.JButton();
        fac_back_bt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("FACULTY FRAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 30, 474, 51);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("Faculty Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 140, 160, 30);
        getContentPane().add(fac_id_tf);
        fac_id_tf.setBounds(480, 140, 120, 40);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("Faculty Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(300, 270, 170, 40);
        getContentPane().add(fac_name_tf);
        fac_name_tf.setBounds(480, 270, 300, 40);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 255));
        jLabel4.setText("Remarks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 480, 160, 30);

        fac_ta.setColumns(20);
        fac_ta.setRows(5);
        jScrollPane1.setViewportView(fac_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 510, 590, 127);

        fac_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                fac_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(fac_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(790, 120, 240, 380);

        fac_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        fac_add_bt.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fac_add_bt.setForeground(new java.awt.Color(255, 204, 102));
        fac_add_bt.setText("Add");
        fac_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(fac_add_bt);
        fac_add_bt.setBounds(450, 650, 108, 32);

        fac_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        fac_update_bt.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fac_update_bt.setForeground(new java.awt.Color(255, 204, 102));
        fac_update_bt.setText("Update");
        fac_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(fac_update_bt);
        fac_update_bt.setBounds(580, 650, 110, 32);

        fac_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        fac_delete_bt.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fac_delete_bt.setForeground(new java.awt.Color(255, 204, 102));
        fac_delete_bt.setText("Delete");
        fac_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(fac_delete_bt);
        fac_delete_bt.setBounds(710, 650, 110, 32);

        fac_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        fac_clear_bt.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fac_clear_bt.setForeground(new java.awt.Color(255, 204, 102));
        fac_clear_bt.setText("Clear");
        fac_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(fac_clear_bt);
        fac_clear_bt.setBounds(830, 650, 98, 32);

        fac_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        fac_back_bt.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        fac_back_bt.setForeground(new java.awt.Color(255, 204, 102));
        fac_back_bt.setText("Back");
        fac_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fac_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(fac_back_bt);
        fac_back_bt.setBounds(940, 650, 97, 32);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 255));
        jLabel5.setText("FacULTIES");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(820, 90, 180, 32);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fac_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_fac_listValueChanged
      FacultyBean Bean=(FacultyBean)this.fac_list.getSelectedValue();
      if(Bean==null)return;
      int facId=Bean.getFacId();
      String facName=Bean.getFacName();
      String Remark=Bean.getRemarks();
      fac_id_tf.setText(facId+"");
      fac_name_tf.setText(facName);
      fac_ta.setText(Remark);
    }//GEN-LAST:event_fac_listValueChanged

    private void fac_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_add_btActionPerformed
        System.out.print("hello");
        String facName=fac_name_tf.getText();
       String remark=fac_ta.getText();
       try{
            int row=DBManager.addFaculty(facName, remark);
            if(row>=1)
            {
                
                JOptionPane.showMessageDialog(null, row+"Record Added");
                
                getFaculty();
            }
       }catch(Exception e){}
    }//GEN-LAST:event_fac_add_btActionPerformed

    private void fac_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_update_btActionPerformed
        FacultyBean bean=(FacultyBean)this.fac_list.getSelectedValue();
        if(bean==null)return;
        String facName=fac_name_tf.getText();
        String remark=fac_ta.getText();

        
        try
        {
            int row=DBManager.updateFaculty(bean.getFacId(),facName,remark);
            if(row>=1)
            {
                JOptionPane.showMessageDialog(null, row+"Row Updated");
                getFaculty();
            }
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_fac_update_btActionPerformed

    private void fac_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_delete_btActionPerformed
int facId=Integer.parseInt(fac_id_tf.getText());
        try
       {
           int row =DBManager.deleteFaculty(facId);
           if(row>=1)
           {
              // System.out.println(row);
               fac_id_tf.setText(null);
               fac_name_tf.setText(null);
               fac_ta.setText(null);
               JOptionPane.showMessageDialog(null, row+"Delete Record");
               getFaculty();
                    

               
           }
       }catch(Exception e)
       {
           
       }        // TODO add your handling code here:
    }//GEN-LAST:event_fac_delete_btActionPerformed

    private void fac_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_clear_btActionPerformed
         fac_id_tf.setText(null);
       fac_name_tf.setText(null);
       fac_ta.setText(null);
    }//GEN-LAST:event_fac_clear_btActionPerformed

    private void fac_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fac_back_btActionPerformed
        new MainFrame().setVisible(true);
        
    }//GEN-LAST:event_fac_back_btActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                 UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacultyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fac_add_bt;
    private javax.swing.JButton fac_back_bt;
    private javax.swing.JButton fac_clear_bt;
    private javax.swing.JButton fac_delete_bt;
    private javax.swing.JTextField fac_id_tf;
    private javax.swing.JList fac_list;
    private javax.swing.JTextField fac_name_tf;
    private javax.swing.JTextArea fac_ta;
    private javax.swing.JButton fac_update_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void getFaculty(){
try{
    java.util.Vector v=DBManager.getFaculty();
    fac_list.setListData(v);
    }
    catch(Exception e){

    }
    }
}
