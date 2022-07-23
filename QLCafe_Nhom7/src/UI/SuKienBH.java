/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DAO.SuKienDao;
import Helper.ChuyenDoi;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SuKien;

/**
 *
 * @author CHIEN
 */
public class SuKienBH extends javax.swing.JPanel {

    SuKienDao SKDAO = new SuKienDao();
    DefaultTableModel tableMode;

    /**
     * Creates new form SuKienBH
     */
    public SuKienBH() {
        initComponents();
        init();
    }

    void init() {
        lamMoiLoi();
        tableMode = (DefaultTableModel) tblSuKien.getModel();
        //set radio ngày kết thúc
        if (rdoCoThoiHan.isSelected()) {
            pnNgay.setVisible(true);
        } else {
            pnNgay.setVisible(false);
        }
        //set nut xóa sự kiện
        if (cbxLoaiSK.getSelectedIndex() == 1) {
            btnXoaSK.setEnabled(true);
        } else {
            btnXoaSK.setEnabled(false);
        }
        //
        SKDAO.loadDatatoTable(tableMode, true);
    }
    //load datato combo

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuKien = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbxLoaiSK = new javax.swing.JComboBox<>();
        SnUuDai = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        rdoCoThoiHan = new javax.swing.JRadioButton();
        rdoKhongCoThoiHan = new javax.swing.JRadioButton();
        pnNgay = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dateNgayKT = new com.toedter.calendar.JDateChooser();
        chkHuySK = new javax.swing.JCheckBox();
        btnXoaSK = new javax.swing.JButton();
        txtTenSK = new javax.swing.JTextField();
        erroMaSK = new javax.swing.JLabel();
        erroTenSK = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateNgayBD = new com.toedter.calendar.JDateChooser();

        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(212, 181, 152));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 640));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 640));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 640));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản lý sự kiện");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã sự kiện");

        txtMaSK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMaSK.setForeground(new java.awt.Color(107, 70, 52));
        txtMaSK.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên sự kiện");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ưu đãi");

        jPanel2.setBackground(new java.awt.Color(212, 181, 152));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2, 20, 50));

        jButton1.setBackground(new java.awt.Color(50, 191, 190));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/hienThi.png"))); // NOI18N
        jButton1.setText("Làm mới");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        btnSua.setBackground(new java.awt.Color(253, 138, 79));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua);

        btnThem.setBackground(new java.awt.Color(107, 70, 52));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them.png"))); // NOI18N
        btnThem.setText("Thêm sự kiện");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem);

        jButton4.setBackground(new java.awt.Color(107, 70, 52));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/timKiem.png"))); // NOI18N
        jButton4.setText("Tìm kiếm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        tblSuKien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tblSuKien.setForeground(new java.awt.Color(107, 70, 52));
        tblSuKien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sự kiện", "Tên sự kiện", "Ưu đãi", "TG bắt đầu", "TG Kết thúc"
            }
        ));
        tblSuKien.setFillsViewportHeight(true);
        tblSuKien.setRowHeight(35);
        tblSuKien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSuKienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSuKien);

        cbxLoaiSK.setBackground(new java.awt.Color(204, 204, 255));
        cbxLoaiSK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbxLoaiSK.setForeground(new java.awt.Color(107, 70, 52));
        cbxLoaiSK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sự kiện đang diễn ra", "Sự kiện đã kết thúc" }));
        cbxLoaiSK.setRequestFocusEnabled(false);
        cbxLoaiSK.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiSKItemStateChanged(evt);
            }
        });
        cbxLoaiSK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaiSKActionPerformed(evt);
            }
        });

        SnUuDai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Loại sự kiện");

        buttonGroup1.add(rdoCoThoiHan);
        rdoCoThoiHan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoCoThoiHan.setForeground(new java.awt.Color(255, 255, 255));
        rdoCoThoiHan.setText("Có thời hạn");
        rdoCoThoiHan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoCoThoiHanItemStateChanged(evt);
            }
        });
        rdoCoThoiHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCoThoiHanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoKhongCoThoiHan);
        rdoKhongCoThoiHan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rdoKhongCoThoiHan.setForeground(new java.awt.Color(255, 255, 255));
        rdoKhongCoThoiHan.setSelected(true);
        rdoKhongCoThoiHan.setText("Không có thời hạn");
        rdoKhongCoThoiHan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rdoKhongCoThoiHanItemStateChanged(evt);
            }
        });

        pnNgay.setBackground(new java.awt.Color(212, 181, 152));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ngày kết thúc");

        javax.swing.GroupLayout pnNgayLayout = new javax.swing.GroupLayout(pnNgay);
        pnNgay.setLayout(pnNgayLayout);
        pnNgayLayout.setHorizontalGroup(
            pnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNgayLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(dateNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnNgayLayout.setVerticalGroup(
            pnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNgayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNgayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        chkHuySK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chkHuySK.setForeground(new java.awt.Color(255, 255, 255));
        chkHuySK.setText("Hủy sự kiện");
        chkHuySK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkHuySKActionPerformed(evt);
            }
        });

        btnXoaSK.setBackground(new java.awt.Color(255, 51, 51));
        btnXoaSK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXoaSK.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSK.setText("Xóa sự kiện");
        btnXoaSK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSKActionPerformed(evt);
            }
        });

        txtTenSK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTenSK.setForeground(new java.awt.Color(107, 70, 52));
        txtTenSK.setVerifyInputWhenFocusTarget(false);

        erroMaSK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        erroMaSK.setForeground(new java.awt.Color(255, 0, 0));
        erroMaSK.setText("Mã sự kiện");

        erroTenSK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        erroTenSK.setForeground(new java.awt.Color(255, 0, 0));
        erroTenSK.setText("Tên sự kiện");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày bắt đầu : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxLoaiSK, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoaSK, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(SnUuDai, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdoCoThoiHan)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdoKhongCoThoiHan))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(erroMaSK))
                            .addComponent(pnNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkHuySK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(erroTenSK))
                            .addComponent(txtMaSK)
                            .addComponent(txtTenSK)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLoaiSK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaSK, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(erroMaSK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(erroTenSK))
                        .addGap(10, 10, 10)
                        .addComponent(txtTenSK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(SnUuDai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoCoThoiHan)
                            .addComponent(rdoKhongCoThoiHan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkHuySK)
                                    .addComponent(jLabel5))
                                .addGap(21, 21, 21)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    //làm mới from

    public void lamMoi() {
        txtMaSK.setEnabled(true);
        txtMaSK.setText(null);
        txtTenSK.setText(null);
        SnUuDai.setValue(0);
        rdoKhongCoThoiHan.setSelected(true);
        chkHuySK.setSelected(false);
        lamMoiLoi();
    }

    public void lamMoiLoi() {
        erroMaSK.setText("");
        erroTenSK.setText("");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        btnSua.setEnabled(false);
        btnThem.setEnabled(true);
        lamMoi();
    }//GEN-LAST:event_jButton1ActionPerformed
    //check 2
    public boolean check2() {
        int d = 0;
        lamMoiLoi();
        //check mã
//        if (txtMaSK.getText().length() == 0) {
//            erroMaSK.setText("Trống mã");
//            ++d;
//        } else {
//            SuKien sk = SKDAO.findByMaSK(txtMaSK.getText());
//            if (sk != null) {
//                erroMaSK.setText("Mã trùng");
//                ++d;
//            } else {
//                erroMaSK.setText("");
//            }
//        }
        //check tên
        Integer index2 = tblSuKien.getSelectedRow();
        if (txtTenSK.getText().length() == 0) {
            erroTenSK.setText("Trống tên");
            ++d;
        } else {
            String tenSK = (String) tblSuKien.getValueAt(index2, 1);
            SuKien sk = SKDAO.findByTenSK(txtTenSK.getText());
            if (sk != null) {
                if (!tenSK.equalsIgnoreCase(sk.getTenSuKien())) {
                    erroTenSK.setText("Trùng tên sự kiện");
                    ++d;
                }
            } else {
                erroTenSK.setText("");
            }

        }
        //check giá trị ưu đãi
        try {
            Integer udai = (Integer) SnUuDai.getValue();
            if (udai < 0) {
                JOptionPane.showMessageDialog(this, "Ưu đãi phải >=0");
                ++d;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chọn lại ưu đãi");
            ++d;
        }

        if (rdoCoThoiHan.isSelected()) {
            try {
                if (!SKDAO.checkNgayThem(dateNgayBD.getDate(),dateNgayKT.getDate())) {
                    JOptionPane.showMessageDialog(this, "Ngày kết thúc sự kiện phải lớn hơn bằng ngày hiện tại");
                    ++d;
                };
            } catch (Exception e) {
            }
        }
        return d == 0 ? true : false;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        SuKien sk = new SuKien();
        sk.setMaSuKien(txtMaSK.getText());
        sk.setTenSuKien(txtTenSK.getText());

        if (!chkHuySK.isSelected()) {
            if (check2()) {
                Integer ud = (Integer) SnUuDai.getValue();
                sk.setUuDai(ud);
                try {
                    if (rdoCoThoiHan.isSelected()) {
                        sk.setTgKetThuc(ChuyenDoi.chuyenDoiNgayVeString1(dateNgayKT.getDate()));
                        sk.setLoaiSuKien(true);
                        SKDAO.updateSuKien(false, sk);
                    } else {
                        SKDAO.updateSuKien(false, sk);
                    }
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    if (cbxLoaiSK.getSelectedIndex() == 1) {
                        btnXoaSK.setEnabled(true);
                        SKDAO.loadDatatoTable(tableMode, false);
                    } else {
                        btnXoaSK.setEnabled(false);
                        SKDAO.loadDatatoTable(tableMode, true);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Thêm lỗi");
                }
            };
        } else {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn Hủy Sự Kiện", "xác nhận", JOptionPane.YES_NO_OPTION);
            if (chon == JOptionPane.YES_OPTION) {
                try {
                    SKDAO.updateSuKien(true, sk);
                    JOptionPane.showMessageDialog(this, "Đã hủy sự kiện");
                    if (cbxLoaiSK.getSelectedIndex() == 1) {
                        btnXoaSK.setEnabled(true);
                        SKDAO.loadDatatoTable(tableMode, false);
                    } else {
                        btnXoaSK.setEnabled(false);
                        SKDAO.loadDatatoTable(tableMode, true);
                    }
                } catch (Exception e) {
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed
    //check 1
    public boolean check() {
        int d = 0;
        lamMoiLoi();
        //check mã
        if (txtMaSK.getText().length() == 0) {
            erroMaSK.setText("Trống mã");
            ++d;
        } else {
            SuKien sk = SKDAO.findByMaSK(txtMaSK.getText());
            if (sk != null) {
                erroMaSK.setText("Mã trùng");
                ++d;
            } else {
                erroMaSK.setText("");
            }
        }
        //check tên
        if (txtTenSK.getText().length() == 0) {
            erroTenSK.setText("Trống tên");
            ++d;
        } else {
            SuKien sk = SKDAO.findByTenSK(txtTenSK.getText());
            if (sk != null) {
                erroTenSK.setText("Trùng tên sự kiện");
                ++d;
            } else {
                erroTenSK.setText("");
            }
        }
        //check giá trị ưu đãi
        try {
            Integer udai = (Integer) SnUuDai.getValue();
            if (udai < 0) {
                JOptionPane.showMessageDialog(this, "Ưu đãi phải >=0");
                ++d;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "chọn lại ưu đãi");
            ++d;
        }
        // check giá trị 
        Integer udai = (Integer) SnUuDai.getValue();
        if(udai > 100 ) {
            JOptionPane.showMessageDialog(this, "Ưu đãi phải < 100");
                ++d;
        }

        if (rdoCoThoiHan.isSelected()) {
            try {
                if (!SKDAO.checkNgayThem(dateNgayBD.getDate(),dateNgayKT.getDate())) {
                    JOptionPane.showMessageDialog(this, "Ngày kết thúc sự kiện phải lớn hơn bằng ngày hiện tại");
                    ++d;
                };
            } catch (Exception e) {
            }
        }
        return d == 0 ? true : false;
    }
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (check()) {
            SuKien sk = new SuKien();
            sk.setMaSuKien(txtMaSK.getText());
            sk.setTenSuKien(txtTenSK.getText());
            Integer ud = (Integer) SnUuDai.getValue();
            sk.setUuDai(ud);
            try {
                if (rdoCoThoiHan.isSelected()) {
                    sk.setTgKetThuc(ChuyenDoi.chuyenDoiNgayVeString1(dateNgayKT.getDate()));
                    sk.setTgBatDau(ChuyenDoi.chuyenDoiNgayVeString1(dateNgayBD.getDate()));
                    sk.setLoaiSuKien(true);
                    SKDAO.insertSuKien(sk, true);
                } else {

                    SKDAO.insertSuKien(sk, false);
                }
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                if (cbxLoaiSK.getSelectedIndex() == 1) {
                    btnXoaSK.setEnabled(true);
                    SKDAO.loadDatatoTable(tableMode, false);
                } else {
                    btnXoaSK.setEnabled(false);
                    SKDAO.loadDatatoTable(tableMode, true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Thêm lỗi");
            }
        };
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String tim = JOptionPane.showInputDialog(this, "Mời bạn nhập");
        if(tim.length()==0){
            JOptionPane.showMessageDialog(this, "Mời bạn nhập");
        }else {
            //cbxLoaiSK.setSelectedIndex(0);
            SKDAO.loadDataFindToTable(tableMode, true, tim);
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbxLoaiSKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaiSKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaiSKActionPerformed

    private void rdoCoThoiHanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoCoThoiHanItemStateChanged
        // TODO add your handling code here:
        if (rdoCoThoiHan.isSelected()) {
            pnNgay.setVisible(true);
        } else {
            pnNgay.setVisible(false);
        }
    }//GEN-LAST:event_rdoCoThoiHanItemStateChanged

    private void rdoKhongCoThoiHanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rdoKhongCoThoiHanItemStateChanged
        // TODO add your handling code here:
        if (rdoCoThoiHan.isSelected()) {
            pnNgay.setVisible(true);
        } else {
            pnNgay.setVisible(false);
        }
    }//GEN-LAST:event_rdoKhongCoThoiHanItemStateChanged

    private void cbxLoaiSKItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiSKItemStateChanged
        // TODO add your handling code here:
        //String loaisk = (String) cbxLoaiSK.getSelectedItem();
        if (cbxLoaiSK.getSelectedIndex() == 1) {
            btnXoaSK.setEnabled(true);
            SKDAO.loadDatatoTable(tableMode, false);
            btnSua.setEnabled(false);
        } else {
            btnXoaSK.setEnabled(false);
            SKDAO.loadDatatoTable(tableMode, true);
            btnSua.setEnabled(true);
        }
    }//GEN-LAST:event_cbxLoaiSKItemStateChanged

    private void rdoCoThoiHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCoThoiHanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCoThoiHanActionPerformed

    private void tblSuKienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSuKienMouseClicked
        // TODO add your handling code here:
        chkHuySK.setSelected(false);
        if (cbxLoaiSK.getSelectedIndex() == 1) {
            btnSua.setEnabled(false);
        } else {
            btnSua.setEnabled(true);
        }

        btnThem.setEnabled(false);
        txtMaSK.setEnabled(false);
        Integer index = tblSuKien.getSelectedRow();
        txtMaSK.setText((String) tblSuKien.getValueAt(index, 0));
        txtTenSK.setText((String) tblSuKien.getValueAt(index, 1));
        SnUuDai.setValue(tblSuKien.getValueAt(index, 2));
        String ngayCuoi = (String) tblSuKien.getValueAt(index, 4);
        //JOptionPane.showMessageDialog(this, ngayCuoi);
        if (ngayCuoi != null) {
            rdoCoThoiHan.setSelected(true);
            dateNgayKT.setDate(ChuyenDoi.chuyenDoiNgay(ngayCuoi));
        } else {
            rdoKhongCoThoiHan.setSelected(true);
        }
//        if (evt.getClickCount() == 2) {
//
//            
//        }
    }//GEN-LAST:event_tblSuKienMouseClicked

    private void btnXoaSKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSKActionPerformed
        // TODO add your handling code here:
        int chon = JOptionPane.showConfirmDialog(this, "Bạn muốn Hủy Sự Kiện", "xác nhận", JOptionPane.YES_NO_OPTION);
        if (chon == JOptionPane.YES_OPTION) {
            SuKien sk = new SuKien();
            sk.setMaSuKien(txtMaSK.getText());
            try {
                SKDAO.anSuKien(sk);
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                if (cbxLoaiSK.getSelectedIndex() == 1) {
                    btnXoaSK.setEnabled(true);
                    SKDAO.loadDatatoTable(tableMode, false);
                } else {
                    btnXoaSK.setEnabled(false);
                    SKDAO.loadDatatoTable(tableMode, true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Xóa lỗi lỗi");
            }
        }
    }//GEN-LAST:event_btnXoaSKActionPerformed

    private void chkHuySKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkHuySKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkHuySKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SnUuDai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaSK;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxLoaiSK;
    private javax.swing.JCheckBox chkHuySK;
    private com.toedter.calendar.JDateChooser dateNgayBD;
    private com.toedter.calendar.JDateChooser dateNgayKT;
    private javax.swing.JLabel erroMaSK;
    private javax.swing.JLabel erroTenSK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnNgay;
    private javax.swing.JRadioButton rdoCoThoiHan;
    private javax.swing.JRadioButton rdoKhongCoThoiHan;
    private javax.swing.JTable tblSuKien;
    private javax.swing.JTextField txtMaSK;
    private javax.swing.JTextField txtTenSK;
    // End of variables declaration//GEN-END:variables
}