
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class BookTypeFrame extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public BookTypeFrame() {
        initComponents();
        setTitle("Book Type Frame");
        setBounds(0,0,width,height);
        getBookType();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Book_typeid_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        book_typeName_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Booktype_ta = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BookType_list = new javax.swing.JList();
        book_add_bt = new javax.swing.JButton();
        book_update_bt = new javax.swing.JButton();
        book_dalate_bt = new javax.swing.JButton();
        book_clear_bt = new javax.swing.JButton();
        book_back_bt = new javax.swing.JButton();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("BOOK TYPES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 10, 315, 49);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("Type Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 100, 131, 34);
        getContentPane().add(Book_typeid_tf);
        Book_typeid_tf.setBounds(490, 110, 183, 34);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("Type");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 200, 131, 30);
        getContentPane().add(book_typeName_tf);
        book_typeName_tf.setBounds(490, 200, 183, 34);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 255));
        jLabel4.setText("Remarks");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 300, 131, 35);

        Booktype_ta.setColumns(20);
        Booktype_ta.setRows(5);
        jScrollPane1.setViewportView(Booktype_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 350, 460, 119);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 51, 255));
        jLabel5.setText("Book Type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(790, 70, 120, 30);

        BookType_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                BookType_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(BookType_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(780, 110, 179, 360);

        book_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_add_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_add_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_add_bt.setText("Add");
        book_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_add_bt);
        book_add_bt.setBounds(300, 480, 100, 30);

        book_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_update_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_update_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_update_bt.setText("Update");
        book_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_update_bt);
        book_update_bt.setBounds(440, 480, 110, 30);

        book_dalate_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_dalate_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_dalate_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_dalate_bt.setText("Delete");
        book_dalate_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_dalate_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_dalate_bt);
        book_dalate_bt.setBounds(580, 480, 110, 30);

        book_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_clear_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_clear_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_clear_bt.setText("Clear");
        book_clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_clear_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_clear_bt);
        book_clear_bt.setBounds(730, 480, 90, 30);

        book_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_back_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_back_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_back_bt.setText("Back");
        book_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_back_bt);
        book_back_bt.setBounds(850, 480, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookType_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_BookType_listValueChanged
       BookTypeBean bbean=(BookTypeBean)this.BookType_list.getSelectedValue();
       if(bbean==null)return;
       try{
                int typeId=bbean.geTypeId();
                String Type=bbean.getType();
                String remark=bbean.getRemark();
                Book_typeid_tf.setText(typeId+"");
                book_typeName_tf.setText(Type);
                Booktype_ta.setText(remark);
       
       
       }catch(Exception e){}
    }//GEN-LAST:event_BookType_listValueChanged

    private void book_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_add_btActionPerformed
        String bookType=book_typeName_tf.getText();
        String remark=Booktype_ta.getText();
        try{
            int row=DBManager.addBookType(bookType,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Added");
                java.util.Vector v=DBManager.getBookType();
                BookType_list.setListData(v);
            }
        }catch(Exception e){}
    }//GEN-LAST:event_book_add_btActionPerformed

    private void book_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_update_btActionPerformed
        BookTypeBean typebean=(BookTypeBean)this.BookType_list.getSelectedValue();
        if(typebean==null)return;
        String booktype=book_typeName_tf.getText();
        String remark=Booktype_ta.getText();
        try{
            int row=DBManager.updateBookType(typebean.geTypeId(),booktype,remark);
            if(row>=1){
            JOptionPane.showMessageDialog(null, row+"Row Update");
            getBookType();
            
            }
        }catch(Exception e){}
    }//GEN-LAST:event_book_update_btActionPerformed

    private void book_dalate_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_dalate_btActionPerformed
        int typeId=Integer.parseInt(Book_typeid_tf.getText());
        try{
        int row=DBManager.deleteBookType(typeId);
        if(row>=1){
        JOptionPane.showMessageDialog(null, row+"Row Delete");
        Book_typeid_tf.setText(null);
        book_typeName_tf.setText(null);
        Booktype_ta.setText(null);
        getBookType();
        }
        }catch(Exception e){}
    }//GEN-LAST:event_book_dalate_btActionPerformed

    private void book_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_clear_btActionPerformed
       Book_typeid_tf.setText(null);
       book_typeName_tf.setText(null);
       Booktype_ta.setText(null);
    }//GEN-LAST:event_book_clear_btActionPerformed

    private void book_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_back_btActionPerformed
       new MainFrame().setVisible(true);
    }//GEN-LAST:event_book_back_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTypeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList BookType_list;
    private javax.swing.JTextField Book_typeid_tf;
    private javax.swing.JTextArea Booktype_ta;
    private javax.swing.JButton book_add_bt;
    private javax.swing.JButton book_back_bt;
    private javax.swing.JButton book_clear_bt;
    private javax.swing.JButton book_dalate_bt;
    private javax.swing.JTextField book_typeName_tf;
    private javax.swing.JButton book_update_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
private void getBookType(){
    try{
         java.util.Vector v=DBManager.getBookType();
         BookType_list.setListData(v);
    
    }catch(Exception e){}

    }
}
