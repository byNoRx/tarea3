import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PanelDeposito<T> extends JPanel{
    private int posX;
    private int posY;

    private Deposito<T> deposito;

    private ArrayList<PanelMoneda> panelesMonedas;
    private ArrayList<PanelProducto> panelesProductos;

    PanelDeposito(int posX, int posY, Deposito<T> deposito) {
        this.posX = posX;
        this.posY = posY;
        this.deposito = deposito;

        panelesMonedas = new ArrayList<>();
        panelesProductos = new ArrayList<>();

        if (!deposito.getObjetos().isEmpty()) {
            T t = deposito.getObjetos().get(0);

            if (t instanceof Moneda) {
                for (T obj : deposito.getObjetos()) {
                    Moneda moneda = (Moneda) obj;
                    panelesMonedas.add(new PanelMoneda(posX, posY, moneda));
                }
            } else if (t instanceof Producto) {
                for (T obj : deposito.getObjetos()) {
                    Producto producto = (Producto) obj;
                    panelesProductos.add(new PanelProducto(posX, posY, producto));
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.gray);
        g.fillRect(posX, posY, ObjetoSize.DEP.getWidth(), ObjetoSize.DEP.getHeight());

        if (!panelesMonedas.isEmpty()) {
            for (PanelMoneda p : panelesMonedas) {
                p.paintComponent(g);
            }
        } else if (!panelesProductos.isEmpty()) {
            for (PanelProducto p : panelesProductos) {
                p.paintComponent(g);
            }
        }
    }
}
