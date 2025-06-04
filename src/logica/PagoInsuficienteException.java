/**
 * Clase PagoInsuficienteException que representa un error en el pago de un producto en una maquina expendedora
 */
public class PagoInsuficienteException extends Exception {
    /**
     * Constructor de la clase PagoInsuficienteException
     * 
     * @param message el mensaje de error
     */
    public PagoInsuficienteException(String message) {
        super(message);
    }
}
