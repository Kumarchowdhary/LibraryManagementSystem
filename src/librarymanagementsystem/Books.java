
package librarymanagementsystem;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class Books extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public Books() {
        initComponents();
        setTitle("BOOKS");
        setBounds(0,0,width,height);
        getBookType();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Book_type_cb = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Book_bookid_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        book_booktitle_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        book_author_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Book_isbn_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        book_publish_tf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        book_edition_tf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        book_purchase_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        book_prise_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        books_list = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Book_ta = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        book_add_bt = new javax.swing.JButton();
        book_update_bt = new javax.swing.JButton();
        book_delete_bt = new javax.swing.JButton();
        book_clear_bt = new javax.swing.JButton();
        book_back_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setText("BOOKS ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 10, 273, 40);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("TYPE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 50, 126, 33);

        Book_type_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_type_cbActionPerformed(evt);
            }
        });
        getContentPane().add(Book_type_cb);
        Book_type_cb.setBounds(450, 50, 202, 36);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Book Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 110, 126, 32);
        getContentPane().add(Book_bookid_tf);
        Book_bookid_tf.setBounds(450, 110, 202, 32);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 204));
        jLabel4.setText("Book Title");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 160, 126, 31);
        getContentPane().add(book_booktitle_tf);
        book_booktitle_tf.setBounds(450, 160, 202, 31);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 204));
        jLabel5.setText("Author");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 210, 126, 37);
        getContentPane().add(book_author_tf);
        book_author_tf.setBounds(450, 220, 202, 29);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 204));
        jLabel6.setText("ISBN");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 270, 126, 31);
        getContentPane().add(Book_isbn_tf);
        Book_isbn_tf.setBounds(450, 270, 202, 31);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 204));
        jLabel7.setText("Publish");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 320, 126, 32);
        getContentPane().add(book_publish_tf);
        book_publish_tf.setBounds(450, 320, 202, 32);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 204));
        jLabel8.setText("Edition");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 370, 126, 36);
        getContentPane().add(book_edition_tf);
        book_edition_tf.setBounds(450, 370, 202, 29);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 204));
        jLabel9.setText("Purchase");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 420, 126, 34);
        getContentPane().add(book_purchase_tf);
        book_purchase_tf.setBounds(450, 420, 202, 34);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 204));
        jLabel10.setText("Prise");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 470, 126, 30);
        getContentPane().add(book_prise_tf);
        book_prise_tf.setBounds(450, 470, 202, 30);

        books_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                books_listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(books_list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(750, 70, 200, 450);

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 204));
        jLabel11.setText("Remarks");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(290, 500, 126, 33);

        Book_ta.setColumns(20);
        Book_ta.setRows(5);
        jScrollPane2.setViewportView(Book_ta);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 530, 653, 108);

        jLabel12.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 204));
        jLabel12.setText("Book Title");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(750, 40, 178, 32);

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
        book_add_bt.setBounds(290, 650, 89, 37);

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
        book_update_bt.setBounds(420, 650, 108, 37);

        book_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        book_delete_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        book_delete_bt.setForeground(new java.awt.Color(255, 153, 0));
        book_delete_bt.setText("Delete");
        book_delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_delete_btActionPerformed(evt);
            }
        });
        getContentPane().add(book_delete_bt);
        book_delete_bt.setBounds(560, 650, 113, 37);

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
        book_clear_bt.setBounds(700, 650, 107, 37);

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
        book_back_bt.setBounds(840, 650, 109, 37);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_add_btActionPerformed
        
        BookTypeBean typebean=(BookTypeBean)this.Book_type_cb.getSelectedItem();
        if(typebean==null)return;
        int typeid=typebean.geTypeId();
        String bookTitle=book_booktitle_tf.getText();
        String bookauthor=book_author_tf.getText();
        String Isbn=Book_isbn_tf.getText();
        String publish=book_publish_tf.getText();
        String Edition=book_edition_tf.getText();
        String purchase=book_purchase_tf.getText();
        String prise=book_prise_tf.getText();
        String remark=Book_ta.getText();
        try{
                int row=DBManager.addBooks(typeid,bookTitle,bookauthor,Isbn,publish,Edition,purchase,prise,remark);
                if(row>=1){
                    JOptionPane.showMessageDialog(null, row+"Row Add");
                    java.util.Vector v=DBManager.getBooks(typeid);
                    books_list.setListData(v);
                }
        
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_book_add_btActionPerformed

    private void Book_type_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_type_cbActionPerformed
      BookTypeBean bookbean=(BookTypeBean)this.Book_type_cb.getSelectedItem();
      if(bookbean==null)return;
      try{
          int typeid=bookbean.geTypeId();
          java.util.Vector v=DBManager.getBooks(typeid);
          books_list.setListData(v);
      
      }catch(Exception e){}
    }//GEN-LAST:event_Book_type_cbActionPerformed

    private void books_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_books_listValueChanged
        BooksBean bookbean=(BooksBean)this.books_list.getSelectedValue();
        if(bookbean==null)return;
        try{
            int bookId=bookbean.getBookId();
            String bookTitle=bookbean.getBookTitle();
            String Author=bookbean.getAuthor();
            String Isbn=bookbean.getISBN();
            String publish=bookbean.getPublish();
            String Edition=bookbean.getEdition();
            String purchase=bookbean.getPurchase();
            String prise=bookbean.getPrise();
            String remark=bookbean.getRemark();
            Book_bookid_tf.setText(bookId+"");
            book_booktitle_tf.setText(bookTitle);
            book_author_tf.setText(Author);
            Book_isbn_tf.setText(Isbn);
            book_publish_tf.setText(publish);
            book_edition_tf.setText(Edition);
            book_purchase_tf.setText(purchase);
            book_prise_tf.setText(prise);
            Book_ta.setText(remark);
        }catch(Exception e){}
    }//GEN-LAST:event_books_listValueChanged

    private void book_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_update_btActionPerformed
        BooksBean bbean=(BooksBean)this.books_list.getSelectedValue();
        if(bbean==null)return;
        int typeId=bbean.getTypeId();
        int bookId=bbean.getBookId();
        String bookTitle=book_booktitle_tf.getText();
        String Author=book_author_tf.getText();
        String Isbn=Book_isbn_tf.getText();
        String publish=book_publish_tf.getText();
        String Edition =book_edition_tf.getText();
        String purchase=book_purchase_tf.getText();
        String prise=book_prise_tf.getText();
        String remark=Book_ta.getText();
        try{
            int row=DBManager.updateBooks(bookId,bookTitle,Author,Isbn,publish,Edition,purchase,prise,remark);
            if(row>=1){
                JOptionPane.showMessageDialog(null, row+"Row Update");
                java.util.Vector v=DBManager.getBooks(typeId);
                  books_list.setListData(v);
                  this.Book_type_cbActionPerformed(evt);
            }
        
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_book_update_btActionPerformed

    private void book_delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_delete_btActionPerformed
        
        BookTypeBean typebean=(BookTypeBean)this.Book_type_cb.getSelectedItem();
        if(typebean==null)return;
        int typeId=typebean.geTypeId();
        int bookId=Integer.parseInt(Book_bookid_tf.getText());
        try{
        int row=DBManager.deleteBooks(bookId);
        if(row>=1){
        JOptionPane.showMessageDialog(null, row+"Row Delete");
        Book_bookid_tf.setText(null);
        book_booktitle_tf.setText(null);
        book_author_tf.setText(null);
        Book_isbn_tf.setText(null);
        book_publish_tf.setText(null);
        book_edition_tf.setText(null);
        book_purchase_tf.setText(null);
        book_prise_tf.setText(null);
        Book_ta.setText(null);
;        
        
        java.util.Vector v=DBManager.getBooks(typeId);
        books_list.setListData(v);
        }
        
        }catch(Exception e){}
    }//GEN-LAST:event_book_delete_btActionPerformed

    private void book_clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_clear_btActionPerformed
        Book_bookid_tf.setText(null);
        book_booktitle_tf.setText(null);
        book_author_tf.setText(null);
        Book_isbn_tf.setText(null);
        book_publish_tf.setText(null);
        book_edition_tf.setText(null);
        book_purchase_tf.setText(null);
        book_prise_tf.setText(null);
        Book_ta.setText(null);
    }//GEN-LAST:event_book_clear_btActionPerformed

    private void book_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_back_btActionPerformed
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_book_back_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Book_bookid_tf;
    private javax.swing.JTextField Book_isbn_tf;
    private javax.swing.JTextArea Book_ta;
    private javax.swing.JComboBox Book_type_cb;
    private javax.swing.JButton book_add_bt;
    private javax.swing.JTextField book_author_tf;
    private javax.swing.JButton book_back_bt;
    private javax.swing.JTextField book_booktitle_tf;
    private javax.swing.JButton book_clear_bt;
    private javax.swing.JButton book_delete_bt;
    private javax.swing.JTextField book_edition_tf;
    private javax.swing.JTextField book_prise_tf;
    private javax.swing.JTextField book_publish_tf;
    private javax.swing.JTextField book_purchase_tf;
    private javax.swing.JButton book_update_bt;
    private javax.swing.JList books_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private void getBookType(){
    try{
        java.util.Vector v=DBManager.getBookType();
        for(int i=0;i<v.size();i++){
            Book_type_cb.addItem(v.elementAt(i));
        
        }
    
    }catch(Exception e){
    }
    
    }

}
