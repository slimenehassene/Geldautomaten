package bank.management.system;

import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Registrieren extends JFrame implements ActionListener{
	
	
	JButton next;
	JDateChooser dateChooser; 
	JRadioButton r1,r2,r3,r4,r5;
	JTextField textFieldName,textFieldFName,textEmail,textAdd,textCity,textState,textPin;
	Random random = new Random();
	long first4 = (random.nextLong()% 9000L)+1000L;
	String first = " " + Math.abs(first4);

	Registrieren(){
		super("Application Form");
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(50, 10, 100, 100);
		add(image);
		
		
		JLabel label1 = new JLabel("Antragsnummer: "+first);
		label1.setFont(new Font("Ralway",Font.BOLD,38));
		label1.setBounds(200,20,600,50);
		add(label1);
		
		JLabel label2 = new JLabel(" Seite 1");
		label2.setFont(new Font("Ralway",Font.BOLD,30));
		label2.setBounds(330,70,600,40);
		add(label2);
		
		JLabel label3 = new JLabel("Persönliche Angaben");
		label3.setFont(new Font("Ralway",Font.BOLD,22));
		label3.setBounds(290,110,600,30);
		add(label3);
		
		JLabel label4 = new JLabel("Vorame: ");
		label4.setFont(new Font("Ralway",Font.BOLD,20));
		label4.setBounds(100,190,600,30);
		add(label4);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Ralway",Font.BOLD,14));
		textFieldName.setBounds(300,190,400,30);
		add(textFieldName);
		
		
		JLabel label5 = new JLabel("Nachname: ");
		label5.setFont(new Font("Ralway",Font.BOLD,20));
		label5.setBounds(100,240,600,30);
		add(label5);
		
		textFieldFName = new JTextField();
		textFieldFName.setFont(new Font("Ralway",Font.BOLD,14));
		textFieldFName.setBounds(300,240,400,30);
		add(textFieldFName);
		
		JLabel label6 = new JLabel("Geburtsdatum: ");
		label6.setFont(new Font("Ralway",Font.BOLD,20));
		label6.setBounds(100,340,200,30);
		add(label6);
		
		dateChooser = new JDateChooser() ;
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,340,400,30);
		add(dateChooser);
		
		JLabel label7 = new JLabel("Geschlecht: ");
		label7.setFont(new Font("Ralway",Font.BOLD,20));
		label7.setBounds(100,290,200,30);
		add(label7);
		
		r1 = new JRadioButton("Männlich");
		r1.setFont(new Font("Ralway",Font.BOLD,14));
		r1.setBackground(new Color(222,255,228));
		r1.setBounds(300,290,100,30);
		add(r1);
		
		r2 = new JRadioButton("Weiblich");
		r2.setBackground(new Color(222,255,228));
		r2.setFont(new Font("Ralway",Font.BOLD,14));
		r2.setBounds(450,290,90,30);
		add(r2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
		JLabel label8 = new JLabel("Email Adresse: ");
		label8.setFont(new Font("Ralway",Font.BOLD,20));
		label8.setBounds(100,390,200,30);
		add(label8);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Ralway",Font.BOLD,14));
		textEmail.setBounds(300,390,400,30);
		add(textEmail);
		
		JLabel label9 = new JLabel("Familienstand:  ");
		label9.setFont(new Font("Ralway",Font.BOLD,20));
		label9.setBounds(100,440,200,30);
		add(label9);
		
		r3 = new JRadioButton("verheiratet");
		r3.setBackground(new Color(222,255,228));
		r3.setFont(new Font("Ralway",Font.BOLD,14));
		r3.setBounds(300,440,150,30);
		add(r3);
		
		r4 = new JRadioButton("geschieden");
		r4.setFont(new Font("Ralway",Font.BOLD,14));
		r4.setBackground(new Color(222,255,228));
		r4.setBounds(450,440,150,30);
		add(r4);
		
		r5 = new JRadioButton("ledig");
		r5.setBackground(new Color(222,255,228));
		r5.setFont(new Font("Ralway",Font.BOLD,14));
		r5.setBounds(635,440,150,30);
		add(r5);
		
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(r3);
		buttonGroup1.add(r4);
		buttonGroup1.add(r5);
		
		JLabel labelAdd = new JLabel("Adresse:  ");
		labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
		labelAdd.setBounds(100,490,200,30);
		add(labelAdd);
		
		textAdd = new JTextField();
		textAdd.setFont(new Font("Ralway",Font.BOLD,14));
		textAdd.setBounds(300,490,400,30);
		add(textAdd);
		
		JLabel labelCity = new JLabel("Stadt:  ");
		labelCity.setFont(new Font("Ralway",Font.BOLD,20));
		labelCity.setBounds(100,540,200,30);
		add(labelCity);
		
		textCity = new JTextField();
		textCity.setFont(new Font("Ralway",Font.BOLD,14));
		textCity.setBounds(300,540,400,30);
		add(textCity);
		
		JLabel labelPin = new JLabel("Pin Code:  ");
		labelPin.setFont(new Font("Ralway",Font.BOLD,20));
		labelPin.setBounds(100,590,200,30);
		add(labelPin);
		
		textPin = new JPasswordField();
		textPin.setFont(new Font("Ralway",Font.BOLD,14));
		textPin.setBounds(300,590,400,30);
		add(textPin);
		
		JLabel labelState = new JLabel("Bundesland:  ");
		labelState.setFont(new Font("Ralway",Font.BOLD,20));
		labelState.setBounds(100,640,200,30);
		add(labelState);
		
		textState = new JTextField();
		textState.setFont(new Font("Ralway",Font.BOLD,14));
		textState.setBounds(300,640,400,30);
		add(textState);
		
		next = new JButton("Next");
		next.setFont(new Font("Arial", Font.BOLD,14));
		next.setForeground(Color.WHITE);
		next.setBackground(Color.black);
		next.setBounds(620,710,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String formNo = first;
		String pin = textPin.getText(); 
		String name= textFieldName.getText();
		String fName= textFieldFName.getText();
		String email= textEmail.getText();
		String adresse= textAdd.getText();
		String City= textCity.getText();
		String State= textState.getText();
		String date= ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		String gender= null;
		if(r1.isSelected()) {
			gender="Male";
		}else if (r2.isSelected()) {
			gender="Female";
		}
		String marital=null;
		if(r3.isSelected()) {
			marital="Married";
		}else if (r4.isSelected()) {
			marital="Unmarried";
		}else if (r5.isSelected()) {
			marital="Other";
		}
		 
		
		try {
			if(name.isEmpty()||pin.isEmpty()||fName.isEmpty()||email.isEmpty()||adresse.isEmpty()||City.isEmpty()||State.isEmpty()||date.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Fill all the fields ");
			}else {
				Verbindung ver1= new Verbindung();
				String q= "insert into Verbindung Values('"+name+"','"+fName+"','"+email+"','"+pin+"','"+adresse+"','"+City+"','"+State+"','"+date+"','"+gender+"','"+marital+"','"+formNo+"')";
				ver1.statement.executeUpdate(q);
				Registrieren2 ver2 = new Registrieren2(first);
				setVisible(false);
			}
			
			
		}catch (Exception E) {
			E.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
	new Registrieren();
}
}
