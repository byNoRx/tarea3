import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {
    private JPanel BigPanel, panel1, panel2;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6;

    public Menu() {
        // Crear los paneles
        BigPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1 = new JPanel(new GridLayout(3, 1, 10, 10)); // 3 filas, 1 columna
        panel2 = new JPanel(new GridLayout(3, 1, 10, 10));

        // Crear los botones
        boton1 = new JButton("Entrar");
        boton1.addActionListener(this);
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Volver");
        boton4.addActionListener(this);
        boton5 = new JButton("Botón 5");
        boton6 = new JButton("Botón 6");

        // Agregar botones a los paneles
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);

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
        } else if (e.getSource() == boton4) {
            BigPanel.remove(panel2);
            BigPanel.add(panel1);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}