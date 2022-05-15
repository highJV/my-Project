/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BanHang;

import Models.Ban;
import Models.ChiTietHD;
import Models.HoaDon;
import Models.ThucDon;
import Mysql.ConnectSQL;
import java.util.ArrayList;

/**
 *
 * @author ThangIKCU
 */
public class DLSoLuong extends javax.swing.JDialog {
    ConnectSQL cn = new ConnectSQL();
    int sl = 0;
    ArrayList<ThucDon> arrThucDon;
    public String gioden, mamon, TenBan;
    public int maban;
    ChiTietHD mon;
    /**
     * Creates new form NewJDialog
     */
    
    /**
     * Creates new form NewJDialog
     * @param parent
     * @param modal
     * @param MaMon
     * @param tenban
     * @param MaBan
     */
    public DLSoLuong(java.awt.Frame parent, boolean modal, String MaMon, String tenban, int MaBan) {
        super(parent, modal);
        initComponents();
        mamon = MaMon;
        TenBan = tenban;
        maban = MaBan;
        Fill();
        mon = cn.GetDsChiTiet(MaMon, MaBan);
        if(mon != null){
            txtgia_59.setText(String.valueOf(mon.GetGia()));
            txtSl_59.setText(String.valueOf(mon.GetSoLuong()));
            
        }
                

    }
    private void Fill(){
        arrThucDon = cn.GetThucDonByMa(mamon);
        txtSl_59.setText("1");
        lblban.setText(TenBan + " ");
        
        lblTenMon.setText(arrThucDon.get(0).GetTenMon());
        lblDVT.setText(arrThucDon.get(0).GetDVT());
        txtgia_59.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTenMon = new javax.swing.JLabel();
        lblDVT = new javax.swing.JLabel();
        txtSl_59 = new javax.swing.JTextField();
        btnYes_59 = new javax.swing.JButton();
        btnCancer_59 = new javax.swing.JButton();
        btnGiam_59 = new javax.swing.JButton();
        btnTang_59 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblban = new javax.swing.JLabel();
        txtgia_59 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(140, 140, 6));
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));

        lblTenMon.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTenMon.setForeground(new java.awt.Color(51, 0, 0));
        lblTenMon.setText("Cà phê sữa");

        lblDVT.setText("Ly");

        txtSl_59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSl_59KeyReleased(evt);
            }
        });

        btnYes_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnYes_59.setText("Đồng ý");
        btnYes_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYes_59ActionPerformed(evt);
            }
        });

        btnCancer_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancer_59.setText("Hủy");
        btnCancer_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancer_59ActionPerformed(evt);
            }
        });

        btnGiam_59.setText("-");
        btnGiam_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiam_59ActionPerformed(evt);
            }
        });

        btnTang_59.setText("+");
        btnTang_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTang_59ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Số lượng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Giá:");

        lblban.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblban.setForeground(new java.awt.Color(0, 51, 0));
        lblban.setText("Bàn1");

        txtgia_59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtgia_59KeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/thucdon2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTenMon)
                                .addGap(80, 80, 80))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblDVT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnYes_59, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancer_59, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGiam_59, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSl_59, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTang_59, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtgia_59, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblban)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblban)
                    .addComponent(lblTenMon))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDVT)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGiam_59)
                            .addComponent(txtSl_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTang_59))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtgia_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancer_59, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnYes_59, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTang_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTang_59ActionPerformed
            sl = Integer.parseInt(txtSl_59.getText());
            if(sl < 30){
                sl++;
                txtSl_59.setText(String.valueOf(sl));
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTang_59ActionPerformed

    private void btnGiam_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiam_59ActionPerformed
        try{
            sl = Integer.parseInt(txtSl_59.getText());
            if(sl != 1 && sl != 0){
                sl--;
                txtSl_59.setText(String.valueOf(sl));
            }
        }catch(Exception e){
                txtSl_59.setText("1");
        }

    }//GEN-LAST:event_btnGiam_59ActionPerformed

    private void btnCancer_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancer_59ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancer_59ActionPerformed

    private void btnYes_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYes_59ActionPerformed
        if(cn.GetMaHD(maban) == 0){
            HoaDon hd = new HoaDon();
            hd.SetMaBan(maban);
            
            hd.SetTrangThai(0);
            //JOptionPane.showMessageDialog(null, gioden);
            int insertHd = cn.InsertHoaDon(hd, gioden);
        }

        if(mon != null){
            ChiTietHD ct = new ChiTietHD();
            ct.SetGia(Integer.parseInt(txtgia_59.getText()));
            ct.SetSoLuong(Integer.parseInt(txtSl_59.getText()));
            ct.SetMaChiTietHD(mon.GetMaChiTietHD());
            int updatect = cn.UpdateChiTiet(ct);
        }if(mon == null){
            ChiTietHD cthd = new ChiTietHD();
            cthd.SetGia(Integer.parseInt(txtgia_59.getText()));
            cthd.SetMaHD(cn.GetMaHD(maban));
            cthd.SetMaMon(mamon);
            cthd.SetSoLuong(Integer.parseInt(txtSl_59.getText()));
            int isertCtHD = cn.InsertChiTietHD(cthd);
        }

        Ban b = new Ban();
        b.SetTrangThai("Đang phục vụ");
        b.SetTenBan(TenBan);
        b.SetMaBan(maban);
        int updateban = cn.UpdateBan(b);

        jpBanHang.bh.FillBan();
        jpBanHang.bh.updateUI();
        JpGoiMon.gm.fillDsMon(cn.GetMaHD(maban));
        JpGoiMon.gm.updateUI();

        this.dispose();
    }//GEN-LAST:event_btnYes_59ActionPerformed

    private void txtSl_59KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSl_59KeyReleased
        try{
            sl = Integer.parseInt(txtSl_59.getText());
            if(txtSl_59.getText().equals("0") || sl > 30)
                txtSl_59.setText("1");
        }catch(Exception e){
           txtSl_59.setText("1");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSl_59KeyReleased

    private void txtgia_59KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgia_59KeyReleased
        try{
            Integer.parseInt(txtgia_59.getText());

        }catch(Exception e){
            txtgia_59.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
        }
        if(txtgia_59.getText().equals("0")){
            txtgia_59.setText(String.valueOf(arrThucDon.get(0).GetDonGia()));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtgia_59KeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancer_59;
    private javax.swing.JButton btnGiam_59;
    private javax.swing.JButton btnTang_59;
    private javax.swing.JButton btnYes_59;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDVT;
    private javax.swing.JLabel lblTenMon;
    private javax.swing.JLabel lblban;
    private javax.swing.JTextField txtSl_59;
    private javax.swing.JTextField txtgia_59;
    // End of variables declaration//GEN-END:variables
}
