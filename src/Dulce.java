/**
 * Clase Dulce que representa un dulce que se puede comprar en una maquina expendedora.
 */
public abstract class Dulce extends Producto {

    /*
     * Constructor
     */
    public Dulce(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor del dulce
     */
    public abstract String getSabor();
}

/**
 * Subclase de Bebida: Snickers (Al ser subclase, hereda las variables de Dulce)
 */
class Snickers extends Dulce {
    /**
     * Constructor 
     */
    public Snickers(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor del dulce
     * 
     * @return el sabor del dulce
     */
    @Override
    public String getSabor() {
        return "snickers";
    }
}

/**
 * Subclase de Bebida: Super8 (Al ser subclase, hereda las variables de Dulce)
 */
class Super8 extends Dulce {
    /**
     * Constructor
     */
    public Super8(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor del dulce
     * 
     * @return el sabor del dulce
     */
    @Override
    public String getSabor() {
        return "super8";
    }
}
