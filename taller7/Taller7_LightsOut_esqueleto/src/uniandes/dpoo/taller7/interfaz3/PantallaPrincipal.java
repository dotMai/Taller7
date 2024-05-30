package uniandes.dpoo.taller7.interfaz3;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class PantallaPrincipal extends JFrame {
    private Norte PanelN;
    private Sur PanelS;
    private Este PanelE;
    private Centro PanelC;

    public PantallaPrincipal() {
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

        PanelC = new Centro(5); // Inicializa el panel Centro con un tamaño de 5
        add(PanelC, BorderLayout.CENTER);

        // Añade el ActionListener al JComboBox en PanelN
        PanelN.getComboBox().addActionListener(e -> {
            String selectedItem = (String) PanelN.getComboBox().getSelectedItem();
            if (selectedItem != null) {
                int newSize = Integer.parseInt(selectedItem.split("x")[0]);
                PanelC.setSize(newSize); // Actualiza el tamaño del tablero
            }
        });
    }

    public static void main(String[] args) {
        PantallaPrincipal princ = new PantallaPrincipal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}



