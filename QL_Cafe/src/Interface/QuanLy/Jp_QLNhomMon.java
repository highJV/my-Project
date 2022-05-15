/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.QuanLy;

import Interface.BanHang.jpThucDon;
import Interface.Run;
import Models.Loai;
import Mysql.ConnectSQL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Jp_QLNhomMon extends javax.swing.JPanel {
    ConnectSQL cn = new ConnectSQL();
    /**
     * Creates new form Jp_QLNhomMon
     */
    public static Jp_QLNhomMon nhom;
    public Jp_QLNhomMon() {
        initComponents();
        nhom = this;
        FillTable();
    }
    public void FillTable() {
        ArrayList<Loai> arrTable = cn.GetLoai();
        DefaultTableModel tbmodel = new DefaultTableModel();

        tbmodel.addColumn("Mã loại");
        tbmodel.addColumn("Tên loại");

        if (arrTable != null) {
            int soloai = 0;
            for (Loai l : arrTable) {
                soloai++;
                tbmodel.addRow(new Object[]{l.GetMaLoai(), l.GetTenLoai(),l.GetMauSac()});
            }
            lblthongtin_59.setText(String.valueOf(soloai)+" loại");
        } else {
            JOptionPane.showMessageDialog(null, "Không có loại nào");
        }
        tbNhomMon_59.setModel(tbmodel);
        for(int i = 0; i < tbNhomMon_59.getColumnCount();i++){
            Class<?> col = tbNhomMon_59.getColumnClass(i);
            tbNhomMon_59.setDefaultEditor(col, null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhomMon_59 = new javax.swing.JTable();
        bntThem_59 = new javax.swing.JButton();
        bntSua_59 = new javax.swing.JButton();
        bntXoa_59 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblthongtin_59 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTim_59 = new javax.swing.JTextField();

        tbNhomMon_59.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhomMon_59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhomMon_59MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhomMon_59);

        bntThem_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntThem_59.setForeground(new java.awt.Color(51, 51, 0));
        bntThem_59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_add.png"))); // NOI18N
        bntThem_59.setText("Thêm");
        bntThem_59.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntThem_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThem_59ActionPerformed(evt);
            }
        });

        bntSua_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntSua_59.setForeground(new java.awt.Color(51, 51, 0));
        bntSua_59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/document_edit.png"))); // NOI18N
        bntSua_59.setText("Sửa");
        bntSua_59.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntSua_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSua_59ActionPerformed(evt);
            }
        });

        bntXoa_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bntXoa_59.setForeground(new java.awt.Color(51, 51, 0));
        bntXoa_59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/file_delete.png"))); // NOI18N
        bntXoa_59.setText("Xóa");
        bntXoa_59.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        bntXoa_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoa_59ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Quản lý Loại món");

        lblthongtin_59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblthongtin_59.setForeground(new java.awt.Color(153, 0, 0));
        lblthongtin_59.setText("Total");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Tổng số loại:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Tìm loại:");

        txtTim_59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTim_59KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntThem_59, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntSua_59, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntXoa_59, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(309, 309, 309)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblthongtin_59)
                        .addGap(18, 281, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTim_59, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTim_59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntThem_59, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntSua_59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntXoa_59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblthongtin_59)))
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbNhomMon_59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhomMon_59MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbNhomMon_59MouseClicked

    private void bntThem_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThem_59ActionPerformed
        DLQl_Them_Loai l = new DLQl_Them_Loai(Run.QlCafe, true);
        l.setVisible(true);
    }//GEN-LAST:event_bntThem_59ActionPerformed

    private void bntSua_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSua_59ActionPerformed
        int select=tbNhomMon_59.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhóm nào !");
        }else{
            String manhom = (String) tbNhomMon_59.getValueAt(select, 0);
            
            DLQl_Sua_Nhom sua = new DLQl_Sua_Nhom(Run.QlCafe, true, manhom);
            sua.setVisible(true);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_bntSua_59ActionPerformed

    private void bntXoa_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoa_59ActionPerformed
        int[] selectedRows = tbNhomMon_59.getSelectedRows();

        if (selectedRows.length <= 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhóm nào !");
        } else {
            ArrayList<String> listmamon = new ArrayList<String>();
            String sp = "";
            for (int i : selectedRows) {
                String ma = (String) tbNhomMon_59.getValueAt(i, 0);
                listmamon.add(ma);
                String tennhom = (String) tbNhomMon_59.getValueAt(i, 1);

                sp += tennhom + "\n";
            }
            int qs;
            qs = JOptionPane.showConfirmDialog(null, "Xóa nhóm: \n " + sp, "Xóa nhóm", JOptionPane.YES_NO_OPTION);
            if (qs == JOptionPane.YES_OPTION) {
                boolean xoa = cn.DeleteNhom(listmamon);

                if (xoa == true) {
                    FillTable();
                    try{
                        Jp_QLThucDon.td.Fillcbb();
                        Jp_QLThucDon.td.FillTable(null);
                        Jp_QLThucDon.td.updateUI();
                        jpThucDon.td.FillLoai();
                        jpThucDon.td.updateUI();
                    }catch(Exception e){

                    }
                }else
                JOptionPane.showMessageDialog(null, "Không xóa được loại !");

            }
        }
    }//GEN-LAST:event_bntXoa_59ActionPerformed

    private void txtTim_59KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTim_59KeyReleased
        ArrayList<Loai> arrTable = cn.SearchLoai(txtTim_59.getText());
        if(arrTable != null){
            DefaultTableModel tbmodel = new DefaultTableModel();

            tbmodel.addColumn("Mã loại");
            tbmodel.addColumn("Tên loại");
            tbmodel.addColumn("Màu sắc");

            int soloai = 0;
            for (Loai l : arrTable) {
                soloai++;
                tbmodel.addRow(new Object[]{l.GetMaLoai(), l.GetTenLoai(),l.GetMauSac()});
            }
            tbNhomMon_59.setModel(tbmodel);
            for(int i = 0; i < tbNhomMon_59.getColumnCount();i++){
                Class<?> col = tbNhomMon_59.getColumnClass(i);
                tbNhomMon_59.setDefaultEditor(col, null);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtTim_59KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSua_59;
    private javax.swing.JButton bntThem_59;
    private javax.swing.JButton bntXoa_59;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblthongtin_59;
    private javax.swing.JTable tbNhomMon_59;
    private javax.swing.JTextField txtTim_59;
    // End of variables declaration//GEN-END:variables
}
