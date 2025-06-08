import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {
    private JPanel BigPanel, panel1, panel2,panel3;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6,boton7,boton8,boton9,boton10,boton11;

    public Menu() {
        setLayout(new BorderLayout());


        // Crear los paneles

        BigPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1 = new JPanel(new GridLayout(0, 1, 10, 10)); // 3 filas, 1 columna
        panel2 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel3 = new JPanel(new GridLayout(0, 1, 10, 10));

        // Crear los botones
        boton1 = new JButton("Comprar");
        boton1.addActionListener(this);
        boton2 = new JButton("ingresar monedas");
        boton2.addActionListener(this);

        boton3 = new JButton("recuperar vuelto");
        boton3.addActionListener(this);

        boton4 = new JButton("producto1");
        boton4.addActionListener(this);

        boton5 = new JButton("producto2");
        boton5.addActionListener(this);

        boton6 = new JButton("volver");
        boton6.addActionListener(this);

        boton7 =new JButton("agregar moneda 100");
        boton8 =new JButton("agregar moneda 500");
        boton9 =new JButton("agregar moneda 1000");
        boton10 =new JButton("agregar moneda 1500");


        boton11 =new JButton("volver");
        boton11.addActionListener(this);


        // Agregar botones a los paneles
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);

        panel3.add(boton7);
        panel3.add(boton8);
        panel3.add(boton9);
        panel3.add(boton10);
        panel3.add(boton11);



        // Agregar panel1 al contenedor principal
        BigPanel.add(panel1);
        add(BigPanel);

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
    }
}