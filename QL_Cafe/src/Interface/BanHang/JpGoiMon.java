/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.BanHang;

import Interface.Run;
import Models.Ban;
import Models.DsOrder;
import Models.HoaDon;
import Models.ThucDon;
import Mysql.ConnectSQL;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public final class JpGoiMon extends javax.swing.JPanel {
    String TenBan;
    int MaBan;
    int MaHD, tienmon = 0, tongtien = 0;
    ConnectSQL cn = new ConnectSQL();
    HoaDon arrhd;
    NumberFormat chuyentien = new DecimalFormat("#,###,###");
    ArrayList<DsOrder> order;
    public static JpGoiMon gm;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
    /**
     * Creates new form JpGoiMon
     * @param trangthai
     * @param tenban
     * @param maban
     */
    public JpGoiMon(String trangthai, String tenban, int maban) {
        initComponents();
        gm = this;
        MaBan = maban;
        TenBan = tenban;
        
        jpDsMon.setVisible(false);
        jpThongTinThanhToan.setVisible(false);
        jScrollPane1.setVisible(false);
        
        arrhd = cn.GetHDbyMaBan(maban);
        if(arrhd != null){
            order = cn.GetDsOrder(arrhd.GetMaHD());
            fillDsMon(0);
            MaHD = arrhd.GetMaHD();
            lblgioden_59.setText(df.format(arrhd.GetGioDen()));  
        }
        lblTenBan.setText(tenban);
        lbltrangthai_59.setText(trangthai);

        if(lbltrangthai_59.getText().equals("Trống")){
            btnDatBan_59.setText("Đặt chỗ");
            return;
            
        }if(lbltrangthai_59.getText().equals("Đã đặt trước")){
            btnDatBan_59.setText("Hủy đặt");
            return;
        }if(lbltrangthai_59.getText().equals("Đang phục vụ")){
            btnDatBan_59.setVisible(false);
            btnThuGon_59.setVisible(false);
            jpThucDon thucdon = new jpThucDon();
            thucdon.tenban = TenBan;
            thucdon.maban = maban;
            jpthucdon.removeAll();
            jpthucdon.add(thucdon);
            jpthucdon.updateUI();
        }         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jpThongTinBan = new javax.swing.JPanel();
        lblTenBan = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblgioden_59 = new javax.swing.JLabel();
        lbltrangthai_59 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDatBan_59 = new javax.swing.JButton();
        btnGoi_59 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jpThongTinThanhToan = new javax.swing.JPanel();
        lblTongTien_59 = new javax.swing.JLabel();
        lblgiamgia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTienMon_59 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnThuGon_59 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpDsMon = new javax.swing.JPanel();
        jpthucdon = new javax.swing.JPanel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Thời gian phục vụ gần nhất");

        setBackground(Color.decode("#e6e6e6"));

        jpThongTinBan.setBackground(Color.decode("#e6e6e6"));
        jpThongTinBan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpThongTinBan.setAutoscrolls(true);

        lblTenBan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTenBan.setForeground(new java.awt.Color(102, 51, 0));
        lblTenBan.setText("Bàn 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Giờ đến:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Status:");

        lblgioden_59.setText(".....");

        lbltrangthai_59.setText("....");

        jPanel1.setBackground(Color.decode("#e6e6e6"));

        btnDatBan_59.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnDatBan_59.setForeground(new java.awt.Color(102, 51, 0));
        btnDatBan_59.setText("Đặt chỗ");
        btnDatBan_59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatBan_59.setPreferredSize(new java.awt.Dimension(100, 40));
        btnDatBan_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatBan_59ActionPerformed(evt);
            }
        });
        jPanel1.add(btnDatBan_59);

        btnGoi_59.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        btnGoi_59.setForeground(new java.awt.Color(102, 51, 0));
        btnGoi_59.setText("Gọi món");
        btnGoi_59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGoi_59.setPreferredSize(new java.awt.Dimension(100, 40));
        btnGoi_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoi_59ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoi_59);

        jSeparator1.setBackground(Color.decode("#e6e6e6"));
        jSeparator1.setForeground(new java.awt.Color(21, 75, 158));

        jpThongTinThanhToan.setBackground(Color.decode("#e6e6e6"));
        jpThongTinThanhToan.setAutoscrolls(true);
        jpThongTinThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpThongTinThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpThongTinThanhToanMousePressed(evt);
            }
        });

        lblTongTien_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTongTien_59.setForeground(new java.awt.Color(255, 0, 0));
        lblTongTien_59.setText("0");

        lblgiamgia.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblgiamgia.setForeground(new java.awt.Color(51, 0, 51));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Tiền món:");

        lblTienMon_59.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTienMon_59.setText("0");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("THÀNH TIỀN:");

        javax.swing.GroupLayout jpThongTinThanhToanLayout = new javax.swing.GroupLayout(jpThongTinThanhToan);
        jpThongTinThanhToan.setLayout(jpThongTinThanhToanLayout);
        jpThongTinThanhToanLayout.setHorizontalGroup(
            jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(lblgiamgia, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTienMon_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTongTien_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jpThongTinThanhToanLayout.setVerticalGroup(
            jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblTienMon_59))
                .addGap(11, 11, 11)
                .addGroup(jpThongTinThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTongTien_59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblgiamgia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThuGon_59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThuGon_59.setForeground(new java.awt.Color(0, 51, 51));
        btnThuGon_59.setText("<<");
        btnThuGon_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuGon_59ActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(Color.decode("#e6e6e6"));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpDsMon.setBackground(Color.decode("#e6e6e6"));
        jpDsMon.setMaximumSize(new java.awt.Dimension(32767, 400));
        jpDsMon.setOpaque(false);

        javax.swing.GroupLayout jpDsMonLayout = new javax.swing.GroupLayout(jpDsMon);
        jpDsMon.setLayout(jpDsMonLayout);
        jpDsMonLayout.setHorizontalGroup(
            jpDsMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jpDsMonLayout.setVerticalGroup(
            jpDsMonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpDsMon);

        javax.swing.GroupLayout jpThongTinBanLayout = new javax.swing.GroupLayout(jpThongTinBan);
        jpThongTinBan.setLayout(jpThongTinBanLayout);
        jpThongTinBanLayout.setHorizontalGroup(
            jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpThongTinBanLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addComponent(lbltrangthai_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(260, 260, 260))
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addComponent(lblgioden_59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(227, 227, 227))))
            .addGroup(jpThongTinBanLayout.createSequentialGroup()
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jpThongTinThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpThongTinBanLayout.createSequentialGroup()
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnThuGon_59, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpThongTinBanLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblTenBan)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpThongTinBanLayout.setVerticalGroup(
            jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpThongTinBanLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTenBan)
                .addGap(48, 48, 48)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblgioden_59))
                .addGap(18, 18, 18)
                .addGroup(jpThongTinBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbltrangthai_59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpThongTinThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThuGon_59, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpthucdon.setBackground(Color.decode("#e6e6e6"));
        jpthucdon.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpThongTinBan, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpthucdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpthucdon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(532, 532, 532))
            .addComponent(jpThongTinBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents
    public void fillThongTin(){
        arrhd = cn.GetHDbyMaBan(MaBan);
        MaHD = arrhd.GetMaHD();
        int ck = cn.CheckDsMon(MaHD, MaBan);
        btnGoi_59.setVisible(true);
        if(ck == 0){
            HuyHD();
            btnGoi_59.setVisible(false);
        }
        
        if(arrhd.GetGiamGia() > 100){
            lblgiamgia.setText(chuyentien.format(arrhd.GetGiamGia())+" VNĐ");
            if(tienmon - arrhd.GetGiamGia() <= 0){
                tongtien = 0;
                lblTongTien_59.setText("0 VNĐ");
            }else{
                tongtien = tienmon - arrhd.GetGiamGia();
                lblTongTien_59.setText(String.valueOf(chuyentien.format(tongtien))+" VNĐ");
            }
        }
        if(arrhd.GetGiamGia() <= 100){
            tongtien = tienmon - (tienmon * arrhd.GetGiamGia() / 100);
            lblTongTien_59.setText(String.valueOf(chuyentien.format(tongtien))+" VNĐ");
            lblgiamgia.setText(String.valueOf(arrhd.GetGiamGia())+" %");
        }
        lblTienMon_59.setText(String.valueOf(chuyentien.format(tienmon))+" VNĐ");        
    }
    
    public void fillDsMon(int mahd){
        if(mahd != 0){
            order = cn.GetDsOrder(mahd);
            arrhd = cn.GetHDbyMaBan(MaBan);
            tienmon = 0;
        }
        mahd = MaHD;
        if(order != null){
            jpDsMon.setVisible(true);
            jpThongTinThanhToan.setVisible(true);
            jScrollPane1.setVisible(true);
            btnGoi_59.setText("Thanh toán");
                     
            JPanel[] pn = new JPanel[order.size()];
            jpDsMon.removeAll();
            jpDsMon.setLayout(new BoxLayout(jpDsMon, BoxLayout.Y_AXIS));
            for(int i=0;i<order.size();i++){
                tienmon += order.get(i).GetGia() * order.get(i).GetSoLuong();
                pn[i] = new JPanel();
                pn[i].setName(order.get(i).GetMaMon());
                pn[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
                pn[i].setBorder(BorderFactory.createLineBorder(Color.darkGray, 1));
                pn[i].setBackground(Color.decode("#b3ff99"));
                pn[i].setLayout(new GridLayout());
                pn[i].setPreferredSize(new Dimension(270, 50));
                pn[i].setMaximumSize(new Dimension(270, 50));
                pn[i].setMinimumSize(new Dimension(270, 50));
                pn[i].add(new JLabel(order.get(i).GetTenMon(),JLabel.CENTER)).setForeground(Color.decode("#001a66"));
                pn[i].add(new JLabel(String.valueOf(chuyentien.format(order.get(i).GetGia()))+" VNĐ",JLabel.CENTER)).setForeground(Color.decode("#ff0000"));
                pn[i].add(new JLabel(String.valueOf(order.get(i).GetSoLuong())+" "+ order.get(i).GetDVT(),JLabel.RIGHT)).setForeground(Color.decode("#008000"));
                Icon ic = new ImageIcon("src/Icons/DeleteRed.png");
                JLabel lbl = new JLabel("", ic,JLabel.CENTER);
                lbl.setForeground(Color.decode("#b3ff99"));
                lbl.setName(order.get(i).GetMaMon());
                pn[i].add(lbl).addMouseListener(new MouseAdapter() {
                  @Override
                    public void mouseClicked(MouseEvent e){
                        int qs;
                        ArrayList<ThucDon> td = cn.GetThucDonByMa(e.getComponent().getName());
                        
                        qs = JOptionPane.showConfirmDialog(null, "Hủy món: "+td.get(0).GetTenMon()+" ?", "Hủy món", JOptionPane.YES_NO_OPTION);
                        if (qs == JOptionPane.YES_OPTION) {
                            int xoa = cn.DeleteMon(e.getComponent().getName(),MaHD, MaBan);
                            if(xoa == 1){
                                fillDsMon(MaHD);
                            }
                            if(xoa == 2){
                                fillDsMon(MaHD);
                                HuyHD();
                            }
                        }
                    }
                });
                pn[i].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e){
                        DLSoLuong sl = new DLSoLuong(Run.QlCafe, true, e.getComponent().getName(), TenBan, MaBan);
                        sl.setVisible(true);
                    }
                });
                jpDsMon.add(pn[i]);
                jpDsMon.updateUI();
                
            }

            fillThongTin();
        }        
    }
    private void HuyHD(){
        
        JButton btnhuy = new JButton("Hủy bàn");
        btnhuy.setPreferredSize(new Dimension(100, 40));
        btnhuy.setBounds(100, 50, 100, 40);
        jpDsMon.setLayout(null);
        btnGoi_59.setVisible(false);
        jpThongTinThanhToan.setVisible(false);
        btnhuy.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                Ban b = new Ban();
                b.SetTrangThai("Trống");
                b.SetMaBan(MaBan);
                cn.UpDateTrangThaiBan(b);

                jpBanHang.bh.FillBan();
                JpGoiMon.gm.removeAll();
                jpBanHang.bh.fillLb();

                HoaDon hd = new HoaDon();
                hd.SetMaHD(MaHD);
                cn.HuyHD(hd);
            }
        });
        jpDsMon.add(btnhuy);
        jpDsMon.updateUI();        
    }
    private void btnGoi_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoi_59ActionPerformed
        if(btnGoi_59.getText().equals("Hủy bàn")){
            
            jpthucdon.removeAll();
            jpthucdon.updateUI();
            jpThongTinThanhToan.setVisible(false);
            btnThuGon_59.setVisible(true);
            lblgioden_59.setText("......");
            lbltrangthai_59.setText("Trống");
            String TrangThai = "Trống";
            Ban b = new Ban(MaBan, lblTenBan.getText(), TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            btnGoi_59.setText("Gọi món");
            btnDatBan_59.setVisible(true);
            btnDatBan_59.setText("Đặt bàn");
            return;
            
        }if(btnGoi_59.getText().equals("Thanh toán")){
            DLThanhToan thanhtoan = new DLThanhToan(Run.QlCafe, true, tongtien, TenBan, MaBan, MaHD);//tongtien trang thai ban ten ban
            thanhtoan.setVisible(true);
            return;         
        }
        if(btnGoi_59.getText().equals("Gọi món")){
            jpthucdon.setVisible(true);
            Date date = new Date();
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm a");
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            lblgioden_59.setText(df.format(date));
            lbltrangthai_59.setText("Đang phục vụ");
            btnDatBan_59.setVisible(false);
            btnThuGon_59.setVisible(false);
            btnGoi_59.setText("Hủy bàn");

            jpThucDon thucdon;
            thucdon = new jpThucDon();
            thucdon.maban = MaBan;
            thucdon.tenban = TenBan;
            
            thucdon.gioden = sf.format(date);
            jpthucdon.removeAll();
            jpthucdon.add(thucdon);
            jpthucdon.revalidate();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGoi_59ActionPerformed

    private void btnDatBan_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatBan_59ActionPerformed
        if(lbltrangthai_59.getText().equals("Đã đặt trước")){
            lbltrangthai_59.setText("Trống");
            btnDatBan_59.setText("Đặt chỗ");           
            String TrangThai = "Trống";
            Ban b = new Ban(MaBan, TenBan, TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            jpBanHang.bh.updateUI();
        }else{
            lbltrangthai_59.setText("Đã đặt trước");
            btnDatBan_59.setText("Hủy đặt");
            String TrangThai = "Đã đặt trước";
            Ban b = new Ban(MaBan, TenBan, TrangThai);
            int Update = cn.UpdateBan(b);
            jpBanHang.bh.FillBan();
            jpBanHang.bh.updateUI();
//            Run.QlCafe.reloadPanel(1, MaBan);            
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatBan_59ActionPerformed

    private void jpThongTinThanhToanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpThongTinThanhToanMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_jpThongTinThanhToanMousePressed

    private void btnThuGon_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuGon_59ActionPerformed
        jpBanHang.bh.fillLb();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnThuGon_59ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatBan_59;
    private javax.swing.JButton btnGoi_59;
    private javax.swing.JButton btnThuGon_59;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpDsMon;
    private javax.swing.JPanel jpThongTinBan;
    private javax.swing.JPanel jpThongTinThanhToan;
    private javax.swing.JPanel jpthucdon;
    private javax.swing.JLabel lblTenBan;
    private javax.swing.JLabel lblTienMon_59;
    private javax.swing.JLabel lblTongTien_59;
    private javax.swing.JLabel lblgiamgia;
    private javax.swing.JLabel lblgioden_59;
    private javax.swing.JLabel lbltrangthai_59;
    // End of variables declaration//GEN-END:variables
}
