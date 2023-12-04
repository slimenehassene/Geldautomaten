package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class Login extends JFrame implements ActionListener {
	JLabel label1, label2, label3;
	JTextField textField,passwordField;
	JButton button1, button2, button3;
	Login(){
		super("Bank Manegement System");
		
		
		setLayout(null);
		setSize(850,480);
		setLocation(450,200);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(350,10,100,100);
		add(image);
		
		ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
		Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon ii3 = new ImageIcon(ii2);
		JLabel iimage = new JLabel(ii3);
		iimage.setBounds(630,350,100,100);
		add(iimage);
		
		label1 = new JLabel("Willkommen bei der Slimene_Bank");
		label1.setForeground(Color.white);
		label1.setFont(new Font("AvantGarde",Font.BOLD,30));
		label1.setBounds(150,125,600,40);
		add(label1);
		
		label2 = new JLabel("Kontonummer: ");
		label2.setForeground(Color.white);
		label2.setFont(new Font("Ralway",Font.BOLD,25));
		label2.setBounds(150,190,375,30);
		add(label2);
		
		textField = new JTextField(15);
		textField.setBounds(330,190,230,30);
		textField.setFont(new Font("Arial",Font.BOLD,14));
		add(textField);
		
		
		label3 = new JLabel("Passwort: ");
		label3.setForeground(Color.white);
		label3.setFont(new Font("Ralway",Font.BOLD,25));
		label3.setBounds(150,250,375,30);
		add(label3);
		
		
		passwordField = new JPasswordField(15);
		passwordField.setBounds(330,250,230,30);
		passwordField.setFont(new Font("Arial",Font.BOLD,14));
		add(passwordField);
		
		button1 = new JButton("Einloggen");
		button1.setFont(new Font("Arial", Font.BOLD,14));
		button1.setForeground(Color.WHITE);
		button1.setBackground(Color.black);
		button1.setBounds(300,300,110,30);
		button1.addActionListener(this);
		add(button1);
		
		button2 = new JButton("Löschen");
		button2.setFont(new Font("Arial", Font.BOLD,14));
		button2.setForeground(Color.WHITE);
		button2.setBackground(Color.black);
		button2.setBounds(430,300,110,30);
		button2.addActionListener(this);
		add(button2);
		
		button3 = new JButton("Registrieren");
		button3.setFont(new Font("Arial", Font.BOLD,14));
		button3.setForeground(Color.WHITE);
		button3.setBackground(Color.black);
		button3.setBounds(300,350,240,30);
		button3.addActionListener(this);
		add(button3);
		
		ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
		Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
		ImageIcon iii3 = new ImageIcon(iii2);
		JLabel iiimage = new JLabel(iii3);
		iiimage.setBounds(0,0,850,480);
		add(iiimage);
		
		setVisible(true);
	}
	
	 @Override
	    public void actionPerformed(ActionEvent e) {
	        try{
	            if (e.getSource()==button1){
	                Verbindung c = new Verbindung();
	                String cardno = textField.getText();
	                String pin = passwordField.getText();
	                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
	                ResultSet resultSet = c.statement.executeQuery(q);
	                if (resultSet.next()){
	                    setVisible(false);
	                    new main_Class(pin);
	                }else {
	                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
	                }


	            }else if (e.getSource() == button2){
	                textField.setText("");
	                passwordField.setText("");
	            }else if (e.getSource() == button3){
	                new Registrieren();
	                setVisible(false);
	            }
	        }catch (Exception E){
	            E.printStackTrace();
	        }

	    }
 
	public static void main(String[] args) {
		new Login();
	}
}
