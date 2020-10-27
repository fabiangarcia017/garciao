package Ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(42, 103, 58, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(42, 166, 58, 33);
		contentPane.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(110, 105, 86, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(110, 172, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] Usuarios= {"Fabian","Jose","MIguel"};
				
				int[] Pass= {123, 321 ,456};
				String Usuario;
				int Password;
				Usuario = txtUsuario.getText();
				Password= Integer.parseInt(txtPassword.getText());
				
				for(int i=0; i<=Usuarios.length; i++)
				{
					
					if(Usuarios[i].equals(Usuario)&&Pass[i]==Password)
					{
						 JOptionPane.showMessageDialog(null, "Bienvenido","Ingresaste",JOptionPane.INFORMATION_MESSAGE);
						 
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos","Error",JOptionPane.ERROR_MESSAGE);
						
					}
					continue;
				}
				
			}
		});
		btnAceptar.setBounds(273, 113, 112, 60);
		contentPane.add(btnAceptar);
		
		JLabel lblNewLabel_2 = new JLabel("Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(158, 26, 105, 33);
		contentPane.add(lblNewLabel_2);
	}
}
