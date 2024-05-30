package uniandes.dpoo.taller7.interfaz4;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Principal extends JFrame {
    private Norte PanelN;
    private Sur PanelS;
    private Este PanelE;
    private Centro PanelC;

    public Principal() {
        setSize(800, 600);
        setTitle("Página Principal :3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        PanelN = new Norte();
        add(PanelN, BorderLayout.NORTH);

        PanelE = new Este();
        add(PanelE, BorderLayout.EAST);

        PanelS = new Sur();
        add(PanelS, BorderLayout.SOUTH);

        PanelC = new Centro(5); 
        add(PanelC, BorderLayout.CENTER);

        PanelN.getComboBox().addActionListener(e -> {
            String selectedItem = (String) PanelN.getComboBox().getSelectedItem();
            if (selectedItem != null) {
                int newSize = Integer.parseInt(selectedItem.split("x")[0]);
                PanelC.setSize(newSize); 
            }
        });
    }
    
    

    public static void main(String[] args) {
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
