/*
 * This file creates a GUI for a calculator.
 * The GUI keys are put into two main types - numpad keys, and arithmetic symbol
 * keys. There are a few keys that are special and not of those two types as 
 * well: the clear key, the del key, the +/- key, and the enter key. When a key 
 * on the GUI is pressed, it is saved into the `lastVal` instance variable.
 * Then, the next time a key of a different type is pressed, `lastVal` is added
 * to the `formula` ArrayList instance variable, and `lastVal` is changed to
 * the key that was typed. If a `lastVal` was a numpad key and another numpad
 * key was pressed, then the key pressed will be added as the rightmost digit
 * in `lastVal`. The arithmetic symbol keys cannot be pressed after other
 * arithmetic symbol keys, enter keys, clear keys, or as the first key. The del
 * key deletes the rightmost character of `lastVal` and, if there was only one
 * character, changes `lastVal` to the most recent value in the `formula`
 * ArrayList. The numpad keys all use the `typeNum()` method which deals with
 * the code to type the numpad keys. The same is for the arithmetic symbol keys
 * using the `doArth()` method. The `makeFormula()` method uses the `formula`
 * instance variable in order to form a String formula, and the `calculateAns`
 * method uses the String made by `makeFormula()` to calculate to final answer.
 */
package com.mycompany.grayscalculator;

import java.util.ArrayList;

