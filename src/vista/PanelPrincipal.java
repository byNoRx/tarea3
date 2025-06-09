import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana
    //private PanelComprador com;
    private PanelExpendedor exp;



    public PanelPrincipal () {
        this.setBackground(Color.white);
        //com = new PanelComprador(0,0,new Comprador());
        exp = new PanelExpendedor(0, 0, new Expendedor(5));
    }

    @Override
    public void paintComponent (Graphics g) {   // Todo se dibuja a partir de este método
        super.paintComponent(g);                // Llama al método paint al que hace override en la super clase
                                                // El de la super clase solo pinta el fondo (background)
        //com.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelExpendedor

    }
}