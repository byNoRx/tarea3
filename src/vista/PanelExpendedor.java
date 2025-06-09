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

    private PanelProducto productoDeEntrega;
    private PanelDeposito<Producto> bandejaDeEntrega; // Sólo visual

    public PanelExpendedor(int posX, int posY, Expendedor expendedor) {
        this.posX = posX;
        this.posY = posY;

        this.depositoCoca = new PanelDeposito<>(posX + 1, posY + 1, expendedor.getDepositoCoca());
        this.depositoFanta = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() + 2, expendedor.getDepositoFanta());
        this.depositoSprite = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 2 + 3, expendedor.getDepositoSprite());

        this.depositoSnickers = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 3 + 4, expendedor.getDepositoSnickers());
        this.depositoSuper8 = new PanelDeposito<>(posX + 1, posY + ObjetoSize.DEP.getHeight() * 4 + 5, expendedor.getDepositoSuper8());

        this.depositoMonedasVuelto = new PanelDeposito<>(posX + 1, posY + ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight() * 2 - 2, expendedor.getDepositoMonedasVuelto());
        this.depositoMonedas = new PanelDeposito<>(posX + ObjetoSize.EXP.getWidth() - ObjetoSize.DEP.getWidth() - 1, posY + (ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight()) / 2, expendedor.getDepositoMonedas());

        // Sólo visual
        Deposito<Producto> d = new Deposito<>(); // Depósito vacío
        this.bandejaDeEntrega = new PanelDeposito<>(posX + 1, posY + (ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight() - 1), d); // panel de depósito vacío

        this.productoDeEntrega = new PanelProducto(posX + 1 + ObjetoSize.OBJ.getWidth(), posY + (ObjetoSize.EXP.getHeight() - ObjetoSize.DEP.getHeight() - 1 + ObjetoSize.OBJ.getHeight()), expendedor.getProducto());

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

        bandejaDeEntrega.paintComponent(g); // Sólo para hacer parecer que hay un depósito para el producto que se entrega
        productoDeEntrega.paintComponent(g);
    }
}
