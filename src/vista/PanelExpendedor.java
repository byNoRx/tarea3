import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private int posX;
    private int posY;
    private Expendedor expendedor;

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

        g.setFont(new Font("Arial", Font.BOLD, 14));

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
    }
}