/**
 *
 * @author seanp
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * `formula` is used to construct the formula of the inputs. `lastVal` is
     * used to store the last input in order to both prevent errors and to add
     * to the formula.
     */
    private ArrayList<String> formula;
    private String lastVal;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        formula = new ArrayList<String>();
        lastVal = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_result = new javax.swing.JTextField();
        text_formula = new javax.swing.JTextField();
        panel_numpad = new javax.swing.JPanel();
        button_7 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_sign = new javax.swing.JButton();
        button_0 = new javax.swing.JButton();
        button_decimal = new javax.swing.JButton();
        panel_top = new javax.swing.JPanel();
        button_clear = new javax.swing.JButton();
        button_del = new javax.swing.JButton();
        button_div = new javax.swing.JButton();
        panel_side = new javax.swing.JPanel();
        button_mult = new javax.swing.JButton();
        button_subtract = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_enter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_result.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        text_result.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        text_formula.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        button_7.setText("7");
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_8.setText("8");
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_9.setText("9");
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_4.setText("4");
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_5.setText("5");
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_6.setText("6");
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_1.setText("1");
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_2.setText("2");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_3.setText("3");
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_sign.setText("+/-");
        button_sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_signActionPerformed(evt);
            }
        });

        button_0.setText("0");
        button_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_0ActionPerformed(evt);
            }
        });

        button_decimal.setText(".");
        button_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_decimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_numpadLayout = new javax.swing.GroupLayout(panel_numpad);
        panel_numpad.setLayout(panel_numpadLayout);
        panel_numpadLayout.setHorizontalGroup(
            panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_numpadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_numpadLayout.createSequentialGroup()
                        .addComponent(button_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_numpadLayout.createSequentialGroup()
                        .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_numpadLayout.createSequentialGroup()
                        .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_numpadLayout.createSequentialGroup()
                        .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panel_numpadLayout.setVerticalGroup(
            panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_numpadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_numpadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_sign, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        button_clear.setText("C");
        button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_clearActionPerformed(evt);
            }
        });

        button_del.setText("Del");
        button_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_delActionPerformed(evt);
            }
        });

        button_div.setText("/");
        button_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_divActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_topLayout = new javax.swing.GroupLayout(panel_top);
        panel_top.setLayout(panel_topLayout);
        panel_topLayout.setHorizontalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_topLayout.createSequentialGroup()
                .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_del, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_topLayout.setVerticalGroup(
            panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_topLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_del, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_div, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        button_mult.setText("x");
        button_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_multActionPerformed(evt);
            }
        });

        button_subtract.setText("-");
        button_subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_subtractActionPerformed(evt);
            }
        });

        button_add.setText("+");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_enter.setText("=");
        button_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_enterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_sideLayout = new javax.swing.GroupLayout(panel_side);
        panel_side.setLayout(panel_sideLayout);
        panel_sideLayout.setHorizontalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addGroup(panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_sideLayout.setVerticalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addComponent(button_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_formula, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text_result)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_numpad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_formula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(text_result, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_numpad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Deletes the most recently typed input character.
     */
    private void button_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_delActionPerformed
        try {
            // Checks to make sure that the last key typed was not the enter key
            if (!lastVal.equals("=")) {
                // Removes the rightmost character from the last keys typed
                if (lastVal.length() > 1) {
                    lastVal = lastVal.substring(0, lastVal.length() - 1);
                    String result = lastVal;
                    if (lastVal.charAt(0) == 'n') {
                        result = "-" + lastVal.substring(1);
                    }
                    text_result.setText(result);
                    for (int i = 0; i < formula.size(); i++) {
                        System.out.println(formula.get(i));
                    }
                } else if (lastVal.length() == 1) {
                    /* Replaces the last key typed with what was typed two keys 
                            ago if there is only one value.
                     */
                    /*if ((lastVal.equals("+") || lastVal.equals("-")
                            || lastVal.equals("*") || lastVal.equals("/")
                            || formula.size() == 1 || lastVal.equals("n")) 
                            && formula.size() > 0) {
                        formula.remove(formula.size() - 1);
                    }*/
                    if (formula.size() > 0) {
                        lastVal = formula.get(formula.size() - 1);
                        formula.remove(formula.size() - 1);
                    } else {
                        lastVal = "";
                    }
                    String val = lastVal;
                    if (lastVal.length() > 0 && lastVal.substring(0, 
                            lastVal.length() - 1).equals("n")) {
                        val = "-" + lastVal.substring(1);
                    }
                    text_result.setText(val);
                    String frmla = makeFormula();
                    text_formula.setText(frmla);
                    //lastVal = " ";
                    for (int i = 0; i < formula.size(); i++) {
                        System.out.println(formula.get(i));
                    }
                }
            }
        } catch (Exception e) {
            text_result.setText("ERR");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_button_delActionPerformed

    /**
     * Makes the current/next number the opposite sign of it's current status.
     */
    private void button_signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_signActionPerformed
        try {
            // Checks to make sure that the last key typed was not the enter key
            if (!(lastVal.equals("=") || lastVal.equals("+")
                    || lastVal.equals("-") || lastVal.equals("*")
                    || lastVal.equals("/"))) {
                // Changes the sign of the last typed number
                if (lastVal.length() > 0 && lastVal.charAt(0) == 'n') {
                    lastVal = lastVal.substring(1);
                    text_result.setText(lastVal);
                } else {
                    lastVal = "n" + lastVal;
                    text_result.setText("-" + lastVal.substring(1));
                }
            }
        } catch (Exception e) {
            text_result.setText("ERR");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_button_signActionPerformed

    /**
     * Decimal and 0-9 buttons all type their respective number/decimal.
     */
    private void button_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_decimalActionPerformed
        typeNum(".");
    }//GEN-LAST:event_button_decimalActionPerformed

    private void button_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_0ActionPerformed
        typeNum("0");
    }//GEN-LAST:event_button_0ActionPerformed

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
        typeNum("1");
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        typeNum("2");
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        typeNum("3");
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        typeNum("4");
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
        typeNum("5");
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        typeNum("6");
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
        typeNum("7");
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        typeNum("8");
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        typeNum("9");
    }//GEN-LAST:event_button_9ActionPerformed

    /**
     * Clears all instance variables and resets the text to being empty.
     */
    private void button_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_clearActionPerformed
        try {
            lastVal = "";
            formula.clear();
            text_formula.setText("");
            text_result.setText("");
        } catch (Exception e) {
            text_result.setText("ERR");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_button_clearActionPerformed

    /**
     * Buttons add, subtract, mult, and div add their respective arithmetic
     * symbols to the formula.
     */
    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        doArth("+");
    }//GEN-LAST:event_button_addActionPerformed

    private void button_subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_subtractActionPerformed
        doArth("-");
    }//GEN-LAST:event_button_subtractActionPerformed

    private void button_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_multActionPerformed
        doArth("*");
    }//GEN-LAST:event_button_multActionPerformed

    private void button_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_divActionPerformed
        doArth("/");
    }//GEN-LAST:event_button_divActionPerformed

    /**
     * Enters the current formula and gives the result.
     */
    private void button_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_enterActionPerformed
        /* Checks to make sure that the last key typed was not the enter key or
                that this is the first key typed
         */
        if (!(lastVal.equals("=") || lastVal.equals(""))) {
            if (!(lastVal.equals("+") || lastVal.equals("-")
                    || lastVal.equals("*") || lastVal.equals("/"))) {
                formula.add(lastVal);
            }
            lastVal = "";
            /* Following lines of code make the formula and the answer and turns
                    them into correctly formatted strings.
             */
            String frmla = makeFormula();
            double answer = calculateAns(frmla);
            lastVal = "=";
            frmla = makeFormula();
            text_formula.setText(frmla);
            int castAnswer = (int) answer;
            double checkAnswer = (double) castAnswer;
            String ans = "";
            if (checkAnswer == answer) {
                ans = "" + castAnswer;
            } else {
                ans = "" + answer;
            }
            if (ans.length() > 12) {
                ans = ans.substring(0, 12);
            }
            text_result.setText(ans);
        }
    }//GEN-LAST:event_button_enterActionPerformed

    /**
     * Returns the formula as a formatted String.
     */
    private String makeFormula() {
        String frmla = "";
        for (String val : formula) {
            // Checks for negative number.
            if (val.charAt(0) == 'n') {
                frmla = frmla + " -" + val.substring(1);
            } else {
                frmla = frmla + " " + val;
            }
        }
        return frmla;
    }

    /**
     * Uses the @param formula made with `makeFormula()` to return the final
     * answer as a double.
     */
    private static double calculateAns(String formula) {
        // Turns String formula into an array for each value
        String[] frmla = formula.trim().split(" ");
        double ans = Double.parseDouble(frmla[0]);
        // Makes an array of all of the arithmetic symbols
        String[] arth = new String[frmla.length / 2];
        for (int i = 1; i < frmla.length; i += 2) {
            arth[(i - 1) / 2] = frmla[i];
        }
        // Calculates the answer
        for (int i = 2; i < frmla.length; i += 2) {
            switch (arth[(i - 2) / 2].charAt(0)) {
                case '+': ans = ans + Double.parseDouble(frmla[i]); break;
                case '-': ans = ans - Double.parseDouble(frmla[i]); break;
                case '*': ans = ans * Double.parseDouble(frmla[i]); break;
                case '/': ans = ans / Double.parseDouble(frmla[i]); break;
            }
            /*if (arth[(i - 2) / 2].equals("+")) {
                ans = ans + Double.parseDouble(frmla[i]);
            }
            if (arth[(i - 2) / 2].equals("-")) {
                ans = ans - Double.parseDouble(frmla[i]);
            }
            if (arth[(i - 2) / 2].equals("*")) {
                ans = ans * Double.parseDouble(frmla[i]);
            }
            if (arth[(i - 2) / 2].equals("/")) {
                ans = ans / Double.parseDouble(frmla[i]);
            }*/
        }
        return ans;
    }

    /**
     * Method to type the number for decimal and 0-9 buttons.
     */
    private void typeNum(String num) {
        try {
            if (lastVal.equals("+") || lastVal.equals("-")
                    || lastVal.equals("*") || lastVal.equals("/")) {
                formula.add(lastVal);
                lastVal = "";
                // Makes the formula and sets the text box to it.
                String frmla = makeFormula();
                text_formula.setText(frmla);
            }
            if (!lastVal.equals("=")) {
                if (!(lastVal.contains(".") && num.equals("."))) {
                    lastVal = lastVal + num;
                    if (lastVal.charAt(0) == 'n') {
                        text_result.setText("-" + lastVal.substring(1));
                    } else {
                        text_result.setText(lastVal);
                    }
                }
            } else {
                // Starts a new formula if the last key was the enter key.
                lastVal = num;
                formula.clear();
                text_formula.setText("");
                text_result.setText(lastVal);
            }
        } catch (Exception e) {
            text_result.setText("ERR");
            e.printStackTrace();
            return;
        }
    }

    /**
     * Method to type the arithmetic symbols.
     */
    private void doArth(String symbol) {
        try {
            /* Checks for if the last key pressed was one that cannot have an
                    arithmetic symbol pressed after it
             */
            if (!(lastVal.equals("+") || lastVal.equals("-")
                    || lastVal.equals("*") || lastVal.equals("/")
                    || lastVal.equals("") || lastVal.equals("="))) {
                formula.add(lastVal);
                lastVal = "";
                String frmla = makeFormula();
                text_formula.setText(frmla);
                text_result.setText(symbol);
                lastVal = symbol;
            }
            if (lastVal.equals("=")) {
                /* If the last key pressed was enter, then the arithmetic key
                        should do it's operation on the answer.
                 */
                lastVal = "";
                String frmla = makeFormula();
                text_formula.setText(frmla);
                text_result.setText(symbol);
                lastVal = symbol;
            }
        } catch (Exception e) {
            text_result.setText("ERR");
            e.printStackTrace();
            return;
        }
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_0;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_clear;
    private javax.swing.JButton button_decimal;
    private javax.swing.JButton button_del;
    private javax.swing.JButton button_div;
    private javax.swing.JButton button_enter;
    private javax.swing.JButton button_mult;
    private javax.swing.JButton button_sign;
    private javax.swing.JButton button_subtract;
    private javax.swing.JPanel panel_numpad;
    private javax.swing.JPanel panel_side;
    private javax.swing.JPanel panel_top;
    private javax.swing.JTextField text_formula;
    private javax.swing.JTextField text_result;
    // End of variables declaration//GEN-END:variables
}
