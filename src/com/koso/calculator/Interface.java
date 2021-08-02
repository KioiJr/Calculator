package com.koso.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 294, 92);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClr = new JButton("C");
		btnClr.setBackground(Color.CYAN);
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnClr.setBounds(10, 114, 66, 49);
		contentPane.add(btnClr);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.CYAN);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn7.setBounds(10, 185, 66, 49);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.CYAN);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn4.setBounds(10, 257, 66, 49);
		contentPane.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.CYAN);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn1.setBounds(10, 323, 66, 49);
		contentPane.add(btn1);
		
		JButton btn00 = new JButton("00");
		btn00.setBackground(Color.CYAN);
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn00.setBounds(10, 391, 66, 49);
		contentPane.add(btn00);
		
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.CYAN);
		btn0.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+btn0.getText();
				textField.setText(number);
				}
		});
		btn0.setBounds(86, 391, 66, 49);
		contentPane.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.CYAN);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn2.setBounds(86, 323, 66, 49);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.CYAN);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn5.setBounds(86, 257, 66, 49);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.CYAN);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn8.setBounds(86, 185, 66, 49);
		contentPane.add(btn8);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(Color.CYAN);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/"; 
			}
		});
		btnDiv.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDiv.setBounds(86, 114, 66, 49);
		contentPane.add(btnDiv);
		
		JButton btnX = new JButton("X");
		btnX.setBackground(Color.CYAN);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*"; 
			}
		});
		btnX.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnX.setBounds(162, 114, 66, 49);
		contentPane.add(btnX);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.CYAN);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn9.setBounds(162, 185, 66, 49);
		contentPane.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.CYAN);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn6.setBounds(162, 257, 66, 49);
		contentPane.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.CYAN);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btn3.setBounds(162, 323, 66, 49);
		contentPane.add(btn3);
		
		JButton btnResult = new JButton("=");
		btnResult.setBackground(Color.CYAN);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation =="+") {
					result = first +second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				
				else if(operation =="-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				
				else if(operation =="/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				
				else if(operation =="*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
				
				else if(operation =="%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);	
				}
			}
		});
		btnResult.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnResult.setBounds(238, 391, 66, 49);
		contentPane.add(btnResult);
		
		JButton btnDel = new JButton("Del");
		btnDel.setForeground(Color.RED);
		btnDel.setBackground(Color.CYAN);
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String del = null;
				if(textField.getText().length()>0) {
					StringBuilder builder = new StringBuilder(textField.getText());
					builder.deleteCharAt(textField.getText().length()-1);
					del = builder.toString();
					textField.setText(del);
					
				}
			}
		});
		btnDel.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDel.setBounds(241, 114, 63, 49);
		contentPane.add(btnDel);
		
		JButton btnSub = new JButton("-");
		btnSub.setBackground(Color.CYAN);
		btnSub.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-"; 
			}
		});
		btnSub.setBounds(241, 185, 63, 49);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBackground(Color.CYAN);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "+"; 
			}
		});
		btnAdd.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnAdd.setBounds(241, 257, 63, 49);
		contentPane.add(btnAdd);
		
		JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.CYAN);
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDot.setBounds(162, 391, 66, 49);
		contentPane.add(btnDot);
		
		JButton btnPerc = new JButton("%");
		btnPerc.setBackground(Color.CYAN);
		btnPerc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%"; 
			}
		});
		btnPerc.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnPerc.setBounds(238, 323, 66, 49);
		contentPane.add(btnPerc);
	}
}
