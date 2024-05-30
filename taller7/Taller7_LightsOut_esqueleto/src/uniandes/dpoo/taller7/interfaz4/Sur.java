package uniandes.dpoo.taller7.interfaz4;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sur extends JPanel {
    private JLabel jugador;
    private JLabel jugadas;

    public Sur() {
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
