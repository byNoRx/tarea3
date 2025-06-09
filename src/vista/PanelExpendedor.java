import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {

    private int posX;
    private int posY;
    private Expendedor expendedor;
    private JPanel panel1;

    /**
     * Constructor
     *
     * @param posX
     * @param posY
     * @param expendedor
     */
    public PanelExpendedor(int posX, int posY, Expendedor expendedor) {
        this.posX = posX;
        this.posY = posY;
        this.expendedor = expendedor;



    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(posX, posY, ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight());



        // Dibujar la maquina expendedora
        g.setColor(Color.GRAY);
        g.fillRect(50, 50, 300, 500);
        g.drawString("Maquina Expendedora", 130, 40);



        // Dibujar la ventana de productos
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 200, 250);

        g.setColor(Color.BLUE);
        g.fillRect(100,360,150,50);


        // Dibujar ranura de pago
        g.setColor(Color.DARK_GRAY);
        g.fillRect(300, 350, 50, 20);

        // Dibujar salida de productos
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(150, 500, 100, 50);

        // Dibujar monedero
        g.setColor(Color.ORANGE);
        g.fillRect(320, 600, 50, 50); // Representa el cuerpo del monedero
        g.setColor(Color.YELLOW);
        g.fillOval(335, 600, 20, 20); // Representa una moneda dentro

        g.setColor(Color.black);
        g.drawString("Monedero", 325, 580);



    }
}
