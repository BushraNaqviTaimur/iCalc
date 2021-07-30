package icalc;


import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author bushra
 */
public class frmRadical extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form frmMain
     */
    public frmRadical() {
        initComponents();
        
        tfDigitScreen.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT); // to enable right to left text entry in textfield
        this.setLocationRelativeTo(null); // for centering form on screen 
        
        
        btnDigit1.addActionListener(this);
        btnDigit2.addActionListener(this);
        btnDigit3.addActionListener(this);
        btnDigit4.addActionListener(this);
        btnDigit5.addActionListener(this);
        btnDigit6.addActionListener(this);
        btnDigit7.addActionListener(this);
        btnDigit8.addActionListener(this);
        btnDigit9.addActionListener(this);
        btnDigit0.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnDigitDot.addActionListener(this);
        btnEquals.addActionListener(this);
    }
    
    

    boolean isCalculating = true; // flag variable
    
    RadicalCalculator cal = new RadicalCalculator(0);
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfDigitScreen = new javax.swing.JTextField();
        btnDigit2 = new javax.swing.JButton();
        btnDigit1 = new javax.swing.JButton();
        btnDigit3 = new javax.swing.JButton();
        btnDigit4 = new javax.swing.JButton();
        btnDigit5 = new javax.swing.JButton();
        btnDigit6 = new javax.swing.JButton();
        btnDigit7 = new javax.swing.JButton();
        btnDigit8 = new javax.swing.JButton();
        btnDigit9 = new javax.swing.JButton();
        btnDigit0 = new javax.swing.JButton();
        btnDigitDot = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnCqrt = new javax.swing.JButton();
        btnX2 = new javax.swing.JButton();
        btnX3 = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnFile = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnBasic = new javax.swing.JMenuItem();
        btnBinary = new javax.swing.JMenuItem();
        btnMatrix = new javax.swing.JMenuItem();
        btnLogarithmic = new javax.swing.JMenuItem();
        btnTrigonometric = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfDigitScreen.setEditable(false);
        tfDigitScreen.setBackground(new java.awt.Color(102, 102, 102));
        tfDigitScreen.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        tfDigitScreen.setForeground(new java.awt.Color(204, 204, 204));
        tfDigitScreen.setText("0");
        tfDigitScreen.setBorder(null);

        btnDigit2.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit2.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit2.setText("2");
        btnDigit2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit1.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit1.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit1.setText("1");
        btnDigit1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit3.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit3.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit3.setText("3");
        btnDigit3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit4.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit4.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit4.setText("4");
        btnDigit4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit5.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit5.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit5.setText("5");
        btnDigit5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit6.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit6.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit6.setText("6");
        btnDigit6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit7.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit7.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit7.setText("7");
        btnDigit7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit8.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit8.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit8.setText("8");
        btnDigit8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit9.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit9.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit9.setText("9");
        btnDigit9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigit0.setBackground(new java.awt.Color(102, 102, 102));
        btnDigit0.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigit0.setForeground(new java.awt.Color(255, 255, 255));
        btnDigit0.setText("0");
        btnDigit0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDigitDot.setBackground(new java.awt.Color(102, 102, 102));
        btnDigitDot.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDigitDot.setForeground(new java.awt.Color(255, 255, 255));
        btnDigitDot.setText(".");
        btnDigitDot.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnDivide.setBackground(new java.awt.Color(255, 153, 0));
        btnDivide.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("/");
        btnDivide.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnMultiply.setBackground(new java.awt.Color(255, 153, 0));
        btnMultiply.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiply.setText("X");
        btnMultiply.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAdd.setBackground(new java.awt.Color(255, 153, 0));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnEquals.setBackground(new java.awt.Color(255, 153, 0));
        btnEquals.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEquals.setLabel("=");

        btnSubtract.setBackground(new java.awt.Color(255, 153, 0));
        btnSubtract.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSubtract.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtract.setText("-");
        btnSubtract.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnAC.setBackground(new java.awt.Color(102, 102, 102));
        btnAC.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnAC.setForeground(new java.awt.Color(255, 255, 255));
        btnAC.setText("AC");
        btnAC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnSqrt.setBackground(new java.awt.Color(255, 153, 0));
        btnSqrt.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnSqrt.setText("Sqrt");
        btnSqrt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnCqrt.setBackground(new java.awt.Color(255, 153, 0));
        btnCqrt.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCqrt.setForeground(new java.awt.Color(255, 255, 255));
        btnCqrt.setText("Cqrt");
        btnCqrt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCqrtActionPerformed(evt);
            }
        });

        btnX2.setBackground(new java.awt.Color(255, 153, 0));
        btnX2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnX2.setForeground(new java.awt.Color(255, 255, 255));
        btnX2.setText("x2");
        btnX2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX2ActionPerformed(evt);
            }
        });

        btnX3.setBackground(new java.awt.Color(255, 153, 0));
        btnX3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnX3.setForeground(new java.awt.Color(255, 255, 255));
        btnX3.setText("x3");
        btnX3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX3ActionPerformed(evt);
            }
        });

        btnPI.setBackground(new java.awt.Color(255, 153, 0));
        btnPI.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnPI.setForeground(new java.awt.Color(255, 255, 255));
        btnPI.setText("pi");
        btnPI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });

        btnFile.setText("File");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnFile.add(btnExit);

        jMenuBar1.add(btnFile);

        jMenu2.setText("Mode");

        btnBasic.setText("Basic");
        btnBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasicActionPerformed(evt);
            }
        });
        jMenu2.add(btnBasic);

        btnBinary.setText("Binary");
        btnBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinaryActionPerformed(evt);
            }
        });
        jMenu2.add(btnBinary);

        btnMatrix.setText("Matrix");
        btnMatrix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrixActionPerformed(evt);
            }
        });
        jMenu2.add(btnMatrix);

        btnLogarithmic.setText("Logarithmic");
        btnLogarithmic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarithmicActionPerformed(evt);
            }
        });
        jMenu2.add(btnLogarithmic);

        btnTrigonometric.setText("Trigonometric");
        btnTrigonometric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrigonometricActionPerformed(evt);
            }
        });
        jMenu2.add(btnTrigonometric);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDigitScreen)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDigitDot, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPI, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnX3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(tfDigitScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnX3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDigitDot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public void actionPerformed(java.awt.event.ActionEvent evt) 
    {
        String btnClicked = evt.getActionCommand();
        
        if(!tfDigitScreen.getText().contains("."))
        {
                if('0' <= btnClicked.charAt(0) && btnClicked.charAt(0) <= '9' || btnClicked.equals(".")) 
                {
                    if(isCalculating)
                      tfDigitScreen.setText(btnClicked);
                    else
                      tfDigitScreen.setText(tfDigitScreen.getText() + btnClicked);
                    isCalculating = false;
                } 
                else 
                {
                    if(isCalculating) 
                    {
                      if(btnClicked.equals("-")) 
                      {
                        tfDigitScreen.setText(btnClicked);
                        isCalculating = false;
                      } 
                      else
                        cal.setOperatorType(btnClicked);

                    } 
                    else 
                    {
                      double operand = Double.parseDouble(tfDigitScreen.getText());
                      cal.Calculate(operand);
                      tfDigitScreen.setText("" + cal.getResult());
                      cal.setOperatorType(btnClicked);
                      isCalculating = true;
                    }
                }
        }
        else
        {
            if('0' <= btnClicked.charAt(0) && btnClicked.charAt(0) <= '9' && !(btnClicked.equals("."))) 
                {
                    if(isCalculating)
                      tfDigitScreen.setText(btnClicked);
                    else
                      tfDigitScreen.setText(tfDigitScreen.getText() + btnClicked);
                    isCalculating = false;
                } 
                else 
                {
                    if(isCalculating) 
                    {
                      if(btnClicked.equals("-")) 
                      {
                        tfDigitScreen.setText(btnClicked);
                        isCalculating = false;
                      } 
                      else
                        cal.setOperatorType(btnClicked);

                    } 
                    else 
                    {
                      double operand = Double.parseDouble(tfDigitScreen.getText());
                      cal.Calculate(operand);
                      tfDigitScreen.setText("" + cal.getResult());
                      cal.setOperatorType(btnClicked);
                      isCalculating = true;
                    }
                }
        }
        

  }
    
    
    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        // TODO add your handling code here:
        
        tfDigitScreen.setText("0");
        isCalculating = true;
        cal.ClearAll();
    }//GEN-LAST:event_btnACActionPerformed

    private void btnBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasicActionPerformed
        // TODO add your handling code here:
        
        new frmBasic().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBasicActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        // TODO add your handling code here:
        
        cal.setOperand(Double.parseDouble(tfDigitScreen.getText()));
        tfDigitScreen.setText(Double.toString(cal.Sqrt()));
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnCqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCqrtActionPerformed
        // TODO add your handling code here:
        
        cal.setOperand(Double.parseDouble(tfDigitScreen.getText()));
        tfDigitScreen.setText(Double.toString(cal.Cqrt()));
    }//GEN-LAST:event_btnCqrtActionPerformed

    private void btnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX2ActionPerformed
        // TODO add your handling code here:
        
        cal.setOperand(Double.parseDouble(tfDigitScreen.getText()));
        tfDigitScreen.setText(Double.toString(cal.X2()));
    }//GEN-LAST:event_btnX2ActionPerformed

    private void btnX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX3ActionPerformed
        // TODO add your handling code here:
        
        cal.setOperand(Double.parseDouble(tfDigitScreen.getText()));
        tfDigitScreen.setText(Double.toString(cal.X3()));
    }//GEN-LAST:event_btnX3ActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
        // TODO add your handling code here:
        
        cal.setOperand(Double.parseDouble(tfDigitScreen.getText()));
        tfDigitScreen.setText(Double.toString(cal.PI()));
    }//GEN-LAST:event_btnPIActionPerformed

    private void btnLogarithmicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarithmicActionPerformed
        // TODO add your handling code here:
        
        new frmLogarithmic().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogarithmicActionPerformed

    private void btnTrigonometricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrigonometricActionPerformed
        // TODO add your handling code here:
        
        new frmTrigonometry().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTrigonometricActionPerformed

    private void btnBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinaryActionPerformed
        // TODO add your handling code here:
        
        new frmBinary().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBinaryActionPerformed

    private void btnMatrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrixActionPerformed
        // TODO add your handling code here:
        
        new frmMatrix().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMatrixActionPerformed

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
            java.util.logging.Logger.getLogger(frmRadical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRadical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRadical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRadical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRadical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAdd;
    private javax.swing.JMenuItem btnBasic;
    private javax.swing.JMenuItem btnBinary;
    private javax.swing.JButton btnCqrt;
    private javax.swing.JButton btnDigit0;
    private javax.swing.JButton btnDigit1;
    private javax.swing.JButton btnDigit2;
    private javax.swing.JButton btnDigit3;
    private javax.swing.JButton btnDigit4;
    private javax.swing.JButton btnDigit5;
    private javax.swing.JButton btnDigit6;
    private javax.swing.JButton btnDigit7;
    private javax.swing.JButton btnDigit8;
    private javax.swing.JButton btnDigit9;
    private javax.swing.JButton btnDigitDot;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEquals;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenu btnFile;
    private javax.swing.JMenuItem btnLogarithmic;
    private javax.swing.JMenuItem btnMatrix;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JMenuItem btnTrigonometric;
    private javax.swing.JButton btnX2;
    private javax.swing.JButton btnX3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField tfDigitScreen;
    // End of variables declaration//GEN-END:variables
}
