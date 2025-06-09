import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal; // Un panel para objetos gráficos

    Ventana() {
        super(); // Hereda metodos de JFrame

        panelPrincipal = new PanelPrincipal();
        panelPrincipal.setLayout(new BorderLayout());
        //Menu menu = new Menu();
        //panelPrincipal.add(menu,BorderLayout.EAST);

        this.add(panelPrincipal,BorderLayout.CENTER); // Se agrega al centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar aplicación
        this.setSize(600,800);
        this.setVisible(true);
    } 
}
