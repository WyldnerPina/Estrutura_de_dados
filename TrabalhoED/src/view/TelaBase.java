package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaBase extends JFrame {
	
	private static final long serialVersionUID = 6909508245638580811L;
	private JPanel contentPane;
	private JTextField txtSistemaDeOrientao;
	private JTextField txtPropriedadeDaFatec;
	private JTextField txtPropriedadeDaFatec_1;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBase frame = new TelaBase();// CHAMADA PARA TELA
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//====================================================================================================================================
//============================================================ TELA BASE =============================================================
//====================================================================================================================================
	public TelaBase() {
		setBackground(new Color(214, 220, 228));
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\A FATEC\\GitHub\\Estrutura_de_dados\\TrabalhoED\\img\\IconeSOE.ico"));
		setTitle("SOE - Sistema de Orientação Estudantil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 50, 1024, 680);// TAMANHO DA TELA
		contentPane = new JPanel();
		contentPane.setBackground(new Color(214, 220, 228));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//----------------------------------------------------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(132, 151, 176));
		lblNewLabel.setIcon(new ImageIcon("D:\\A FATEC\\GitHub\\Estrutura_de_dados\\TrabalhoED\\img\\logoSOE.png"));
		lblNewLabel.setBounds(-18, -11, 266, 115);
		contentPane.add(lblNewLabel);
		
		//----------------------------------------------------------------------------------------------------------------------------
		txtSistemaDeOrientao = new JTextField();
		txtSistemaDeOrientao.setEditable(false);
		txtSistemaDeOrientao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSistemaDeOrientao.setForeground(new Color(255, 255, 255));
		txtSistemaDeOrientao.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtSistemaDeOrientao.setText("SISTEMA DE ORIENTAÇÃO ESTUDANTIL      ");
		txtSistemaDeOrientao.setBackground(new Color(132, 151, 176));
		txtSistemaDeOrientao.setBounds(0, 0, 1008, 93);
		contentPane.add(txtSistemaDeOrientao);
		txtSistemaDeOrientao.setColumns(10);
		
		txtPropriedadeDaFatec_1 = new JTextField();
		txtPropriedadeDaFatec_1.setText("Propriedade da FATEC Zona Leste. Todos os direitos reservados ®");
		txtPropriedadeDaFatec_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPropriedadeDaFatec_1.setForeground(Color.WHITE);
		txtPropriedadeDaFatec_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPropriedadeDaFatec_1.setEditable(false);
		txtPropriedadeDaFatec_1.setColumns(10);
		txtPropriedadeDaFatec_1.setBackground(new Color(132, 151, 176));
		txtPropriedadeDaFatec_1.setBounds(0, 616, 1008, 25);
		contentPane.add(txtPropriedadeDaFatec_1);
		
		txtPropriedadeDaFatec = new JTextField();
		txtPropriedadeDaFatec.setHorizontalAlignment(SwingConstants.CENTER);
		txtPropriedadeDaFatec.setForeground(Color.WHITE);
		txtPropriedadeDaFatec.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPropriedadeDaFatec.setEditable(false);
		txtPropriedadeDaFatec.setColumns(10);
		txtPropriedadeDaFatec.setBackground(new Color(191, 143, 0));
		txtPropriedadeDaFatec.setBounds(0, 612, 1008, 5);
		contentPane.add(txtPropriedadeDaFatec);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(191, 143, 0));
		textField_1.setBounds(0, 92, 1008, 5);
		contentPane.add(textField_1);
		//----------------------------------------------------------------------------------------------------------------------------
	}
}
