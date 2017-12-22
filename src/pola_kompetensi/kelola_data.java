/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pola_kompetensi;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane; 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import metode.ARM;
import metode.AssociationRuleMining;
import metode.Frekuensi;
import mysql.Database;
/**
 *
 * @author Supandi
 */
public class kelola_data extends javax.swing.JFrame {

    /**
     * Creates new form kelola_data
     */
    public String[] itemSet;
    public char[] abjad = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
            'O','P','Q','R','S','T','U','V','W','X','Y','Z'
        };
    public ArrayList<String[]> parseData = new ArrayList<>();
    public ArrayList<String> cleanData = new ArrayList<>();
    public CleaningData cleaningData = new CleaningData();
    Database database = new Database();
    
    public kelola_data() {
        initComponents();
        parseData = cleaningData.parseFile(database.getData());
        loadTableTransaksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bcg1 = new pola_kompetensi.bcg();
        panelWarnaTransparan1 = new Tampilan.PanelWarnaTransparan();
        labelURL = new javax.swing.JTextField();
        BtnBrowse = new javax.swing.JButton();
        LblAmbilData1 = new javax.swing.JLabel();
        panelWarnaTransparan2 = new Tampilan.PanelWarnaTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblAsosiasi = new javax.swing.JTable();
        LblAsosiasi = new javax.swing.JLabel();
        BtnProses1 = new Tampilan.button1();
        panelWarnaTransparan3 = new Tampilan.PanelWarnaTransparan();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnDeleteKD1 = new Tampilan.button1();
        BtnNextKD1 = new Tampilan.button1();
        BtnBackKD1 = new Tampilan.button1();
        panelWarnaTransparan4 = new Tampilan.PanelWarnaTransparan();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SubHome = new javax.swing.JMenuItem();
        SubKD = new javax.swing.JMenuItem();
        SubExit = new javax.swing.JMenuItem();
        Menu_View = new javax.swing.JMenu();
        SubMenu_ARM = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        submenu_result = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelola Data");

        labelURL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelURLActionPerformed(evt);
            }
        });

        BtnBrowse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnBrowse.setText("Browse");
        BtnBrowse.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBrowseActionPerformed(evt);
            }
        });

        LblAmbilData1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        LblAmbilData1.setForeground(new java.awt.Color(255, 255, 255));
        LblAmbilData1.setText("Ambil Data");

        javax.swing.GroupLayout panelWarnaTransparan1Layout = new javax.swing.GroupLayout(panelWarnaTransparan1);
        panelWarnaTransparan1.setLayout(panelWarnaTransparan1Layout);
        panelWarnaTransparan1Layout.setHorizontalGroup(
            panelWarnaTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelURL, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(BtnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panelWarnaTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWarnaTransparan1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(LblAmbilData1)
                    .addContainerGap(380, Short.MAX_VALUE)))
        );
        panelWarnaTransparan1Layout.setVerticalGroup(
            panelWarnaTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelWarnaTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelURL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(panelWarnaTransparan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelWarnaTransparan1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(LblAmbilData1)
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        TblAsosiasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Industri", "Kebutuhan Kompetensi"
            }
        ));
        jScrollPane1.setViewportView(TblAsosiasi);

        LblAsosiasi.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        LblAsosiasi.setForeground(new java.awt.Color(255, 255, 255));
        LblAsosiasi.setText("Tabel Data");

        javax.swing.GroupLayout panelWarnaTransparan2Layout = new javax.swing.GroupLayout(panelWarnaTransparan2);
        panelWarnaTransparan2.setLayout(panelWarnaTransparan2Layout);
        panelWarnaTransparan2Layout.setHorizontalGroup(
            panelWarnaTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan2Layout.createSequentialGroup()
                .addGroup(panelWarnaTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWarnaTransparan2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelWarnaTransparan2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(LblAsosiasi)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelWarnaTransparan2Layout.setVerticalGroup(
            panelWarnaTransparan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWarnaTransparan2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblAsosiasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        BtnProses1.setForeground(new java.awt.Color(255, 255, 255));
        BtnProses1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/qr-code.png"))); // NOI18N
        BtnProses1.setText("Cleaning Data");
        BtnProses1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        BtnProses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProses1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jenis Kebutuhan", "Asumsi"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panelWarnaTransparan3Layout = new javax.swing.GroupLayout(panelWarnaTransparan3);
        panelWarnaTransparan3.setLayout(panelWarnaTransparan3Layout);
        panelWarnaTransparan3Layout.setHorizontalGroup(
            panelWarnaTransparan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelWarnaTransparan3Layout.setVerticalGroup(
            panelWarnaTransparan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnDeleteKD1.setForeground(new java.awt.Color(255, 255, 255));
        BtnDeleteKD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/recycle-bin (1).png"))); // NOI18N
        BtnDeleteKD1.setText("Delete");
        BtnDeleteKD1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnDeleteKD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteKD1ActionPerformed(evt);
            }
        });

        BtnNextKD1.setForeground(new java.awt.Color(255, 255, 255));
        BtnNextKD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/atom-shape.png"))); // NOI18N
        BtnNextKD1.setText("Lihat Kandidat Rule");
        BtnNextKD1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnNextKD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextKD1ActionPerformed(evt);
            }
        });

        BtnBackKD1.setForeground(new java.awt.Color(255, 255, 255));
        BtnBackKD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/return-arrow.png"))); // NOI18N
        BtnBackKD1.setText("Back");
        BtnBackKD1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnBackKD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackKD1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Batas Minimum");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("(∑ > Data Masukan)");

        javax.swing.GroupLayout panelWarnaTransparan4Layout = new javax.swing.GroupLayout(panelWarnaTransparan4);
        panelWarnaTransparan4.setLayout(panelWarnaTransparan4Layout);
        panelWarnaTransparan4Layout.setHorizontalGroup(
            panelWarnaTransparan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelWarnaTransparan4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelWarnaTransparan4Layout.setVerticalGroup(
            panelWarnaTransparan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWarnaTransparan4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelWarnaTransparan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout bcg1Layout = new javax.swing.GroupLayout(bcg1);
        bcg1.setLayout(bcg1Layout);
        bcg1Layout.setHorizontalGroup(
            bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bcg1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelWarnaTransparan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelWarnaTransparan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bcg1Layout.createSequentialGroup()
                        .addComponent(panelWarnaTransparan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnNextKD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelWarnaTransparan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(bcg1Layout.createSequentialGroup()
                                .addComponent(BtnBackKD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnDeleteKD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bcg1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnProses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );
        bcg1Layout.setVerticalGroup(
            bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bcg1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelWarnaTransparan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelWarnaTransparan2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnProses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bcg1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(bcg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnDeleteKD1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnBackKD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(panelWarnaTransparan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnNextKD1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelWarnaTransparan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jMenu1.setText("Identifikasi Pola");

        SubHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/homepage.png"))); // NOI18N
        SubHome.setText("Home");
        SubHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubHomeActionPerformed(evt);
            }
        });
        jMenu1.add(SubHome);

        SubKD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/checklist-with-a-pencil.png"))); // NOI18N
        SubKD.setText("Kelola Data");
        SubKD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubKDActionPerformed(evt);
            }
        });
        jMenu1.add(SubKD);

        SubExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit.png"))); // NOI18N
        SubExit.setText("Exit");
        SubExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubExitActionPerformed(evt);
            }
        });
        jMenu1.add(SubExit);

        jMenuBar1.add(jMenu1);

        Menu_View.setText("Association");
        Menu_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ViewActionPerformed(evt);
            }
        });

        SubMenu_ARM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/calculator.png"))); // NOI18N
        SubMenu_ARM.setText("ARM");
        SubMenu_ARM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenu_ARMActionPerformed(evt);
            }
        });
        Menu_View.add(SubMenu_ARM);

        jMenuBar1.add(Menu_View);

        jMenu2.setText("Hasil Asosiasi");

        submenu_result.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/text-documents.png"))); // NOI18N
        submenu_result.setText("Lihat Kesimpulan");
        submenu_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_resultActionPerformed(evt);
            }
        });
        jMenu2.add(submenu_result);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bcg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bcg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubHomeActionPerformed
        this.setVisible(false);
        new dashboard().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_SubHomeActionPerformed

    private void SubKDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubKDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new kelola_data().setVisible(true);
    }//GEN-LAST:event_SubKDActionPerformed

    private void SubARMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubARMActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_SubARMActionPerformed

    private void SubExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubExitActionPerformed
        // TODO add your handling code here:
        int ok=JOptionPane.showConfirmDialog(null,"Apakah anda mau keluar ?","Konfirmasi Keluar",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            dispose();
        }
    }//GEN-LAST:event_SubExitActionPerformed

    private void SubMenu_PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenu_PDActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_SubMenu_PDActionPerformed

    private void Menu_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ViewActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Menu_ViewActionPerformed

    private void SubMenu_TentangAplikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenu_TentangAplikasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubMenu_TentangAplikasiActionPerformed

    private void BtnProses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProses1ActionPerformed
        // TODO add your handling code here:
        cleanData = (ArrayList<String>)cleaningData.generateTransaksi(parseData).clone();
        
        DefaultTableModel tabelModel = new DefaultTableModel(){};
        tabelModel.addColumn("Jenis Kebutuhan");
        tabelModel.addColumn("Asumsi");
        try{
            for(int i=0;i<cleanData.size(); i++){
                Object[] x = new Object[2];
                x[0] = cleanData.get(i);
                x[1] = (i+1);
                tabelModel.addRow(x);
            }
            jTable1.setModel(tabelModel);
        }catch(Exception ex){
        }
    }//GEN-LAST:event_BtnProses1ActionPerformed

    private void BtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBrowseActionPerformed
        // TODO add your handling code here:
        String data = new String();
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV", "csv");
        file.setCurrentDirectory(file.getCurrentDirectory());
        file.setFileFilter(filter);
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setMultiSelectionEnabled(false);
        if(file.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            File file1 = file.getSelectedFile();
            String namaFile = file1.getName();
            labelURL.setText(namaFile);
            data = (String)file1.getAbsolutePath();
            parseData = cleaningData.readFile(data);
            loadTableTransaksi();
        }

    }//GEN-LAST:event_BtnBrowseActionPerformed

    private void labelURLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelURLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelURLActionPerformed

    private void BtnDeleteKD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteKD1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tabelModel1 = new DefaultTableModel(){
            
        };
        tabelModel1.addColumn("Industri");
        tabelModel1.addColumn("Kebutuhan Kompetensi");
        TblAsosiasi.setModel(tabelModel1);
        
        DefaultTableModel tabelModel2 = new DefaultTableModel(){
            
        };
        tabelModel2.addColumn("Jenis Kebutuhan");
        tabelModel2.addColumn("Asumsi");
        jTable1.setModel(tabelModel2);
    }//GEN-LAST:event_BtnDeleteKD1ActionPerformed

    private void BtnNextKD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextKD1ActionPerformed
        // TODO add your handling code here:
        int batasMinimum = (int)jSpinner1.getValue();
        
        ARM arm = new ARM();
        arm.setAttributes(parseData, cleanData, batasMinimum);
        arm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnNextKD1ActionPerformed

    private void BtnBackKD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackKD1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_BtnBackKD1ActionPerformed

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
            java.util.logging.Logger.getLogger(kelola_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kelola_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kelola_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kelola_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kelola_data().setVisible(true);
            }
        });
    }
    public void loadTableTransaksi(){
        int i, j;
        DefaultTableModel tabelModel = new DefaultTableModel(){};
        tabelModel.addColumn("Industri");
        tabelModel.addColumn("Kebutuhan Kompetensi");
        
        for(i=0;i<parseData.size();i++){
            String temp = "";
            for(j=0;j<parseData.get(i).length;j++){
                temp = temp + parseData.get(i)[j] + ", ";
            }
            Object[] data = new Object[2];
            data[0] = (i+1);
            data[1] = temp;
            //System.out.println(data[0] +" "+data[1]);
            tabelModel.addRow(data);
        }
        TblAsosiasi.setModel(tabelModel);
    }
    
    public void submenu_resultActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    public void SubMenu_ARMActionPerformed(java.awt.event.ActionEvent evt){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Tampilan.button1 BtnBackKD1;
    private javax.swing.JButton BtnBrowse;
    private Tampilan.button1 BtnDeleteKD1;
    private Tampilan.button1 BtnNextKD1;
    private Tampilan.button1 BtnProses1;
    private javax.swing.JLabel LblAmbilData1;
    private javax.swing.JLabel LblAsosiasi;
    private javax.swing.JMenu Menu_View;
    private javax.swing.JMenuItem SubExit;
    private javax.swing.JMenuItem SubHome;
    private javax.swing.JMenuItem SubKD;
    private javax.swing.JMenuItem SubMenu_ARM;
    private javax.swing.JTable TblAsosiasi;
    private pola_kompetensi.bcg bcg1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField labelURL;
    private Tampilan.PanelWarnaTransparan panelWarnaTransparan1;
    private Tampilan.PanelWarnaTransparan panelWarnaTransparan2;
    private Tampilan.PanelWarnaTransparan panelWarnaTransparan3;
    private Tampilan.PanelWarnaTransparan panelWarnaTransparan4;
    private javax.swing.JMenuItem submenu_result;
    // End of variables declaration//GEN-END:variables

}