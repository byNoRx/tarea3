/**
 * Clase Comprador que representa un cliente que compra productos usando una máquina expendedora.
 */
public class Comprador {
    private final String sonido;
    private final int vuelto;

    /**
     * Constructor de Comprador
     * 
     * @param moneda la moneda con la que se va a realizar la compra
     * @param cualBebida el número del producto a comprar
     * @param expendedor la máquina expendedora en la que se va a comprar
     * @throws NoHayProductoException si no hay producto disponible
     * @throws PagoInsuficienteException si el pago es insuficiente
     * @throws PagoIncorrectoException si el pago es incorrecto
     */
    public Comprador(Moneda moneda, int cualBebida, Expendedor expendedor) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        Producto bebida_comprada = expendedor.comprarProducto(moneda, cualBebida);
        if (bebida_comprada != null) {
            this.sonido = bebida_comprada.getSabor();
        } else {
            this.sonido = null;
        }

        int sum_vuelto = 0;
        Moneda m;
        while ((m = expendedor.getVuelto()) != null){
            sum_vuelto += m.getValor();
        }
        this.vuelto = sum_vuelto;
    }

    /**
     * @return el vuelto que se ha obtenido al hacer la compra
     */
    public int cuantoVuelto () {
        return vuelto;
    }

    /**
     * @return el sonido del producto que se ha comprado
     */
    public String queConsumiste () {
        return sonido;
    }
}
