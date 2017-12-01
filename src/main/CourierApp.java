/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.CostDAO;
import dao.DeliveryCostLib;
import dao.ResiNoGenerator;
import entity.DeliveryCost;
import entity.DeliveryPackage;
import entity.Dimention;
import entity.Receiver;
import entity.Report;
import entity.Sender;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class CourierApp extends javax.swing.JFrame {

    private Sender sender;
    private Receiver receiver;
    private DeliveryPackage packages;
    private Dimention dimensi;
    private CostDAO costDAO;
    private Report report;

    /**
     * Creates new form CourierApp
     */
    public CourierApp() {
        initComponents();
        setSenderFieldEnabled(false);
        setReceiverFieldEnabled(false);
        setCostFieldVisible(false);
        setResiFieldVisible(false);
        BTNRefresh.setEnabled(false);
        BTNCancel.setEnabled(false);
        BTNSave.setEnabled(false);
        BTNPrint.setEnabled(false);
        packagePanels.setVisible(false);
        dateNowLabel.setText(getDateNow());
        setPackagePaymentVisible(false);
        packed();

    }

    public void packed() {
        this.pack();
    }

    public void setSenderFieldEnabled(Boolean en) {
        senderNameTextField.setEnabled(en);
        senderAddressTextArea.setEnabled(en);
        senderCityTextField.setEnabled(en);
        senderPhoneTextField.setEnabled(en);
        senderPosCodeTextField.setEnabled(en);
        senderProvinceTextField.setEnabled(en);
    }

    public void setReceiverFieldEnabled(Boolean en) {
        recieverNameTextField.setEnabled(en);
        recieverAddressTextArea.setEnabled(en);
        recieverCityTextField.setEnabled(en);
        recieverPhoneTextField.setEnabled(en);
        recieverPosCodeTextField.setEnabled(en);
        receiverProvinceTextField.setEnabled(en);
    }

    public void setCostFieldVisible(Boolean vis) {
        BTNcheckout.setVisible(vis);
        totalCostLLabel.setVisible(vis);
        totalCostTXTField.setVisible(vis);
    }

    public void setCostFieldEnabled(Boolean en) {
        BTNcheckout.setEnabled(en);
        totalCostLLabel.setEnabled(en);
        totalCostTXTField.setEnabled(en);
    }

    public void setResiFieldVisible(Boolean vis) {
        noResiTXTField.setVisible(vis);
        noResiLabel.setVisible(vis);
    }

    public void setSenderFieldRefresh() {
        senderNameTextField.setText("");
        senderAddressTextArea.setText("");
        senderCityTextField.setText("");
        senderPhoneTextField.setText("");
        senderPosCodeTextField.setText("");
        senderProvinceTextField.setText("");
    }

    public void setReceiverFieldRefresh() {
        recieverNameTextField.setText("");
        recieverAddressTextArea.setText("");
        recieverCityTextField.setText("");
        recieverPhoneTextField.setText("");
        recieverPosCodeTextField.setText("");
        receiverProvinceTextField.setText("");
    }

    public void setPackageFieldRefresh() {
        packageHeightTXTField.setText("");
        packageLengthTXTField.setText("");
        packagePriceTXTField.setText("");
        packageTypeTXTField.setText("");
        packageWeightTxtField.setText("");
        packageWidthTXTField.setText("");
        packageDestinationCombo.setSelectedIndex(0);
        packageInsuranceNoRadio.setSelected(true);
        packageInsuranceYesRadio.setSelected(false);
        packageTypeCombo.setSelectedIndex(0);
        packageSvcEcoRadio.setSelected(false);
        packageSvcHdsRadio.setSelected(false);
        packageSvcOnsRadio.setSelected(false);
        packageSvcRegRadio.setSelected(false);
        packageSvcSdsRadio.setSelected(false);
    }

    public void setPackagePriceVisible(Boolean vis) {
        packagePriceTXTField.setVisible(vis);
        packagePriceLabel.setVisible(vis);
    }

    public void setPackagePaymentVisible(Boolean vis) {
        packagePaymentCashRadio.setVisible(vis);
        packagePaymentCreditRadio.setVisible(vis);
        packagePaymentDebitRadio.setVisible(vis);
        packagePaymentLabel.setVisible(vis);
        packagePaymentCreditDebitTXTField.setVisible(vis);
    }

    public void setPackagePaymentEnabled(Boolean en) {
        packagePaymentCashRadio.setEnabled(en);
        packagePaymentCreditRadio.setEnabled(en);
        packagePaymentDebitRadio.setEnabled(en);
        packagePaymentLabel.setEnabled(en);
        packagePaymentCreditDebitTXTField.setEnabled(en);
    }

    public void setPackageFieldEnabled(Boolean en) {
        packageDestinationCombo.setEnabled(en);
        packageHeightTXTField.setEnabled(en);
        packageInsuranceNoRadio.setEnabled(en);
        packageInsuranceYesRadio.setEnabled(en);
        packageLengthTXTField.setEnabled(en);
        packagePriceTXTField.setEnabled(en);
        packageSvcEcoRadio.setEnabled(en);
        packageSvcHdsRadio.setEnabled(en);
        packageSvcOnsRadio.setEnabled(en);
        packageSvcRegRadio.setEnabled(en);
        packageSvcSdsRadio.setEnabled(en);
        packageTypeCombo.setEnabled(en);
        packageTypeTXTField.setEnabled(en);
        packageWeightTxtField.setEnabled(en);
        packageWidthTXTField.setEnabled(en);
    }

    public String getDateNow() {
        String date = "";
        Date datenow = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM, dd yyyy");
        date += sdf.format(datenow);
        return date;
    }

    public String chageFormatMoney(Double m) {
        String format = String.format("%,.2f", m);
        return format;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asuransiButtonGroup = new javax.swing.ButtonGroup();
        layananButtonGroup = new javax.swing.ButtonGroup();
        paymentButtonGroup = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        senderPanels = new javax.swing.JPanel();
        senderNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senderCityTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        senderProvinceTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        senderPosCodeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        senderAddressTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        senderPhoneTextField = new javax.swing.JTextField();
        receiverPanels = new javax.swing.JPanel();
        recieverNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recieverAddressTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        recieverCityTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        receiverProvinceTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        recieverPosCodeTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        recieverPhoneTextField = new javax.swing.JTextField();
        BTNNew = new javax.swing.JButton();
        packagePanels = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        packageTypeCombo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        packageWeightTxtField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        packageInsuranceYesRadio = new javax.swing.JRadioButton();
        packageInsuranceNoRadio = new javax.swing.JRadioButton();
        packagePriceLabel = new javax.swing.JLabel();
        packagePriceTXTField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        packageWidthTXTField = new javax.swing.JTextField();
        packageLengthTXTField = new javax.swing.JTextField();
        packageHeightTXTField = new javax.swing.JTextField();
        packageSvcRegRadio = new javax.swing.JRadioButton();
        packageSvcEcoRadio = new javax.swing.JRadioButton();
        packageSvcOnsRadio = new javax.swing.JRadioButton();
        packageSvcHdsRadio = new javax.swing.JRadioButton();
        packageSvcSdsRadio = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        packageTypeTXTField = new javax.swing.JTextField();
        packageDestinationCombo = new javax.swing.JComboBox<>();
        BTNCalculate = new javax.swing.JButton();
        noResiTXTField = new javax.swing.JTextField();
        noResiLabel = new javax.swing.JLabel();
        BTNCancel = new javax.swing.JButton();
        BTNRefresh = new javax.swing.JButton();
        dateNowLabel = new javax.swing.JLabel();
        totalCostTXTField = new javax.swing.JTextField();
        totalCostLLabel = new javax.swing.JLabel();
        BTNcheckout = new javax.swing.JButton();
        BTNSave = new javax.swing.JButton();
        BTNPrint = new javax.swing.JButton();
        BTNMasterData = new javax.swing.JButton();
        BTNInfo = new javax.swing.JButton();
        packagePaymentCashRadio = new javax.swing.JRadioButton();
        packagePaymentDebitRadio = new javax.swing.JRadioButton();
        packagePaymentCreditRadio = new javax.swing.JRadioButton();
        packagePaymentCreditDebitTXTField = new javax.swing.JTextField();
        packagePaymentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Courier Application");
        setResizable(false);

        senderPanels.setBorder(javax.swing.BorderFactory.createTitledBorder("Sender's Details"));

        senderNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderNameTextFieldFocusLost(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("City");

        senderCityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderCityTextFieldFocusLost(evt);
            }
        });

        jLabel5.setText("Province");

        senderProvinceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderProvinceTextFieldFocusLost(evt);
            }
        });

        jLabel6.setText("Pos Code");

        senderPosCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderPosCodeTextFieldFocusLost(evt);
            }
        });

        senderAddressTextArea.setColumns(20);
        senderAddressTextArea.setRows(5);
        senderAddressTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderAddressTextAreaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(senderAddressTextArea);

        jLabel7.setText("Phone");

        senderPhoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                senderPhoneTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout senderPanelsLayout = new javax.swing.GroupLayout(senderPanels);
        senderPanels.setLayout(senderPanelsLayout);
        senderPanelsLayout.setHorizontalGroup(
            senderPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senderPanelsLayout.createSequentialGroup()
                .addGroup(senderPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(senderPanelsLayout.createSequentialGroup()
                .addGroup(senderPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(senderCityTextField)
                    .addComponent(senderProvinceTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senderPosCodeTextField)
                    .addGroup(senderPanelsLayout.createSequentialGroup()
                        .addGroup(senderPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senderPhoneTextField)
                    .addComponent(senderNameTextField))
                .addContainerGap())
        );
        senderPanelsLayout.setVerticalGroup(
            senderPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(senderPanelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(senderNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senderCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senderProvinceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senderPosCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senderPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(senderPanels);

        receiverPanels.setBorder(javax.swing.BorderFactory.createTitledBorder("Receiver's Details"));

        recieverNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recieverNameTextFieldFocusLost(evt);
            }
        });

        jLabel8.setText("Address");

        jLabel9.setText("Name");

        recieverAddressTextArea.setColumns(20);
        recieverAddressTextArea.setRows(5);
        recieverAddressTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recieverAddressTextAreaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(recieverAddressTextArea);

        jLabel10.setText("City");

        recieverCityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recieverCityTextFieldFocusLost(evt);
            }
        });

        jLabel11.setText("Province");

        receiverProvinceTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                receiverProvinceTextFieldFocusLost(evt);
            }
        });

        jLabel12.setText("Pos Code");

        recieverPosCodeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recieverPosCodeTextFieldFocusLost(evt);
            }
        });

        jLabel13.setText("Phone");

        recieverPhoneTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recieverPhoneTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout receiverPanelsLayout = new javax.swing.GroupLayout(receiverPanels);
        receiverPanels.setLayout(receiverPanelsLayout);
        receiverPanelsLayout.setHorizontalGroup(
            receiverPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiverPanelsLayout.createSequentialGroup()
                .addGroup(receiverPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(recieverNameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addGap(12, 12, 12))
            .addGroup(receiverPanelsLayout.createSequentialGroup()
                .addGroup(receiverPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recieverCityTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(receiverProvinceTextField)
                    .addComponent(recieverPosCodeTextField)
                    .addGroup(receiverPanelsLayout.createSequentialGroup()
                        .addGroup(receiverPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(recieverPhoneTextField))
                .addContainerGap())
        );
        receiverPanelsLayout.setVerticalGroup(
            receiverPanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(receiverPanelsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recieverNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recieverCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(receiverProvinceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recieverPosCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recieverPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(receiverPanels);

        BTNNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/add_icon.png"))); // NOI18N
        BTNNew.setToolTipText("Add New Delivery");
        BTNNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNNewActionPerformed(evt);
            }
        });

        packagePanels.setBorder(javax.swing.BorderFactory.createTitledBorder("Package's Details"));

        jLabel16.setText("Destination");

        jLabel17.setText("Type");

        packageTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Document", "Electronic", "Food", "Lainnya" }));
        packageTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageTypeComboActionPerformed(evt);
            }
        });

        jLabel18.setText("Weight");

        packageWeightTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageWeightTxtFieldFocusLost(evt);
            }
        });

        jLabel19.setText("Service");

        jLabel20.setText("Insurance");

        asuransiButtonGroup.add(packageInsuranceYesRadio);
        packageInsuranceYesRadio.setText("Ya");
        packageInsuranceYesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageInsuranceYesRadioActionPerformed(evt);
            }
        });

        asuransiButtonGroup.add(packageInsuranceNoRadio);
        packageInsuranceNoRadio.setText("Tidak");
        packageInsuranceNoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageInsuranceNoRadioActionPerformed(evt);
            }
        });

        packagePriceLabel.setText("Price");

        packagePriceTXTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packagePriceTXTFieldFocusLost(evt);
            }
        });

        jLabel22.setText("Dimention");

        packageWidthTXTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageWidthTXTFieldFocusLost(evt);
            }
        });

        packageLengthTXTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageLengthTXTFieldFocusLost(evt);
            }
        });

        packageHeightTXTField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageHeightTXTFieldFocusLost(evt);
            }
        });

        layananButtonGroup.add(packageSvcRegRadio);
        packageSvcRegRadio.setText("Reguler");
        packageSvcRegRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSvcRegRadioActionPerformed(evt);
            }
        });

        layananButtonGroup.add(packageSvcEcoRadio);
        packageSvcEcoRadio.setText("Economy");
        packageSvcEcoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSvcEcoRadioActionPerformed(evt);
            }
        });

        layananButtonGroup.add(packageSvcOnsRadio);
        packageSvcOnsRadio.setText("ONS");
        packageSvcOnsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSvcOnsRadioActionPerformed(evt);
            }
        });

        layananButtonGroup.add(packageSvcHdsRadio);
        packageSvcHdsRadio.setText("HDS");
        packageSvcHdsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSvcHdsRadioActionPerformed(evt);
            }
        });

        layananButtonGroup.add(packageSvcSdsRadio);
        packageSvcSdsRadio.setText("SDS");
        packageSvcSdsRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSvcSdsRadioActionPerformed(evt);
            }
        });

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("W");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("L");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("H");

        jLabel28.setText("X");

        jLabel29.setText("X");

        jLabel30.setText("CM");

        packageDestinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung", "Semarang", "Surabaya", "Timika", "Malang", "Tanggerang", "Tasikmalaya", "Yogyakarta", "Medan" }));
        packageDestinationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageDestinationComboActionPerformed(evt);
            }
        });

        BTNCalculate.setText("Calculate");
        BTNCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout packagePanelsLayout = new javax.swing.GroupLayout(packagePanels);
        packagePanels.setLayout(packagePanelsLayout);
        packagePanelsLayout.setHorizontalGroup(
            packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagePanelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(packagePanelsLayout.createSequentialGroup()
                        .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(13, 13, 13)
                        .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packageWeightTxtField)
                            .addComponent(packageTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(packagePanelsLayout.createSequentialGroup()
                                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(packageWidthTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel28)
                                .addGap(7, 7, 7)
                                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(packageLengthTXTField)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel29)
                                .addGap(4, 4, 4)
                                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(packageHeightTXTField)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(packageTypeTXTField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, packagePanelsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNCalculate))
                    .addGroup(packagePanelsLayout.createSequentialGroup()
                        .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(packagePriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packagePriceTXTField)
                            .addComponent(packageDestinationCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(packagePanelsLayout.createSequentialGroup()
                                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packageSvcOnsRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(packageSvcSdsRadio)
                                    .addComponent(packageInsuranceYesRadio)
                                    .addComponent(packageSvcRegRadio))
                                .addGap(26, 26, 26)
                                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(packageSvcEcoRadio)
                                    .addComponent(packageInsuranceNoRadio)
                                    .addComponent(packageSvcHdsRadio))
                                .addGap(0, 37, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        packagePanelsLayout.setVerticalGroup(
            packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagePanelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageWidthTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageLengthTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packageHeightTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packageTypeTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(packageDestinationCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageSvcRegRadio)
                    .addComponent(packageSvcEcoRadio)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageSvcOnsRadio)
                    .addComponent(packageSvcHdsRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(packageSvcSdsRadio)
                .addGap(18, 18, 18)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageInsuranceYesRadio)
                    .addComponent(packageInsuranceNoRadio)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(packagePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packagePriceTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(packagePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNCalculate))
        );

        noResiTXTField.setEditable(false);
        noResiTXTField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        noResiLabel.setText("No. Resi");

        BTNCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/Cancel-256.png"))); // NOI18N
        BTNCancel.setToolTipText("Cancel");
        BTNCancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelActionPerformed(evt);
            }
        });

        BTNRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/refresh_icon.png"))); // NOI18N
        BTNRefresh.setToolTipText("Refresh");
        BTNRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRefreshActionPerformed(evt);
            }
        });

        dateNowLabel.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        totalCostTXTField.setEditable(false);

        totalCostLLabel.setText("Cost");

        BTNcheckout.setText("Checkout");
        BTNcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcheckoutActionPerformed(evt);
            }
        });

        BTNSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/save.png"))); // NOI18N
        BTNSave.setToolTipText("Save");
        BTNSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTNSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSaveActionPerformed(evt);
            }
        });

        BTNPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/print.png"))); // NOI18N
        BTNPrint.setToolTipText("Print Transaction");
        BTNPrint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTNMasterData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/list.png"))); // NOI18N
        BTNMasterData.setToolTipText("Master Data");
        BTNMasterData.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BTNInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/info.png"))); // NOI18N
        BTNInfo.setToolTipText("About and Help");
        BTNInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        paymentButtonGroup.add(packagePaymentCashRadio);
        packagePaymentCashRadio.setText("Cash");
        packagePaymentCashRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagePaymentCashRadioActionPerformed(evt);
            }
        });

        paymentButtonGroup.add(packagePaymentDebitRadio);
        packagePaymentDebitRadio.setText("Debit");
        packagePaymentDebitRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagePaymentDebitRadioActionPerformed(evt);
            }
        });

        paymentButtonGroup.add(packagePaymentCreditRadio);
        packagePaymentCreditRadio.setText("Credit Card");
        packagePaymentCreditRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packagePaymentCreditRadioActionPerformed(evt);
            }
        });

        packagePaymentCreditDebitTXTField.setToolTipText("Amount or Credit No. or Debit No");

        packagePaymentLabel.setText("Payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNMasterData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateNowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(noResiLabel))
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(packagePaymentLabel)
                        .addGap(6, 6, 6)
                        .addComponent(packagePaymentCashRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packagePaymentDebitRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packagePaymentCreditRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packagePaymentCreditDebitTXTField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNcheckout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalCostLLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packagePanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noResiTXTField)
                    .addComponent(totalCostTXTField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTNNew)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(noResiTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(noResiLabel))
                            .addComponent(BTNRefresh)
                            .addComponent(BTNCancel))
                        .addComponent(BTNSave, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(BTNPrint)
                    .addComponent(BTNMasterData)
                    .addComponent(BTNInfo)
                    .addComponent(dateNowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPane1)
                    .addComponent(packagePanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalCostTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(totalCostLLabel)
                        .addComponent(BTNcheckout))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(packagePaymentCashRadio)
                        .addComponent(packagePaymentDebitRadio)
                        .addComponent(packagePaymentCreditRadio)
                        .addComponent(packagePaymentCreditDebitTXTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(packagePaymentLabel)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNNewActionPerformed
        // TODO add your handling code here:
        setSenderFieldEnabled(true);
        setReceiverFieldEnabled(true);
        packagePanels.setVisible(true);
        setResiFieldVisible(true);
        setCostFieldVisible(false);
        BTNNew.setEnabled(false);
        BTNRefresh.setEnabled(true);
        BTNCancel.setEnabled(true);
        packageTypeTXTField.setVisible(false);
        noResiTXTField.setText(ResiNoGenerator.generateResiNumber());
        setPackagePriceVisible(false);
        setPackagePaymentVisible(false);
        packed();
        sender = new Sender();
        receiver = new Receiver();
        packages = new DeliveryPackage();
        dimensi = new Dimention();
        costDAO = new CostDAO();
        report = new Report();
        packages.setPackageCode(noResiTXTField.getText());
        packages.setSentDate(new Date());
    }//GEN-LAST:event_BTNNewActionPerformed

    private void packagePriceTXTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packagePriceTXTFieldFocusLost
        // TODO add your handling code here:
        try {
            //          if (!packagePriceTXTField.getText().equalsIgnoreCase("")) {
//                packagePriceTXTField.setText(chageFormatMoney(Double.parseDouble(packagePriceTXTField.getText())));
//                packages.setPackagePrice(Double.parseDouble(packagePriceTXTField.getText()));
//                packages.setPackagePrice(Double.parseDouble(packagePriceTXTField.getText()));
            //         }
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(rootPane, "Only number that allowed");
            packagePriceTXTField.setText("");
            packagePriceTXTField.requestFocus();
        }
    }//GEN-LAST:event_packagePriceTXTFieldFocusLost

    private void packageTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageTypeComboActionPerformed
        // TODO add your handling code here:
        if (packageTypeCombo.getSelectedItem().equals("Lainnya")) {
            packageTypeTXTField.setVisible(true);
            packed();
            packages.setPackageType(packageTypeTXTField.getText());
        } else {
            packageTypeTXTField.setVisible(false);
            packed();
            packages.setPackageType(packageTypeCombo.getSelectedItem().toString());
        }
    }//GEN-LAST:event_packageTypeComboActionPerformed

    private void packageInsuranceYesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageInsuranceYesRadioActionPerformed
        // TODO add your handling code here:
        if (packageInsuranceYesRadio.isSelected()) {
            setPackagePriceVisible(true);
            packages.setInsurance(true);
        }
    }//GEN-LAST:event_packageInsuranceYesRadioActionPerformed

    private void packageInsuranceNoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageInsuranceNoRadioActionPerformed
        // TODO add your handling code here:
        if (packageInsuranceNoRadio.isSelected()) {
            setPackagePriceVisible(false);
            packages.setInsurance(false);
        }
    }//GEN-LAST:event_packageInsuranceNoRadioActionPerformed

    private void BTNRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRefreshActionPerformed
        // TODO add your handling code here:
        setSenderFieldRefresh();
        setReceiverFieldRefresh();
        setPackageFieldRefresh();
        setPackagePriceVisible(false);
        packageTypeTXTField.setVisible(false);
        packed();
    }//GEN-LAST:event_BTNRefreshActionPerformed

    private void packageWidthTXTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageWidthTXTFieldFocusLost
        // TODO add your handling code here:
        try {
            Double width = Double.parseDouble(packageWidthTXTField.getText());
            dimensi.setWidth(width);
            packageLengthTXTField.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Only number that allowed");
            packageWidthTXTField.setText("");
            packageWidthTXTField.requestFocus();
        }
    }//GEN-LAST:event_packageWidthTXTFieldFocusLost

    private void packageLengthTXTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageLengthTXTFieldFocusLost
        // TODO add your handling code here:
        try {
            Double length = Double.parseDouble(packageLengthTXTField.getText());
            dimensi.setLength(length);
            packageHeightTXTField.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Only number that allowed");
            packageLengthTXTField.setText("");
            packageLengthTXTField.requestFocus();
        }
    }//GEN-LAST:event_packageLengthTXTFieldFocusLost

    private void packageHeightTXTFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageHeightTXTFieldFocusLost
        // TODO add your handling code here:
        try {
            Double height = Double.parseDouble(packageHeightTXTField.getText());
            dimensi.setHeight(height);
            packageWeightTxtField.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Only number that allowed");
            packageHeightTXTField.setText("");
            packageHeightTXTField.requestFocus();
        }
    }//GEN-LAST:event_packageHeightTXTFieldFocusLost

    private void packageWeightTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageWeightTxtFieldFocusLost
        // TODO add your handling code here:
        try {
            Double weight = Double.parseDouble(packageWeightTxtField.getText());
            packages.setDimention(dimensi);
            packages.setPackageWeight(weight);
            packageTypeCombo.requestFocus();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Only number that allowed");
            packageWeightTxtField.setText("");
            packageWeightTxtField.requestFocus();
        }
    }//GEN-LAST:event_packageWeightTxtFieldFocusLost

    private void packageDestinationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageDestinationComboActionPerformed
        // TODO add your handling code here:
        try {
            packages.setDestination(packageDestinationCombo.getSelectedItem().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_packageDestinationComboActionPerformed

    private void packageSvcRegRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSvcRegRadioActionPerformed
        // TODO add your handling code here:
        if (packageSvcRegRadio.isSelected()) {
            packages.setDeliveryService("regular");
        }
    }//GEN-LAST:event_packageSvcRegRadioActionPerformed

    private void packageSvcEcoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSvcEcoRadioActionPerformed
        // TODO add your handling code here:
        if (packageSvcEcoRadio.isSelected()) {
            packages.setDeliveryService("economy");
        }
    }//GEN-LAST:event_packageSvcEcoRadioActionPerformed

    private void packageSvcOnsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSvcOnsRadioActionPerformed
        // TODO add your handling code here:
        if (packageSvcOnsRadio.isSelected()) {
            packages.setDeliveryService("ons");
        }
    }//GEN-LAST:event_packageSvcOnsRadioActionPerformed

    private void packageSvcHdsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSvcHdsRadioActionPerformed
        // TODO add your handling code here:
        if (packageSvcHdsRadio.isSelected()) {
            packages.setDeliveryService("hds");
        }
    }//GEN-LAST:event_packageSvcHdsRadioActionPerformed

    private void packageSvcSdsRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSvcSdsRadioActionPerformed
        // TODO add your handling code here:
        if (packageSvcSdsRadio.isSelected()) {
            packages.setDeliveryService("sds");
        }
    }//GEN-LAST:event_packageSvcSdsRadioActionPerformed

    private void BTNcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcheckoutActionPerformed
        // TODO add your handling code here:
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogChoice = JOptionPane.showConfirmDialog(this, "Are you sure to proceed?", "Warning", dialogButton);
            if (dialogChoice == 0) {
                setPackageFieldEnabled(false);
                setSenderFieldEnabled(false);
                setReceiverFieldEnabled(false);
                setPackagePaymentEnabled(false);
                setCostFieldEnabled(false);
                BTNSave.setEnabled(true);
                BTNPrint.setEnabled(true);
                BTNRefresh.setEnabled(false);
                packed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNcheckoutActionPerformed

    private void BTNCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCalculateActionPerformed
        // TODO add your handling code here:
        try {
            if (packageInsuranceNoRadio.isSelected()) {
                packages.setPackagePrice(0.0);
            } else {
                packages.setPackagePrice(Double.parseDouble(packagePriceTXTField.getText()));
            }
            Double totalCost = costDAO.calculateCost(packages);
            System.out.println("Total Cost: " + totalCost);
            totalCostTXTField.setText("" + totalCost);
            setCostFieldVisible(true);
            setPackagePaymentVisible(true);
            packed();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Please fill all field");
            e.printStackTrace();
        }
    }//GEN-LAST:event_BTNCalculateActionPerformed

    private void packagePaymentCashRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagePaymentCashRadioActionPerformed
        // TODO add your handling code here:
        if (packagePaymentCashRadio.isSelected()) {
            report.setPayment("Cash");
        }
    }//GEN-LAST:event_packagePaymentCashRadioActionPerformed

    private void packagePaymentDebitRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagePaymentDebitRadioActionPerformed
        // TODO add your handling code here:
        if (packagePaymentDebitRadio.isSelected()) {
            report.setPayment("debit");
        }
    }//GEN-LAST:event_packagePaymentDebitRadioActionPerformed

    private void packagePaymentCreditRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packagePaymentCreditRadioActionPerformed
        // TODO add your handling code here:
        if (packagePaymentCreditRadio.isSelected()) {
            report.setPayment("credit");
        }
    }//GEN-LAST:event_packagePaymentCreditRadioActionPerformed

    private void BTNCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelActionPerformed
        // TODO add your handling code here:
        if (!BTNcheckout.isEnabled()) {
            setPackageFieldEnabled(true);
            setSenderFieldEnabled(true);
            setReceiverFieldEnabled(true);
            setPackagePaymentEnabled(true);
            setCostFieldEnabled(true);
            BTNSave.setEnabled(false);
            BTNPrint.setEnabled(false);
            BTNRefresh.setEnabled(false);
            packed();
        } else {
            setSenderFieldEnabled(false);
            setReceiverFieldEnabled(false);
            setCostFieldVisible(false);
            setResiFieldVisible(false);
            BTNRefresh.setEnabled(false);
            BTNCancel.setEnabled(false);
            BTNSave.setEnabled(false);
            BTNPrint.setEnabled(false);
            BTNNew.setEnabled(true);
            packagePanels.setVisible(false);
            dateNowLabel.setText(getDateNow());
            setPackagePaymentVisible(false);
            packed();
        }
    }//GEN-LAST:event_BTNCancelActionPerformed

    private void senderNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderNameTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (senderNameTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderNameTextField.requestFocus();
            }
            sender.setSenderName(senderNameTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderNameTextFieldFocusLost

    private void senderAddressTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderAddressTextAreaFocusLost
        // TODO add your handling code here:
        try {
            if (senderAddressTextArea.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderAddressTextArea.requestFocus();
            }
            sender.setAddress(senderAddressTextArea.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderAddressTextAreaFocusLost

    private void senderCityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderCityTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (senderCityTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderCityTextField.requestFocus();
            }
            sender.setCity(senderCityTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderCityTextFieldFocusLost

    private void senderProvinceTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderProvinceTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (senderProvinceTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderProvinceTextField.requestFocus();
            }
            sender.setProvince(senderProvinceTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderProvinceTextFieldFocusLost

    private void senderPosCodeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderPosCodeTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (senderPosCodeTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderPosCodeTextField.requestFocus();
            }
            sender.setPosCode(senderPosCodeTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderPosCodeTextFieldFocusLost

    private void senderPhoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senderPhoneTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (senderPhoneTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                senderPhoneTextField.requestFocus();
            }
            sender.setPhone(senderPhoneTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_senderPhoneTextFieldFocusLost

    private void recieverNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recieverNameTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (recieverNameTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                recieverNameTextField.requestFocus();
            }
            receiver.setSenderName(recieverNameTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recieverNameTextFieldFocusLost

    private void recieverAddressTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recieverAddressTextAreaFocusLost
        // TODO add your handling code here:
        try {
            if (recieverAddressTextArea.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                recieverAddressTextArea.requestFocus();
            }
            receiver.setAddress(recieverAddressTextArea.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recieverAddressTextAreaFocusLost

    private void recieverCityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recieverCityTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (recieverCityTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                recieverCityTextField.requestFocus();
            }
            receiver.setCity(recieverCityTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recieverCityTextFieldFocusLost

    private void receiverProvinceTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_receiverProvinceTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (receiverProvinceTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                receiverProvinceTextField.requestFocus();
            }
            receiver.setProvince(receiverProvinceTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_receiverProvinceTextFieldFocusLost

    private void recieverPosCodeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recieverPosCodeTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (recieverPosCodeTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                recieverPosCodeTextField.requestFocus();
            }
            receiver.setPosCode(recieverPosCodeTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recieverPosCodeTextFieldFocusLost

    private void recieverPhoneTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recieverPhoneTextFieldFocusLost
        // TODO add your handling code here:
        try {
            if (recieverPhoneTextField.getText().trim().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(rootPane, "Please fill the field");
                recieverPhoneTextField.requestFocus();
            }
            receiver.setPhone(recieverPhoneTextField.getText().trim());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_recieverPhoneTextFieldFocusLost

    private void BTNSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSaveActionPerformed
        // TODO add your handling code here:
        report.setAmountPaymentOrCreditDebitNumber(packagePaymentCreditDebitTXTField.getText().trim());
        report.setCost(Double.parseDouble(totalCostTXTField.getText().trim()));
        report.setPackages(packages);
        report.setSender(sender);
        report.setReceiver(receiver);
//        report.set
    }//GEN-LAST:event_BTNSaveActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourierApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourierApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCalculate;
    private javax.swing.JButton BTNCancel;
    private javax.swing.JButton BTNInfo;
    private javax.swing.JButton BTNMasterData;
    private javax.swing.JButton BTNNew;
    private javax.swing.JButton BTNPrint;
    private javax.swing.JButton BTNRefresh;
    private javax.swing.JButton BTNSave;
    private javax.swing.JButton BTNcheckout;
    private javax.swing.ButtonGroup asuransiButtonGroup;
    private javax.swing.JLabel dateNowLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.ButtonGroup layananButtonGroup;
    private javax.swing.JLabel noResiLabel;
    private javax.swing.JTextField noResiTXTField;
    private javax.swing.JComboBox<String> packageDestinationCombo;
    private javax.swing.JTextField packageHeightTXTField;
    private javax.swing.JRadioButton packageInsuranceNoRadio;
    private javax.swing.JRadioButton packageInsuranceYesRadio;
    private javax.swing.JTextField packageLengthTXTField;
    private javax.swing.JPanel packagePanels;
    private javax.swing.JRadioButton packagePaymentCashRadio;
    private javax.swing.JTextField packagePaymentCreditDebitTXTField;
    private javax.swing.JRadioButton packagePaymentCreditRadio;
    private javax.swing.JRadioButton packagePaymentDebitRadio;
    private javax.swing.JLabel packagePaymentLabel;
    private javax.swing.JLabel packagePriceLabel;
    private javax.swing.JTextField packagePriceTXTField;
    private javax.swing.JRadioButton packageSvcEcoRadio;
    private javax.swing.JRadioButton packageSvcHdsRadio;
    private javax.swing.JRadioButton packageSvcOnsRadio;
    private javax.swing.JRadioButton packageSvcRegRadio;
    private javax.swing.JRadioButton packageSvcSdsRadio;
    private javax.swing.JComboBox<String> packageTypeCombo;
    private javax.swing.JTextField packageTypeTXTField;
    private javax.swing.JTextField packageWeightTxtField;
    private javax.swing.JTextField packageWidthTXTField;
    private javax.swing.ButtonGroup paymentButtonGroup;
    private javax.swing.JPanel receiverPanels;
    private javax.swing.JTextField receiverProvinceTextField;
    private javax.swing.JTextArea recieverAddressTextArea;
    private javax.swing.JTextField recieverCityTextField;
    private javax.swing.JTextField recieverNameTextField;
    private javax.swing.JTextField recieverPhoneTextField;
    private javax.swing.JTextField recieverPosCodeTextField;
    private javax.swing.JTextArea senderAddressTextArea;
    private javax.swing.JTextField senderCityTextField;
    private javax.swing.JTextField senderNameTextField;
    private javax.swing.JPanel senderPanels;
    private javax.swing.JTextField senderPhoneTextField;
    private javax.swing.JTextField senderPosCodeTextField;
    private javax.swing.JTextField senderProvinceTextField;
    private javax.swing.JLabel totalCostLLabel;
    private javax.swing.JTextField totalCostTXTField;
    // End of variables declaration//GEN-END:variables
}
