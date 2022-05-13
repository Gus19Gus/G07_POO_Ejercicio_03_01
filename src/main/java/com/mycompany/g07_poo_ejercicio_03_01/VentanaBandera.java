
package com.mycompany.g07_poo_ejercicio_03_01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gus-Gus
 */
public class VentanaBandera extends JFrame {
    
    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    public VentanaBandera(String title) {
        super(title);
        this.setSize(800, 500);
        this.setLocation(10, 325);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    } 
    public void iniciarComponentes() {
        this.iniciarPanel();
        this.iniciarBandera();
        this.colocarbotones();
    }   
    public void iniciarPanel() {
        this.jPanel1 = new JPanel();
        this.jPanel1.setLayout(new BorderLayout());       
    }  
    public void colocarbotones(){       
        JButton btn1 = new JButton();
        btn1.setText("Button-1");
        btn1.setEnabled(true);
        jPanel1.add(btn1);
        JButton btn3 = new JButton();
        btn3.setText("Button-3");
        btn3.setEnabled(true);
        jPanel1.add(btn3);
        JButton btn4 = new JButton();
        btn4.setText("Long-Named Button-4");
        btn4.setEnabled(true);
        jPanel1.add(btn4);
        JButton btn5 = new JButton();
        btn5.setText("Button-5");
        btn5.setEnabled(true);
        jPanel1.add(btn5);          
        jPanel1.add(btn1, BorderLayout.NORTH);
        jPanel1.add(jPanelBandera, BorderLayout.CENTER);
        jPanel1.add(btn3, BorderLayout.WEST);
        jPanel1.add(btn4, BorderLayout.SOUTH);
        jPanel1.add(btn5, BorderLayout.EAST);
    }
    public void iniciarBandera() { 
        this.jPanelBandera = new JPanel();
        this.jPanelBandera.setLayout(new GridLayout(7,7));     
        this.jLabelBanderaList = new ArrayList<>();
        for (var i = 0; i < 49; i++)
            this.jLabelBanderaList.add(new JLabel());      
        this.jLabelBanderaList.get(0).setBackground(Color.RED);
        this.jLabelBanderaList.get(1).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(2).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(3).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(4).setBackground(Color.RED);
        this.jLabelBanderaList.get(5).setBackground(Color.RED);
        this.jLabelBanderaList.get(6).setBackground(Color.RED);
        this.jLabelBanderaList.get(7).setBackground(Color.RED);
        this.jLabelBanderaList.get(8).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(9).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(10).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(11).setBackground(Color.RED);
        this.jLabelBanderaList.get(12).setBackground(Color.RED);
        this.jLabelBanderaList.get(13).setBackground(Color.RED);
        this.jLabelBanderaList.get(14).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(15).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(16).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(17).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(18).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(19).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(20).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(21).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(22).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(24).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(25).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(26).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(27).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(28).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(29).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(30).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(31).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(32).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(33).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(34).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(35).setBackground(Color.RED);
        this.jLabelBanderaList.get(36).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(37).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(38).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(39).setBackground(Color.RED);
        this.jLabelBanderaList.get(40).setBackground(Color.RED);
        this.jLabelBanderaList.get(41).setBackground(Color.RED);
        this.jLabelBanderaList.get(42).setBackground(Color.RED);
        this.jLabelBanderaList.get(43).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(44).setBackground(Color.BLUE);
        this.jLabelBanderaList.get(45).setBackground(Color.WHITE);
        this.jLabelBanderaList.get(46).setBackground(Color.RED);
        this.jLabelBanderaList.get(47).setBackground(Color.RED);
        this.jLabelBanderaList.get(48).setBackground(Color.RED); 
        for (var i = 0; i < 49; i++) {
            this.jPanelBandera.add(this.jLabelBanderaList.get(i));
            this.jLabelBanderaList.get(i).setOpaque(true);
        }
    }
}
