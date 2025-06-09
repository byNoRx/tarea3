import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
    private int posX;
    private int posY;

    /**
     * Constructor
     * 
     * @param posX
     * @param posY
     * @param comprador
     */
    public PanelComprador(int posX, int posY, Comprador comprador) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(posX, posY, ObjetoSize.COM.getWidth(), ObjetoSize.COM.getHeight());
    }
}
