import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelProducto extends JFrame implements ActionListener {
    private JPanel BigPanel;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JPanel panel1;
    private JPanel panel2;
    private JFrame frame1;


    public PanelProducto() {

    }
    public void paintComponent(Graphics g) {
        // Crear frame
        frame1 = new JFrame("JPanel1 with Buttons");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(300, 200);


        // crea los paneles
        BigPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel1 = new JPanel(new GridLayout(3, 1, 10, 10)); // 3 filas, 1 columna
        panel2 = new JPanel(new GridLayout(3, 1, 10, 10));


        // crea los botones
        boton1 = new JButton("entrar");
        boton1.addActionListener(this);

        boton2 = new JButton("boton 2");
        boton2.addActionListener(this);

        boton3 = new JButton("boton 3");

        boton4 = new JButton("volver");
        boton4.addActionListener(this);

        boton5 = new JButton("boton 5");
        boton6 = new JButton("boton 6");


        // agrega los botones
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton3);

        panel2.add(boton4);
        panel2.add(boton5);
        panel2.add(boton6);


        // agrega los paneles panel1 y bigpanel
        BigPanel.add(panel1);


        frame1.add(BigPanel);


        // le da visibilidad al frame
        frame1.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {


            BigPanel.remove(panel1);
            BigPanel.add(panel2);
            SwingUtilities.updateComponentTreeUI(frame1);


        }
        if (e.getSource() == boton4) {

            BigPanel.remove(panel2);
            BigPanel.add(panel1);
            SwingUtilities.updateComponentTreeUI(frame1);


        }


    }
}


