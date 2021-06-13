package com.tb.gui2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class CalcDemo1 {

	public JFrame frame;
	private JTextField textField;
	private JButton txtDisplay;
	private JButton btn_1;
	private JButton btn;
	double firstNum;
	double secondNum;
	String operation;
	String answer;
	double  result;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn7_1;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7_2;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn7_5;
	private JButton btn0;
	private JButton btn7_7;
	private JButton btn7_8;
	private JButton btn7_9;

	
	/**
	 * Create the application.
	 */
	public CalcDemo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(72, 209, 204));
		frame.setFont(null);
		frame.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 28));
		frame.setBounds(100, 100, 357, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Calibri", Font.BOLD, 28));
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=textField.getText();
				textField.setText(result);

				
			}
		});
		textField.setBounds(19, 24, 309, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(12, 147, 80, 70);
		btnC.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btnC);
		
		JButton btn_12 = new JButton("X");
		btn_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn_12=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					btn_12=str.toString();
					textField.setText(btn_12);
				}
			}
		});
		btn_12.setBounds(91, 147, 80, 70);
		btn_12.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn_12);
		
		btn_1 = new JButton("%");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btn_1.setBounds(169, 147, 80, 70);
		btn_1.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn_1);
		
		btn = new JButton("/");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn.setBounds(247, 147, 81, 70);
		btn.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn);

		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn7.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn7.setBounds(12, 215, 80, 70);
		btn7.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn8.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn8.setBounds(91, 215, 80, 70);
		btn8.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn9.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn9.setBounds(169, 215, 80, 70);
		btn9.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn9);
		
		btn7_1 = new JButton("*");
		btn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText(""); 
				operation="*";
			}
		});
		btn7_1.setBounds(247, 215, 80, 70);
		btn7_1.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn7_1); 
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn4.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn4.setBounds(12, 283, 80, 70);
		btn4.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn5.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn5.setBounds(91, 283, 80, 70);
		btn5.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn6.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn6.setBounds(169, 283, 80, 70);
		btn6.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn6);
		
		btn7_2 = new JButton("-");
		btn7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btn7_2.setBounds(247, 283, 80, 70);
		btn7_2.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn7_2);
		
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn1.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn1.setBounds(12, 352, 80, 70);
		btn1.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn2.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn2.setBounds(91, 352, 80, 70);
		btn2.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Entername=textField.getText()+btn3.getText();
				textField.setText(Entername);
				
			}
		});
		btn3.setBounds(169, 352, 80, 70);
		btn3.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn3);
		
		btn7_5 = new JButton("+");
		btn7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btn7_5.setBounds(247, 352, 80, 70);
		btn7_5.setFont(new Font("Calibri", Font.BOLD, 28));
		frame.getContentPane().add(btn7_5);
		
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber=textField.getText()+btn0.getText();
				textField.setText(Enternumber);
				
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 28));
		btn0.setBounds(12, 422, 80, 70);
		frame.getContentPane().add(btn0);
		
		btn7_7 = new JButton(".");
		btn7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=".";
			}
		});
		btn7_7.setFont(new Font("Calibri", Font.BOLD, 28));
		btn7_7.setBounds(91, 422, 80, 70);
		frame.getContentPane().add(btn7_7);
		
		btn7_8 = new JButton("+/-");
		btn7_8.setBackground(new Color(240, 240, 240));
		btn7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+/-";
			}
		});
		btn7_8.setFont(new Font("Calibri", Font.BOLD, 28));
		btn7_8.setBounds(169, 422, 80, 70);
		frame.getContentPane().add(btn7_8);
		
		
		btn7_9 = new JButton("=");
		btn7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNum=Double.parseDouble(textField.getText());
				
				if(operation=="+") {
					result=firstNum+secondNum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=firstNum-secondNum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				
					
				}
			else if(operation=="*") {
					result=firstNum*secondNum;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				
					
				}
			else if(operation=="/") {
				result=firstNum/secondNum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
			
				
			}
			else if(operation=="%") {
				result=firstNum%secondNum;
				answer=String.format("%.2f",result);
				textField.setText(answer);
			
				
			}
				
				
			}
		});
		btn7_9.setFont(new Font("Calibri", Font.BOLD, 28));
		btn7_9.setBounds(247, 422, 80, 70);
		frame.getContentPane().add(btn7_9);
	}
}
