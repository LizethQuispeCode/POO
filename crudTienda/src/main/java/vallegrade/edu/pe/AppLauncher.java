package vallegrade.edu.pe;

import vallegrade.edu.pe.controller.ProductoController;

public class AppLauncher {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new ProductoController();
        });
    }
}
