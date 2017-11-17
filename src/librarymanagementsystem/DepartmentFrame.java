
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class DepartmentFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    public DepartmentFrame() {
        initComponents();
        setTitle("DEPARTMENT FRAME");
        setBounds(0,0,width,height);
        getFaculty();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dep_id = new javax.swing.JTextField();
        dep_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dep_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        dep_list = new javax.swing.JList();
        dep_combo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        dep_add_bt = new javax.swing.JButton();
        dep_update_bt = new javax.swing.JButton();
        dep_delete_bt = new javax.swing.JButton();
        dep_clear_bt = new javax.swing.JButton();
        dep_back_bt = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("DEPARTMENT FRAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 10, 474, 46);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("Faculties");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 110, 170, 32);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 255));
        jLabel3.setText("DepartmentId");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 190, 170, 25);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 255));
        jLabel4.setText("DepartmentName");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 260, 170, 27);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setText("Remarks");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 410, 180, 26);
        getContentPane().add(dep_id);
        dep_id.setBounds(530, 180, 140, 40);
        getContentPane().add(dep_name);
        dep_name.setBounds(526, 250, 310, 50);

        dep_ta.setColumns(20);
        dep_ta.setRows(5);
        jScrollPane1.setViewportView(dep_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(440, 440, 620, 140);

        dep_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dep_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(dep_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(860, 82, 200, 350);

        dep_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_comboActionPerformed(evt);
            }
        });
        getContentPane().add(dep_combo);
        dep_combo.setBounds(526, 100, 300, 40);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 255));
        jLabel6.setText("DePARTMENTS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(870, 60, 170, 26);

        dep_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        dep_add_bt.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dep_add_bt.setForeground(new java.awt.Color(255, 204, 51));
        dep_add_bt.setText("Add");
        dep_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(dep_add_bt);
        dep_add_bt.setBounds(440, 590, 92, 33);

        dep_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        dep_update_bt.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dep_update_bt.setForeground(new java.awt.Color(255, 204, 51));
        dep_update_bt.setText("Update");
        dep_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(dep_update_bt);
        dep_update_bt.setBounds(560, 590, 109, 33);

        dep_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        dep_delete_bt.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dep_delete_bt.setForeground(new java.awt.Color(255, 204, 51));
        dep_delete_bt.setText("delete");
        dep_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(dep_delete_bt);
        dep_delete_bt.setBounds(690, 590, 112, 33);

        dep_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        dep_clear_bt.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dep_clear_bt.setForeground(new java.awt.Color(255, 204, 51));
        dep_clear_bt.setText("clear");
        dep_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(dep_clear_bt);
        dep_clear_bt.setBounds(830, 590, 97, 33);

        dep_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        dep_back_bt.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        dep_back_bt.setForeground(new java.awt.Color(255, 204, 51));
        dep_back_bt.setText("back");
        dep_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dep_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(dep_back_bt);
        dep_back_bt.setBounds(940, 590, 87, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dep_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_clear_btActionPerformed
        dep_id.setText("");
        dep_name.setText("");
        dep_ta.setText("");
    }//GEN-LAST:event_dep_clear_btActionPerformed

    private void dep_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_comboActionPerformed
        FacultyBean Bean=(FacultyBean)this.dep_combo.getSelectedItem();
        if(Bean==null)return;
        try{
                int facId=Bean.getFacId();
                java.util.Vector v=DBManager.getDepartment(facId);
                dep_list.setListData(v);
            }catch(Exception e){
        
        }
    }//GEN-LAST:event_dep_comboActionPerformed

    private void dep_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dep_listValueChanged
        DepartmentBean DBean=(DepartmentBean)this.dep_list.getSelectedValue();
        if(DBean==null)return;
        int DepId=DBean.getDeptId();
        String DepName=DBean.getdeptName();
        String Remark=DBean.getRemark();
        dep_id.setText(DepId+"");
        dep_name.setText(DepName);
        dep_ta.setText(Remark);
        
        
    }//GEN-LAST:event_dep_listValueChanged

    private void dep_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_add_btActionPerformed
        FacultyBean fbean=(FacultyBean)this.dep_combo.getSelectedItem();
        if(fbean==null)return;
        int facId=fbean.getFacId();
        String depName=dep_name.getText();
        String remark=dep_ta.getText();
        try{
            int row=DBManager.addDepartment(facId,depName,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Inserted");
                java.util.Vector v=DBManager.getDepartment(facId);
                dep_list.setListData(v);
            
            }
        
        
        }catch(Exception e){}
    }//GEN-LAST:event_dep_add_btActionPerformed

    private void dep_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_update_btActionPerformed
       DepartmentBean dbean=(DepartmentBean)this.dep_list.getSelectedValue();
       if(dbean==null)return;
       int depId=dbean.getDeptId();
       int facId=dbean.getFacId();
       String depName=dep_name.getText();
       String remark=dep_ta.getText();
       try{
           int row=DBManager.updateDepartment(depId,depName,remark);
           if(row>=1){
           JOptionPane.showMessageDialog(null, row+"Row Updated");
           java.util.Vector v=DBManager.getDepartment(facId);
           dep_list.setListData(v);
               
           }
       }catch(Exception e){}
    }//GEN-LAST:event_dep_update_btActionPerformed

    private void dep_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_delete_btActionPerformed
       FacultyBean fbean=(FacultyBean)this.dep_combo.getSelectedItem();
       if(fbean==null)return;
       int facId=fbean.getFacId();
       int depId=Integer.parseInt(dep_id.getText());
       try{
            int row=DBManager.deleteDepartment(depId);
            if(row>=1){
                
            JOptionPane.showMessageDialog(null, row+"Delete Record");
            dep_id.setText(null);
            dep_name.setText(null);
            dep_ta.setText(null);
            java.util.Vector v=DBManager.getDepartment(facId);
            dep_list.setListData(v);
            }
       }catch(Exception e){}
    }//GEN-LAST:event_dep_delete_btActionPerformed

    private void dep_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dep_back_btActionPerformed
       new MainFrame().setVisible(true);
    }//GEN-LAST:event_dep_back_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dep_add_bt;
    private javax.swing.JButton dep_back_bt;
    private javax.swing.JButton dep_clear_bt;
    private javax.swing.JComboBox dep_combo;
    private javax.swing.JButton dep_delete_bt;
    private javax.swing.JTextField dep_id;
    private javax.swing.JList dep_list;
    private javax.swing.JTextField dep_name;
    private javax.swing.JTextArea dep_ta;
    private javax.swing.JButton dep_update_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void getFaculty(){

    try{
            java.util.Vector v=DBManager.getFaculty();
            for(int i=0;i<v.size();i++)
                dep_combo.addItem(v.elementAt(i));
}catch(Exception e){}
}
}
