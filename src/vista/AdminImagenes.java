package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AdminImagenes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminImagenes frame = new AdminImagenes();
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
	public AdminImagenes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
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
		contentPane.setLayout(null);
		
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
		comboBox.setBounds(246, 11, 178, 20);
		contentPane.add(comboBox);
		comboBox.addItem("Administrar imagenes");
        comboBox.addItem("Configuracion de la cuenta");
        comboBox.addItem("Configuracion de privacidad");
        comboBox.addItem("Cerrar sesion");
        
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(28, 60, 401, 176);
        contentPane.add(tabbedPane);
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
        
        JLabel etiqueta1 = new JLabel( "panel uno", SwingConstants.CENTER );
        JPanel panel1 = new JPanel();
        panel1.add( etiqueta1 ); 
        tabbedPane.addTab( "Ficha uno", null, panel1, "Primer panel" ); 
        
        /************************************/
        /**********************************/
	}

}
