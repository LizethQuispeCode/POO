package vallegrade.edu.pe.view;

import vallegrade.edu.pe.model.Producto;
import vallegrade.edu.pe.service.ProductoService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class FrmProducto extends JFrame {
    private JTable tabla;
    private JButton btnActualizar;
    private ProductoService service = new ProductoService();

    public FrmProducto() {
        setTitle("Listado de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Layout principal
        setLayout(new BorderLayout());

        // Tabla con scroll
        tabla = new JTable();
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        // Botón actualizar abajo
        btnActualizar = new JButton("Actualizar");
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnActualizar);
        add(panelBoton, BorderLayout.SOUTH);

        // Evento del botón
        btnActualizar.addActionListener(e -> cargarDatos());

        // Cargar datos iniciales
        cargarDatos();
    }

    private void cargarDatos() {
        String[] columnas = {"ID", "Nombre", "Precio", "Stock"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0);

        List<Producto> lista = service.listarProductos();
        for (Producto p : lista) {
            Object[] fila = {p.getId(), p.getNombre(), p.getPrecio(), p.getStock()};
            model.addRow(fila);
        }
        tabla.setModel(model);
    }
}
