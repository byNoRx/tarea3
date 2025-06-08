import java.awt.*;

public class PanelExpendedor {
    private int posX;
    private int posY;
    private Expendedor expendedor;

    // Metodo constructor
    public PanelExpendedor(int posX, int posY, Expendedor expendedor) {
        this.posX = posX;
        this.posY = posY;
        this.expendedor = expendedor;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(posX, posY, ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight());
    }
}
