package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;
import java.awt.Component;
import java.awt.Cursor;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTabbedPane;

public class AdminUsuario extends JFrame {

	private JPanel contentPane;
	private String Nombre;

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
	public AdminUsuario(String miNombre) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) 
			{
				int eleccion = JOptionPane.showOptionDialog(null, "Desea salir?",
						"Selecciona una opcion",
						JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						new Object []{"SI","NO"},
						"SI");
				if (eleccion == 0)
				{
					dispose();
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.Nombre = miNombre;
		
		JLabel lblNewLabel = new JLabel("Bienvenido "+this.Nombre);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(10, 11, 414, 14);
		contentPane.add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() 
		{
			
		public void itemStateChanged(ItemEvent arg0) 
		{
				String itemSel = (String) comboBox.getSelectedItem();
				JOptionPane.showMessageDialog( null, ""+itemSel );				
		}
	});
		

		comboBox.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboBox.setBounds(22, 63, 178, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Administrar imagenes");
        comboBox.addItem("Configuracion de la cuenta");
        comboBox.addItem("Configuracion de privacidad");
        comboBox.addItem("Cerrar sesion");
        
        JButton btnNewButton = new JButton("Atras");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	Login miLogin = new Login();
        	miLogin.setVisible(true);
        	miLogin.setDefaultCloseOperation(1);
        	dispose();
        		
        		
        	}
        });
        
        
        
        btnNewButton.setBounds(311, 37, 89, 23);
        contentPane.add(btnNewButton);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(22, 111, 389, 119);
        contentPane.add(tabbedPane);
        
        JPanel p1=new JPanel(null); 
        JLabel lbl1 = new JLabel("panel uno");
        
        JPanel p2=new JPanel(null); 
        JLabel lbl2 = new JLabel("panel dos");
		
        
        
        
        
        
        
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnNewMenu = new JMenu("Mapa");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Directorio");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Clasificados");
		mnNewMenu_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
			
	
		});
		
		menuBar.add(mnNewMenu_2);
		
		JMenu mnVenta = new JMenu("Empleos");
		mnVenta.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu_2.add(mnVenta);
		
		JMenu mnNewMenu_3 = new JMenu("Servicios");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Contacto");
		menuBar.add(mnNewMenu_4);
		
		
	}
	
	public void setNombre(String miNombre)
		{
			this.Nombre = miNombre;
		}
}
