
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class BatchFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public BatchFrame() {
        initComponents();
        setTitle("BATCH FRAME");
        setBounds(0,0,width,height);
        getFaculty();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        batch_fac_cb = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        bat_dep_cb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        bat_pro_cb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        bat_id_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bat_year_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bat_shift_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bat_group_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bat_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        bat_list = new javax.swing.JList();
        bat_add_bt = new javax.swing.JButton();
        bat_update_bt = new javax.swing.JButton();
        bat_delete_bt = new javax.swing.JButton();
        bat_clear_bt = new javax.swing.JButton();
        bat_back_bt = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("Batch Frame");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 520, 46);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("FACULTIES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 80, 129, 28);

        batch_fac_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batch_fac_cbActionPerformed(evt);
            }
        });
        getContentPane().add(batch_fac_cb);
        batch_fac_cb.setBounds(330, 70, 301, 39);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 255));
        jLabel3.setText("DEPARTMENTS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 170, 129, 33);

        bat_dep_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_dep_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bat_dep_cb);
        bat_dep_cb.setBounds(330, 164, 301, 40);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 255));
        jLabel4.setText("PROGRAM");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 250, 129, 34);

        bat_pro_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_pro_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bat_pro_cb);
        bat_pro_cb.setBounds(330, 250, 301, 38);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setText("BATCH ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 340, 118, 30);
        getContentPane().add(bat_id_tf);
        bat_id_tf.setBounds(330, 340, 301, 39);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 255));
        jLabel6.setText("BATCH YEAR");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 410, 129, 38);
        getContentPane().add(bat_year_tf);
        bat_year_tf.setBounds(330, 410, 301, 38);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 255));
        jLabel7.setText("SHIFT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(690, 370, 113, 40);
        getContentPane().add(bat_shift_tf);
        bat_shift_tf.setBounds(680, 410, 113, 38);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 255));
        jLabel8.setText("GROUP");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(830, 370, 122, 32);
        getContentPane().add(bat_group_tf);
        bat_group_tf.setBounds(820, 410, 122, 36);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 51, 255));
        jLabel9.setText("REMARKS");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(330, 480, 130, 30);

        bat_ta.setColumns(20);
        bat_ta.setRows(5);
        jScrollPane1.setViewportView(bat_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 510, 620, 130);

        bat_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                bat_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(bat_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(960, 60, 200, 580);

        bat_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        bat_add_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bat_add_bt.setForeground(new java.awt.Color(255, 153, 51));
        bat_add_bt.setText("Add");
        bat_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(bat_add_bt);
        bat_add_bt.setBounds(330, 650, 120, 30);

        bat_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        bat_update_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bat_update_bt.setForeground(new java.awt.Color(255, 153, 51));
        bat_update_bt.setText("Update");
        bat_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(bat_update_bt);
        bat_update_bt.setBounds(500, 650, 130, 30);

        bat_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        bat_delete_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bat_delete_bt.setForeground(new java.awt.Color(255, 153, 51));
        bat_delete_bt.setText("Delete");
        bat_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(bat_delete_bt);
        bat_delete_bt.setBounds(680, 650, 130, 30);

        bat_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        bat_clear_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bat_clear_bt.setForeground(new java.awt.Color(255, 153, 51));
        bat_clear_bt.setText("Clear");
        bat_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(bat_clear_bt);
        bat_clear_bt.setBounds(870, 650, 120, 30);

        bat_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        bat_back_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bat_back_bt.setForeground(new java.awt.Color(255, 153, 51));
        bat_back_bt.setText("Back");
        bat_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bat_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(bat_back_bt);
        bat_back_bt.setBounds(1030, 650, 130, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 255));
        jLabel10.setText("BATCHES");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(960, 30, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void batch_fac_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batch_fac_cbActionPerformed
        FacultyBean FBean=(FacultyBean)this.batch_fac_cb.getSelectedItem();
        if(FBean==null)
        return;
        try{
        int facId=FBean.getFacId();
        java.util.Vector v=DBManager.getDepartment(facId);
        bat_dep_cb.removeAllItems();
        for(int i=0;i<v.size();i++)
        {
            bat_dep_cb.addItem(v.elementAt(i));
        }
        }catch(Exception e){}
        
    }//GEN-LAST:event_batch_fac_cbActionPerformed

    private void bat_dep_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_dep_cbActionPerformed
        DepartmentBean DBean=(DepartmentBean)this.bat_dep_cb.getSelectedItem();
        if(DBean==null)return;
        try{
                int depId=DBean.getDeptId();
                java.util.Vector v=DBManager.getProgram(depId);
                bat_pro_cb.removeAllItems();
                for(int i=0;i<v.size();i++)
                    bat_pro_cb.addItem(v.elementAt(i));
        }catch(Exception e){}
    }//GEN-LAST:event_bat_dep_cbActionPerformed

    private void bat_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_bat_listValueChanged
        BatchBean BBean=(BatchBean)this.bat_list.getSelectedValue();
        if(BBean==null)return;
        try{
            int batId=BBean.getBatchId();
            String batYear=BBean.getBatchYear();
            String shift=BBean.getShift();
            String group=BBean.getGroup();
            String remark=BBean.getRemark();
            bat_id_tf.setText(batId+"");
            bat_year_tf.setText(batYear);
            bat_shift_tf.setText(shift);
            bat_group_tf.setText(group);
            bat_ta.setText(remark);
        }catch(Exception e){}
    }//GEN-LAST:event_bat_listValueChanged

    private void bat_pro_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_pro_cbActionPerformed
        ProgramBean PBean=(ProgramBean)this.bat_pro_cb.getSelectedItem();
        if(PBean==null)return;
        try{
                int proId=PBean.getProgId();
                java.util.Vector v=DBManager.getBatch(proId);
                bat_list.setListData(v);
        }catch(Exception e){}
    }//GEN-LAST:event_bat_pro_cbActionPerformed

    private void bat_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_add_btActionPerformed
        ProgramBean pbean=(ProgramBean)this.bat_pro_cb.getSelectedItem();
        if(pbean==null)return;
        int proId=pbean.getProgId();
        String batchYear=bat_year_tf.getText();
        String shift=bat_shift_tf.getText();
        String group=bat_group_tf.getText();
        String remark=bat_ta.getText();
        try{
                int row=DBManager.addBatch(proId,batchYear,shift,group,remark);
                if(row>=1){
                    JOptionPane.showMessageDialog(null, row+"Row Inserted");
                    java.util.Vector v=DBManager.getBatch(proId);
                    bat_list.setListData(v);
                
                }
        }catch(Exception e){}
    }//GEN-LAST:event_bat_add_btActionPerformed

    private void bat_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_update_btActionPerformed
        BatchBean bbean=(BatchBean)this.bat_list.getSelectedValue();
        if(bbean==null)return;
        int proId=bbean.getBatchId();
        int batId=bbean.getBatchId();
        String batYear=bat_year_tf.getText();
        String shift=bat_shift_tf.getText();
        String group=bat_group_tf.getText();
        try{
        int row=DBManager.updateBatch(batId,batYear,shift,group);
        if(row>=1){
        JOptionPane.showMessageDialog(null, row+"Row Update");
        java.util.Vector v=DBManager.getBatch(proId);
        bat_list.setListData(v);
        }
        }catch(Exception e){}
    }//GEN-LAST:event_bat_update_btActionPerformed

    private void bat_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_delete_btActionPerformed
        ProgramBean pbean=(ProgramBean)this.bat_pro_cb.getSelectedItem();
        if(pbean==null)return;
        int proId=pbean.getProgId();
        int batId=Integer.parseInt(bat_id_tf.getText());
        try{
        int row=DBManager.deleteBatch(batId);
        if(row>=1){
        JOptionPane.showMessageDialog(null, row+"Row Delete");
        bat_id_tf.setText(null);
        bat_year_tf.setText(null);
        bat_shift_tf.setText(null);
        bat_group_tf.setText(null);
        bat_ta.setText(null);
        java.util.Vector v=DBManager.getBatch(proId);
        bat_list.setListData(v);
        }
        
        }catch(Exception e){}
    }//GEN-LAST:event_bat_delete_btActionPerformed

    private void bat_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_clear_btActionPerformed
        bat_id_tf.setText(null);
        bat_year_tf.setText(null);
        bat_shift_tf.setText(null);
        bat_group_tf.setText(null);
        bat_ta.setText(null);
    }//GEN-LAST:event_bat_clear_btActionPerformed

    private void bat_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bat_back_btActionPerformed
       new MainFrame().setVisible(true);
    }//GEN-LAST:event_bat_back_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bat_add_bt;
    private javax.swing.JButton bat_back_bt;
    private javax.swing.JButton bat_clear_bt;
    private javax.swing.JButton bat_delete_bt;
    private javax.swing.JComboBox bat_dep_cb;
    private javax.swing.JTextField bat_group_tf;
    private javax.swing.JTextField bat_id_tf;
    private javax.swing.JList bat_list;
    private javax.swing.JComboBox bat_pro_cb;
    private javax.swing.JTextField bat_shift_tf;
    private javax.swing.JTextArea bat_ta;
    private javax.swing.JButton bat_update_bt;
    private javax.swing.JTextField bat_year_tf;
    private javax.swing.JComboBox batch_fac_cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void getFaculty(){
try{
        java.util.Vector v=DBManager.getFaculty();
        for(int i=0;i<v.size();i++)
        {
            batch_fac_cb.addItem(v.elementAt(i));
        }
        }catch(Exception e){}

}

}
