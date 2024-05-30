package uniandes.dpoo.taller7.interfaz3;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class Centro extends JPanel {
    private int size;

    public Centro(int initialSize) {
        this.size = initialSize;
    }

    public void setSize(int newSize) {
        this.size = newSize;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        drawBoard(g2d);
    }

    private void drawBoard(Graphics2D g2d) {
        int width = getWidth();
        int height = getHeight();
        int cellSize = Math.min(width, height) / size;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g2d.setColor(Color.YELLOW);
                g2d.fillRect(i * cellSize, j * cellSize, cellSize, cellSize);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(i * cellSize, j * cellSize, cellSize, cellSize);
            }
        }
    }
}


