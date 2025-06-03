import java.util.ArrayList;

/**
 * Clase Deposito que representa un depósito de productos de un tipo determinado.
 */
public class Deposito<T> {

    private final ArrayList<T> objetos;

    /**
     * Constructor de la clase Deposito.
     */
    public Deposito() {
        objetos = new ArrayList<>();
    }

    /**
     * Agrega un producto al depósito.
     *
     * @param objeto el producto a agregar.
     */
    public void addObjeto(T objeto) {
        objetos.add(objeto);
    }

    /**
     * Obtiene el primer producto del depósito.
     *
     * @return el primer producto del depósito, o null si el depósito está vacío.
     */
    public T getObjeto() {
        if (!objetos.isEmpty()) {
            return objetos.removeFirst();
        }
        return null;
    }
}