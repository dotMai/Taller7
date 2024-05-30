package uniandes.dpoo.taller7.interfaz2;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelEste extends JPanel{
	private JButton nuevo;
	private JButton reiniciar;
	private JButton top;
	private JButton cambio;
	
	public PanelEste() {
		
		setLayout( new GridLayout( 13, 1 ) );
		
		add(new JLabel( ""));
		
		nuevo =  new JButton ("NUEVO");
		add(nuevo);
		
		add(new JLabel( ""));
		
		reiniciar = new JButton("REINICIAR");
		add(reiniciar);
		
		add(new JLabel( ""));
		
		top = new JButton("TOP-10");
		add(top);
		
		add(new JLabel( ""));
		
		cambio = new JButton("CAMBIAR JUGADOR");
		add(cambio);
		
		

	}
}
