
package Presentacion;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    JDesktopPane escritorio;
    JMenuBar barraMenus;
    JMenu menuMantener;
    JMenuItem menuMantenerEmpleados;
    JMenuItem menuMantenerClientes;
    JMenuItem menuMantenerProveedores;
    //VentanaEmpleados ventanaEmpleados;
    //VentanaClientes ventanaClientes;
    //VentanaProveedores ventanaProveedores;
    
    public VentanaPrincipal() {
        inicializarComponentes();
    }
    
    protected void inicializarComponentes() {
        setTitle("Ventana Principal");
        
        escritorio = new JDesktopPane();
        setContentPane(escritorio);
        
        barraMenus = new JMenuBar();
        setJMenuBar(barraMenus);
        
        menuMantener = new JMenu("Mantener");
        barraMenus.add(menuMantener);
        
        menuMantenerEmpleados = new JMenuItem("Empleados");
        menuMantenerEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manejarClicMenuMantenerEmpleados(e);
            }
        });
        menuMantener.add(menuMantenerEmpleados);
        
        menuMantenerClientes = new JMenuItem("Clientes");
        menuMantenerClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manejarClicMenuMantenerClientes(e);
            }
        });
        menuMantener.add(menuMantenerClientes);
        
        menuMantenerProveedores = new JMenuItem("Proveedores");
        menuMantenerProveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                manejarClicMenuMantenerProveedores(e);
            }
        });
        menuMantener.add(menuMantenerProveedores);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    protected void manejarClicMenuMantenerEmpleados(ActionEvent e) {
//        try {
//            if (ventanaEmpleados == null) {
//                ventanaEmpleados = VentanaEmpleados.getInstancia(this);
//                escritorio.add(ventanaEmpleados);
//                ventanaEmpleados.setVisible(true);
//            }
//            
//            ventanaEmpleados.setSelected(true);
//        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
//        }
    }
    
    protected void manejarClicMenuMantenerClientes(ActionEvent e) {
//        try {
//            if (ventanaClientes == null) {
//                ventanaClientes = VentanaClientes.getInstancia(this);
//                escritorio.add(ventanaClientes);
//                ventanaClientes.setVisible(true);
//            }
//            
//            ventanaClientes.setSelected(true);
//        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
//        }
    }
    
    protected void manejarClicMenuMantenerProveedores(ActionEvent e) {
//        try {
//            if (ventanaProveedores == null) {
//                ventanaProveedores = VentanaProveedores.getInstancia(this);
//                escritorio.add(ventanaProveedores);
//                ventanaProveedores.setVisible(true);
//            }
//            
//            ventanaProveedores.setSelected(true);
//        }
//        catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, ex.getMessage(), "¡Error!", JOptionPane.ERROR_MESSAGE);
//        }
    }
}
