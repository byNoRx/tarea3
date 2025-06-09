import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelPrincipal extends JPanel implements ActionListener, MouseListener {    // Se ve en el centro de la ventana
    // Comprador  y expendedor
    private Comprador modeloComprador;
    private Expendedor modeloExpendedor;

    private Moneda modeloMoneda;
    private int cualProducto;

    private PanelComprador com;
    private PanelExpendedor exp;

    int numProductos;

    // Botones para el menú interactivo
    private JPanel BigPanel, panel1, panel2,panel3;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6,boton7,boton8,boton9,boton10,boton11,boton12,boton13,boton14,boton15;

    public PanelPrincipal() {

        numProductos = 5;

        modeloExpendedor = new Expendedor(numProductos);

        // Personalizar panel principal
        setLayout(new BorderLayout());
        setBackground(Color.white);
        addMouseListener(this);

        exp = new PanelExpendedor(0, 0, modeloExpendedor);
        com = new PanelComprador(0, 0, modeloComprador);
        exp.setPreferredSize(new Dimension(ObjetoSize.EXP.getWidth(), ObjetoSize.EXP.getHeight()));
        exp.addMouseListener(this);
        com.setPreferredSize(new Dimension(ObjetoSize.COM.getWidth(), ObjetoSize.COM.getHeight()));
        add(exp, BorderLayout.EAST);
        add(com, BorderLayout.CENTER);

        // Expendedor al panel de la derecha

        // -------------MENÚ----------------
        // Crear los paneles
        BigPanel = new JPanel();
        panel1 = new JPanel(new GridLayout(0, 1, 10, 10)); // 3 filas, 1 columna
        panel2 = new JPanel(new GridLayout(0, 1, 10, 10));
        panel3 = new JPanel(new GridLayout(0, 1, 10, 10));

        // Crear los botones
        boton1 = new JButton("ELEGIR PRODUCTO");
        boton1.addActionListener(this);
        boton1.setBackground(Color.cyan);

        boton2 = new JButton("ELEGIR MONEDA");
        boton2.addActionListener(this);
        boton2.setBackground(Color.yellow);

        boton15 = new JButton("COMPRAR PRODUCTO");
        boton15.addActionListener(this);
        boton15.setBackground(Color.green);

        boton3 = new JButton("RECUPERAR VUELTO");
        boton3.addActionListener(this);

        boton4 = new JButton(ProductoTipo.SUPER8.toString() + " $" + ProductoTipo.SUPER8.getPrecio());
        boton4.addActionListener(this);
        boton4.setBackground(Color.black);
        boton4.setForeground(Color.white);

        boton5 = new JButton(ProductoTipo.SNICKERS.toString() + " $" + ProductoTipo.SNICKERS.getPrecio());
        boton5.addActionListener(this);
        boton5.setBackground(Color.yellow);

        boton12 = new JButton(ProductoTipo.COCA.toString() + " $" + ProductoTipo.COCA.getPrecio());
        boton12.addActionListener(this);
        boton12.setBackground(Color.red);
        boton12.setForeground(Color.white);

        boton13 = new JButton(ProductoTipo.SPRITE.toString() + " $" + ProductoTipo.SPRITE.getPrecio());
        boton13.addActionListener(this);
        boton13.setBackground(Color.green);

        boton14 = new JButton(ProductoTipo.FANTA.toString() + " $" + ProductoTipo.FANTA.getPrecio());
        boton14.addActionListener(this);
        boton14.setBackground(Color.orange);

        boton6 = new JButton("VOLVER");
        boton6.addActionListener(this);

        boton7 = new JButton("$100");
        boton7.addActionListener(this);
        boton7.setBackground(Color.lightGray);
        boton8 = new JButton("$500");
        boton8.addActionListener(this);
        boton8.setBackground(Color.yellow);
        boton9 = new JButton("$1000");
        boton9.addActionListener(this);
        boton9.setBackground(Color.blue);
        boton9.setForeground(Color.white);
        boton10 = new JButton("$1500");
        boton10.addActionListener(this);
        boton10.setBackground(Color.magenta);
        boton10.setForeground(Color.white);

        boton11 = new JButton("VOLVER");
        boton11.addActionListener(this);

        // Agregar botones a los paneles
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.add(boton15);
        panel1.add(boton3);

        panel2.add(boton12);
        panel2.add(boton14);
        panel2.add(boton13);
        panel2.add(boton5);
        panel2.add(boton4);
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
        } else if (e.getSource() == boton2) {
            BigPanel.remove(panel1);
            BigPanel.add(panel3);
            SwingUtilities.updateComponentTreeUI(this);
        } else if (e.getSource() == boton11) {
            BigPanel.remove(panel3);
            BigPanel.add(panel1);
            SwingUtilities.updateComponentTreeUI(this);
        }

        // Productos
        else if (e.getSource() == boton4) {
            cualProducto = ProductoTipo.SUPER8.getNumero();
            JOptionPane.showMessageDialog(null, "Bebida " + ProductoTipo.SUPER8.toString().toLowerCase() + " seleccionada");
        } else if (e.getSource() == boton5) {
            cualProducto = ProductoTipo.SNICKERS.getNumero();
            JOptionPane.showMessageDialog(null, "Bebida " + ProductoTipo.SNICKERS.toString().toLowerCase() + " seleccionada");
        } else if (e.getSource() == boton12) {
            cualProducto = ProductoTipo.COCA.getNumero();
            JOptionPane.showMessageDialog(null, "Bebida " + ProductoTipo.COCA.toString().toLowerCase() + " seleccionada");
        } else if (e.getSource() == boton13) {
            cualProducto = ProductoTipo.SPRITE.getNumero();
            JOptionPane.showMessageDialog(null, "Bebida " + ProductoTipo.SPRITE.toString().toLowerCase() + " seleccionada");
        } else if (e.getSource() == boton14) {
            cualProducto = ProductoTipo.FANTA.getNumero();
            JOptionPane.showMessageDialog(null, "Bebida " + ProductoTipo.FANTA.toString().toLowerCase() + " seleccionada");
        }

        // Monedas
        else if (e.getSource() == boton7) {
            modeloMoneda = new Moneda100();
            JOptionPane.showMessageDialog(null, "Moneda de $100 seleccionada");
        } else if (e.getSource() == boton8) {
            modeloMoneda = new Moneda500();
            JOptionPane.showMessageDialog(null, "Moneda de $500 seleccionada");
        } else if (e.getSource() == boton9) {
            modeloMoneda = new Moneda1000();
            JOptionPane.showMessageDialog(null, "Moneda de $1000 seleccionada");
        } else if (e.getSource() == boton10) {
            modeloMoneda = new Moneda1500();
            JOptionPane.showMessageDialog(null, "Moneda de $1500 seleccionada");
        }

        // Comprar
        else if (e.getSource() == boton15) {
            try {
                modeloComprador = new Comprador(modeloMoneda, cualProducto, modeloExpendedor);
                JOptionPane.showMessageDialog(null, "Compra realizada con éxito");
            } catch (NoHayProductoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            } catch (PagoInsuficienteException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
            repaint();
        }
    }

    @Override
    public void paintComponent (Graphics g) {   // Todo se dibuja a partir de este método
        super.paintComponent(g);                // Llama al método paint al que hace override en la super clase
                                                // El de la super clase solo pinta el fondo (background)
        com.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelComprador
        exp.paintComponent(g);                  // Llama al metodo paintComponent definido en el PanelExpendedor
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == exp) {             // Si se cliquea el expendedor
            System.out.println("Expendedor rellenado");
            modeloExpendedor.rellenarProductos(numProductos);
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}