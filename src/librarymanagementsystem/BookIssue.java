
package librarymanagementsystem;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.text.SimpleDateFormat;


public class BookIssue extends javax.swing.JFrame {
    Toolkit kit=getToolkit();
    Dimension d=kit.getScreenSize();
    int width=d.width;
    int height=d.height;
    
    public BookIssue() {
        initComponents();
        setTitle("BOOK ISSUE");
        setBounds(0,0,width,height);
        getFaculty();
        getBookType();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bookissue_fac_cb = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        bookissue_dep_cb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        bookissue_pro_cb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        bookissue_shift_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bookissue_group_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bookissue_bat_cb = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        bookissue_std_cb = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        bookissue_fathername_tf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bookissue_std_rollno_tf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bookissue_surname_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bookissue_bookauthor_tf = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        bookissue_edition_tf = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookissue_ta = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        issuedate_list = new javax.swing.JList();
        jLabel19 = new javax.swing.JLabel();
        bookissue_add_bt = new javax.swing.JButton();
        bookissue_update_bt = new javax.swing.JButton();
        bookissue_delete_bt = new javax.swing.JButton();
        bookissue_clear_bt = new javax.swing.JButton();
        bookissue_back_bt = new javax.swing.JButton();
        bookissue_booktype_cb = new javax.swing.JComboBox();
        bookissue_books_cb = new javax.swing.JComboBox();
        bookissue_issuedate_tf = new com.toedter.calendar.JDateChooser();
        bookissue_returndate_tf = new com.toedter.calendar.JDateChooser();
        BookName = new javax.swing.JTextField();
        TypeName = new javax.swing.JTextField();
        IssueId = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 255));
        jLabel1.setText("BOOK ISSUE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(307, 11, 322, 41);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("FACULTY");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(246, 58, 134, 30);

        bookissue_fac_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_fac_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_fac_cb);
        bookissue_fac_cb.setBounds(392, 59, 191, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 255));
        jLabel3.setText("DEPARTMENT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(246, 94, 134, 30);

        bookissue_dep_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_dep_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_dep_cb);
        bookissue_dep_cb.setBounds(392, 95, 191, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 255));
        jLabel4.setText("PROGRAMS");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(246, 130, 134, 30);

        bookissue_pro_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_pro_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_pro_cb);
        bookissue_pro_cb.setBounds(392, 131, 191, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 255));
        jLabel5.setText("SHIFT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(614, 133, 73, 24);
        getContentPane().add(bookissue_shift_tf);
        bookissue_shift_tf.setBounds(601, 157, 98, 31);

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 255));
        jLabel6.setText("GROUP");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(759, 134, 77, 23);

        bookissue_group_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_group_tfActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_group_tf);
        bookissue_group_tf.setBounds(763, 157, 110, 31);

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 255));
        jLabel7.setText("BATCH ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(246, 168, 134, 25);

        bookissue_bat_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_bat_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_bat_cb);
        bookissue_bat_cb.setBounds(392, 167, 191, 28);

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 255));
        jLabel8.setText("STUDENTS");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(246, 204, 134, 25);

        bookissue_std_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_std_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_std_cb);
        bookissue_std_cb.setBounds(392, 201, 191, 32);

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 255));
        jLabel9.setText("FATHER NAME");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(246, 239, 142, 27);
        getContentPane().add(bookissue_fathername_tf);
        bookissue_fathername_tf.setBounds(392, 238, 191, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 255));
        jLabel10.setText("STUDENT ROLL NO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(246, 273, 142, 30);
        getContentPane().add(bookissue_std_rollno_tf);
        bookissue_std_rollno_tf.setBounds(392, 274, 191, 30);

        jLabel11.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 255));
        jLabel11.setText("SURNAME");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(246, 309, 142, 31);
        getContentPane().add(bookissue_surname_tf);
        bookissue_surname_tf.setBounds(392, 310, 191, 31);

        jLabel12.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 255));
        jLabel12.setText("Book TYPE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(246, 351, 142, 31);

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 255));
        jLabel13.setText("BOOKS");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(246, 383, 142, 30);

        jLabel14.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 0, 255));
        jLabel14.setText("BOOK AUTHOR");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(246, 419, 142, 29);
        getContentPane().add(bookissue_bookauthor_tf);
        bookissue_bookauthor_tf.setBounds(392, 420, 191, 29);

        jLabel15.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 255));
        jLabel15.setText("EDITION");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(246, 463, 90, 28);
        getContentPane().add(bookissue_edition_tf);
        bookissue_edition_tf.setBounds(390, 464, 193, 28);

        jLabel16.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 255));
        jLabel16.setText("ISSUE DATE");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(601, 411, 115, 29);

        jLabel17.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 0, 255));
        jLabel17.setText("RETURN DATE");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(601, 461, 102, 32);

        jLabel18.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 255));
        jLabel18.setText("Remarks");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(246, 496, 142, 24);

        bookissue_ta.setColumns(20);
        bookissue_ta.setRows(5);
        jScrollPane1.setViewportView(bookissue_ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(246, 526, 650, 96);

        issuedate_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                issuedate_listValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(issuedate_list);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(904, 51, 212, 571);

        jLabel19.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 255));
        jLabel19.setText("Issue DaTE");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(932, 26, 184, 19);

        bookissue_add_bt.setBackground(new java.awt.Color(0, 0, 0));
        bookissue_add_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bookissue_add_bt.setForeground(new java.awt.Color(255, 204, 0));
        bookissue_add_bt.setText("Add");
        bookissue_add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_add_btActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_add_bt);
        bookissue_add_bt.setBounds(250, 640, 118, 31);

        bookissue_update_bt.setBackground(new java.awt.Color(0, 0, 0));
        bookissue_update_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bookissue_update_bt.setForeground(new java.awt.Color(255, 204, 0));
        bookissue_update_bt.setText("Update");
        bookissue_update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_update_btActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_update_bt);
        bookissue_update_bt.setBounds(430, 640, 121, 35);

        bookissue_delete_bt.setBackground(new java.awt.Color(0, 0, 0));
        bookissue_delete_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bookissue_delete_bt.setForeground(new java.awt.Color(255, 204, 0));
        bookissue_delete_bt.setText("Delete");
        getContentPane().add(bookissue_delete_bt);
        bookissue_delete_bt.setBounds(610, 640, 118, 35);

        bookissue_clear_bt.setBackground(new java.awt.Color(0, 0, 0));
        bookissue_clear_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bookissue_clear_bt.setForeground(new java.awt.Color(255, 204, 0));
        bookissue_clear_bt.setText("Clear");
        getContentPane().add(bookissue_clear_bt);
        bookissue_clear_bt.setBounds(800, 640, 126, 35);

        bookissue_back_bt.setBackground(new java.awt.Color(0, 0, 0));
        bookissue_back_bt.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        bookissue_back_bt.setForeground(new java.awt.Color(255, 204, 0));
        bookissue_back_bt.setText("Back");
        bookissue_back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_back_btActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_back_bt);
        bookissue_back_bt.setBounds(980, 640, 136, 35);

        bookissue_booktype_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_booktype_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_booktype_cb);
        bookissue_booktype_cb.setBounds(392, 352, 191, 31);

        bookissue_books_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookissue_books_cbActionPerformed(evt);
            }
        });
        getContentPane().add(bookissue_books_cb);
        bookissue_books_cb.setBounds(392, 389, 191, 24);
        getContentPane().add(bookissue_issuedate_tf);
        bookissue_issuedate_tf.setBounds(734, 412, 140, 37);
        getContentPane().add(bookissue_returndate_tf);
        bookissue_returndate_tf.setBounds(734, 461, 140, 32);
        getContentPane().add(BookName);
        BookName.setBounds(734, 372, 140, 28);
        getContentPane().add(TypeName);
        TypeName.setBounds(734, 326, 140, 28);
        getContentPane().add(IssueId);
        IssueId.setBounds(734, 276, 140, 28);

        jLabel20.setText("Issue id");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(622, 283, 94, 14);

        jLabel21.setText("Type Name");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(622, 330, 72, 20);

        jLabel22.setText("Book Nsme");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(622, 379, 72, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookissue_bat_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_bat_cbActionPerformed
        BatchBean bbean=(BatchBean)this.bookissue_bat_cb.getSelectedItem();
        if(bbean==null)return;
        String shift=bbean.getShift();
        String group=bbean.getGroup();
        bookissue_shift_tf.setText(shift);
        bookissue_group_tf.setText(group);
        try{
            int batId=bbean.getBatchId();
            java.util.Vector v=DBManager.getStudent(batId);
            bookissue_std_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
            bookissue_std_cb.addItem(v.elementAt(i));
            }
        }catch(Exception e){}
    }//GEN-LAST:event_bookissue_bat_cbActionPerformed

    private void bookissue_fac_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_fac_cbActionPerformed
       FacultyBean fbean=(FacultyBean)this.bookissue_fac_cb.getSelectedItem();
       if(fbean==null)return;
       try{
            int facId=fbean.getFacId();
            java.util.Vector v=DBManager.getDepartment(facId);
            bookissue_dep_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
                bookissue_dep_cb.addItem(v.elementAt(i));
            }
       }catch(Exception e){}
    }//GEN-LAST:event_bookissue_fac_cbActionPerformed

    private void bookissue_dep_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_dep_cbActionPerformed
        DepartmentBean dbean=(DepartmentBean)this.bookissue_dep_cb.getSelectedItem();
        if(dbean==null)return;
        try{
                int depId=dbean.getDeptId();
                java.util.Vector v=DBManager.getProgram(depId);
                bookissue_pro_cb.removeAllItems();
                for(int i=0;i<v.size();i++){
                bookissue_pro_cb.addItem(v.elementAt(i));
                }
                        
        }catch(Exception e){}
    }//GEN-LAST:event_bookissue_dep_cbActionPerformed

    private void bookissue_pro_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_pro_cbActionPerformed
        ProgramBean pbean=(ProgramBean)this.bookissue_pro_cb.getSelectedItem();
        if(pbean==null)return;
        try{
            int proId=pbean.getProgId();
            java.util.Vector v=DBManager.getBatch(proId);
            bookissue_bat_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
            bookissue_bat_cb.addItem(v.elementAt(i));
            }
        
        }catch(Exception e){}
    }//GEN-LAST:event_bookissue_pro_cbActionPerformed

    private void bookissue_std_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_std_cbActionPerformed
        StudentsBean sbean=(StudentsBean)this.bookissue_std_cb.getSelectedItem();
        if(sbean==null)return;
        try{
            int stdId=sbean.getStudentId();
            java.util.Vector v=DBManager.getBookIssue(stdId);
            issuedate_list.setListData(v);
                String fatherName=sbean.getStudentFatherName();
                String stdrollNo=sbean.getRollNo();
                String surname=sbean.getSurname();
                bookissue_fathername_tf.setText(fatherName);
                bookissue_std_rollno_tf.setText(stdrollNo);
                bookissue_surname_tf.setText(surname);
                
            
        }catch(Exception e){}
    }//GEN-LAST:event_bookissue_std_cbActionPerformed

    private void bookissue_booktype_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_booktype_cbActionPerformed
        BookTypeBean typebean=(BookTypeBean)this.bookissue_booktype_cb.getSelectedItem();
        if(typebean==null)return;
        try{
            int typeId=typebean.geTypeId();
            java.util.Vector v=DBManager.getBooks(typeId);
            
            bookissue_books_cb.removeAllItems();
            for(int i=0;i<v.size();i++){
            bookissue_books_cb.addItem(v.elementAt(i));
            }
        }catch(Exception e){}  
    }//GEN-LAST:event_bookissue_booktype_cbActionPerformed

    private void issuedate_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_issuedate_listValueChanged

       BookIssueBean bookissuebean=(BookIssueBean)issuedate_list.getSelectedValue();
       
       if(bookissuebean==null)return;
      // BooksBean bbean=(BooksBean)this.bookissue_books_cb.getSelectedItem();
       //if(bbean==null)return;
       String selected = issuedate_list.getSelectedValue().toString();
        //JDateChooser dc=new JDateChooser();
        
       this.IssueId.setText(""+bookissuebean.getIssueId());
       //this.bookissue_issuedate_tf.setDateFormatString(bookissuebean.getIssueDate());
       //this.bookissue_returndate_tf.setDateFormatString(bookissuebean.getReturnDate());
       this.bookissue_ta.setText(bookissuebean.getRemark());
       System.out.println(bookissuebean.getIssueDate());
      //issue date change
       String data1=bookissuebean.getIssueDate();
       String monthissue=data1.substring(0,2);
       System.out.println("month="+monthissue);
       String dayissue=data1.substring(3,5);
       System.out.println("day="+dayissue);
       String yearIssue=data1.substring(6,10);
       System.out.println("year="+yearIssue);
       int monthconissue=Integer.parseInt(monthissue);
       String monthEngissue=Month(monthconissue);
       System.out.println("Month in English"+monthEngissue);
       String dayChangeIssue=Day(dayissue);
       System.out.println("day change"+dayChangeIssue);
       String calanderdateinsertissue=monthEngissue+" "+dayChangeIssue+", "+yearIssue;
       try{
           java.util.Date dateDem=new SimpleDateFormat("MMM d, yyyy").parse(calanderdateinsertissue);
           bookissue_issuedate_tf.setDate(dateDem);
       }catch(Exception e){e.printStackTrace();}
       
           String datareturn=bookissuebean.getReturnDate();
       String monthreturn=datareturn.substring(0,2);
       System.out.println("month="+monthissue);
       String dayreturn=datareturn.substring(3,5);
       System.out.println("day="+dayreturn);
       String yearreturn=datareturn.substring(6,10);
       System.out.println("year="+yearreturn);
       int monthconreturn=Integer.parseInt(monthreturn);
       String monthEngreturn=Month(monthconreturn);
       System.out.println("Month in English"+monthEngreturn);
       String dayChangereturn=Day(dayreturn);
       System.out.println("day change"+dayChangereturn);
       String calanderdateinsertreturn=monthEngreturn+" "+dayChangereturn+", "+yearreturn;
       try{
           java.util.Date dateDemreturn=new SimpleDateFormat("MMM d, yyyy").parse(calanderdateinsertreturn);
           bookissue_returndate_tf.setDate(dateDemreturn);
       }catch(Exception e){e.printStackTrace();}
   
       
