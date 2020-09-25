package Fibonaci2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class FiboVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FiboVentana frame = new FiboVentana();
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
	public FiboVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Iteraciones");
		lblNewLabel.setBounds(23, 30, 85, 21);
		contentPane.add(lblNewLabel);
		
		JTextArea txtIteraciones = new JTextArea();
		txtIteraciones.setBounds(118, 28, 62, 22);
		contentPane.add(txtIteraciones);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 1");
		lblNewLabel_1.setBounds(23, 77, 85, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtNum1 = new JTextArea();
		txtNum1.setBounds(118, 72, 62, 22);
		contentPane.add(txtNum1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero 2");
		lblNewLabel_2.setBounds(23, 121, 85, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtNum2 = new JTextArea();
		txtNum2.setBounds(118, 116, 62, 22);
		contentPane.add(txtNum2);
		
		JList Lista = new JList();
		DefaultListModel modelo = new DefaultListModel();
		Lista.setBounds(297, 11, 127, 239);
		contentPane.add(Lista);
		
		
		Button btnCalcularFibonaci = new Button("Calcular Serie Fibonaci");
		btnCalcularFibonaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iteraciones=0, cont=0,num1=0, num2=0, num3=0;
				iteraciones= Integer.parseInt(txtIteraciones.getText());
				num1 = Integer.parseInt( txtNum1.getText());
				num2=Integer.parseInt( txtNum2.getText());
			     do
			     {
			          num3=num1+num2;
			         
			         modelo.addElement("interacion "+cont+"  "+" "+num3);
			         num1=num2;
			         num2=num3;
			         cont += 1;
			     }while(cont<iteraciones);
			     Lista.setModel(modelo);
			}
		});
		btnCalcularFibonaci.setBounds(44, 184, 167, 43);
		contentPane.add(btnCalcularFibonaci);
		
		
		
		
	}
}
