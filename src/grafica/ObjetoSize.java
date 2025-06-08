public enum ObjetoSize {
    EXP(100, 200),
    COM(50, 175);

    private int width;
    private int height;

    /**
     * Constructor
     * 
     * @param width
     * @param height
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