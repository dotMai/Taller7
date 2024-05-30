package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Principal extends JFrame {

	
	public Principal() {
		
		setSize(800, 600);
		setTitle("Pagina Principal :3");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
	}
	
	public static void main (String[] args) {
		Principal princ = new Principal ();
		princ.setVisible(true);
		princ.setLocationRelativeTo(null);
	}
}
