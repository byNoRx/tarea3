import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    // Posiciones
    private int posX;
    private int posY;

    // Depositos de bebidas
    private PanelDeposito<Producto> depositoCoca;
    private PanelDeposito<Producto> depositoFanta;
    private PanelDeposito<Producto> depositoSprite;

    // Depositos de dulces
    private PanelDeposito<Producto> depositoSnickers;
    private PanelDeposito<Producto> depositoSuper8;

    // Deposito de monedas
    private PanelDeposito<Moneda> depositoMonedasVuelto;
    private PanelDeposito<Moneda> depositoMonedas;

    private PanelProducto bandejaDeEntrega;

    /**
     * Constructor
     *
     * @param posX
     * @param posY
     * @param expendedor
     */
    public PanelExpendedor(int posX, int posY, Expendedor expendedor) {
        this.depositoCoca = new PanelDeposito<>(posX + 1, posY + 1, expendedor.getDepositoCoca());
        this.depositoFanta = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() + 2, expendedor.getDepositoFanta());
        this.depositoSprite = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 2 + 3, expendedor.getDepositoSprite());

        this.depositoSnickers = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 3 + 4, expendedor.getDepositoSnickers());
        this.depositoSuper8 = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 4 + 5, expendedor.getDepositoSuper8());

        this.depositoMonedas = new PanelDeposito<>(posX + 1, posY + ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight() * 2 - 2, expendedor.getDepositoMonedas());
        this.depositoMonedasVuelto = new PanelDeposito<>(posX + ObjetoSize.EXP.getWidth() - ObjetoSize.DEP.getWidth() - 1, posY + (ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight()) / 2, expendedor.getDepositoMonedasVuelto());

        //this.bandejaDeEntrega = new PanelProducto(posX + 1, posY + (ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight() - 1), expendedor.getDepositoMonedasVuelto());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(posX, posY, ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight());

        depositoCoca.paintComponent(g);
        depositoFanta.paintComponent(g);
        depositoSprite.paintComponent(g);

        depositoSnickers.paintComponent(g);
        depositoSuper8.paintComponent(g);

        depositoMonedas.paintComponent(g);
        depositoMonedasVuelto.paintComponent(g);

        //bandejaDeEntrega.paintComponent(g);
    }
}
