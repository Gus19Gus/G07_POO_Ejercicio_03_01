
package com.mycompany.g07_poo_ejercicio_03_01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Gus-Gus
 */
public class Ventana3 extends JFrame{
   
    public JPanel panel;
    public Ventana3(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(500, 150));
        this.setLocation(new Point(820, 10));
        iniciarComponentes();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void colocarPaneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        this.panel.setLayout(new FlowLayout(5));
    }
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
    }
    private void colocarBotones() {
        JButton btn1 = new JButton();
        btn1.setText("Button-1");
        btn1.setEnabled(true);
        panel.add(btn1);
        JButton btn2 = new JButton();
        btn2.setText("2");
        btn2.setEnabled(true);
        panel.add(btn2);
        JButton btn3 = new JButton();
        btn3.setText("Button-3");
        btn3.setEnabled(true);
        panel.add(btn3);
        JButton btn4 = new JButton();
        btn4.setText("Long-Named Button-4");
        btn4.setEnabled(true);
        panel.add(btn4);
        JButton btn5 = new JButton();
        btn5.setText("Button-5");
        btn5.setEnabled(true);
        panel.add(btn5);
    }
}
