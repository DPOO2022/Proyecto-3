package Interfaz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelAdmin extends JPanel implements ActionListener{
	private static final String CTEMPORADA = "CTEMPORADA";
	private static final String CPARTIDO = "CPARTIDO";
	
	private VentanaAdmin padre;
	
	private JButton cargarTemporada;
	private JButton cargarUnPartido;
	
	
	public PanelAdmin(VentanaAdmin papa) {
		padre = papa;
		
		cargarTemporada = new JButton("Cargar la información de la temporada");
		cargarTemporada.setActionCommand(CTEMPORADA);
		cargarTemporada.addActionListener(this);
		
		cargarUnPartido = new JButton("Cargar la información de un partido");
		cargarUnPartido.setActionCommand(CPARTIDO);
		cargarUnPartido.addActionListener(this);
		
		
		setBorder(new TitledBorder("Bienvenido admin!"));
		
		setLayout(new FlowLayout());
		
		add(cargarTemporada);
		add(cargarUnPartido);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String evento = e.getActionCommand();
		if (evento.equals(CTEMPORADA)) {
			//this.padre.configurarTemporada();
		}
		if (evento.equals(CPARTIDO)) {
			//padre.carg
		}
		
	}
}
