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
	private JTextField txtChieuCao;
	private JTextField txtCanNang;
	private JTextField txtKetQua;

	
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
		
		txtChieuCao = new JTextField();
		txtChieuCao.setBounds(161, 80, 312, 34);
		contentPane.add(txtChieuCao);
		txtChieuCao.setColumns(10);
		
		txtCanNang = new JTextField();
		txtCanNang.setBounds(161, 142, 312, 34);
		contentPane.add(txtCanNang);
		txtCanNang.setColumns(10);
		
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
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setBackground(new Color(128, 255, 255));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 357, 133, 44);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cân đối 18.5-24.5");
		lblNewLabel_3_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_3_1.setBounds(199, 357, 151, 44);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Thừa cân 25-29.9");
		lblNewLabel_3_2.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_2.setBackground(new Color(255, 255, 0));
		lblNewLabel_3_2.setBounds(416, 357, 144, 44);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Béo phì 30-34.9");
		lblNewLabel_3_3.setForeground(new Color(255, 128, 64));
		lblNewLabel_3_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_3.setBackground(new Color(255, 128, 64));
		lblNewLabel_3_3.setBounds(118, 411, 133, 44);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Béo phì nguy hiểm >34.9");
		lblNewLabel_3_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_3_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_3_4.setBackground(new Color(255, 0, 0));
		lblNewLabel_3_4.setBounds(300, 411, 239, 44);
		contentPane.add(lblNewLabel_3_4);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtKetQua.setBounds(10, 269, 560, 78);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
	
	private void tinhBMI() {
		double chieuCao = Double.parseDouble(txtChieuCao.getText());
		double canNang = Double.parseDouble(txtCanNang.getText());
		double ketQua = canNang / (chieuCao * chieuCao / 10000);
		inKQ(ketQua);
	}
	
	private void inKQ(double ketQua) {
		String BMI;
		if(ketQua < 18.5){
            BMI = "Thiếu cân! Bạn hãy bổ sung thêm nhiều thực phẩm";
        }
        else if(ketQua >= 18.5 && ketQua < 24.9){
            BMI = "Chúc mừng bạn có thân hình cân đối!";
        }
        else if(ketQua >= 25 && ketQua < 29.9){
            BMI = "Bạn đang trong tình trạng thừa cân!";
        }
        else if(ketQua >= 30 && ketQua < 34.9){
            BMI = "Bạn đang trong tình trạng béo phì!";
        }
        else{
            BMI = "Bạn đang trong tình trạng béo phì nguy hiểm!!!";
        }
		txtKetQua.setText(String.format("BMI: %.1f\n %s", ketQua , BMI));
	}
	
	
}

