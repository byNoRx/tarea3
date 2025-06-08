/**
 * Clase Moneda que representa una moneda que se puede introducir en una maquina expendedora.
 */
public abstract class Moneda implements Comparable<Moneda> {

    /**
     *  Metodo constructor
     */
    public Moneda() {}

    /**
     * Metodo getter
     * 
     * @return la moneda
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda
     */
    public abstract int getValor();

    /**
     * Compara esta moneda con la dada.
     *
     * @param moneda la moneda con la que se quiere comparar esta moneda
     * @return un número positivo si el valor de esta moneda es mayor,
     *         un número negativo si el valor de esta moneda es menor,
     *         cero si son iguales.
     */
    @Override
    public int compareTo(Moneda moneda) {
        return this.getValor() - moneda.getValor();
    }
}

/** 
 * Subclase de Moneda: $100
 */
class Moneda100 extends Moneda {
    /**
     * Metodo constructor
     */
    public Moneda100() {
        super();
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda
     * 
     * @return el valor de la moneda
     */
    @Override
    public int getValor() {
        return 100;
    }
}

/**
 * Subclase de Moneda: $500  
 */
class Moneda500 extends Moneda {
    /**
     * Metodo constructor
     */
    public Moneda500() {
        super();
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda
     * 
     * @return el valor de la moneda
     */
    @Override
    public int getValor() {
        return 500;
    }
}

// Subclase de Moneda: $1000
class Moneda1000 extends Moneda {
    /** 
     * Metodo constructor
     */
    public Moneda1000() {
        super();
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda
     * 
     * @return el valor de la moneda
     */
    @Override
    public int getValor() {
        return 1000;
    }
}

/**
 * Subclase de Moneda: $1500
 */
class Moneda1500 extends Moneda {
    /**
     * Metodo constructor 
     */
    public Moneda1500() {
        super();
    }

    /**
     * Metodo abstracto que retorna el valor de la moneda
     * 
     * @return el valor de la moneda
     */
    @Override
    public int getValor() {
        return 1500;
    }
}
