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
import javax.swing.JSeparator;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.Nombre = miNombre;
		
		JLabel lblNewLabel = new JLabel("Bienvenido "+this.Nombre);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(10, 11, 195, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() 
		{
			public void itemStateChanged(ItemEvent arg0) 
			{
				if(comboBox.getSelectedItem() == "Administrar imagenes"){
					AdminImagenes miAdminImagenes = new AdminImagenes();
					miAdminImagenes.setVisible(true);
					miAdminImagenes.setDefaultCloseOperation(1);
					dispose();
				}
				
			}
		});
		

		comboBox.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboBox.setBounds(246, 8, 178, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Administrar imagenes");
        comboBox.addItem("Configuracion de la cuenta");
        comboBox.addItem("Configuracion de privacidad");
        comboBox.addItem("Cerrar sesion");
        
        JButton btnNewButton = new JButton("Atras");
        btnNewButton.addActionListener(new ActionListener() {
        	
      public void actionPerformed(ActionEvent e) 
      {
        	Login miLogin = new Login();
        	miLogin.setVisible(true);
        	miLogin.setDefaultCloseOperation(1);
        	dispose();
       }
        });
        
        
        
        btnNewButton.setBounds(345, 218, 89, 23);
        contentPane.add(btnNewButton);
        /************************************/
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(10, 56, 414, 137);
        contentPane.add(tabbedPane);
        
        JLabel etiqueta1 = new JLabel( "panel uno", SwingConstants.CENTER );
        JPanel panel1 = new JPanel();
        panel1.add( etiqueta1 ); 
        tabbedPane.addTab( "Ficha uno", null, panel1, "Primer panel" ); 
        /************************************/
        
        /***********************************/
        JLabel etiqueta2 = new JLabel( "panel dos", SwingConstants.CENTER );
        JPanel panel2 = new JPanel();
        panel2.add( etiqueta2 ); 
        tabbedPane.addTab( "Ficha dos", null, panel2, "Segundo panel" ); 
        /************************************/
        /**********************************/
        
        JLabel etiqueta3 = new JLabel( "panel tres", SwingConstants.CENTER );
        JPanel panel3 = new JPanel();
        panel3.add( etiqueta3 ); 
        tabbedPane.addTab( "Ficha tres", null, panel3, "Tercer panel" ); 
        
        /************************************/
        /**********************************/
 
        
        
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 204, 414, -8);
        contentPane.add(separator);
        
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

}
