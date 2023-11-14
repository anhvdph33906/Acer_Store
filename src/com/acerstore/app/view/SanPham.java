/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.acerstore.app.view;

import com.acerstore.app.dao.SanPhamDao;
import com.acerstore.app.main.SanPhamChiTiet;
import com.acerstore.app.model.SanPhamNew;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.management.StringValueExp;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class SanPham extends javax.swing.JPanel {
DefaultTableModel code = new DefaultTableModel();
    SanPhamDao spdao = new SanPhamDao();
    List<SanPhamNew> sp = new ArrayList<>();
    SanPhamChiTiet spct = new SanPhamChiTiet();
    String load = "F::\\SD_18319_Java3\\icon\\aceraspire.jpg";
    int index = 0;
    public SanPham() {
        initComponents();
        this.fillToTableSanPham(spdao.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        rdoConHang = new javax.swing.JRadioButton();
        rdoHetHang = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        cboXuatXu = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btnTrai = new javax.swing.JButton();
        btnPhai = new javax.swing.JButton();
        btnImage = new javax.swing.JToggleButton();
        btnXemSPCT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dcsDate = new com.toedter.calendar.JDateChooser();
        lblHinhAnh = new javax.swing.JLabel();
        btnenter = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        txtTimKiemSP = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        cboXuatXu2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        rdoConHang2 = new javax.swing.JRadioButton();
        rdoHetHang2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        cboDanhMucSP1 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1272, 660));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel14.setForeground(new java.awt.Color(51, 51, 51));

        jLabel27.setText("Mã sản phẩm");

        jLabel28.setText("Tên sản phẩm");

        jLabel30.setText("Trạng thái");

        buttonGroup2.add(rdoConHang);
        rdoConHang.setText("Còn hàng");

        buttonGroup2.add(rdoHetHang);
        rdoHetHang.setText("Hết hàng");

        jLabel32.setText("Xuất xứ");

        cboXuatXu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Việt Nam", "Trung Quốc", "Nhật Bản", "Mỹ", "Đức", "Anh" }));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnTrai.setText("<<");
        btnTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraiActionPerformed(evt);
            }
        });

        btnPhai.setText(">>");
        btnPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhaiActionPerformed(evt);
            }
        });

        btnImage.setText("Image");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        btnXemSPCT.setText("Xem sản phẩm chi tiết");
        btnXemSPCT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXemSPCTMouseClicked(evt);
            }
        });
        btnXemSPCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemSPCTActionPerformed(evt);
            }
        });

        jLabel2.setText("Ngày ra mắt");

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblHinhAnh.setPreferredSize(new java.awt.Dimension(134, 172));

        btnenter.setText("enter");
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });

        btnDau.setText("|<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel28)
                        .addComponent(jLabel27)
                        .addComponent(jLabel2)
                        .addComponent(jLabel30))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(btnDau)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcsDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rdoConHang)
                                    .addComponent(btnTrai))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(btnPhai)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCuoi))
                                    .addComponent(rdoHetHang))))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(10, 605, Short.MAX_VALUE)
                                .addComponent(jLabel36)
                                .addGap(279, 279, 279))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnenter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnXemSPCT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(1044, Short.MAX_VALUE)
                .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(556, 556, 556)
                    .addComponent(jLabel37)
                    .addContainerGap(706, Short.MAX_VALUE)))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32)))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(dcsDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(rdoConHang)
                            .addComponent(rdoHetHang))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrai)
                            .addComponent(btnPhai)
                            .addComponent(btnUpdate)
                            .addComponent(btnenter)
                            .addComponent(btnDau)
                            .addComponent(btnCuoi)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew)
                            .addComponent(btnAdd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemSPCT)
                .addGap(88, 88, 88))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel36))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel37)
                    .addContainerGap(289, Short.MAX_VALUE)))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel33.setText("Tìm kiếm");

        txtTimKiemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemSPActionPerformed(evt);
            }
        });
        txtTimKiemSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemSPKeyReleased(evt);
            }
        });

        jLabel34.setText("Xuất xứ");

        cboXuatXu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Việt Nam", "Trung Quốc", "Nhật Bản", "Mỹ", "Đức", "Anh" }));

        jLabel35.setText("Trạng thái");

        rdoConHang2.setText("Còn hàng");

        rdoHetHang2.setText("Hết hàng");

        jLabel1.setText("Danh mục");

        cboDanhMucSP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nitro", "Asprire Gaming", "Swift", "Asprire" }));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboXuatXu2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboDanhMucSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(rdoConHang2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdoHetHang2)
                .addGap(32, 32, 32))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtTimKiemSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(cboXuatXu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(rdoConHang2)
                    .addComponent(rdoHetHang2)
                    .addComponent(jLabel1)
                    .addComponent(cboDanhMucSP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Xuất xứ", "Ngày ra mắt", "Trạng thái", "HinhAnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane7)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        this.addSP();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.NewForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraiActionPerformed
        // TODO add your handling code here:
        this.Left();
    }//GEN-LAST:event_btnTraiActionPerformed

    private void btnPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhaiActionPerformed
        // TODO add your handling code here:
        this.Right();
    }//GEN-LAST:event_btnPhaiActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser("F:\\anh");
        ch.showOpenDialog(null);
        File fi = ch.getSelectedFile();
        load = fi.getAbsolutePath();
        try {
            lblHinhAnh.setIcon(LoadImage(String.valueOf(load)));
            JOptionPane.showMessageDialog(this, "s");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "chon anh");
            System.out.println(load);
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnXemSPCTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXemSPCTMouseClicked
        // TODO add your handling code here:
        index = tblSanPham.getSelectedRow();
        this.showDeTailSanPham(index);
        String maSp = code.getValueAt(index, 0).toString();
        String tenSp = code.getValueAt(index, 1).toString();
        spct.setVisible(true);
        spct.pack();
        spct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        spct.txtMaSP2.setText(maSp);
        spct.txtTenSP2.setText(tenSp);
        spct.rdoConHang3.setSelected(true);
        spct.rdoHetHang3.setSelected(false);

    }//GEN-LAST:event_btnXemSPCTMouseClicked

    private void btnXemSPCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemSPCTActionPerformed
        // TODO add your handling code here:
        index = tblSanPham.getSelectedRow();
        this.showDeTailSanPham(index);
        String maSp = code.getValueAt(index, 0).toString();
        String tenSp = code.getValueAt(index, 1).toString();
        spct.setVisible(true);
        spct.pack();
        spct.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        spct.txtMaSP2.setText(maSp);
        spct.txtTenSP2.setText(tenSp);
        spct.rdoConHang3.setSelected(true);
        spct.rdoHetHang3.setSelected(false);
    }//GEN-LAST:event_btnXemSPCTActionPerformed

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnenterActionPerformed

    private void txtTimKiemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemSPActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimKiemSPActionPerformed

    private void txtTimKiemSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemSPKeyReleased
        // TODO add your handling code here:
        code = (DefaultTableModel) tblSanPham.getModel();
        TableRowSorter<DefaultTableModel> ob = new TableRowSorter<>(code);
        tblSanPham.setRowSorter(ob);
        ob.setRowFilter(RowFilter.regexFilter(txtTimKiemSP.getText()));
    }//GEN-LAST:event_txtTimKiemSPKeyReleased

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        index = tblSanPham.getSelectedRow();
        this.showDeTailSanPham(index);

    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnCuoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JToggleButton btnImage;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnPhai;
    private javax.swing.JButton btnTrai;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXemSPCT;
    private javax.swing.JButton btnenter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboDanhMucSP1;
    private javax.swing.JComboBox<String> cboXuatXu;
    private javax.swing.JComboBox<String> cboXuatXu2;
    private com.toedter.calendar.JDateChooser dcsDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JRadioButton rdoConHang;
    private javax.swing.JRadioButton rdoConHang2;
    private javax.swing.JRadioButton rdoHetHang;
    private javax.swing.JRadioButton rdoHetHang2;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiemSP;
    // End of variables declaration//GEN-END:variables

    private void fillToTableSanPham(List<SanPhamNew> s) {
        code = (DefaultTableModel) tblSanPham.getModel();
        code.setRowCount(0);
        for (SanPhamNew sn : s) {
            code.addRow(sn.toDataSP());
        }
    }

    private void showDeTailSanPham(int index) {
SanPhamNew s = spdao.getAll().get(index);
        txtMaSP.setText(s.getMaSP());
        txtTenSP.setText(s.getTenSP());
        cboXuatXu.setSelectedItem(s.getXuatXu());
        dcsDate.setDate(s.getNgayRaMat());
        rdoConHang.setSelected(s.isTrangThai());
        rdoHetHang.setSelected(!s.isTrangThai());
        lblHinhAnh.setText(s.getHinhAnh());
        tblSanPham.setRowSelectionInterval(index, index);
    }
    private SanPhamNew readDataSanPham() {
        String ma =txtMaSP.getText();
        String ten =txtTenSP.getText();
       String xuatxu =cboXuatXu.getSelectedItem() + "";
        Date ngay= dcsDate.getDate();
      boolean trangthai=false;
      if(trangthai == rdoConHang.isSelected()){
          trangthai = true;
      }
      else{
          trangthai=false;
      }
      String ha = lblHinhAnh.getText();
      return new SanPhamNew(ma, ten, xuatxu, ngay, trangthai, ha);
    }
