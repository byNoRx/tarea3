/**
 * Clase PagoIncorrectoException que representa un error en el pago de un producto en una maquina expendedora
 */
public class PagoIncorrectoException extends Exception {
    /**
     * Constructor de la clase PagoIncorrectoException
     * 
     * @param message el mensaje de error
     */
    public PagoIncorrectoException(String message) {
        super(message);
    }
}
