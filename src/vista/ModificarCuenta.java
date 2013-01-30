package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class ModificarCuenta extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ModificarCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Administrar imagenes", "Configuracion de la cuenta", "Configuracion de la privacidad", "Cerrar sesion"}));
		comboBox.setBounds(22, 63, 178, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(38, 107, 46, 14);
		contentPane.add(lblNewLabel);
	
	}

}
