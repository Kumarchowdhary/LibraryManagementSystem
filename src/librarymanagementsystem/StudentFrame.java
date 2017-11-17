
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class StudentFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public StudentFrame() {
        initComponents();
        setTitle("STUDENT FRAME");
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
        std_fac_cb = new javax.swing.JComboBox();
        std_dep_cb = new javax.swing.JComboBox();
        std_pro_cb = new javax.swing.JComboBox();
        std_bat_cb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        std_shift_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        std_group_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        std_id_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        std_name_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        std_fathername_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        std_surname_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        std_gender_tf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        std_rollno_tf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        std_contactno_tf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        std_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        std_list = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();
        atd_add_bt = new javax.swing.JButton();
        std_update_bt = new javax.swing.JButton();
        std_delete_bt = new javax.swing.JButton();
        std_clear_bt = new javax.swing.JButton();
        std_back_bt = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("STUDENT FRAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(275, 11, 379, 44);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("FACULTIES");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 70, 111, 32);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("DEPARTMENT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 120, 127, 32);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 255));
        jLabel4.setText("PROGRAMS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 170, 118, 34);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 255));
        jLabel5.setText("BATCHES");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(210, 230, 118, 30);

        std_fac_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_fac_cbActionPerformed(evt);
            }
        });
        getContentPane().add(std_fac_cb);
        std_fac_cb.setBounds(390, 60, 250, 40);

        std_dep_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_dep_cbActionPerformed(evt);
            }
        });
        getContentPane().add(std_dep_cb);
        std_dep_cb.setBounds(390, 120, 250, 40);

        std_pro_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_pro_cbActionPerformed(evt);
            }
        });
        getContentPane().add(std_pro_cb);
        std_pro_cb.setBounds(390, 170, 250, 40);

        std_bat_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_bat_cbActionPerformed(evt);
            }
        });
        getContentPane().add(std_bat_cb);
        std_bat_cb.setBounds(390, 220, 250, 40);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 255));
        jLabel6.setText("SHIFT");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(670, 190, 91, 27);
        getContentPane().add(std_shift_tf);
        std_shift_tf.setBounds(670, 220, 108, 37);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 255));
        jLabel7.setText("GROUP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 190, 87, 27);
        getContentPane().add(std_group_tf);
        std_group_tf.setBounds(830, 220, 96, 37);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 255));
        jLabel8.setText("STUDENT ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(210, 280, 118, 34);
        getContentPane().add(std_id_tf);
        std_id_tf.setBounds(390, 280, 250, 34);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 255));
        jLabel9.setText("STUDENT NAME");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 330, 118, 28);

        std_name_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_name_tfActionPerformed(evt);
            }
        });
        getContentPane().add(std_name_tf);
        std_name_tf.setBounds(390, 330, 250, 35);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 255));
        jLabel10.setText("STUDENT FATHER NAME");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 380, 160, 33);
        getContentPane().add(std_fathername_tf);
        std_fathername_tf.setBounds(390, 380, 250, 35);

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 255));
        jLabel11.setText("SURNAME");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 430, 130, 32);

        std_surname_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_surname_tfActionPerformed(evt);
            }
        });
        getContentPane().add(std_surname_tf);
        std_surname_tf.setBounds(390, 430, 250, 35);

        jLabel12.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 255));
        jLabel12.setText("GENDER");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(670, 430, 122, 35);
        getContentPane().add(std_gender_tf);
        std_gender_tf.setBounds(800, 430, 135, 35);

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 255));
        jLabel13.setText("RollNo");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(210, 480, 127, 34);
        getContentPane().add(std_rollno_tf);
        std_rollno_tf.setBounds(390, 480, 250, 34);

        jLabel14.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 255));
        jLabel14.setText("CONTACT NO");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(670, 480, 122, 34);

        std_contactno_tf.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        getContentPane().add(std_contactno_tf);
        std_contactno_tf.setBounds(800, 480, 135, 35);

        jLabel15.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 255));
        jLabel15.setText("REMARKS");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(390, 510, 127, 31);

        std_ta.setColumns(20);
        std_ta.setRows(5);
        jScrollPane1.setViewportView(std_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(390, 540, 564, 104);

        std_list.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        std_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                std_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(std_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(960, 90, 200, 550);

        jLabel16.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 255));
        jLabel16.setText("STUDENTS");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(970, 50, 160, 30);

        atd_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        atd_add_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        atd_add_bt.setForeground(new java.awt.Color(255, 153, 51));
        atd_add_bt.setText("Add");
        atd_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atd_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(atd_add_bt);
        atd_add_bt.setBounds(390, 650, 115, 33);

        std_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        std_update_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        std_update_bt.setForeground(new java.awt.Color(255, 153, 51));
        std_update_bt.setText("Update");
        std_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(std_update_bt);
        std_update_bt.setBounds(560, 650, 114, 33);

        std_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        std_delete_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        std_delete_bt.setForeground(new java.awt.Color(255, 153, 51));
        std_delete_bt.setText("Delete");
        std_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(std_delete_bt);
        std_delete_bt.setBounds(720, 650, 119, 33);

        std_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        std_clear_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        std_clear_bt.setForeground(new java.awt.Color(255, 153, 51));
        std_clear_bt.setText("Clear");
        std_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(std_clear_bt);
        std_clear_bt.setBounds(890, 650, 115, 33);

        std_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        std_back_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        std_back_bt.setForeground(new java.awt.Color(255, 153, 51));
        std_back_bt.setText("Back");
        std_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                std_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(std_back_bt);
        std_back_bt.setBounds(1050, 650, 109, 33);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void std_name_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_name_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_name_tfActionPerformed

    private void std_surname_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_surname_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_std_surname_tfActionPerformed

    private void std_fac_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_fac_cbActionPerformed
        FacultyBean fbean=(FacultyBean)this.std_fac_cb.getSelectedItem();
        if(fbean==null)return;
        try{
            int facId=fbean.getFacId();
            java.util.Vector v=DBManager.getDepartment(facId);
            std_dep_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
            std_dep_cb.addItem(v.elementAt(i));
            }
        
        }catch(Exception e){}
    }//GEN-LAST:event_std_fac_cbActionPerformed

    private void std_dep_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_dep_cbActionPerformed
        DepartmentBean dbean=(DepartmentBean)this.std_dep_cb.getSelectedItem();
        if(dbean==null)return;
        try{
                int depId=dbean.getDeptId();
                java.util.Vector v=DBManager.getProgram(depId);
                std_pro_cb.removeAllItems();
                for(int i=0;i<v.size();i++)
                {
                    std_pro_cb.addItem(v.elementAt(i));
                }
        
        }catch(Exception e){}
    }//GEN-LAST:event_std_dep_cbActionPerformed

    private void std_pro_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_pro_cbActionPerformed
        ProgramBean pbean=(ProgramBean)this.std_pro_cb.getSelectedItem();
        if(pbean==null)return;
        try{
            int proId=pbean.getProgId();
            java.util.Vector v=DBManager.getBatch(proId);
            std_bat_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
                std_bat_cb.addItem(v.elementAt(i));
            }
        
        }catch(Exception e){}
    }//GEN-LAST:event_std_pro_cbActionPerformed

    private void std_bat_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_bat_cbActionPerformed
        BatchBean bbean=(BatchBean)this.std_bat_cb.getSelectedItem();
        if(bbean==null)return;
            String shift=bbean.getShift();
            String group=bbean.getGroup();
            std_shift_tf.setText(shift);
            std_group_tf.setText(group);
        try{
            int batId=bbean.getBatchId();
            java.util.Vector v=DBManager.getStudent(batId);
            std_list.setListData(v);
        
        }catch(Exception e){}
    }//GEN-LAST:event_std_bat_cbActionPerformed

    private void std_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_std_listValueChanged
        StudentsBean sbean=(StudentsBean)this.std_list.getSelectedValue();
        if(sbean==null)return;
        try{
            int stdId=sbean.getStudentId();
            String stdName=sbean.getStudentName();
            String stdFatherName=sbean.getStudentFatherName();
            String surname=sbean.getSurname();
            String stdrollno=sbean.getRollNo();
            String stdcontactno=sbean.getContactNo();
            String gender=sbean.getGender();
            String remark=sbean.getRemark();
            std_id_tf.setText(stdId+"");
            std_name_tf.setText(stdName);
            std_fathername_tf.setText(stdFatherName);
            std_surname_tf.setText(surname);
            std_rollno_tf.setText(stdrollno);
            std_contactno_tf.setText(stdcontactno);
            std_gender_tf.setText(gender);
            std_ta.setText(remark);
        }catch(Exception e){}
    }//GEN-LAST:event_std_listValueChanged

    private void atd_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atd_add_btActionPerformed
        BatchBean bbean=(BatchBean)this.std_bat_cb.getSelectedItem();
        if(bbean==null)return;
        int batId=bbean.getBatchId();
        String stdName=std_name_tf.getText();
        String stdfatherName=std_fathername_tf.getText();
        String surname=std_surname_tf.getText();
        String rollno=std_rollno_tf.getText();
        String gender=std_gender_tf.getText();
        String contact=std_contactno_tf.getText();
        String remark=std_ta.getText();
        try{
            int row=DBManager.addStudent(batId,stdName,stdfatherName,surname,rollno,gender,contact,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null,row+"row Inserted");
                java.util.Vector v=DBManager.getStudent(batId);
                std_list.setListData(v);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_atd_add_btActionPerformed

    private void std_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_update_btActionPerformed
        StudentsBean sbean=(StudentsBean)this.std_list.getSelectedValue();
        if(sbean==null)return;
        int batId=sbean.getBatchId();
        int stdId=sbean.getStudentId();
        String stdName=std_name_tf.getText();
        String fname=std_fathername_tf.getText();
        String surname=std_surname_tf.getText();
        String gender=std_gender_tf.getText();
        String rollNo=std_rollno_tf.getText();
        String contactNo=std_contactno_tf.getText();
        String remark=std_ta.getText();
        try{
            int row=DBManager.updateStudent(stdId,stdName,fname,surname,gender,rollNo,contactNo,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Update");
            java.util.Vector v=DBManager.getStudent(batId);
            std_list.setListData(v);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_std_update_btActionPerformed

    private void std_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_delete_btActionPerformed
        BatchBean bbean=(BatchBean)this.std_bat_cb.getSelectedItem();
        if(bbean==null)return;
        int batId=bbean.getBatchId();
        int stdId=Integer.parseInt(std_id_tf.getText());
        try{
                int row=DBManager.deleteStudent(stdId);
                if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Delete");
                std_id_tf.setText(null);
                std_name_tf.setText(null);
                std_fathername_tf.setText(null);
                std_surname_tf.setText(null);
                std_rollno_tf.setText(null);
                std_gender_tf.setText(null);
                std_contactno_tf.setText(null);
                std_ta.setText(null);
                java.util.Vector v=DBManager.getStudent(batId);
                std_list.setListData(v);
                }
        
        }catch(Exception e){}
    }//GEN-LAST:event_std_delete_btActionPerformed

    private void std_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_clear_btActionPerformed
       std_id_tf.setText(null);
       std_name_tf.setText(null);
       std_fathername_tf.setText(null);
       std_surname_tf.setText(null);
       std_gender_tf.setText(null);
       std_rollno_tf.setText(null);
       std_contactno_tf.setText(null);
       std_ta.setText(null);
    }//GEN-LAST:event_std_clear_btActionPerformed

    private void std_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_std_back_btActionPerformed
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_std_back_btActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atd_add_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton std_back_bt;
    private javax.swing.JComboBox std_bat_cb;
    private javax.swing.JButton std_clear_bt;
    private javax.swing.JTextField std_contactno_tf;
    private javax.swing.JButton std_delete_bt;
    private javax.swing.JComboBox std_dep_cb;
    private javax.swing.JComboBox std_fac_cb;
    private javax.swing.JTextField std_fathername_tf;
    private javax.swing.JTextField std_gender_tf;
    private javax.swing.JTextField std_group_tf;
    private javax.swing.JTextField std_id_tf;
    private javax.swing.JList std_list;
    private javax.swing.JTextField std_name_tf;
    private javax.swing.JComboBox std_pro_cb;
    private javax.swing.JTextField std_rollno_tf;
    private javax.swing.JTextField std_shift_tf;
    private javax.swing.JTextField std_surname_tf;
    private javax.swing.JTextArea std_ta;
    private javax.swing.JButton std_update_bt;
    // End of variables declaration//GEN-END:variables
private void getFaculty(){
try{
        java.util.Vector v=DBManager.getFaculty();
        for(int i=0;i<v.size();i++)
        {
            std_fac_cb.addItem(v.elementAt(i));
        }
        }catch(Exception e){}

}


}
