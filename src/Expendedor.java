/**
 * Clase Expendedor que representa una máquina expendedora de bebidas y dulces.
 */
public class Expendedor {
    // Bebidas
    private final Deposito<Producto> depositoCoca;
    private final Deposito<Producto> depositoFanta;
    private final Deposito<Producto> depositoSprite;
    // Dulces
    private final Deposito<Producto> depositoSnickers;
    private final Deposito<Producto> depositoSuper8;
    // Monedas para vuelto
    private final Deposito<Moneda> depositoMonedas;

    /**
     * Constructor de la clase Expendedor.
     * 
     * @param numProductos el número de cada tipo de productos que se van a agregar al depósito
     */
    public Expendedor(int numProductos) {
        // Depositos de Bebidas
        depositoCoca = new Deposito<>();
        depositoFanta = new Deposito<>();
        depositoSprite = new Deposito<>();
        // Depositos de Dulces
        depositoSnickers = new Deposito<>();
        depositoSuper8 = new Deposito<>();
        // Deposito de Monedas
        depositoMonedas = new Deposito<>();

        for (int i = 0; i < numProductos; i++) {
            depositoCoca.addObjeto(new CocaCola(1000+i));
            depositoFanta.addObjeto(new Fanta(2000+i));
            depositoSprite.addObjeto(new Sprite(3000+i));
            depositoSnickers.addObjeto(new Snickers(4000+i));
            depositoSuper8.addObjeto(new Super8(5000+i));
        }
    }

    /**
     * Compra un producto de la máquina expendedora.
     * 
     * @param moneda la moneda con la que se va a realizar la compra
     * @param cual el número del producto a comprar
     * @return el producto comprado, o null si no se puede comprar
     * @throws PagoIncorrectoException si el pago es incorrecto
     * @throws PagoInsuficienteException si el pago es insuficiente
     * @throws NoHayProductoException si no hay productos disponibles
     */
    public Producto comprarProducto(Moneda moneda, int cual) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if (moneda == null) {
            throw new PagoIncorrectoException("El pago es incorrecto.");
        }

        int valorMoneda = moneda.getValor();
        Producto producto = null;

        if (cual == ProductoTipo.COCA.getNumero() && valorMoneda >= ProductoTipo.COCA.getPrecio()) {
            producto = depositoCoca.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - ProductoTipo.COCA.getPrecio();
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                throw new NoHayProductoException("No hay coca-cola.");
            }
        }
        else if (cual == ProductoTipo.FANTA.getNumero() && valorMoneda >= ProductoTipo.FANTA.getPrecio()) {
            producto = depositoFanta.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - ProductoTipo.FANTA.getPrecio();
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                throw new NoHayProductoException("No hay fanta.");
            }
        }
        else if (cual == ProductoTipo.SPRITE.getNumero() && valorMoneda >= ProductoTipo.SPRITE.getPrecio()) {
            producto = depositoSprite.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - ProductoTipo.SPRITE.getPrecio();
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                throw new NoHayProductoException("No hay sprite.");
            }
        }
        else if (cual == ProductoTipo.SNICKERS.getNumero() && valorMoneda >= ProductoTipo.SNICKERS.getPrecio()) {
            producto = depositoSnickers.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - ProductoTipo.SNICKERS.getPrecio();
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                throw new NoHayProductoException("No hay snickers.");
            }
        }
        else if (cual == ProductoTipo.SUPER8.getNumero() && valorMoneda >= ProductoTipo.SUPER8.getPrecio()) {
            producto = depositoSuper8.getObjeto();
            if (producto != null) {
                int vuelto = moneda.getValor() - ProductoTipo.SUPER8.getPrecio();
                for (int i = 0; i < vuelto / 100; i++) {
                    depositoMonedas.addObjeto(new Moneda100());
                }
                return producto;
            }
            else {
                depositoMonedas.addObjeto(moneda);
                throw new NoHayProductoException("No hay super 8.");
            }
        }
        else if (cual != ProductoTipo.COCA.getNumero() && cual != ProductoTipo.FANTA.getNumero() && cual != ProductoTipo.SPRITE.getNumero() && cual != ProductoTipo.SNICKERS.getNumero() && cual != ProductoTipo.SUPER8.getNumero()) {
            depositoMonedas.addObjeto(moneda);
            throw new NoHayProductoException("El número de depósito es erróneo.");
        }
        else {   
            depositoMonedas.addObjeto(moneda);
            throw new PagoInsuficienteException("No alcanza para comprar el producto.");
        }
    }

    /** 
     * Devuelve el vuelto que se ha obtenido al hacer la compra.
     * 
     * @return el vuelto que se ha obtenido al hacer la compra
     */
    public Moneda getVuelto () {
        return depositoMonedas.getObjeto();
    }
}
