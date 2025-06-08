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
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(posX, posY, ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight());
    }
}
