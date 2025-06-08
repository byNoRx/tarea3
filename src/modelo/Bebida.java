/**
 * Clase Bebida que representa una bebida que se puede comprar en una maquina expendedora.
 */
public abstract class Bebida extends Producto {

    /**
     * Metodo constructor
     * 
     * @param serie la serie de la bebida
     */
    public Bebida(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor de la bebida
     */
    public abstract String getSabor();
}

/**
 * Subclase de Bebida: CocaCola (Al ser subclase, hereda las variables de Bebida)
 */
class CocaCola extends Bebida {
    /**
     * Metodo constructor
     * @param serie la serie de la bebida     
     */
    public CocaCola(int serie) {
        super(serie);
    }

    /** 
     * Metodo abstracto que retorna el sabor de la bebida
     * 
     * @return el sabor de la bebida
     */
    @Override
    public String getSabor() {
        return "cocacola";
    }
}

/**
 * Subclase de Bebida: Fanta (Al ser subclase, hereda las variables de Bebida)
 */
class Fanta extends Bebida {
    /** 
     * Metodo constructor
     * 
     * @param serie la serie de la bebida
     */
    public Fanta(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor de la bebida
     * 
     * @return el sabor de la bebida
     */
    @Override
    public String getSabor() {
        return "fanta";
    }
}

/** 
 * Subclase de Bebida: Sprite (Al ser subclase, hereda las variables de Bebida)
 */
class Sprite extends Bebida {
    /**
     * Metodo constructor
     *  
     * @param serie la serie de la bebida
     */
    public Sprite(int serie) {
        super(serie);
    }

    /**
     * Metodo abstracto que retorna el sabor de la bebida
     * 
     * @return el sabor de la bebida
     */
    @Override
    public String getSabor() {
        return "sprite";
    }
}
