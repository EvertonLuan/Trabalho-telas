import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MeuFrame extends JFrame {

	private JPanel contentPane;
	private JTextPane textlogin;
	private JTextPane textsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeuFrame frame = new MeuFrame();
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
	public MeuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_OK = new JButton("OK");
		btn_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				if(textlogin.getText().equals("admin") & textsenha.getText().equals("swordfish") ) {
					JOptionPane.showMessageDialog(contentPane,"Login realizado com sucesso!");
				} else {
					JOptionPane.showMessageDialog(contentPane,"Senha ou login incorretos, tente novamente");
		}
				
			}
		});
		btn_OK.setForeground(SystemColor.activeCaptionText);
		btn_OK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_OK.setBounds(134, 144, 92, 31);
		contentPane.add(btn_OK);
		
		JLabel Login = new JLabel("Login:");
		Login.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Login.setForeground(new Color(0, 0, 0));
		Login.setBounds(42, 42, 51, 31);
		contentPane.add(Login);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(42, 85, 51, 31);
		contentPane.add(lblSenha);
		
		textlogin = new JTextPane();
		textlogin.setBounds(103, 42, 217, 25);
		contentPane.add(textlogin);
		
		textsenha = new JTextPane();
		textsenha.setBounds(103, 91, 217, 25);
		contentPane.add(textsenha);
	}
}
