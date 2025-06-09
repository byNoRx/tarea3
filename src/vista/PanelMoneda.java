import javax.swing.*;
import java.awt.*;

public class PanelMoneda extends JPanel {
    private int posX;
    private int posY;
    private Moneda moneda;

    PanelMoneda(int posX, int posY, Moneda moneda) {
        this.posX = posX;
        this.posY = posY;

        this.moneda = moneda;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.yellow);
        g.fillOval(posX, posY, ObjetoSize.OBJ.getWidth(), ObjetoSize.OBJ.getHeight());

        /*if (moneda.getValor() == 100) {
            g.setColor(Color.lightGray);
        }*/

    }
}
