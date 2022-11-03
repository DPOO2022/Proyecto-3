package Interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelUsuarioSuperior extends JPanel implements ActionListener{
	private static final String COMPRAR = "COMPRAR";
	private static final String VENDER = "VENDER";
	private VentanaUsuario padre;
	
	private JButton verEstadisticas;
	private JButton comprarJugador;
	private JButton venderJugador;
	
	public PanelUsuarioSuperior(VentanaUsuario papa) {
		padre = papa;
		
		verEstadisticas = new JButton("Ver Estadísticas");
		comprarJugador = new JButton("Comprar Jugador");
		venderJugador = new JButton("Vender Jugador");
		setBorder(new TitledBorder("Bienvenido "+ padre.getInterfaz().getAplicacion().getUsuarioActivo().getNombreUsuario()+"!"));
		setLayout(new FlowLayout());
		add(verEstadisticas);
		add(comprarJugador);
		add(venderJugador);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String evento = e.getActionCommand();
		if (evento.equals(COMPRAR)) {}
		if (evento.equals(VENDER)) {
			this.padre.venderJugador();
		}
	}

}
