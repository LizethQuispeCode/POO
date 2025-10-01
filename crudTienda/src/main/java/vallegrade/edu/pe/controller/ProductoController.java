package vallegrade.edu.pe.controller;



import vallegrade.edu.pe.model.Producto;
import vallegrade.edu.pe.service.ProductoService;
import vallegrade.edu.pe.view.FrmProducto;

import java.util.List;

public class ProductoController {
    private FrmProducto vista;

    public ProductoController() {
        // Crear y mostrar la vista
        vista = new FrmProducto();
        vista.setVisible(true);
    }
}