private boolean checkDataSanPham() {
        if (txtMaSP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "không để trống");
            txtMaSP.requestFocus();
            return false;
        }
        if (txtTenSP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "không để trống");
            txtTenSP.requestFocus();
            return false;
        }
        return true;
    }
private void NewForm() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        rdoConHang.setSelected(true);
        dcsDate.setDate(null);
        cboXuatXu.setSelectedItem(null);
        lblHinhAnh.setText("");
    }
private void addSP() {
        if (checkDataSanPham()) {
            SanPhamNew sp = readDataSanPham();

            if (spdao.LikeMa(txtMaSP.getText()) != null) {
                JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại");
            } else {
                try {
                    if (spdao.add(sp) > 0) {
                        JOptionPane.showMessageDialog(this, "thêm mới sản phẩm thành công");   
                        fillDataImage();
                        fillToTableSanPham(spdao.getAll());
                    }
                } catch (Exception e) {
                    e.getMessage();
                    JOptionPane.showMessageDialog(this, "thêm sản phẩm thất bại");
                }
            }
        }
    }

    private void Left() {
        index =tblSanPham.getSelectedRow();
        code = (DefaultTableModel) tblSanPham.getModel();
        if(index>0){
            index=index-1;
            tblSanPham.setSelectionBackground(Color.red);
            showDeTailSanPham(index);
        }
        else{
            index=code.getRowCount()-1;
            tblSanPham.setSelectionBackground(Color.red);
            showDeTailSanPham(index);
        }
    }

    private void Right() {
        index =tblSanPham.getSelectedRow();
        code = (DefaultTableModel) tblSanPham.getModel();
        if(index<code.getRowCount()-1){
            index=index+1;
            tblSanPham.setSelectionBackground(Color.red);
            showDeTailSanPham(index);
        }
        else{
            index=0;
           tblSanPham.setSelectionBackground(Color.red);
           showDeTailSanPham(index);
        }

    }

    private void first() {
        index= tblSanPham.getSelectedRow();
        tblSanPham.setRowSelectionInterval(index=0, index=0);
            tblSanPham.setSelectionBackground(Color.red);
            showDeTailSanPham(index);
    }

    private void last() {
        index= tblSanPham.getSelectedRow();
        if(index==0){
            tblSanPham.setRowSelectionInterval(index=code.getRowCount()-1, index=code.getRowCount()-1);
            tblSanPham.setSelectionBackground(Color.red);
            showDeTailSanPham(index);
        }
    }

    private ImageIcon LoadImage(String ImagePath) {
        ImageIcon MyImage= new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lblHinhAnh.getWidth(), lblHinhAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    private void fillDataImage() {
        SanPhamNew  spn = new SanPhamNew();
        spn.setMaSP(txtMaSP.getText());
        spn.setTenSP(txtTenSP.getText());
         spn.setXuatXu(cboXuatXu.getSelectedItem().toString());
          spn.setNgayRaMat(dcsDate.getDate());
           spn.setTrangThai(!rdoConHang.isSelected());
           spn.setTrangThai(rdoHetHang.isSelected());
           spn.setHinhAnh(load);
           sp.add(spn);
    }
}