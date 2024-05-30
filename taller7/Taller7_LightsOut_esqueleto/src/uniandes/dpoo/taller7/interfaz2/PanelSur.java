package uniandes.dpoo.taller7.interfaz2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelSur extends JPanel{
	private JLabel jugador;
	private JLabel jugadas;

	public PanelSur() {
	
		jugadas = new JLabel("Jugadas");
		add(jugadas);
		
		JTextField t_jugadas = new JTextField("0                        ");
		add(t_jugadas);
		
		jugador = new JLabel("Jugador");
		add(jugador);
		
		JTextField t_jugador = new JTextField("                              ");
		add(t_jugador);
	}
}