//this.bookissue_bookauthor_tf.setText(bbean.getAuthor());
       //this.bookissue_edition_tf.setText(bbean.getEdition());
       //this.bookissue_booktype_cb.removeAllItems();
       
       try
       {
       int book_id = DBManager.getBookId(IssueId.getText());
      // java.util.Vector v=DBManager.getBookId(IssueId.getText());
       if(book_id != 0)
       {
           String data  = DBManager.getTypeId(book_id);
           String[] d = data.split(":");
           if(data != "")
           {
               System.out.println("Hello i am here");
               String getTypeName = DBManager.getTypeName(Integer.parseInt(d[0]));
               if(getTypeName != "")
               {
                 // this.bookissue_booktype_cb.removeAllItems();
                //  this.bookissue_books_cb.removeAllItems();
                   this.TypeName.setText(getTypeName);
                   this.BookName.setText(d[1]);
                   //this.bookissue_booktype_cb.addItem(getTypeName);
                   //this.bookissue_books_cb.addItem(d[1]);
                   //this.bookissue_books_cb.addItem();
               }
               
           }
                   
       }
       }
       catch(Exception ex)
       {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }//GEN-LAST:event_issuedate_listValueChanged

    private void bookissue_books_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_books_cbActionPerformed
       BooksBean bookbean=(BooksBean)this.bookissue_books_cb.getSelectedItem();
        //String edi=bookbean.getEdition();
        //String aut=bookbean.getAuthor();
       // this.bookissue_bookauthor_tf.setText(aut);
       // this.bookissue_edition_tf.setText(edi);
       if(bookbean==null)return;
        try{
                String author=bookbean.getAuthor();
                String Edition=bookbean.getEdition();
                bookissue_bookauthor_tf.setText(author);
                bookissue_edition_tf.setText(Edition);
        }catch(Exception e)
        {}
        
    }//GEN-LAST:event_bookissue_books_cbActionPerformed

    private void bookissue_add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_add_btActionPerformed
  System.out.println("hi");
        BookIssueBean bean=(BookIssueBean)this.issuedate_list.getSelectedValue();
        //if(bean==null)return;
        System.out.println("hi");
        int stdId=bean.getStudentId();
        int bookId=bean.getBookId();
        String issueDate=bookissue_issuedate_tf.getDateFormatString();
        String returnDate=bookissue_returndate_tf.getDateFormatString();
       // java.util.Date date;
       // date=bookissue_issuedate_tf.getDate();
       JOptionPane.showMessageDialog(null, "hello");
        
       // System.out.println(issueDate);
        //SimpleDateFormat dateformat=new SimpleDateFormat("MM/dd/yyyy");
        //String issuedatechange=dateformat.format(issueDate);
        
        //String returndatechange=dateformat.format(returnDate);
        //String issuedatechange=issueDate.
        String remark=bookissue_ta.getText();
        //System.out.println("issue date:"+issuedatechange);
        try{
            System.out.println(issueDate);
            int row=DBManager.addBookIssue(stdId,bookId,issueDate,returnDate,remark);
            if(row>=1){
            JOptionPane.showMessageDialog(null, row+"Row Added");
            bookissue_std_cbActionPerformed(evt);
            bookissue_books_cbActionPerformed(evt);
            java.util.Vector v=DBManager.getBookIssue(stdId);
                    issuedate_list.setListData(v);
            }
        
        }catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_bookissue_add_btActionPerformed

    private void bookissue_group_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_group_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookissue_group_tfActionPerformed

    private void bookissue_back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_back_btActionPerformed
      new MainFrame().setVisible(true);
    }//GEN-LAST:event_bookissue_back_btActionPerformed

    private void bookissue_update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookissue_update_btActionPerformed
        BookIssueBean bookissuebean=(BookIssueBean)this.issuedate_list.getSelectedValue();
        if(bookissuebean==null)return;
        JOptionPane.showMessageDialog(null, "Hello");
        int bissueId=bookissuebean.getIssueId();
        String issueDate=this.bookissue_issuedate_tf.getDateFormatString();
        String returnDate=this.bookissue_returndate_tf.getDateFormatString();
        String remark=this.bookissue_ta.getText();
        try{
        int row=DBManager.updateBookIssue(bissueId,issueDate,returnDate,remark);
        if(row>=1){
        JOptionPane.showMessageDialog(null, row+"Row Updated");
        bookissue_std_cbActionPerformed(evt);
        }
        
        }catch(Exception e){}
    }//GEN-LAST:event_bookissue_update_btActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookIssue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField IssueId;
    private javax.swing.JTextField TypeName;
    private javax.swing.JButton bookissue_add_bt;
    private javax.swing.JButton bookissue_back_bt;
    private javax.swing.JComboBox bookissue_bat_cb;
    private javax.swing.JTextField bookissue_bookauthor_tf;
    private javax.swing.JComboBox bookissue_books_cb;
    private javax.swing.JComboBox bookissue_booktype_cb;
    private javax.swing.JButton bookissue_clear_bt;
    private javax.swing.JButton bookissue_delete_bt;
    private javax.swing.JComboBox bookissue_dep_cb;
    private javax.swing.JTextField bookissue_edition_tf;
    private javax.swing.JComboBox bookissue_fac_cb;
    private javax.swing.JTextField bookissue_fathername_tf;
    private javax.swing.JTextField bookissue_group_tf;
    private com.toedter.calendar.JDateChooser bookissue_issuedate_tf;
    private javax.swing.JComboBox bookissue_pro_cb;
    private com.toedter.calendar.JDateChooser bookissue_returndate_tf;
    private javax.swing.JTextField bookissue_shift_tf;
    private javax.swing.JComboBox bookissue_std_cb;
    private javax.swing.JTextField bookissue_std_rollno_tf;
    private javax.swing.JTextField bookissue_surname_tf;
    private javax.swing.JTextArea bookissue_ta;
    private javax.swing.JButton bookissue_update_bt;
    private javax.swing.JList issuedate_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
            bookissue_fac_cb.addItem(v.elementAt(i));
        }
    
    }catch(Exception e){}
}
private void getBookType(){
try{
    java.util.Vector v=DBManager.getBookType();
    //System.out.println(v);
    for(int i=0;i<v.size();i++){
    bookissue_booktype_cb.addItem(v.elementAt(i));}
    }catch(Exception e){}
}
public String Month(int j){
    String str[]={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    String str1="";
    for(int i=j;i<=j;i++){
        str1=str[i];
    }
    return str1;
}
public String Day(String j){
    String a=j.substring(0, 1);
    String b=j.substring(1, 2);
    String st="";
    if(a.equals("0")){
        st=b;
    }
    if(a.equals("1") ||a.equals("2") ||a.equals("3")  ){
        st=a+b;
    }
    return st;
}
}
