import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelPrincipal extends JPanel implements ActionListener {    // Se ve en el centro de la ventana
    // Comprador  y expendedor
    private PanelComprador com;
    private PanelExpendedor exp;

    // Botones para el menú interactivo
    private JPanel BigPanel, panel1, panel2,panel3;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6,boton7,boton8,boton9,boton10,boton11,boton12,boton13,boton14;

    public PanelPrincipal() {

        // Personalizar panel principal
        setLayout(new BorderLayout());
        setBackground(Color.white);

        // Crear subpaneles
        // Izquierda
        JPanel left = new JPanel();
        add(left, BorderLayout.CENTER);
        left.setBackground(Color.WHITE);
        // Derecha
        JPanel right = new JPanel();
        right.setLayout(new BorderLayout());
        right.setPreferredSize(new Dimension(ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight()));
        add(right, BorderLayout.EAST);
        right.setBackground(Color.lightGray);

        // Agregar subpaneles al panel principal
        add(left, BorderLayout.CENTER);
        add(right, BorderLayout.EAST);

        // Expendedor al panel de la derecha
        exp = new PanelExpendedor(0, 0, new Expendedor(5));
        right.add(exp, BorderLayout.CENTER);

        // -------------MENÚ----------------
        // Crear los paneles
        BigPanel = new JPanel();
        panel1 = new JPanel(new GridLayout(0, 1, 10, 10)); // 3 filas, 1 columna
        panel2 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel3 = new JPanel(new GridLayout(0, 1, 10, 10));

        // Crear los botones
        boton1 = new JButton("Comprar");
        boton1.addActionListener(this);
        boton2 = new JButton("Ingresar monedas");
        boton2.addActionListener(this);

        boton3 = new JButton("Recuperar vuelto");
        boton3.addActionListener(this);

        boton4 = new JButton("Super8");
        boton4.addActionListener(this);

        boton5 = new JButton("Snicker");
        boton5.addActionListener(this);

        boton12 = new JButton("Coca Cola");
        boton12.addActionListener(this);

        boton13 = new JButton("Sprite");
        boton13.addActionListener(this);

        boton14 = new JButton("Fanta");
        boton14.addActionListener(this);

        boton6 = new JButton("Volver");
        boton6.addActionListener(this);

        boton7 = new JButton("Agregar moneda 100");
        boton8 = new JButton("Agregar moneda 500");
        boton9 = new JButton("Agregar moneda 1000");
        boton10 = new JButton("Agregar moneda 1500");


        boton11 = new JButton("Volver");
        boton11.addActionListener(this);


        // Agregar botones a los paneles
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton12);
        panel2.add(boton13);
        panel2.add(boton14);
        panel2.add(boton6);

        panel3.add(boton7);
        panel3.add(boton8);
        panel3.add(boton9);
        panel3.add(boton10);
        panel3.add(boton11);

        // Agregar panel1 al contenedor principal
        BigPanel.add(panel1);
        add(BigPanel, BorderLayout.WEST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            BigPanel.remove(panel1);
            BigPanel.add(panel2);
            SwingUtilities.updateComponentTreeUI(this);
        } else if (e.getSource() == boton6) {
            BigPanel.remove(panel2);
            BigPanel.add(panel1);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if (e.getSource() == boton2) {
            BigPanel.remove(panel1);
            BigPanel.add(panel3);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if (e.getSource() == boton11) {
            BigPanel.remove(panel3);
            BigPanel.add(panel1);
            SwingUtilities.updateComponentTreeUI(this);
        }
        else if (e.getSource() == boton3) {
            //com;
        }
    }

    @Override
    public void paintComponent (Graphics g) {   // Todo se dibuja a partir de este método
        super.paintComponent(g);                // Llama al método paint al que hace override en la super clase
                                                // El de la super clase solo pinta el fondo (background)
        //com.paintComponent(g);                // Llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelExpendedor
    }
}