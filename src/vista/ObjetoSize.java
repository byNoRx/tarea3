public enum ObjetoSize {
    EXP(300, 512),
    COM(50, 175),
    DEP(128, 64),
    OBJ(8, 8);

    private final int width;
    private final int height;

    /**
     * Constructor
     * 
     * @param width ancho
     * @param height alto
     */
    ObjetoSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}