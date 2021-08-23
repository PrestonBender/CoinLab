package per.preston.coins;

import javax.swing.UIManager;

/**
 * @author Preston Bender
 * Source code for Coin Lab GUI
 */
public class Coins extends javax.swing.JFrame {

    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton dimesButton;
    private javax.swing.JLabel dimesDisplayLabel;
    private javax.swing.JLabel dimesLabel;
    private javax.swing.JTextField dimesTF;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nickelsButton;
    private javax.swing.JLabel nickelsDisplayLabel;
    private javax.swing.JLabel nickelsLabel;
    private javax.swing.JTextField nickelsTF;
    private javax.swing.JButton quartersButton;
    private javax.swing.JLabel quartersLabel;
    private javax.swing.JTextField quartersTF;
    private javax.swing.JLabel quatersDisplayLabel;
    private javax.swing.JPanel textFieldPanel;
    private javax.swing.JPanel titlesPanel;
    private javax.swing.JLabel totalDisplayLabel;

    private CoinLab coinLab;
    private int quarters, dimes, nickels;

    /**
     * Creates new form CoinLabGUI
     */
    public Coins() {
        initComponents();
        initOther();
    }

    private void initOther() {
        // setting default values
        quarters = 0;
        dimes = 0;
        nickels = 0;

        // constructing new coin lab object
        coinLab = new CoinLab(quarters, dimes, nickels);

        // setting default dislpay labels
        quatersDisplayLabel.setText("Quarters: $0.00");
        dimesDisplayLabel.setText("Dimes: $0.00");
        nickelsDisplayLabel.setText("Nickels: $0.00");
        totalDisplayLabel.setText("With 0 coins, Total is $0.00");

    }
    // method for the submit buttons
    private void submit() {
        coinLab.recalulate(quarters, dimes, nickels);
        String[] dollarCoins = coinLab.getDollarAmounts();

        // setting individual coin outputs
        quatersDisplayLabel.setText("Quarters: $" + dollarCoins[0]);
        dimesDisplayLabel.setText("Dimes: $" + dollarCoins[1]);
        nickelsDisplayLabel.setText("Nickels: $" + dollarCoins[2]);

        // setting the text display with total amount and coins
        totalDisplayLabel.setText("With " + coinLab.getTotalCoins() + " coins, Total is $" + coinLab.getTotalAmount());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titlesPanel = new javax.swing.JPanel();
        quartersLabel = new javax.swing.JLabel();
        dimesLabel = new javax.swing.JLabel();
        nickelsLabel = new javax.swing.JLabel();
        textFieldPanel = new javax.swing.JPanel();
        quartersTF = new javax.swing.JTextField();
        dimesTF = new javax.swing.JTextField();
        nickelsTF = new javax.swing.JTextField();
        buttonsPanel = new javax.swing.JPanel();
        quartersButton = new javax.swing.JButton();
        dimesButton = new javax.swing.JButton();
        nickelsButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        quatersDisplayLabel = new javax.swing.JLabel();
        dimesDisplayLabel = new javax.swing.JLabel();
        nickelsDisplayLabel = new javax.swing.JLabel();
        totalDisplayLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        footerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 469));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        titlesPanel.setBackground(new java.awt.Color(255, 255, 255));
        titlesPanel.setLayout(new java.awt.GridLayout(3, 1));

        quartersLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        quartersLabel.setForeground(java.awt.Color.darkGray);
        quartersLabel.setText("Enter Quarters");
        titlesPanel.add(quartersLabel);

        dimesLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dimesLabel.setForeground(java.awt.Color.darkGray);
        dimesLabel.setText("Enter Dimes");
        titlesPanel.add(dimesLabel);

        nickelsLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nickelsLabel.setForeground(java.awt.Color.darkGray);
        nickelsLabel.setText("Enter Nickels");
        titlesPanel.add(nickelsLabel);

        textFieldPanel.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPanel.setLayout(new java.awt.GridLayout(3, 1, 5, 75));
        textFieldPanel.add(quartersTF);
        textFieldPanel.add(dimesTF);
        textFieldPanel.add(nickelsTF);

        buttonsPanel.setBackground(new java.awt.Color(255, 255, 255));
        buttonsPanel.setForeground(new java.awt.Color(255, 255, 255));
        buttonsPanel.setToolTipText("");
        buttonsPanel.setLayout(new java.awt.GridLayout(3, 1, 0, 55));

        quartersButton.setText("Update");
        quartersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartersButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(quartersButton);

        dimesButton.setText("Update");
        dimesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimesButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(dimesButton);

        nickelsButton.setText("Update");
        nickelsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickelsButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(nickelsButton);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1, 0, 55));

        quatersDisplayLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        quatersDisplayLabel.setForeground(java.awt.Color.darkGray);
        jPanel1.add(quatersDisplayLabel);

        dimesDisplayLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dimesDisplayLabel.setForeground(java.awt.Color.darkGray);
        jPanel1.add(dimesDisplayLabel);

        nickelsDisplayLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nickelsDisplayLabel.setForeground(java.awt.Color.darkGray);
        jPanel1.add(nickelsDisplayLabel);

        totalDisplayLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        totalDisplayLabel.setForeground(java.awt.Color.darkGray);
        totalDisplayLabel.setText("");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(titlesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(totalDisplayLabel)
                                                .addGap(215, 215, 215))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43))))
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(titlesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(23, 23, 23)
                                                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(mainPanelLayout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(textFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalDisplayLabel)
                                .addGap(20, 20, 20))
        );

        headerPanel.setBackground(new java.awt.Color(0, 102, 204));
        headerPanel.setPreferredSize(new java.awt.Dimension(995, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Project Coin Lab");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        footerPanel.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
                footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        footerPanelLayout.setVerticalGroup(
                footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(footerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0)
                                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // submit when the quarters submit button is pressed
    private void quartersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartersButtonActionPerformed
        int updateQuarter = Integer.parseInt(quartersTF.getText());

        quarters = updateQuarter;
        submit();
    }//GEN-LAST:event_quartersButtonActionPerformed
    // submit when the dimes submit button is pressed
    private void dimesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dimesButtonActionPerformed
        int updateDime = Integer.parseInt(dimesTF.getText());
        dimes = updateDime;
        submit();
    }//GEN-LAST:event_dimesButtonActionPerformed
    // submit when the nickels  submit button is pressed
    private void nickelsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nickelsButtonActionPerformed
        int updateNickel = Integer.parseInt(nickelsTF.getText());
        nickels = updateNickel;
        submit();
    }//GEN-LAST:event_nickelsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Coins().setVisible(true));
    }
}
