/**
 * Clase Producto que representa un producto que se puede comprar en una maquina expendedora
 *
 */
public abstract class Producto {
    private final int serie;

    /**
     * Constructor de la clase Producto
     * 
     * @param serie la serie del producto
     */
    public Producto(int serie) {
        this.serie = serie;
    }

    /**
     * Obtiene la serie del producto
     * 
     * @return
     */
    public int getSerie() {
        return serie;
    }

    /**
     * Obtiene el sabor del producto
     */
    public abstract String getSabor();
}
