package ntu.phongnt63135074;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

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
		
		JLabel lblPhamMem = new JLabel("Phần Mềm Tính Chỉ Số BMI");
		lblPhamMem.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblPhamMem.setBounds(118, 10, 339, 44);
		contentPane.add(lblPhamMem);
		
		JLabel lblChieuCao = new JLabel("Chiều cao (cm):");
		lblChieuCao.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblChieuCao.setBounds(10, 77, 177, 34);
		contentPane.add(lblChieuCao);
		
		JLabel lblCanNang = new JLabel("Cân Nặng (kg):");
		lblCanNang.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCanNang.setBounds(10, 134, 165, 44);
		contentPane.add(lblCanNang);
		
		textField = new JTextField();
		textField.setBounds(161, 80, 312, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 142, 312, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTinh.setBackground(new Color(255, 0, 0));
		btnTinh.setBounds(234, 209, 114, 34);
		contentPane.add(btnTinh);
		
		btnTinh.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tinhBMI();
            }
        });
		
		
		JLabel lblNewLabel_3 = new JLabel("Thiếu cân <18.5");
		lblNewLabel_3.setBackground(new Color(128, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 357, 133, 44);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cân đối 18.5-24.5");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_3_1.setBounds(199, 357, 151, 44);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Thừa cân 25-29.9");
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_2.setBackground(new Color(255, 255, 0));
		lblNewLabel_3_2.setBounds(416, 357, 144, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Béo phì 30-34.9");
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_3.setBackground(new Color(255, 128, 64));
		lblNewLabel_3_3.setBounds(118, 411, 133, 44);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Béo phì nguy hiểm >34.9");
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_4.setBackground(new Color(255, 0, 0));
		lblNewLabel_3_4.setBounds(300, 411, 239, 44);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblKetQua = new JLabel("");
		lblKetQua.setEnabled(false);
		lblKetQua.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblKetQua.setBounds(10, 264, 550, 74);
		contentPane.add(lblKetQua);
	}
	
	private void tinhBMI() {
		
	}
}
