package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		setResizable(false);
		setTitle("Ingreso al sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnNewMenu = new JMenu("Mapa");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Directorio");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Clasificados");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnVenta = new JMenu("Empleos");
		mnVenta.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.add(mnVenta);
		
		JMenu mnNewMenu_3 = new JMenu("Servicios");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Contacto");
		menuBar.add(mnNewMenu_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Busca Armenia");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
		lblNewLabel.setBounds(117, 11, 194, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de Usuario:");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreDeUsuario.setBounds(25, 76, 125, 14);
		contentPane.add(lblNombreDeUsuario);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(62, 117, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(164, 76, 132, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AdminUsuario miAdmin = new AdminUsuario();
				miAdmin.setVisible(true);
				miAdmin.setDefaultCloseOperation(1);
				
				
				
			}
		});
		btnIngresar.setBounds(205, 157, 91, 23);
		contentPane.add(btnIngresar);
		
		JButton btnOlvidoContrasea = new JButton("Olvido Contrase\u00F1a?");
		btnOlvidoContrasea.setMnemonic('o');
		btnOlvidoContrasea.setToolTipText("Olvido Contrase\u00F1a?");
		btnOlvidoContrasea.setVerticalAlignment(SwingConstants.BOTTOM);
		btnOlvidoContrasea.setBounds(161, 218, 150, 23);
		contentPane.add(btnOlvidoContrasea);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBounds(325, 218, 109, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(164, 114, 132, 20);
		contentPane.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 205, 424, 2);
		contentPane.add(separator);
	}
}
