/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import DAO.ChuyenDeDAO;
import Entity.ChuyenDe;
import Utils.Auth;
import Utils.MsgBox;
import Utils.XImage;
import java.awt.Image;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ChuyenDeFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChuyenDe
     */
    public ChuyenDeFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnDauTien = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnTiepTheo = new javax.swing.JButton();
        btnCuoiCung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChuyenDe = new javax.swing.JTable();

        FileChooser.setFileHidingEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hệ Quản Lý Đào Tạo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Hình LOGO");

        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã chuyên đề");

        txtMaCD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tên chuyên đề");

        txtTenCD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Thời lượng (Giờ)");

        txtThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Học phí");

        txtHocPhi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mô tả chuyên đề");

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel3.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel3.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel3.add(btnXoa);

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanel3.add(btnLamMoi);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        btnDauTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDauTien.setText("|<");
        btnDauTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauTienActionPerformed(evt);
            }
        });
        jPanel4.add(btnDauTien);

        btnLui.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLui.setText("<<");
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });
        jPanel4.add(btnLui);

        btnTiepTheo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTiepTheo.setText(">>");
        btnTiepTheo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTheoActionPerformed(evt);
            }
        });
        jPanel4.add(btnTiepTheo);

        btnCuoiCung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCuoiCung.setText(">|");
        btnCuoiCung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiCungActionPerformed(evt);
            }
        });
        jPanel4.add(btnCuoiCung);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaCD)
                            .addComponent(txtTenCD)
                            .addComponent(txtThoiLuong)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtHocPhi)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tabs.addTab("CẬP NHẬT", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(51, 51, 51))); // NOI18N

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên chuyên đề:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã CĐ", "Tên CĐ", "Học Phí", "Thời Lượng", "Hình Ảnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChuyenDe.setRowHeight(24);
        tblChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblChuyenDe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
        // TODO add your handling code here:
        this.chonAnh();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnDauTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauTienActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnDauTienActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnTiepTheoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTheoActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnTiepTheoActionPerformed

    private void btnCuoiCungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiCungActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnCuoiCungActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        this.timKiem();
    }//GEN-LAST:event_btnTimActionPerformed

    private void tblChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChuyenDeMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            this.row = tblChuyenDe.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblChuyenDeMouseClicked

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
            java.util.logging.Logger.getLogger(ChuyenDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenDeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btnCuoiCung;
    private javax.swing.JButton btnDauTien;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTiepTheo;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblChuyenDe;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    ChuyenDeDAO dao = new ChuyenDeDAO();
    int row = -1;
    
    void init(){
        setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
    void insert(){
        ChuyenDe cd = getForm();
        if(cd == null){
            return;
        }else if(dao.selectById(txtMaCD.getText()) == null){
            try{
                dao.insert(cd);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Đã thêm chuyên đề mới thành công!");
            }catch(Exception e){
                MsgBox.alert(this, "Thêm chuyên đề thất bại!");
            }
        }else{
            MsgBox.alert(this, "Mã chuyên đề đã tồn tại!");
        }
    }
    void update(){
        ChuyenDe cd = getForm();
        if(cd == null){
            return;
        }else{
            try{
                dao.update(cd);
                this.fillTable();
                MsgBox.alert(this, "Đã cập nhật thông tin chuyên đề thành công!");
            }catch(Exception e){
                MsgBox.alert(this, "Cập nhật thông tin chuyên đề thất bại!");
            }
        }
    }
    void delete(){
        if(!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề!");
        }else{
            String macd = txtMaCD.getText();
            if(MsgBox.confirm(this, "Bạn có thực sự muốn xóa chuyên đề này?")){
                try{
                    dao.delete(macd);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa chuyên đề thành công!");
                }catch(Exception e){
                    MsgBox.alert(this, "Xóa chuyên đề thất bại!");
                }
            }
        }
    }
    void clearForm(){
        ChuyenDe cd = new ChuyenDe();
        this.setForm(cd);
        this.row = -1;
        this.updateStatus();
    }
    void edit(){
        String macd = (String) tblChuyenDe.getValueAt(this.row, 0);
        ChuyenDe cd = dao.selectById(macd);
        this.setForm(cd);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }
    void first(){
        this.row = 0;
        this.edit();
    }
    void prev(){
        if(this.row > 0){
            this.row --;
            this.edit();
        }
    }
    void next(){
        if(this.row < tblChuyenDe.getRowCount() - 1){
            this.row ++;
            this.edit();
        }
    }
    void last(){
        this.row = tblChuyenDe.getRowCount() - 1;
        this.edit();
    }
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tblChuyenDe.getModel();
        model.setRowCount(0);
        try{
            String keyword = txtTimKiem.getText();
            List<ChuyenDe> list = dao.selectByKeyword(keyword);
            for(ChuyenDe cd : list){
                Object[] row = {
                    cd.getMaCD(), cd.getTenCD(), cd.getHocPhi(),
                    cd.getThoiLuong(), cd.getHinh()
                };
                model.addRow(row);
            }
        }catch(Exception e){
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void setForm(ChuyenDe cd){
        txtMaCD.setText(cd.getMaCD());
        txtTenCD.setText(cd.getTenCD());
        txtThoiLuong.setText(String.valueOf(cd.getThoiLuong()));
        txtHocPhi.setText(String.valueOf(cd.getHocPhi()));
        txtMoTa.setText(cd.getMoTa());
        if(cd.getHinh() != null){
            lblHinh.setToolTipText(cd.getHinh());
            ImageIcon icon = XImage.read(cd.getHinh()); // Lấy địa chỉ của file Icon
            
            //Chuyển Icon sang image và điều chỉnh kích thước
            Image scaleIcon = icon.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT);
            lblHinh.setIcon(new javax.swing.ImageIcon(scaleIcon));
        }
        
    }
    ChuyenDe getForm(){
        ChuyenDe cd = new ChuyenDe();
        if(Validation()){
            cd.setMaCD(txtMaCD.getText());
            cd.setTenCD(txtTenCD.getText());
            cd.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
            cd.setHocPhi(Double.valueOf(txtHocPhi.getText()));
            cd.setMoTa(txtMoTa.getText());
            cd.setHinh(lblHinh.getToolTipText());
            return cd;
        }
        return null;
    }
    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblChuyenDe.getRowCount() -1);
        //Trạng Thái Form
        txtMaCD.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        //Trạng Thái Điều Hướng
        btnDauTien.setEnabled(edit && !first);
        btnLui.setEnabled(edit && !first);
        btnTiepTheo.setEnabled(edit && !last);
        btnCuoiCung.setEnabled(edit && !last);
    }
    void chonAnh(){
        if(FileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            File file = FileChooser.getSelectedFile();
            XImage.save(file); // Lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName()); // Đọc hình từ logos
            Image scaleIcon = icon.getImage().getScaledInstance(lblHinh.getWidth(), lblHinh.getHeight(), Image.SCALE_DEFAULT);
            lblHinh.setIcon(new javax.swing.ImageIcon(scaleIcon));
            lblHinh.setToolTipText(file.getName()); //Giữ tên hình trong toolTip
        }
    }
    void timKiem(){
        this.fillTable();
        this.clearForm();
        this.row = -1;
        updateStatus();
    }
    boolean Validation(){
        // Kiểm tra mã Chuyên Đề
        if(txtMaCD.getText().length() == 0){
            MsgBox.alert(this, "Mã chuyên đề không được để trống !");
            txtMaCD.setFocusable(true);
            return false;
        }else if(txtMaCD.getText().length() > 5){
            MsgBox.alert(this, "Mã chuyên đề không vượt quá 5 ký tự!");
            txtMaCD.setFocusable(true);
            return false;
        }
        
        //Kiểm tra tên Chuyên Đề
        if(txtTenCD.getText().length() == 0){
            MsgBox.alert(this, "Tên chuyên đề không được để trống!");
            txtTenCD.setFocusable(true);
            return false;
        }else if(txtTenCD.getText().length() > 50){
            MsgBox.alert(this, "Tên chuyên đề không dài quá 50 ký tự!");
            txtTenCD.setFocusable(true);
            return false;
        }
        
        //Kiểm tra thời lượng
        if(txtThoiLuong.getText().length() == 0){
            MsgBox.alert(this, "Thời lượng không được để trống!");
            txtThoiLuong.setFocusable(true);
            return false;
        }else{
            try{
                int thoiluong = Integer.parseInt(txtThoiLuong.getText());
            }catch(Exception e){
                MsgBox.alert(this, "Sai kiểu dữ liệu thời lượng!");
                txtThoiLuong.setFocusable(true);
                return false;
            }
        }
        
        //Kiểm tra học phí
        if(txtHocPhi.getText().length() == 0){
            MsgBox.alert(this, "Học phí không được để trống!");
            txtHocPhi.setFocusable(true);
            return false;
        }else{
            try{
                double hocphi = Double.parseDouble(txtHocPhi.getText());
            }catch(Exception e){
                MsgBox.alert(this, "Sai kiểu dữ liệu học phí!");
                txtHocPhi.setFocusable(true);
                return false;
            }
        }
        
        //Kiểm tra hình ảnh
        if(lblHinh.getToolTipText() == null){
            MsgBox.alert(this, "Bạn chưa chọn hình cho chuyên đề!");
            return false;
        }
        
        return true;
    }
}
