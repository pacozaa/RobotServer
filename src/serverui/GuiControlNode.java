package serverui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.abs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.InputMap;
import javax.swing.JToggleButton;

import javax.swing.SwingUtilities;

public class GuiControlNode extends javax.swing.JFrame {

    public boolean CheckListenbtn = false;
    public boolean CheckDisconnectbtn = false;
    public static String DirectionStream = null;
    public static String DragStatus = "";
    public static String PlanStream;
    public GuiControlNode() throws IOException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConSole = new javax.swing.JPanel();
        lblTCPStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDebug = new javax.swing.JTextArea();
        Close = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Go = new javax.swing.JButton();
        RotateLeft = new javax.swing.JButton();
        RotateRight = new javax.swing.JButton();
        ConToRobot = new javax.swing.JButton();
        ModeSelect = new javax.swing.JToggleButton();
        lblRightWheel = new javax.swing.JLabel();
        lblLeftWheel = new javax.swing.JLabel();
        lblDirection = new javax.swing.JLabel();
        btnTeach = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cbxFileSelector = new javax.swing.JComboBox();
        txtPathName = new javax.swing.JTextField();
        btnSaveLog = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cbxScaleSelector = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaShowPath = new javax.swing.JTextArea();
        btnAutoStart = new javax.swing.JButton();
        GraphicMap = new serverui.Map();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ROBOT CONTROL V0.01");

