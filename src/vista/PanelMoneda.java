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

        if (moneda == null) {
            return;
        }

        if (moneda.getValor() == 100) {
            g.setColor(Color.lightGray);
        }
        else if (moneda.getValor() == 500) {
            g.setColor(Color.yellow);
        }
        else if (moneda.getValor() == 1000) {
            g.setColor(Color.blue);
        }
        else if (moneda.getValor() == 1500) {
            g.setColor(Color.magenta);
        }

        g.fillOval(posX, posY, ObjetoSize.OBJ.getWidth(), ObjetoSize.OBJ.getHeight());
    }
}
