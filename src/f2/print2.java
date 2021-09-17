package f2;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class print2 extends javax.swing.JFrame {

            Connection conn = null;
            Statement stmt =  null;
            ResultSet rs = null;
            
    public print2() {
        
        super("Print");
        initComponents();
        conn = DB.dbc.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        b6 = new javax.swing.JLabel();
        x5 = new javax.swing.JTextField();
        item = new javax.swing.JTextField();
        b7 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        b10 = new javax.swing.JLabel();
        brand1 = new javax.swing.JTextField();
        brand2 = new javax.swing.JTextField();
        brand3 = new javax.swing.JTextField();
        brand4 = new javax.swing.JTextField();
        brand5 = new javax.swing.JTextField();
        itc = new javax.swing.JTextField();
        brand8 = new javax.swing.JTextField();
        brand9 = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        remark = new javax.swing.JTextField();
        b11 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        ldate = new javax.swing.JTextField();
        dept = new javax.swing.JTextField();
        x6 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        device1 = new javax.swing.JTextField();
        nox = new javax.swing.JTextField();
        device5 = new javax.swing.JTextField();
        x8 = new javax.swing.JTextField();
        x7 = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        x9 = new javax.swing.JTextField();
        x4 = new javax.swing.JTextField();
        itc1 = new javax.swing.JTextField();
        itc2 = new javax.swing.JTextField();
        brand10 = new javax.swing.JTextField();
        brand11 = new javax.swing.JTextField();
        brand72 = new javax.swing.JTextField();
        brand73 = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        ppr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        print = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        no = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        ppanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b6.setText("SN");
        b6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        x5.setEditable(false);
        x5.setBackground(new java.awt.Color(255, 255, 255));
        x5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        x5.setText("   1");
        x5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x5ActionPerformed(evt);
            }
        });

        item.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        item.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setText("Item 品牌");
        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b9.setText("Qty 数量");
        b9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        qty.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(255, 255, 255));
        b10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b10.setText("Unit 单元");
        b10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        brand1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand1.setText(" OM 協理:");
        brand1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        brand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand1ActionPerformed(evt);
            }
        });

        brand2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand2.setText(" PM 廠務主管:");
        brand2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand2ActionPerformed(evt);
            }
        });

        brand3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand3.setText(" PAC Manager 企劃主管:");
        brand3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand3ActionPerformed(evt);
            }
        });

        brand4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand4.setText(" Dept. Manager 部門主管:");
        brand4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand4ActionPerformed(evt);
            }
        });

        brand5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand5ActionPerformed(evt);
            }
        });

        itc.setEditable(false);
        itc.setBackground(new java.awt.Color(255, 255, 255));
        itc.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itcActionPerformed(evt);
            }
        });

        brand8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        brand8.setText(" Leader 單位主管:");
        brand8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand8ActionPerformed(evt);
            }
        });

        brand9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand9.setText(" Applicant 申請人:");
        brand9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand9ActionPerformed(evt);
            }
        });

        unit.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        unit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });

        remark.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        remark.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        remark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        remark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarkActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b11.setText("Remarks 备注");
        b11.setToolTipText("");
        b11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b12.setText("Last Taken Date 上次領用日期");
        b12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ldate.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ldate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ldate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ldate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldateActionPerformed(evt);
            }
        });

        dept.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dept.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        x6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        x6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x6ActionPerformed(evt);
            }
        });

        x3.setEditable(false);
        x3.setBackground(new java.awt.Color(255, 255, 255));
        x3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x3.setText("Date:");
        x3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        device1.setEditable(false);
        device1.setBackground(new java.awt.Color(255, 255, 255));
        device1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        device1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        device1.setText("SN :");
        device1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        device1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                device1ActionPerformed(evt);
            }
        });

        nox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noxActionPerformed(evt);
            }
        });

        device5.setEditable(false);
        device5.setBackground(new java.awt.Color(255, 255, 255));
        device5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        device5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        device5.setText("Month 申請月份 :");
        device5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        device5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                device5ActionPerformed(evt);
            }
        });

        x8.setEditable(false);
        x8.setBackground(new java.awt.Color(255, 255, 255));
        x8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 16)); // NOI18N
        x8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x8.setText("(BOFH)");
        x8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x8ActionPerformed(evt);
            }
        });

        x7.setEditable(false);
        x7.setBackground(new java.awt.Color(255, 255, 255));
        x7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        x7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x7.setText("Ink/Toner/Ribbon Monthly Application Form/每月碳粉匣申請單");
        x7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x7ActionPerformed(evt);
            }
        });

        month.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        month.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monthMouseClicked(evt);
            }
        });
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        x9.setEditable(false);
        x9.setBackground(new java.awt.Color(255, 255, 255));
        x9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        x9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x9.setText("Bangladesh Pou Hung(孟加拉国蒲洪)");
        x9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x9ActionPerformed(evt);
            }
        });

        x4.setEditable(false);
        x4.setBackground(new java.awt.Color(255, 255, 255));
        x4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        x4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x4.setText("Department 部:");
        x4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x4ActionPerformed(evt);
            }
        });

        itc1.setEditable(false);
        itc1.setBackground(new java.awt.Color(255, 255, 255));
        itc1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itc1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itc1ActionPerformed(evt);
            }
        });

        itc2.setEditable(false);
        itc2.setBackground(new java.awt.Color(255, 255, 255));
        itc2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itc2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itc2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itc2ActionPerformed(evt);
            }
        });

        brand10.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand10ActionPerformed(evt);
            }
        });

        brand11.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand11ActionPerformed(evt);
            }
        });

        brand72.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand72.setText(" Unit price 單價");
        brand72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand72ActionPerformed(evt);
            }
        });

        brand73.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        brand73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand73.setText(" Printing Paper Range 打印纸张范围");
        brand73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand73ActionPerformed(evt);
            }
        });

        up.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        up.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        up.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        ppr.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ppr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ppr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(device1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nox, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(device5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(brand1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(brand2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(brand3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(brand4, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(brand5)
                            .addComponent(brand72, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(up))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ppr)
                                    .addComponent(brand73, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(brand10)
                                    .addComponent(brand8))
                                .addGap(304, 304, 304))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(itc, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(itc2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itc1)
                                    .addComponent(brand9, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                                    .addComponent(brand11)))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(x9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(device1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(device5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ldate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itc, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itc2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itc1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(brand8)
                    .addComponent(brand73)
                    .addComponent(brand9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brand72))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(ppr)
                    .addComponent(brand10)
                    .addComponent(brand11)))
        );

        javax.swing.GroupLayout ppanelLayout = new javax.swing.GroupLayout(ppanel);
        ppanel.setLayout(ppanelLayout);
        ppanelLayout.setHorizontalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ppanelLayout.setVerticalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/src.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/submit.png"))); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man.png"))); // NOI18N
        jButton1.setText("Populate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(84, 84, 84)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, search});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, print, search});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1162, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            stmt = conn.createStatement();
            String NO = no.getText();

            String sql = "SELECT * FROM f2 WHERE No = '"+NO+"' ";
            rs = stmt.executeQuery(sql);

            if (rs.next()){

                nox.setText(rs.getString("No"));
                dept.setText(rs.getString("Department"));
                date.setText(rs.getString("Date"));
                item.setText(rs.getString("Item"));
                qty.setText(String.format("%s",rs.getInt("qty")));
                unit.setText(rs.getString("Unit"));
                remark.setText(rs.getString("Remarks"));
                ldate.setText(rs.getString("LDate"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Not Found!!");
            }

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        printRecord(ppanel);
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        home2 object = new home2();
        object.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x4ActionPerformed

    private void x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x9ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x7ActionPerformed

    private void x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x8ActionPerformed

    private void device5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_device5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_device5ActionPerformed

    private void noxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noxActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x3ActionPerformed

    private void x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x6ActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_deptActionPerformed

    private void ldateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ldateActionPerformed

    private void remarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarkActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void itcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itcActionPerformed

    private void brand5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand5ActionPerformed

    private void brand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand4ActionPerformed

    private void brand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand3ActionPerformed

    private void brand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand2ActionPerformed

    private void brand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand1ActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x5ActionPerformed

    private void device1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_device1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_device1ActionPerformed

    private void brand9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand9ActionPerformed

    private void brand8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand8ActionPerformed

    private void itc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itc1ActionPerformed

    private void itc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itc2ActionPerformed

    private void brand10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand10ActionPerformed

    private void brand11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand11ActionPerformed

    private void brand72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand72ActionPerformed

    private void brand73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand73ActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upActionPerformed

    private void pprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pprActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActionPerformed

    private void monthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_monthMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            stmt = conn.createStatement();

            String ITEM = item.getText();

            String sql = "SELECT * FROM il WHERE Item = '"+ITEM+"' ";
            rs = stmt.executeQuery(sql);

            if (rs.next()){
                
                up.setText(rs.getString("UP"));
                ppr.setText(rs.getString("PPR"));

            }else{
                JOptionPane.showMessageDialog(null, "Not Found!!");
            }

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            LocalDateTime date = LocalDateTime.now();  
            DateTimeFormatter cd = DateTimeFormatter.ofPattern("MMMM");  
            String formattedDate = date.format(cd);

            month.setText(formattedDate);
 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(print2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b9;
    private javax.swing.JButton back;
    private javax.swing.JTextField brand1;
    private javax.swing.JTextField brand10;
    private javax.swing.JTextField brand11;
    private javax.swing.JTextField brand2;
    private javax.swing.JTextField brand3;
    private javax.swing.JTextField brand4;
    private javax.swing.JTextField brand5;
    private javax.swing.JTextField brand72;
    private javax.swing.JTextField brand73;
    private javax.swing.JTextField brand8;
    private javax.swing.JTextField brand9;
    private javax.swing.JTextField date;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField device1;
    private javax.swing.JTextField device5;
    private javax.swing.JTextField itc;
    private javax.swing.JTextField itc1;
    private javax.swing.JTextField itc2;
    private javax.swing.JTextField item;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField ldate;
    private javax.swing.JTextField month;
    private javax.swing.JTextField no;
    private javax.swing.JTextField nox;
    private javax.swing.JPanel ppanel;
    private javax.swing.JTextField ppr;
    private javax.swing.JButton print;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField remark;
    private javax.swing.JButton search;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField up;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField x5;
    private javax.swing.JTextField x6;
    private javax.swing.JTextField x7;
    private javax.swing.JTextField x8;
    private javax.swing.JTextField x9;
    // End of variables declaration//GEN-END:variables

private void printRecord(JPanel panel) {
PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setJobName("Print");
        printerJob.setPrintable(new Printable(){
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if(pageIndex > 0){
                return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D graphics2D = (Graphics2D)graphics;
                graphics2D.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                
                graphics2D.scale(.51, .65);
                panel.paint(graphics2D);
                return Printable.PAGE_EXISTS;
              
            }
        });
        boolean returningResult = printerJob.printDialog();
        if(returningResult){
            try{
                printerJob.print();

            }catch(PrinterException printerException ){
                
                JOptionPane.showMessageDialog(this, "Print Error" + printerException.getMessage());
            }
        }
    }
}
