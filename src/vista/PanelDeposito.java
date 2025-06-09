import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

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
            T t = deposito.getObjetos().getFirst();
            if (t instanceof Moneda) {
                // Ordenar monedas por su valor de lo más bajo a lo más alto
                ArrayList<Moneda> monedas = new ArrayList<>();
                for (int i = 0; i < deposito.getObjetos().size(); i++) {
                    monedas.add((Moneda) deposito.getObjetos().get(i));
                }
                monedas.sort(null);

                for (int i = 0; i < monedas.size(); i++) {
                    Moneda moneda = (Moneda) monedas.get(i);
                    panelesMonedas.add(new PanelMoneda(posX + ObjetoSize.OBJ.getWidth() * i + i * ObjetoSize.OBJ.getWidth() + ObjetoSize.OBJ.getWidth(), posY + ObjetoSize.OBJ.getHeight(), moneda));
                }
            } else if (t instanceof Producto) {
                for (int i = 0; i < deposito.getObjetos().size(); i++) {
                    Producto producto = (Producto) deposito.getObjetos().get(i);
                    panelesProductos.add(new PanelProducto(posX + ObjetoSize.OBJ.getWidth() * i + i * ObjetoSize.OBJ.getWidth() + ObjetoSize.OBJ.getWidth(), posY + ObjetoSize.OBJ.getHeight(), producto));
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.gray);
        g.fillRect(posX, posY, ObjetoSize.DEP.getWidth(), ObjetoSize.DEP.getHeight());

        actualizarPaneles();

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

    public void actualizarPaneles() {
        panelesMonedas.clear();
        panelesProductos.clear();

        if (!deposito.getObjetos().isEmpty()) {
            T t = deposito.getObjetos().getFirst();

            if (t instanceof Moneda) {
                ArrayList<Moneda> monedas = new ArrayList<>();
                for (T obj : deposito.getObjetos()) {
                    monedas.add((Moneda) obj);
                }
                monedas.sort(null);

                for (int i = 0; i < monedas.size(); i++) {
                    Moneda moneda = monedas.get(i);
                    panelesMonedas.add(new PanelMoneda(posX + ObjetoSize.OBJ.getWidth() * i + i * ObjetoSize.OBJ.getWidth() + ObjetoSize.OBJ.getWidth(), posY + ObjetoSize.OBJ.getHeight(), moneda));
                }
            } else if (t instanceof Producto) {
                for (int i = 0; i < deposito.getObjetos().size(); i++) {
                    Producto producto = (Producto) deposito.getObjetos().get(i);
                    panelesProductos.add(new PanelProducto(posX + ObjetoSize.OBJ.getWidth() * i + i * ObjetoSize.OBJ.getWidth() + ObjetoSize.OBJ.getWidth(), posY + ObjetoSize.OBJ.getHeight(), producto));
                }
            }
        }
    }
}
