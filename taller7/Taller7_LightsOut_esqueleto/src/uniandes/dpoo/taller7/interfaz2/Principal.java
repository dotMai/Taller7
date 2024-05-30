package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Principal extends JFrame {
	private PanelSuperior PanelN;
	private PanelSur PanelS;
	private PanelEste PanelE;
	
	public Principal() {
		
		setSize(800, 600);
		setTitle("Pagina Principal :3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		PanelN = new PanelSuperior();
		add(PanelN, BorderLayout.NORTH);
		
		PanelE = new PanelEste();
		add(PanelE, BorderLayout.EAST);
		
		PanelS = new PanelSur();
		add(PanelS, BorderLayout.SOUTH);
	}
			
			
			
			
			
			
			
			
			
	public static void main (String[] args) {
		Principal princ = new Principal ();
		princ.setVisible(true);
		princ.setLocationRelativeTo(null);
	}
}

