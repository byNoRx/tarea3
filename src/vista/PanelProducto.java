import javax.swing.*;
import java.awt.*;

public class PanelProducto extends JPanel {
    private int posX;
    private int posY;
    //private Producto producto;

    public PanelProducto(int posX, int posY, Producto producto) {
        this.posX = posX;
        this.posY = posY;
        //.producto = producto;
    }

    /*@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(posX, posY, ObjetoSize.PRO.getWidth(), ObjetoSize.PRO.getHeight());
    }*/
}


