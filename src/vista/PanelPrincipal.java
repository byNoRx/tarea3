import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {    // Se ve en el centro de la ventana
    private PanelComprador com;
    private PanelExpendedor exp;

    private Menu menu;



    public PanelPrincipal () {

        setLayout(new BorderLayout());
        setBackground(Color.white);

        // Crear subpaneles
        JPanel left = new JPanel();
        left.setLayout(new BorderLayout());
        //left.setPreferredSize(new Dimension(ObjetoSize.EXP.getHeight(), ObjetoSize.EXP.getHeight()));
        add(left, BorderLayout.CENTER);
        left.setBackground(Color.WHITE);

        JPanel right = new JPanel();
        right.setLayout(new BorderLayout());
        right.setPreferredSize(new Dimension(ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight()));
        add(right, BorderLayout.EAST);
        right.setBackground(Color.lightGray);

        // Agregar subpaneles al panel principal
        add(left, BorderLayout.CENTER);
        add(right, BorderLayout.EAST);

        exp = new PanelExpendedor(0, 0, new Expendedor(5));
        right.add(exp, BorderLayout.CENTER);

        menu = new Menu();
        add(menu, BorderLayout.WEST);
        //menu.setPreferredSize(new Dimension(ObjetoSize.EXP.getHeight(), ObjetoSize.EXP.getHeight()));
    }

    @Override
    public void paintComponent (Graphics g) {   // Todo se dibuja a partir de este método
        super.paintComponent(g);                // Llama al método paint al que hace override en la super clase
                                                // El de la super clase solo pinta el fondo (background)
        //com.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelExpendedor
    }
}