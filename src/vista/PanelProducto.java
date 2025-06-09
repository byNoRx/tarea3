import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {
    private int posX;
    private int posY;
    private Producto producto;

    public PanelProducto(int posX, int posY, Producto producto) {
        this.posX = posX;
        this.posY = posY;
        this.producto = producto;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (producto == null) {
            return;
        }

        switch (producto) {
            case CocaCola cocaCola -> g.setColor(Color.red);
            case Fanta fanta -> g.setColor(Color.orange);
            case Sprite sprite -> g.setColor(Color.green);
            case Snickers snickers -> g.setColor(Color.yellow);
            case Super8 super8 -> g.setColor(Color.black);
            default -> g.setColor(Color.white);
        }

        g.fillRect(posX, posY, ObjetoSize.OBJ.getWidth(), ObjetoSize.OBJ.getHeight());
    }
}


