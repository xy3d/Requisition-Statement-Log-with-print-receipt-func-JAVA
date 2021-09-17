package f1;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class print extends javax.swing.JFrame {

            Connection conn = null;
            Statement stmt =  null;
            ResultSet rs = null;
            
    public print() {
        
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
        brand = new javax.swing.JTextField();
        b7 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        model = new javax.swing.JTextField();
        b9 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        b10 = new javax.swing.JLabel();
        brand1 = new javax.swing.JTextField();
        brand2 = new javax.swing.JTextField();
        brand3 = new javax.swing.JTextField();
        brand4 = new javax.swing.JTextField();
        x98 = new javax.swing.JTextField();
        x99 = new javax.swing.JTextField();
        unit = new javax.swing.JTextField();
        remark = new javax.swing.JTextField();
        b11 = new javax.swing.JLabel();
        b12 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        usage = new javax.swing.JTextField();
        b13 = new javax.swing.JLabel();
        dept = new javax.swing.JTextField();
        x6 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        device = new javax.swing.JTextField();
        device1 = new javax.swing.JTextField();
        device2 = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        nox = new javax.swing.JTextField();
        device5 = new javax.swing.JTextField();
        x8 = new javax.swing.JTextField();
        x7 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        x9 = new javax.swing.JTextField();
        x4 = new javax.swing.JTextField();
        itb = new javax.swing.JTextField();
        ito = new javax.swing.JTextField();
        brand7 = new javax.swing.JTextField();
        brand9 = new javax.swing.JTextField();
        brand8 = new javax.swing.JTextField();
        ito1 = new javax.swing.JTextField();
        ito2 = new javax.swing.JTextField();
        ito3 = new javax.swing.JTextField();
        ito4 = new javax.swing.JTextField();
        ito5 = new javax.swing.JTextField();
        ito6 = new javax.swing.JTextField();
        ito7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        print = new javax.swing.JButton();
        back = new javax.swing.JButton();
        no = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        ppanel.setBackground(new java.awt.Color(255, 255, 255));

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

        brand.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        brand.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b7.setText("Item 品牌");
        b7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b8.setText("Model 型号");
        b8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        model.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        model.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        model.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelActionPerformed(evt);
            }
        });

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

        brand1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand1.setText(" OM:");
        brand1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        brand1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand1ActionPerformed(evt);
            }
        });

        brand2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand2.setText(" PM:");
        brand2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand2ActionPerformed(evt);
            }
        });

        brand3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand3.setText(" PAC:");
        brand3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand3ActionPerformed(evt);
            }
        });

        brand4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand4.setText(" IT:");
        brand4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand4ActionPerformed(evt);
            }
        });

        x98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        x98.setText(" IT comment(Bengali):");
        x98.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x98ActionPerformed(evt);
            }
        });

        x99.setEditable(false);
        x99.setBackground(new java.awt.Color(255, 255, 255));
        x99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        x99.setText(" IT comment(Overseas):");
        x99.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x99ActionPerformed(evt);
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
        b12.setText("Price 价钱");
        b12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        price.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });

        usage.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        usage.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usageActionPerformed(evt);
            }
        });

        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        b13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b13.setText(" Duration of usage");
        b13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dept.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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
        x3.setText("Device No:");
        x3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x3ActionPerformed(evt);
            }
        });

        device.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        device.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        device.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        device.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deviceActionPerformed(evt);
            }
        });

        device1.setEditable(false);
        device1.setBackground(new java.awt.Color(255, 255, 255));
        device1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        device1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        device1.setText("No#:");
        device1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        device1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                device1ActionPerformed(evt);
            }
        });

        device2.setEditable(false);
        device2.setBackground(new java.awt.Color(255, 255, 255));
        device2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        device2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        device2.setText("User Name用户名:");
        device2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        device2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                device2ActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
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
        device5.setText("Date:");
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
        x7.setText("Hardware Requisition Form 硬件申请表");
        x7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        x7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x7ActionPerformed(evt);
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

        itb.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        itb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itb.setText("  ");
        itb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itbActionPerformed(evt);
            }
        });

        ito.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito.setText("  ");
        ito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itoActionPerformed(evt);
            }
        });

        brand7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand7.setText(" Department Manager:");
        brand7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand7ActionPerformed(evt);
            }
        });

        brand9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand9.setText(" Applicant:");
        brand9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand9ActionPerformed(evt);
            }
        });

        brand8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brand8.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        brand8.setText(" Department Leader:");
        brand8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brand8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand8ActionPerformed(evt);
            }
        });

        ito1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito1.setText("  ");
        ito1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito1ActionPerformed(evt);
            }
        });

        ito2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito2.setText("  ");
        ito2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito2ActionPerformed(evt);
            }
        });

        ito3.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito3.setText("  ");
        ito3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito3ActionPerformed(evt);
            }
        });

        ito4.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito4.setText("  ");
        ito4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito4ActionPerformed(evt);
            }
        });

        ito5.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito5.setText("  ");
        ito5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito5ActionPerformed(evt);
            }
        });

        ito6.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito6.setText("  ");
        ito6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito6ActionPerformed(evt);
            }
        });

        ito7.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        ito7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ito7.setText("  ");
        ito7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ito7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ito7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                    .addComponent(brand))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(model))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(qty)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unit)
                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(remark, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(usage, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(b13, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addComponent(device)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(device1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(nox, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(x4)
                        .addGap(0, 0, 0)
                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(device2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(x3))
                .addGap(0, 0, 0)
                .addComponent(device5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(x7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(x8)
            .addComponent(x9, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x98, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addComponent(itb))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x99)
                    .addComponent(ito)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ito2)
                    .addComponent(brand1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brand2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(ito3))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ito4)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brand4, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(ito5)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(brand7, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(brand8, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ito1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ito6)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(brand9, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(ito7))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(x9)
                .addGap(0, 0, 0)
                .addComponent(x8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(x7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(device1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(device2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(device5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(x4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(x6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(device, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(b12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(x5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(brand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(unit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(remark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(brand3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand4))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ito2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(ito3)
                    .addComponent(ito4)
                    .addComponent(ito5))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x99)
                    .addComponent(x98, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ito, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(brand8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brand9))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ito1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ito6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ito7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dept, device, device1, device2, nox, user, x3, x6});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {x7, x8});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {itb, ito1, ito2, ito6, ito7});

        javax.swing.GroupLayout ppanelLayout = new javax.swing.GroupLayout(ppanel);
        ppanel.setLayout(ppanelLayout);
        ppanelLayout.setHorizontalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ppanelLayout.setVerticalGroup(
            ppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ppanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(no)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {back, print, search});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(ppanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ppanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(1184, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void x5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x5ActionPerformed

    private void brandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandActionPerformed

    private void modelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void brand1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand1ActionPerformed

    private void brand2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand2ActionPerformed

    private void brand3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand3ActionPerformed

    private void brand4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand4ActionPerformed

    private void x98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x98ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x98ActionPerformed

    private void x99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x99ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x99ActionPerformed

    private void brand7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand7ActionPerformed

    private void brand8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand8ActionPerformed

    private void brand9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand9ActionPerformed

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void remarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarkActionPerformed

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void usageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usageActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void x6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x6ActionPerformed

    private void x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x3ActionPerformed

    private void deviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deviceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deviceActionPerformed

    private void device1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_device1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_device1ActionPerformed

    private void device2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_device2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_device2ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void noxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noxActionPerformed

    private void device5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_device5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_device5ActionPerformed

    private void x8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x8ActionPerformed

    private void x7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x7ActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void x9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x9ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            stmt = conn.createStatement();
            //int NO = Integer.parseInt(no.getText());
            String NO = no.getText();

            String sql = "SELECT * FROM f1 WHERE No = '"+NO+"' ";
            rs = stmt.executeQuery(sql);

            if (rs.next()){

                nox.setText(rs.getString("No"));
                user.setText(rs.getString("User Name"));
                dept.setText(rs.getString("Department"));
                device.setText(rs.getString("Device Number"));
                brand.setText(rs.getString("Brand/Item"));
                model.setText(rs.getString("Model/Configuration"));
                qty.setText(String.format("%s",rs.getInt("qty")));
                unit.setText(rs.getString("Unit"));
                remark.setText(rs.getString("Remarks"));
                price.setText(String.format("%s",rs.getInt("price")));
                usage.setText(rs.getString("Duration of usage"));
                date.setText(rs.getString("Date"));
                itb.setText(rs.getString("ItBD"));
                ito.setText(rs.getString("ItOS"));

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
        home object = new home();
        object.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x4ActionPerformed

    private void itbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itbActionPerformed

    private void itoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itoActionPerformed

    private void ito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito1ActionPerformed

    private void ito2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito2ActionPerformed

    private void ito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito3ActionPerformed

    private void ito4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito4ActionPerformed

    private void ito5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito5ActionPerformed

    private void ito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito6ActionPerformed

    private void ito7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ito7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ito7ActionPerformed

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
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b11;
    private javax.swing.JLabel b12;
    private javax.swing.JLabel b13;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JButton back;
    private javax.swing.JTextField brand;
    private javax.swing.JTextField brand1;
    private javax.swing.JTextField brand2;
    private javax.swing.JTextField brand3;
    private javax.swing.JTextField brand4;
    private javax.swing.JTextField brand7;
    private javax.swing.JTextField brand8;
    private javax.swing.JTextField brand9;
    private javax.swing.JTextField date;
    private javax.swing.JTextField dept;
    private javax.swing.JTextField device;
    private javax.swing.JTextField device1;
    private javax.swing.JTextField device2;
    private javax.swing.JTextField device5;
    private javax.swing.JTextField itb;
    private javax.swing.JTextField ito;
    private javax.swing.JTextField ito1;
    private javax.swing.JTextField ito2;
    private javax.swing.JTextField ito3;
    private javax.swing.JTextField ito4;
    private javax.swing.JTextField ito5;
    private javax.swing.JTextField ito6;
    private javax.swing.JTextField ito7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField model;
    private javax.swing.JTextField no;
    private javax.swing.JTextField nox;
    private javax.swing.JPanel ppanel;
    private javax.swing.JTextField price;
    private javax.swing.JButton print;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField remark;
    private javax.swing.JButton search;
    private javax.swing.JTextField unit;
    private javax.swing.JTextField usage;
    private javax.swing.JTextField user;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField x4;
    private javax.swing.JTextField x5;
    private javax.swing.JTextField x6;
    private javax.swing.JTextField x7;
    private javax.swing.JTextField x8;
    private javax.swing.JTextField x9;
    private javax.swing.JTextField x98;
    private javax.swing.JTextField x99;
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
                
                graphics2D.scale(.51, .6);
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
