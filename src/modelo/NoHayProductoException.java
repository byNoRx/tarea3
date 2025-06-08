/* 
 * Clase NoHayProductoException que representa un error en la compra de un producto en una maquina expendedora
 */
public class NoHayProductoException extends Exception {
    /**
     * Constructor de la clase NoHayProductoException
     *
     * @param message el mensaje de error
     */
    public NoHayProductoException(String message) {
        super(message);
    }
}
