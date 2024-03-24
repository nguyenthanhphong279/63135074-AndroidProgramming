package ntu.phongnt63135074;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AppBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public AppBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phần Mềm Tính Chỉ Số BMI");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(118, 10, 339, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chiều cao (cm):");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 77, 177, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cân Nặng (kg):");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 134, 165, 44);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(161, 80, 312, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 142, 312, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.setBounds(263, 216, 85, 21);
		contentPane.add(btnNewButton);
	}
}