        ConSole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConSoleMouseClicked(evt);
            }
        });

        lblTCPStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTCPStatus.setForeground(new java.awt.Color(204, 0, 0));
        lblTCPStatus.setText("TCP Status : OFF");

        txtAreaDebug.setEditable(false);
        txtAreaDebug.setColumns(20);
        txtAreaDebug.setRows(5);
        jScrollPane1.setViewportView(txtAreaDebug);

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Back.setLabel("S");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Go.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Go.setText("W");
        Go.setToolTipText("");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        RotateLeft.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RotateLeft.setLabel("A");
        RotateLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateLeftActionPerformed(evt);
            }
        });

        RotateRight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RotateRight.setLabel("D");
        RotateRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RotateRightActionPerformed(evt);
            }
        });

        ConToRobot.setText("Wake Robot!");
        ConToRobot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConToRobotActionPerformed(evt);
            }
        });

        ModeSelect.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ModeSelect.setText("MANUAL MODE");
        ModeSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeSelectActionPerformed(evt);
            }
        });

        lblRightWheel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRightWheel.setForeground(new java.awt.Color(0, 102, 0));
        lblRightWheel.setText("RIGHT SPEED : 0 KM/H");

        lblLeftWheel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblLeftWheel.setForeground(new java.awt.Color(0, 102, 0));
        lblLeftWheel.setText("LEFT SPEED : 0 KM/H");

        lblDirection.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDirection.setForeground(new java.awt.Color(0, 102, 0));
        lblDirection.setText("Direction : None");

        btnTeach.setForeground(java.awt.Color.red);
        btnTeach.setText("TEACH");
        btnTeach.setEnabled(false);
        btnTeach.setMaximumSize(new java.awt.Dimension(73, 25));
        btnTeach.setMinimumSize(new java.awt.Dimension(73, 25));
        btnTeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeachActionPerformed(evt);
            }
        });

        btnLoad.setText("LOAD");
        btnLoad.setEnabled(false);
        btnLoad.setMaximumSize(new java.awt.Dimension(73, 25));
        btnLoad.setMinimumSize(new java.awt.Dimension(73, 25));
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cbxFileSelector.setEnabled(false);

        txtPathName.setText(".txt");
        txtPathName.setEnabled(false);

        btnSaveLog.setText("SAVE LOG");

        btnClear.setText("CLEAR");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbxScaleSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5m", "10m", "50m", "100m" }));
        cbxScaleSelector.setEnabled(false);

        txtAreaShowPath.setColumns(20);
        txtAreaShowPath.setRows(5);
        jScrollPane2.setViewportView(txtAreaShowPath);

        btnAutoStart.setText("START/STOP");
        btnAutoStart.setEnabled(false);
        btnAutoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConSoleLayout = new javax.swing.GroupLayout(ConSole);
        ConSole.setLayout(ConSoleLayout);
        ConSoleLayout.setHorizontalGroup(
            ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConSoleLayout.createSequentialGroup()
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConSoleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLeftWheel)
                            .addGroup(ConSoleLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ConToRobot)
                                .addGap(18, 18, 18)
                                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTCPStatus)
                            .addGroup(ConSoleLayout.createSequentialGroup()
                                .addComponent(RotateLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ConSoleLayout.createSequentialGroup()
                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RotateRight, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ModeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConSoleLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDirection)
                            .addComponent(lblRightWheel)
                            .addGroup(ConSoleLayout.createSequentialGroup()
                                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnLoad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTeach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPathName)
                                    .addComponent(cbxScaleSelector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxFileSelector, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnSaveLog, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ConSoleLayout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAutoStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ConSoleLayout.setVerticalGroup(
            ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConSoleLayout.createSequentialGroup()
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ConSoleLayout.createSequentialGroup()
                        .addComponent(Go, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RotateLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RotateRight, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ConSoleLayout.createSequentialGroup()
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTeach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxScaleSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPathName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFileSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnAutoStart)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDirection, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTCPStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLeftWheel)
                    .addComponent(lblRightWheel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(ConSoleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(ConToRobot)
                    .addComponent(btnSaveLog))
                .addContainerGap())
        );

        Action actionListenerKey = new AbstractAction() {
            public void actionPerformed(ActionEvent actionEvent) {
                JButton source = (JButton) actionEvent.getSource();
                //System.out.println("Activated: " + source.getText());
                String tx=source.getText();
                if(tx == "W"){
                    Go.doClick();
                }
                else if(tx == "S"){
                    Back.doClick();
                }
                else if(tx == "A"){
                    RotateLeft.doClick();
                }
                else if(tx == "D"){
                    RotateRight.doClick();
                }
            }
        };

        KeyStroke W_Go = KeyStroke.getKeyStroke("W");
        InputMap inputMap = Go.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(W_Go, "The Action");
        ActionMap actionMap = Go.getActionMap();
        actionMap.put("The Action", actionListenerKey);

        KeyStroke S_Back = KeyStroke.getKeyStroke("S");
        inputMap = Back.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(S_Back, "The Action");
        actionMap = Back.getActionMap();
        actionMap.put("The Action", actionListenerKey);

        KeyStroke A_RotateLeft = KeyStroke.getKeyStroke("A");
        inputMap = RotateLeft.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(A_RotateLeft, "The Action");
        actionMap = RotateLeft.getActionMap();
        actionMap.put("The Action", actionListenerKey);

        KeyStroke D_RotateRight = KeyStroke.getKeyStroke("D");
        inputMap = RotateRight.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(D_RotateRight, "The Action");
        actionMap = RotateRight.getActionMap();
        actionMap.put("The Action", actionListenerKey);
        Action actionListenerKey2 = new AbstractAction() {
            public void actionPerformed(ActionEvent actionEvent) {
                JToggleButton source = (JToggleButton) actionEvent.getSource();
                //System.out.println("Activated: " + source.getText());
                String tx=source.getText();
                if(tx == "MANUAL MODE" || tx == "AUTO MODE"){
                    ModeSelect.doClick();
                }
            }
        };

        KeyStroke E_ModeSelect = KeyStroke.getKeyStroke("E");
        InputMap inputMap2 = ModeSelect.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap2.put(E_ModeSelect, "The Action");
        ActionMap actionMap2 = ModeSelect.getActionMap();
        actionMap2.put("The Action", actionListenerKey2);
        File folder = new File(System.getProperty("user.dir"));
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile() && (listOfFiles[i].getName().contains("txt"))) {
                cbxFileSelector.addItem(listOfFiles[i].getName());
            }
        }

        GraphicMap.setBackground(new java.awt.Color(0, 0, 0));
        GraphicMap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                GraphicMapMouseDragged(evt);
            }
        });
        GraphicMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GraphicMapMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GraphicMapMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GraphicMapMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout GraphicMapLayout = new javax.swing.GroupLayout(GraphicMap);
        GraphicMap.setLayout(GraphicMapLayout);
        GraphicMapLayout.setHorizontalGroup(
            GraphicMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 719, Short.MAX_VALUE)
        );
        GraphicMapLayout.setVerticalGroup(
            GraphicMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ConSole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GraphicMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConSole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GraphicMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        this.CheckDisconnectbtn = true;
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        GuiControlNode.DirectionStream = "w";
        this.displayMessage("Click/Press : W");
    }//GEN-LAST:event_GoActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        GuiControlNode.DirectionStream = "s";
        this.displayMessage("Click/Press : S");
    }//GEN-LAST:event_BackActionPerformed

    private void RotateRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateRightActionPerformed
        GuiControlNode.DirectionStream = "d";
        this.displayMessage("Click/Press : D");
    }//GEN-LAST:event_RotateRightActionPerformed

    private void RotateLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RotateLeftActionPerformed
        GuiControlNode.DirectionStream = "a";
        this.displayMessage("Click/Press : A");
    }//GEN-LAST:event_RotateLeftActionPerformed

    private void ConToRobotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConToRobotActionPerformed
        this.CheckListenbtn = true;
    }//GEN-LAST:event_ConToRobotActionPerformed

    private void ModeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeSelectActionPerformed
        if ("MANUAL MODE".equals(ModeSelect.getText())) {
            ModeSelect.setText("AUTO MODE");
            Go.setEnabled(false);
            Back.setEnabled(false);
            RotateLeft.setEnabled(false);
            RotateRight.setEnabled(false);
            btnTeach.setEnabled(true);
            btnLoad.setEnabled(true);
            btnClear.setEnabled(true);
            btnAutoStart.setEnabled(true);
            cbxFileSelector.setEnabled(true);
            txtPathName.setEnabled(true);
            cbxScaleSelector.setEnabled(true);
        } else if ("AUTO MODE".equals(ModeSelect.getText())) {
            ModeSelect.setText("MANUAL MODE");
            Go.setEnabled(true);
            Back.setEnabled(true);
            RotateLeft.setEnabled(true);
            RotateRight.setEnabled(true);
            btnSave.setEnabled(false);
            btnTeach.setEnabled(false);
            btnLoad.setEnabled(false);
            btnClear.setEnabled(false);
            btnAutoStart.setEnabled(false);
            cbxFileSelector.setEnabled(false);
            txtPathName.setEnabled(false);
            cbxScaleSelector.setEnabled(false);

        }
    }//GEN-LAST:event_ModeSelectActionPerformed

    private void ConSoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConSoleMouseClicked

    }//GEN-LAST:event_ConSoleMouseClicked

    private void GraphicMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphicMapMouseClicked
        System.out.println(evt.getPoint());
    }//GEN-LAST:event_GraphicMapMouseClicked

    private void GraphicMapMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphicMapMouseDragged
        if (Map.TeachStatus == true) {
            DragStatus = "Drag";
            if (abs(evt.getX() - Map.PolyStartPoint.get(Map.DIndex).x) > abs(evt.getY() - Map.PolyStartPoint.get(Map.DIndex).y)) {
                Map.PolyEndPoint.add(Map.DIndex, new Point(evt.getX(), Map.PolyStartPoint.get(Map.DIndex).y));
            } else {
                Map.PolyEndPoint.add(Map.DIndex, new Point(Map.PolyStartPoint.get(Map.DIndex).x, evt.getY()));
            }
            repaint();
        }
        

    }//GEN-LAST:event_GraphicMapMouseDragged

    private void GraphicMapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphicMapMousePressed

        if (Map.TeachStatus == true) {
            if (Map.DIndex == 0) {
                Map.PolyStartPoint.add(Map.DIndex, evt.getPoint());
            }
            if (Map.DIndex != 0 && "Drag".equals(DragStatus)) {
                Map.PolyStartPoint.add(Map.DIndex, Map.PolyEndPoint.get(Map.DIndex - 1));
            }
        }


    }//GEN-LAST:event_GraphicMapMousePressed

    private void btnTeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeachActionPerformed
        if (Map.TeachStatus == false) {
            Map.TeachStatus = true;
            btnSave.setEnabled(true);
            btnLoad.setEnabled(false);
            btnTeach.setForeground(new Color(0, 102, 0));
        } else {
            Map.TeachStatus = false;
            btnTeach.setForeground(Color.red);
            btnLoad.setEnabled(true);
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_btnTeachActionPerformed

    private void GraphicMapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GraphicMapMouseReleased
        if (Map.TeachStatus == true) {
            if (Map.PolyStartPoint.size() > 0) {
                Double len = Map.getLenght(Map.PolyStartPoint.get(Map.DIndex), Map.PolyEndPoint.get(Map.DIndex));
                this.displayMapStatus(Map.PolyStartPoint.get(Map.DIndex).toString() + " to " + Map.PolyEndPoint.get(Map.DIndex).toString() + " = " + len.toString() + " meters");
            }
            if ("Drag".equals(DragStatus)) {
                Map.DIndex++;
            }
            txtPathName.requestFocus();
            txtPathName.selectAll();
        }


    }//GEN-LAST:event_GraphicMapMouseReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        System.out.println(this.GraphicMap.getSize().toString());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (Map.TeachStatus == true) {
            if (Map.PolyEndPoint.size() > 0) {
                Map.AnalystPath();
                try {
                    Map.SaveMapToTextFile(txtPathName.getText());
                    File folder = new File(System.getProperty("user.dir"));
                    File[] listOfFiles = folder.listFiles();
                    for (int i = 0; i < listOfFiles.length; i++) {
                        if (listOfFiles[i].isFile() && (listOfFiles[i].getName().contains("txt"))) {
                            cbxFileSelector.addItem(listOfFiles[i].getName());
                        }
                    }
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed

        boolean checkit = Map.LoadFile(cbxFileSelector.getSelectedItem().toString());
        if (checkit == true) {
            repaint();
        } else {
            System.err.println("File Format Fial");
        }

    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnAutoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoStartActionPerformed
        if(Map.OpStatus == true){
           Map.PrepareData();
           Map.OpStatus = false;
           btnAutoStart.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAutoStartActionPerformed
    public void windowClosing(WindowEvent e) {
        this.CheckDisconnectbtn = true;
    }

    public void displayMessage(final String messageToDisplay) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() // updates displayArea
                    {
                        txtAreaDebug.append(messageToDisplay + "\n"); // append message
                    } // end method run
                } // end anonymous inner class
        ); // end call to SwingUtilities.invokeLater
    } // end method displayMessage
    public void displayMapStatus(final String messageToDisplay) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    public void run() // updates displayArea
                    {
                        txtAreaShowPath.append(messageToDisplay + "\n"); // append message
                    } // end method run
                } // end anonymous inner class
        ); // end call to SwingUtilities.invokeLater
    } // end method displayMessage
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]){
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new gui().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Close;
    private javax.swing.JPanel ConSole;
    private javax.swing.JButton ConToRobot;
    private javax.swing.JButton Go;
    public static javax.swing.JPanel GraphicMap;
    public javax.swing.JToggleButton ModeSelect;
    private javax.swing.JButton RotateLeft;
    private javax.swing.JButton RotateRight;
    private javax.swing.JButton btnAutoStart;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveLog;
    public static javax.swing.JButton btnTeach;
    private javax.swing.JComboBox cbxFileSelector;
    public static javax.swing.JComboBox cbxScaleSelector;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lblDirection;
    public javax.swing.JLabel lblLeftWheel;
    public javax.swing.JLabel lblRightWheel;
    public javax.swing.JLabel lblTCPStatus;
    private javax.swing.JTextArea txtAreaDebug;
    private javax.swing.JTextArea txtAreaShowPath;
    private javax.swing.JTextField txtPathName;
    // End of variables declaration//GEN-END:variables
}