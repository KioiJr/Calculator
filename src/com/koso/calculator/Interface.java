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

public class Interface extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 294, 81);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnClr = new JButton("C");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnClr.setBounds(10, 114, 66, 49);
		contentPane.add(btnClr);
		
		JButton btn7 = new JButton("7");
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
		btnDiv.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDiv.setBounds(86, 114, 66, 49);
		contentPane.add(btnDiv);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnX.setBounds(162, 114, 66, 49);
		contentPane.add(btnX);
		
		JButton btn9 = new JButton("9");
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
		btnResult.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnResult.setBounds(238, 391, 66, 49);
		contentPane.add(btnResult);
		
		JButton btnDel = new JButton("Del");
		btnDel.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDel.setBounds(241, 114, 63, 49);
		contentPane.add(btnDel);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSub.setBounds(241, 185, 63, 49);
		contentPane.add(btnSub);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnAdd.setBounds(241, 257, 63, 49);
		contentPane.add(btnAdd);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnDot.setBounds(162, 391, 66, 49);
		contentPane.add(btnDot);
		
		JButton btnPerc = new JButton("%");
		btnPerc.setFont(new Font("Leelawadee", Font.BOLD, 11));
		btnPerc.setBounds(238, 323, 66, 49);
		contentPane.add(btnPerc);
	}
}
