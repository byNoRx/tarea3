import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private PanelPrincipal panelPrincipal;

    public Ventana() {
        personalizar();

        panelPrincipal = new PanelPrincipal();
        add(panelPrincipal, BorderLayout.CENTER);
        pack();
    }

    private void personalizar() {
        setTitle("Expendedor y Comprador");
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
