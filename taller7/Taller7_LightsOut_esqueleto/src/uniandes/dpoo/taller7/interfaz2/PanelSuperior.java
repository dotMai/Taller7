package uniandes.dpoo.taller7.interfaz2;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelSuperior extends JPanel {
	private JLabel Tama�o;
	private JLabel Dificultad;
	
	public PanelSuperior() {
		Tama�o = new JLabel("Tama�o ");
		add(Tama�o);
		
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("1x1");
		combo.addItem("2x2");
		combo.addItem("3x3");
		combo.addItem("4x4");
		combo.addItem("5x5");
		add(combo);
		
		add(new JLabel( "         "));
		
		Dificultad = new JLabel(" Dificultad ");
		add(Dificultad);
		
		JRadioButton facil = new JRadioButton("F�cil");
		JRadioButton medio = new JRadioButton("Medio");
		JRadioButton dificil = new JRadioButton("Dif�cil");
		ButtonGroup group = new ButtonGroup();
		group.add(facil);
		group.add(medio);
		group.add(dificil);
		add(facil);
		add(medio);
		add(dificil);

	}
	
	
	

}
