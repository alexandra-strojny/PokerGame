
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class PokerGameGUI extends javax.swing.JFrame {

    /**
     * Creates new form PokerGameGUI
     */
    private static JLabel[] myCards;
    private static JLabel[] compCards;
    private static JPanel[] myCPane;
    private static JPanel[] compCPane;
    private static GameState newGame;
    
    Color tan = new Color(215,206,199);
    
    public PokerGameGUI() {
        initComponents();
        myCards = new JLabel[] {myCardLabel1, myCardLabel2, myCardLabel3, myCardLabel4, myCardLabel5};
        compCards = new JLabel[] {compCardLabel1, compCardLabel2, compCardLabel3, compCardLabel4, compCardLabel5};
        myCPane = new JPanel[] {myCard1, myCard2, myCard3, myCard4, myCard5};
        compCPane = new JPanel[] {compCard1, compCard2, compCard3, compCard4, compCard5};
        newGame = new GameState();
        myChips.setText(newGame.getMyChips()+"");
        compChips.setText(newGame.getCompChips()+"");
        statLabel.setText("Ante Up!");
        callButton.setEnabled(false);
        foldButton.setEnabled(false);
        betButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ex2 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        myChips = new javax.swing.JLabel();
        compChips = new javax.swing.JLabel();
        CompPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        compCard1 = new javax.swing.JPanel();
        compCardLabel1 = new javax.swing.JLabel();
        compCard2 = new javax.swing.JPanel();
        compCardLabel2 = new javax.swing.JLabel();
        compCard3 = new javax.swing.JPanel();
        compCardLabel3 = new javax.swing.JLabel();
        compCard4 = new javax.swing.JPanel();
        compCardLabel4 = new javax.swing.JLabel();
        compCard5 = new javax.swing.JPanel();
        compCardLabel5 = new javax.swing.JLabel();
        MyPanel = new javax.swing.JPanel();
        yourCards = new javax.swing.JLabel();
        myCard1 = new javax.swing.JPanel();
        myCardLabel1 = new javax.swing.JLabel();
        myCard2 = new javax.swing.JPanel();
        myCardLabel2 = new javax.swing.JLabel();
        myCard3 = new javax.swing.JPanel();
        myCardLabel3 = new javax.swing.JLabel();
        myCard4 = new javax.swing.JPanel();
        myCardLabel4 = new javax.swing.JLabel();
        myCard5 = new javax.swing.JPanel();
        myCardLabel5 = new javax.swing.JLabel();
        GenButton = new javax.swing.JButton();
        betButton = new javax.swing.JButton();
        callButton = new javax.swing.JButton();
        foldButton = new javax.swing.JButton();
        statPanel = new javax.swing.JPanel();
        statLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        ex2.setText("another example");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(215, 206, 199));
        Header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(86, 86, 86));
        jLabel1.setText("Poker Game");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(86, 86, 86));
        jLabel3.setText("Computer's Chips: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(86, 86, 86));
        jLabel4.setText("Your Chips: ");

        myChips.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        myChips.setForeground(new java.awt.Color(86, 86, 86));

        compChips.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        compChips.setForeground(new java.awt.Color(86, 86, 86));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compChips))
                            .addGroup(HeaderLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(1, 1, 1)
                                .addComponent(myChips)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(myChips))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(compChips))
                .addGap(9, 9, 9))
        );

        CompPanel.setBackground(new java.awt.Color(86, 86, 86));
        CompPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(215, 206, 199));
        jLabel2.setText("Computer's Cards:");

        compCard1.setBackground(new java.awt.Color(118, 50, 63));
        compCard1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        compCard1.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard1Layout = new javax.swing.GroupLayout(compCard1);
        compCard1.setLayout(compCard1Layout);
        compCard1Layout.setHorizontalGroup(
            compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard1Layout.setVerticalGroup(
            compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard2.setBackground(new java.awt.Color(118, 50, 63));
        compCard2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        compCard2.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard2Layout = new javax.swing.GroupLayout(compCard2);
        compCard2.setLayout(compCard2Layout);
        compCard2Layout.setHorizontalGroup(
            compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard2Layout.setVerticalGroup(
            compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard3.setBackground(new java.awt.Color(118, 50, 63));
        compCard3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        compCard3.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard3Layout = new javax.swing.GroupLayout(compCard3);
        compCard3.setLayout(compCard3Layout);
        compCard3Layout.setHorizontalGroup(
            compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard3Layout.setVerticalGroup(
            compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard4.setBackground(new java.awt.Color(118, 50, 63));
        compCard4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        compCard4.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard4Layout = new javax.swing.GroupLayout(compCard4);
        compCard4.setLayout(compCard4Layout);
        compCard4Layout.setHorizontalGroup(
            compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard4Layout.setVerticalGroup(
            compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        compCard5.setBackground(new java.awt.Color(118, 50, 63));
        compCard5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        compCard5.setPreferredSize(new java.awt.Dimension(80, 109));

        compCardLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout compCard5Layout = new javax.swing.GroupLayout(compCard5);
        compCard5.setLayout(compCard5Layout);
        compCard5Layout.setHorizontalGroup(
            compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        compCard5Layout.setVerticalGroup(
            compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(compCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(compCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(compCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout CompPanelLayout = new javax.swing.GroupLayout(CompPanel);
        CompPanel.setLayout(CompPanelLayout);
        CompPanelLayout.setHorizontalGroup(
            CompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompPanelLayout.createSequentialGroup()
                .addGroup(CompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CompPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(compCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(compCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(compCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(compCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(compCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CompPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CompPanelLayout.setVerticalGroup(
            CompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CompPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(CompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        MyPanel.setBackground(new java.awt.Color(86, 86, 86));
        MyPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yourCards.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        yourCards.setForeground(new java.awt.Color(215, 206, 199));
        yourCards.setText("Your Cards:");

        myCard1.setBackground(new java.awt.Color(118, 50, 63));
        myCard1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        myCard1.setMinimumSize(new java.awt.Dimension(100, 100));
        myCard1.setName(""); // NOI18N
        myCard1.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard1Layout = new javax.swing.GroupLayout(myCard1);
        myCard1.setLayout(myCard1Layout);
        myCard1Layout.setHorizontalGroup(
            myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard1Layout.createSequentialGroup()
                    .addGap(0, 39, Short.MAX_VALUE)
                    .addComponent(myCardLabel1)
                    .addGap(0, 39, Short.MAX_VALUE)))
        );
        myCard1Layout.setVerticalGroup(
            myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard1Layout.createSequentialGroup()
                    .addGap(0, 53, Short.MAX_VALUE)
                    .addComponent(myCardLabel1)
                    .addGap(0, 54, Short.MAX_VALUE)))
        );

        myCard2.setBackground(new java.awt.Color(118, 50, 63));
        myCard2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        myCard2.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard2Layout = new javax.swing.GroupLayout(myCard2);
        myCard2.setLayout(myCard2Layout);
        myCard2Layout.setHorizontalGroup(
            myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard2Layout.setVerticalGroup(
            myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard3.setBackground(new java.awt.Color(118, 50, 63));
        myCard3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        myCard3.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard3Layout = new javax.swing.GroupLayout(myCard3);
        myCard3.setLayout(myCard3Layout);
        myCard3Layout.setHorizontalGroup(
            myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard3Layout.setVerticalGroup(
            myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard4.setBackground(new java.awt.Color(118, 50, 63));
        myCard4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        myCard4.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard4Layout = new javax.swing.GroupLayout(myCard4);
        myCard4.setLayout(myCard4Layout);
        myCard4Layout.setHorizontalGroup(
            myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard4Layout.setVerticalGroup(
            myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        myCard5.setBackground(new java.awt.Color(118, 50, 63));
        myCard5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        myCard5.setPreferredSize(new java.awt.Dimension(80, 109));

        myCardLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        javax.swing.GroupLayout myCard5Layout = new javax.swing.GroupLayout(myCard5);
        myCard5.setLayout(myCard5Layout);
        myCard5Layout.setHorizontalGroup(
            myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        myCard5Layout.setVerticalGroup(
            myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
            .addGroup(myCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(myCard5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(myCardLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        GenButton.setBackground(new java.awt.Color(215, 206, 199));
        GenButton.setForeground(new java.awt.Color(118, 50, 63));
        GenButton.setText("Begin Round");
        GenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenButtonActionPerformed(evt);
            }
        });

        betButton.setBackground(new java.awt.Color(215, 206, 199));
        betButton.setForeground(new java.awt.Color(118, 50, 63));
        betButton.setText("Bet");

        callButton.setBackground(new java.awt.Color(215, 206, 199));
        callButton.setForeground(new java.awt.Color(118, 50, 63));
        callButton.setText("Call");

        foldButton.setBackground(new java.awt.Color(215, 206, 199));
        foldButton.setForeground(new java.awt.Color(118, 50, 63));
        foldButton.setText("Fold");

        javax.swing.GroupLayout MyPanelLayout = new javax.swing.GroupLayout(MyPanel);
        MyPanel.setLayout(MyPanelLayout);
        MyPanelLayout.setHorizontalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MyPanelLayout.createSequentialGroup()
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(betButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(callButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foldButton))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(myCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(myCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(myCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(myCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(myCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MyPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(yourCards)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MyPanelLayout.setVerticalGroup(
            MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yourCards)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(myCard2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myCard1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(MyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenButton)
                    .addComponent(betButton)
                    .addComponent(callButton)
                    .addComponent(foldButton))
                .addGap(20, 20, 20))
        );

        statPanel.setBackground(new java.awt.Color(215, 206, 199));

        statLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        statLabel.setForeground(new java.awt.Color(86, 86, 86));
        statLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout statPanelLayout = new javax.swing.GroupLayout(statPanel);
        statPanel.setLayout(statPanelLayout);
        statPanelLayout.setHorizontalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(statLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        statPanelLayout.setVerticalGroup(
            statPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(118, 50, 63));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(118, 50, 63));

        jMenu1.setBackground(new java.awt.Color(118, 50, 63));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(215, 206, 199));
        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu1.setOpaque(true);

        jMenuItem3.setText("New Game");
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Load Game");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save Game");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CompPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(CompPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(statPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(MyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenButtonActionPerformed
        // TODO add your handling code here:
        newGame.dealCards();
        Card[] c = newGame.getMyCards();
        for (int i = 0; i < 5; i = i + 1){
            JLabel tempLabel = myCards[i];
            JPanel tempPanel = myCPane[i];
            tempLabel.setText(c[i].getNumber()+ " "+c[i].getSuitCode());
            tempLabel.setForeground(c[i].getColor());
            tempPanel.setBackground(tan);
        }
        newGame.anteUp();
        myChips.setText(newGame.getMyChips()+"");
        compChips.setText(newGame.getCompChips()+"");
        //GenButton.setEnabled(false);

    }//GEN-LAST:event_GenButtonActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokerGameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CompPanel;
    private javax.swing.JButton GenButton;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel MyPanel;
    private javax.swing.JButton betButton;
    private javax.swing.JButton callButton;
    private javax.swing.JPanel compCard1;
    private javax.swing.JPanel compCard2;
    private javax.swing.JPanel compCard3;
    private javax.swing.JPanel compCard4;
    private javax.swing.JPanel compCard5;
    private javax.swing.JLabel compCardLabel1;
    private javax.swing.JLabel compCardLabel2;
    private javax.swing.JLabel compCardLabel3;
    private javax.swing.JLabel compCardLabel4;
    private javax.swing.JLabel compCardLabel5;
    private javax.swing.JLabel compChips;
    private javax.swing.JLabel ex2;
    private javax.swing.JButton foldButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel myCard1;
    private javax.swing.JPanel myCard2;
    private javax.swing.JPanel myCard3;
    private javax.swing.JPanel myCard4;
    private javax.swing.JPanel myCard5;
    private javax.swing.JLabel myCardLabel1;
    private javax.swing.JLabel myCardLabel2;
    private javax.swing.JLabel myCardLabel3;
    private javax.swing.JLabel myCardLabel4;
    private javax.swing.JLabel myCardLabel5;
    private javax.swing.JLabel myChips;
    private javax.swing.JLabel statLabel;
    private javax.swing.JPanel statPanel;
    private javax.swing.JLabel yourCards;
    // End of variables declaration//GEN-END:variables
    
}
