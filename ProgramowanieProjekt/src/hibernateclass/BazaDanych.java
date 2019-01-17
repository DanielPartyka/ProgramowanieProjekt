
package hibernateclass;

import java.sql.SQLException;
import static java.time.Clock.system;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jpa.HibernatePersistenceProvider;
import org.jdesktop.beansbinding.Binding;

/**
 *
 * @author Galan
 */
public class BazaDanych extends javax.swing.JFrame {

    //Glowny Konstruktor
    public BazaDanych() {
        
       try {
          //Inicjalizacja GUI
          initComponents();
       
       } catch(Exception e)
       {
           JOptionPane.showMessageDialog(BazaDanych.this, "Blad z polaczeniem z baza danych" + e.getMessage(),"Connection",
           JOptionPane.ERROR_MESSAGE);
       }    
       finally {
           JOptionPane.showMessageDialog(BazaDanych.this, "Polaczono z baza danych","Connection",
           JOptionPane.INFORMATION_MESSAGE);
       }
    }
   
    //Komponenty
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ProgramowanieProjektPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProgramowanieProjektPU").createEntityManager();
        studenciUczelnia_1Query = java.beans.Beans.isDesignTime() ? null : ProgramowanieProjektPUEntityManager.createQuery("SELECT s FROM StudenciUczelnia_1 s");
        studenciUczelnia_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studenciUczelnia_1Query.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dodawanieStudentaB = new javax.swing.JButton();
        usuwanieStudentaB = new javax.swing.JButton();
        aktualizacjaStudentaB = new javax.swing.JButton();
        podgladbazyB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        przenoszeniedanychB = new javax.swing.JButton();
        zamykaniebazyB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Baza ze Studentami");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studenciUczelnia_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentId}"));
        columnBinding.setColumnName("StudentId");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nazwisko}"));
        columnBinding.setColumnName("Nazwisko");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${imie}"));
        columnBinding.setColumnName("Imie");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pesel}"));
        columnBinding.setColumnName("Pesel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataUr}"));
        columnBinding.setColumnName("DataUr");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${miasto}"));
        columnBinding.setColumnName("Miasto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kod}"));
        columnBinding.setColumnName("Kod");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ulica}"));
        columnBinding.setColumnName("Ulica");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numer}"));
        columnBinding.setColumnName("Numer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tel}"));
        columnBinding.setColumnName("Tel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EMail}"));
        columnBinding.setColumnName("EMail");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uczelnia}"));
        columnBinding.setColumnName("Uczelnia");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        dodawanieStudentaB.setText("Dodawanie Studenta");
        dodawanieStudentaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodawanieStudentaBActionPerformed(evt);
            }
        });

        usuwanieStudentaB.setText("Usuwanie Studenta");
        usuwanieStudentaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuwanieStudentaBActionPerformed(evt);
            }
        });

        aktualizacjaStudentaB.setText("Aktualizacja Studenta");
        aktualizacjaStudentaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktualizacjaStudentaBActionPerformed(evt);
            }
        });

        podgladbazyB.setText("Podglad Bazy");
        podgladbazyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                podgladbazyBActionPerformed(evt);
            }
        });

        jLabel2.setText("Student_id");

        jLabel3.setText("Nazwisko");

        jLabel4.setText("Imie");

        jLabel5.setText("Pesel");

        jLabel6.setText("data_urodzenia");

        jLabel7.setText("miasto");

        jLabel8.setText("kod");

        jLabel9.setText("ulica");

        jLabel10.setText("numer_ulicy");

        jLabel11.setText("telefon");

        jLabel12.setText("uczelnia");

        jLabel13.setText("e_mail");

        przenoszeniedanychB.setText("Przenies dane z tabeli");
        przenoszeniedanychB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                przenoszeniedanychBActionPerformed(evt);
            }
        });

        zamykaniebazyB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        zamykaniebazyB.setText("ZAMKNIJ BAZE DANYCH");
        zamykaniebazyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamykaniebazyBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zamykaniebazyB, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuwanieStudentaB)
                        .addGap(18, 18, 18)
                        .addComponent(przenoszeniedanychB)
                        .addGap(18, 18, 18)
                        .addComponent(dodawanieStudentaB)
                        .addGap(18, 18, 18)
                        .addComponent(podgladbazyB, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aktualizacjaStudentaB)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dodawanieStudentaB)
                            .addComponent(usuwanieStudentaB)
                            .addComponent(podgladbazyB)
                            .addComponent(przenoszeniedanychB)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(aktualizacjaStudentaB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(zamykaniebazyB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Button odpowiedzialny za dodawanie
    private void dodawanieStudentaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodawanieStudentaBActionPerformed
        try {
            dodawaniedanych();
        } catch (SQLException ex) {
            Logger.getLogger(BazaDanych.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dodawanieStudentaBActionPerformed
    //Button odpowiedzialny za usuwanie
    private void usuwanieStudentaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuwanieStudentaBActionPerformed
        try {
            usuwaniedanych();
        } catch (SQLException ex) {
            Logger.getLogger(BazaDanych.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usuwanieStudentaBActionPerformed
    //Button odpowiedzialny za aktualizacje
    private void aktualizacjaStudentaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktualizacjaStudentaBActionPerformed
        try {
            aktualizacjadanych();
        } catch (SQLException ex) {
            Logger.getLogger(BazaDanych.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aktualizacjaStudentaBActionPerformed
    //Button odpowiedzialny za przenoszenie danych z tabeli do pol z danymi
    private void przenoszeniedanychBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_przenoszeniedanychBActionPerformed
        try {
            przenoszeniedanych();
        } catch (SQLException ex) {
            Logger.getLogger(BazaDanych.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_przenoszeniedanychBActionPerformed
    //Button odpowiedzialny za podglad bazy
    private void podgladbazyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_podgladbazyBActionPerformed
       PodgladBazy g = new PodgladBazy();
       g.setVisible(true);
    }//GEN-LAST:event_podgladbazyBActionPerformed
    //Button zamykajacy program
    private void zamykaniebazyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamykaniebazyBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_zamykaniebazyBActionPerformed

    //metoda przenoszenia danych
    void przenoszeniedanych() throws SQLException
    {
        try { 
        //zaznaczanie danego rekordu
        int row = jTable1.getSelectedRow();
        //pobieranie tekstu z tabeli
        jTextField1.setText((String) jTable1.getValueAt(row, 0));
        jTextField2.setText((String) jTable1.getValueAt(row, 1));
        jTextField3.setText((String) jTable1.getValueAt(row, 2));
        jTextField4.setText((String) jTable1.getValueAt(row, 3));
        jTextField5.setText((String) jTable1.getValueAt(row, 4));
        jTextField6.setText((String) jTable1.getValueAt(row, 5));
        jTextField7.setText((String) jTable1.getValueAt(row, 6));
        jTextField8.setText((String) jTable1.getValueAt(row, 7));
        jTextField9.setText((String) jTable1.getValueAt(row, 8));
        jTextField10.setText((String) jTable1.getValueAt(row, 9));
        jTextField12.setText((String) jTable1.getValueAt(row, 10));
        jTextField11.setText((String) jTable1.getValueAt(row, 11));
        
       }  catch (Exception e)
             {
              JOptionPane.showMessageDialog(BazaDanych.this, "Musisz zaznaczyc wiersz z studentem", "Error",
              JOptionPane.ERROR_MESSAGE);	
             }
    }
    
    //metoda aktualizujaca
    void aktualizacjadanych() throws SQLException
    {
        try {     
           
           //Przygotowanie do wymiany danych pomiedzy java a baza danych
           SessionFactory factory = new Configuration().configure("hibernateclass\\hibernate.cfg.xml").addAnnotatedClass(StudenciUczelnia.class).buildSessionFactory();
           Session session = factory.getCurrentSession();
           //otwarcie transakcji potrzebnej do zapytania sqla
           Transaction transaction = session.beginTransaction();
            
           int row = jTable1.getSelectedRow();
           

           //pobranie danych z pol tekstowych
           String student_id = jTextField1.getText();
           String nazwisko = jTextField2.getText();
           String imie = jTextField3.getText();
           String pesel = jTextField4.getText();
           String data_ur = jTextField5.getText();
           String miasto = jTextField6.getText();
           String kod = jTextField7.getText();
           String ulica = jTextField8.getText();
           String numer = jTextField9.getText();
           String tel = jTextField10.getText();
           String e_mail = jTextField12.getText();
           String uczelnia = jTextField11.getText();
            
           
            //utworzenie obiektu
            StudenciUczelnia student = new StudenciUczelnia(student_id,nazwisko,imie,pesel,data_ur,miasto,kod,ulica,numer,tel,e_mail,uczelnia);
           
            
            //polecenie sqla
            String query = ("update studenci_uczelnia set nazwisko = " + nazwisko + ", imie =" + imie + ", pesel=" + pesel + ",data_ur="
                    + data_ur + ", miasto=" + miasto + ",kod=" + kod + ", ulica=" + ulica + ", numer=" + numer + ", tel=" + tel +
                    ", e_mail=" + e_mail + ", uczelnia=" + uczelnia  
                    + " where student_id = " + student.getStudentId() + ""); 
            
          
            
            //zakmniecie polaczenia, wstawienie danych(obiektu) do bazy danych
            session.createSQLQuery(query);
            session.update(student);
            session.flush();
            session.getTransaction().commit();
            
            
            //probowalem tutaj przeniesc dane z jTextFieldow do wiersza tabeli ale niestety to nie zadzialo
            /*
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.setValueAt(jTextField2.getText(),row,1);
            model.setValueAt(jTextField3.getText(),row,2);
            model.setValueAt(jTextField4.getText(),row,3);
            model.setValueAt(jTextField5.getText(),row,4);
            model.setValueAt(jTextField6.getText(),row,5);
            model.setValueAt(jTextField7.getText(),row,6);
            model.setValueAt(jTextField8.getText(),row,7);
            model.setValueAt(jTextField9.getText(),row,8);
            model.setValueAt(jTextField10.getText(),row,9);
            model.setValueAt(jTextField12.getText(),row,10);
            model.setValueAt(jTextField11.getText(),row,11);
            */
            
            JOptionPane.showMessageDialog(this, "Pomyslnie zaaktualizowano Studenta", "Baza Danych",
					JOptionPane.INFORMATION_MESSAGE);
            
      
      } catch (Exception e) 
      {
           JOptionPane.showMessageDialog(this, "Blad z aktualizacja studenta, musisz podac Student_id(Primary Key) ", "Error",
	   JOptionPane.ERROR_MESSAGE);
      }
      finally {
            odswiez();
            this.bindingGroup.getBindings().get(0).refresh();
            this.bindingGroup.getBindings().get(2).refresh();
            refreshupdate();
        }
    }
    
    //metoda usuwajaca dane
    void usuwaniedanych() throws SQLException
    {
        try {
           
           //zaznaczenie wiersza w tabeli
           int row = jTable1.getSelectedRow();
           if (row < 0) 
            {
                JOptionPane.showMessageDialog(BazaDanych.this, "Musisz zaznaczyc wiersz z studentem", "Error",
                JOptionPane.ERROR_MESSAGE);				
                return;
            }
            
            //upewnienie sie czy uzytkownik chce usunac wiersz
            int response = JOptionPane.showConfirmDialog(BazaDanych.this, "Czy na pewno chcesz usunac Studenta?", "Potwierdz", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response != JOptionPane.YES_OPTION) 
            {
                return;
            }
            
            //Przygotowanie do wymiany danych pomiedzy java a baza danych, konfiguracja z pliku hibernat.cfg
            SessionFactory factory = new Configuration().configure("hibernateclass\\hibernate.cfg.xml").addAnnotatedClass(StudenciUczelnia.class).buildSessionFactory();
            Session session = factory.getCurrentSession();
            Transaction transaction = session.beginTransaction();
           
           
            //polecenie sqla
            SQLQuery query = session.createSQLQuery("delete from studenci_uczelnia where student_id = '" + jTable1.getValueAt(row,0) + "'");
            query.executeUpdate();
           
           
            //zatwierdzenie danych
            transaction.commit();
           
            JOptionPane.showMessageDialog(this, "Pomyslnie usunieto studenta" , "Bazy Danych",
            JOptionPane.INFORMATION_MESSAGE);
        
            }   catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "Blad z usuwaniem studenta " + e.getMessage(), "Error",
					JOptionPane.ERROR_MESSAGE);
            }
            finally {
            odswiez();
        }
    
    }
    
    //metoda dodajaca dane
    void dodawaniedanych() throws SQLException
    {
                SessionFactory factory = new Configuration().configure("hibernateclass\\hibernate.cfg.xml").addAnnotatedClass(StudenciUczelnia.class).buildSessionFactory();
            
                //pobranie wartosci z pol tekstowych
                String student_id = jTextField1.getText();
		String nazwisko = jTextField2.getText();
		String imie = jTextField3.getText();
		String pesel = jTextField4.getText();
		String data_ur = jTextField5.getText();
		String miasto = jTextField6.getText();
		String kod = jTextField7.getText();
		String ulica = jTextField8.getText();
		String numer = jTextField9.getText();
		String tel = jTextField10.getText();
		String e_mail = jTextField12.getText();
		String uczelnia = jTextField11.getText();
        
        
                Session session = factory.getCurrentSession();
           
           try {
                //utworzenie obiektu
                StudenciUczelnia student = new StudenciUczelnia(student_id,nazwisko,imie,pesel,data_ur,miasto,kod,ulica,numer,tel,e_mail,uczelnia);
                
                //zapisanie danych w bazie
                session.beginTransaction();
                session.flush();
                session.save(student);
                session.getTransaction().commit();
                
                
                    JOptionPane.showMessageDialog(BazaDanych.this, "Pomyslnie Dodano Studenta", "Baza Danych",
                    JOptionPane.INFORMATION_MESSAGE);	
           
           } catch (Exception e)
                   {
                       JOptionPane.showMessageDialog(BazaDanych.this, "Blad z dodawaniem studenta, student_id to klucz glowny..." + e.getMessage(), "Error",
                       JOptionPane.ERROR_MESSAGE);
                   }
           
           
            finally {
               factory.close();
               odswiez();
               
           }
    }
    
   //metoda odswiezajaca tabele
    private void odswiez() {
        
        ProgramowanieProjektPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProgramowanieProjektPU").createEntityManager();
        studenciUczelnia_1Query = java.beans.Beans.isDesignTime() ? null : ProgramowanieProjektPUEntityManager.createQuery("SELECT s FROM StudenciUczelnia_1 s");
        studenciUczelnia_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studenciUczelnia_1Query.getResultList();
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studenciUczelnia_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentId}"));
        columnBinding.setColumnName("Student Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nazwisko}"));
        columnBinding.setColumnName("Nazwisko");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${imie}"));
        columnBinding.setColumnName("Imie");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pesel}"));
        columnBinding.setColumnName("Pesel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataUr}"));
        columnBinding.setColumnName("Data Ur");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${miasto}"));
        columnBinding.setColumnName("Miasto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${kod}"));
        columnBinding.setColumnName("Kod");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ulica}"));
        columnBinding.setColumnName("Ulica");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numer}"));
        columnBinding.setColumnName("Numer");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tel}"));
        columnBinding.setColumnName("Tel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${EMail}"));
        columnBinding.setColumnName("EMail");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uczelnia}"));
        columnBinding.setColumnName("Uczelnia");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);
    }
    
    //
    private void refreshupdate() {                                                       
            Binding g = bindingGroup.getBindings().get(0);
            g.setSourceObject(studenciUczelnia_1List);
            g.bind();
    }
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //ustawienie widocznosci pola
                new BazaDanych().setVisible(true);
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ProgramowanieProjektPUEntityManager;
    private javax.swing.JButton aktualizacjaStudentaB;
    private javax.swing.JButton dodawanieStudentaB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton podgladbazyB;
    private javax.swing.JButton przenoszeniedanychB;
    private java.util.List<hibernateclass.StudenciUczelnia_1> studenciUczelnia_1List;
    private javax.persistence.Query studenciUczelnia_1Query;
    private javax.swing.JButton usuwanieStudentaB;
    private javax.swing.JButton zamykaniebazyB;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
