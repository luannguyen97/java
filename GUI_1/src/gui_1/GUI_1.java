/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author luannguyen
 */
public class GUI_1 extends Frame{

    public GUI_1(){
        setTitle("Chuong trinh GUI");
        setSize(300,300);
        setLayout(new FlowLayout());
        
        lblA = new Label("A=");
        add(lblA);
        
        txtA = new TextField(30);
        add(txtA);
        
        lblB = new Label("B=");
        add(lblB);
        
        txtB = new TextField(30);
        add(txtB);
        
        btnTong = new Button("+");
        btnTong.addActionListener(new LangngheCong());
        add(btnTong);
        
        btnHieu = new Button("-");
        btnHieu.addActionListener(new LangngheHieu());
        add(btnHieu);
        
        btnTich = new Button("*");
        btnTich.addActionListener(new LangngheTich());
        add(btnTich);
        
        btnThuong = new Button("/");
        btnThuong.addActionListener(new LangngheThuong());
        add(btnThuong);
        
        lblKq = new Label("Ket qua=");
        add(lblKq);
        
        txtKq = new TextField(20);
        add(txtKq);
        
        xulysukiencuaso bolangnghe = new xulysukiencuaso();
        addWindowListener(bolangnghe);
        
        setVisible(true);
        
}
   
    public static void main(String[] args) {
        new GUI_1();
    }
    //Bo lang nghe
    class LangngheCong implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Tong = a+b;
            txtKq.setText(String.valueOf(Tong));
        }
    }
    
    class LangngheHieu implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Hieu = a-b;
            txtKq.setText(String.valueOf(Hieu));
        }
    }
    class LangngheTich implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Tich = a*b;
            txtKq.setText(String.valueOf(Tich));
        }
    }
    class LangngheThuong implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(txtA.getText());
            int b = Integer.parseInt(txtB.getText());
            int Thuong = a/b;
            txtKq.setText(String.valueOf(Thuong));
        }
    }
    static class xulysukiencuaso implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    
    }
    
    Label lblA, lblB, lblKq;
    TextField txtA, txtB, txtKq;
    Button btnTong, btnHieu, btnTich, btnThuong;
}
