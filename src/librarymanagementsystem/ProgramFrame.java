
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class ProgramFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    public ProgramFrame() {
        initComponents();
        setTitle("PROGRAM FRAME");
        setBounds(0,0,width,height);
        
        getFaculty();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pro_fac_cb = new javax.swing.JComboBox();
        pro_dep_cb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        pro_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        prog_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pro_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        prog_list = new javax.swing.JList();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prog_duration = new javax.swing.JTextField();
        pro_add_bt = new javax.swing.JButton();
        pro_update_bt = new javax.swing.JButton();
        prog_delete_bt = new javax.swing.JButton();
        prog_clear_bt = new javax.swing.JButton();
        pro_back_bt = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("PROGRAM FRAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(275, 11, 394, 64);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setText("Faculties");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(283, 81, 196, 31);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 255));
        jLabel3.setText("Departments");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(283, 171, 196, 32);

        pro_fac_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_fac_cbActionPerformed(evt);
            }
        });
        getContentPane().add(pro_fac_cb);
        pro_fac_cb.setBounds(460, 80, 360, 40);

        pro_dep_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_dep_cbActionPerformed(evt);
            }
        });
        getContentPane().add(pro_dep_cb);
        pro_dep_cb.setBounds(460, 170, 360, 41);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 51, 255));
        jLabel4.setText("Program ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 260, 82, 29);
        getContentPane().add(pro_id);
        pro_id.setBounds(460, 260, 75, 37);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setText("Program Name");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(560, 260, 132, 37);
        getContentPane().add(prog_name);
        prog_name.setBounds(690, 260, 144, 36);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 51, 255));
        jLabel6.setText("REMARKS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(310, 420, 90, 35);

        pro_ta.setColumns(20);
        pro_ta.setRows(5);
        jScrollPane1.setViewportView(pro_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 462, 520, 111);

        prog_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                prog_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(prog_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(840, 81, 185, 490);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 51, 255));
        jLabel7.setText("PROGRAMS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(840, 40, 156, 40);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 255));
        jLabel8.setText("PROGRAM DURATION");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 330, 160, 42);
        getContentPane().add(prog_duration);
        prog_duration.setBounds(460, 330, 370, 40);

        pro_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        pro_add_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        pro_add_bt.setForeground(new java.awt.Color(255, 204, 51));
        pro_add_bt.setText("Add");
        pro_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(pro_add_bt);
        pro_add_bt.setBounds(330, 590, 110, 30);

        pro_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        pro_update_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        pro_update_bt.setForeground(new java.awt.Color(255, 204, 51));
        pro_update_bt.setText("Update");
        pro_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(pro_update_bt);
        pro_update_bt.setBounds(470, 590, 110, 30);

        prog_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        prog_delete_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        prog_delete_bt.setForeground(new java.awt.Color(255, 204, 51));
        prog_delete_bt.setText("Delete");
        prog_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prog_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(prog_delete_bt);
        prog_delete_bt.setBounds(620, 590, 110, 30);

        prog_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        prog_clear_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        prog_clear_bt.setForeground(new java.awt.Color(255, 204, 51));
        prog_clear_bt.setText("Clear");
        prog_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prog_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(prog_clear_bt);
        prog_clear_bt.setBounds(760, 590, 100, 30);

        pro_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        pro_back_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        pro_back_bt.setForeground(new java.awt.Color(255, 204, 51));
        pro_back_bt.setText("Back");
        pro_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(pro_back_bt);
        pro_back_bt.setBounds(890, 590, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pro_fac_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_fac_cbActionPerformed
        FacultyBean fBean=(FacultyBean)this.pro_fac_cb.getSelectedItem();
        if(fBean==null)return;
        try{
        int facId=fBean.getFacId();
        java.util.Vector v=DBManager.getDepartment(facId);
        pro_dep_cb.removeAllItems();
        for(int i=0;i<v.size();i++){
        pro_dep_cb.addItem(v.elementAt(i));
        }
        }catch(Exception e){}
    }//GEN-LAST:event_pro_fac_cbActionPerformed

    private void pro_dep_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_dep_cbActionPerformed
        DepartmentBean DBean=(DepartmentBean)this.pro_dep_cb.getSelectedItem();
        if(DBean==null)return;
        try{
        
        int depId=DBean.getDeptId();
        java.util.Vector v=DBManager.getProgram(depId);
        prog_list.setListData(v);
        }catch(Exception e){}
        
        
        
    }//GEN-LAST:event_pro_dep_cbActionPerformed

    private void prog_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_prog_listValueChanged
       ProgramBean PBean=(ProgramBean)this.prog_list.getSelectedValue();
       if(PBean==null)return;
       try{
            int proId=PBean.getProgId();
            String proName=PBean.getProgName();
            String proDuration=PBean.getProgDuration();
            String remark=PBean.getRemark();
            pro_id.setText(proId+"");
            prog_name.setText(proName);
            prog_duration.setText(proDuration);
            pro_ta.setText(remark);
           
       
       }catch(Exception e){}
    }//GEN-LAST:event_prog_listValueChanged

    private void pro_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_add_btActionPerformed
       DepartmentBean dbean=(DepartmentBean)this.pro_dep_cb.getSelectedItem();
       if(dbean==null)return;
       int depId=dbean.getDeptId();
       String proName=prog_name.getText();
       String proDuration=prog_duration.getText();
       String remark=pro_ta.getText();
       try{
       
       int row=DBManager.addProgram(depId,proName,proDuration,remark);
       if(row>=1){
           
           JOptionPane.showMessageDialog(null,row+"Row Inserted");
           
           java.util.Vector v=DBManager.getProgram(depId);
           prog_list.setListData(v);
       
       }
       }catch(Exception e){}
    }//GEN-LAST:event_pro_add_btActionPerformed

    private void pro_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_update_btActionPerformed
        ProgramBean pbean=(ProgramBean)this.prog_list.getSelectedValue();
        if(pbean==null)return;
        int depId=pbean.getDeptId();
        int proId=pbean.getProgId();
        String proName=prog_name.getText();
        String proDuration=prog_duration.getText();
        String remark=pro_ta.getText();
        try{
            int row=DBManager.updateProgram(proId,proName,proDuration,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Update");
                java.util.Vector v=DBManager.getProgram(depId);
                prog_list.setListData(v);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_pro_update_btActionPerformed

    private void prog_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prog_delete_btActionPerformed
       DepartmentBean dbean=(DepartmentBean)this.pro_dep_cb.getSelectedItem();
       if(dbean==null)return;
       int depId=dbean.getDeptId();
       int proId=Integer.parseInt(pro_id.getText());
       try{
       int row=DBManager.deleteProgram(proId);
       if(row>=1){
           JOptionPane.showMessageDialog(null, row+"Row Delete");
           
           prog_name.setText(null);
           prog_duration.setText(null);
           pro_ta.setText(null);
       java.util.Vector v=DBManager.getProgram(depId);
       prog_list.setListData(v);
       }
       }catch(Exception e){
       
       
       }
    }//GEN-LAST:event_prog_delete_btActionPerformed

    private void prog_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prog_clear_btActionPerformed
       pro_id.setText("");
       prog_name.setText("");
       prog_duration.setText("");
       pro_ta.setText("");
       
    }//GEN-LAST:event_prog_clear_btActionPerformed

    private void pro_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_back_btActionPerformed
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_pro_back_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pro_add_bt;
    private javax.swing.JButton pro_back_bt;
    private javax.swing.JComboBox pro_dep_cb;
    private javax.swing.JComboBox pro_fac_cb;
    private javax.swing.JTextField pro_id;
    private javax.swing.JTextArea pro_ta;
    private javax.swing.JButton pro_update_bt;
    private javax.swing.JButton prog_clear_bt;
    private javax.swing.JButton prog_delete_bt;
    private javax.swing.JTextField prog_duration;
    private javax.swing.JList prog_list;
    private javax.swing.JTextField prog_name;
    // End of variables declaration//GEN-END:variables
private void getFaculty(){
try{
    java.util.Vector v=DBManager.getFaculty();
    for(int i=0;i<=v.size();i++)pro_fac_cb.addItem(v.elementAt(i));
    }catch(Exception e){}

}
}
