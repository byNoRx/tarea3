/** 
 * Enum con los tipos de productos
 */
public enum ProductoTipo {
    COCA(1, 1100),
    FANTA(2, 1200),
    SPRITE(3, 1300),
    SNICKERS(4, 400),
    SUPER8(5, 500);

    private final int numero;
    private final int precio;

    /**
     * Constructor
     * 
     * @param numero numero del producto
     * @param precio precio del producto
     */
    ProductoTipo(int numero, int precio) {
        this.numero = numero;
        this.precio = precio;
    }

    /**
     * Obtiene el numero del producto
     * 
     * @return el numero del producto
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Obtiene el precio del producto
     * 
     * @return el precio del producto
     */
    public int getPrecio() {
        return precio;
    }
}
