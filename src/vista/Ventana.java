import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal dp; // Un panel para objetos gráficos
    Ventana(){
        super(); // Hereda metodos de JFrame
        this.setLayout(new BorderLayout());
        dp=new PanelPrincipal();
        this.add(dp,BorderLayout.CENTER); // Se agrega al centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cerrar aplicación
        this.setSize(600,800);
        this.setVisible(true);
    }
}
