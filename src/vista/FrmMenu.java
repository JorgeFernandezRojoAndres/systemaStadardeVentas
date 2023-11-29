package vista;

import controlador.Reportes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author Jorge
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDesktopPane_menu;

    public FrmMenu() {
        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);//esta linea hace que la ventana se adapate a la pantalla
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema de ventas");
        
        this.setLayout(null);
        jDesktopPane_menu = new JDesktopPane();

        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDesktopPane_menu.setBounds(0, 0, ancho, (alto - 110));
        this.add(jDesktopPane_menu);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2_nuevoUsuario = new javax.swing.JMenuItem();
        jMenuItem3_GestionDelUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4_NuevoProducto = new javax.swing.JMenuItem();
        jMenuItem5_GestionarProducto = new javax.swing.JMenuItem();
        jMenuItem6_ActualizarStock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7_NuevoCliente = new javax.swing.JMenuItem();
        jMenuItem8_GestionarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9_NuevaCategoria = new javax.swing.JMenuItem();
        jMenuItem10_GestionarCategoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11_NuevaVenta = new javax.swing.JMenuItem();
        jMenuItem12_GestionarVenta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13_RporteClientes = new javax.swing.JMenuItem();
        jMenuItem14_ReporteCAtegorias = new javax.swing.JMenuItem();
        jMenuItem15_ReporteProducto = new javax.swing.JMenuItem();
        jMenuItem16_ReporteVenta = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem17_VerHistorial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem18_CerrarSesion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu9.setText("File");
        jMenuBar2.add(jMenu9);

        jMenu10.setText("Edit");
        jMenuBar2.add(jMenu10);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem2_nuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem2_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem2_nuevoUsuario.setText("Nuevo Usuario ");
        jMenuItem2_nuevoUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem2_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_nuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_nuevoUsuario);

        jMenuItem3_GestionDelUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem3_GestionDelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem3_GestionDelUsuario.setText("Gestionar Usuario");
        jMenuItem3_GestionDelUsuario.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem3_GestionDelUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3_GestionDelUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3_GestionDelUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem4_NuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem4_NuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem4_NuevoProducto.setText("Nuevo Producto");
        jMenuItem4_NuevoProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem4_NuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4_NuevoProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4_NuevoProducto);

        jMenuItem5_GestionarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem5_GestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem5_GestionarProducto.setText("Gestionar Producto");
        jMenuItem5_GestionarProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem5_GestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5_GestionarProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5_GestionarProducto);

        jMenuItem6_ActualizarStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem6_ActualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem6_ActualizarStock.setText("Actualizar Stock");
        jMenuItem6_ActualizarStock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem6_ActualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6_ActualizarStockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6_ActualizarStock);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem7_NuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem7_NuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem7_NuevoCliente.setText("Nuevo Cliente");
        jMenuItem7_NuevoCliente.setPreferredSize(new java.awt.Dimension(180, 30));
        jMenuItem7_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7_NuevoClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7_NuevoCliente);

        jMenuItem8_GestionarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem8_GestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenuItem8_GestionarCliente.setText("Gestionar Clientes");
        jMenuItem8_GestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8_GestionarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8_GestionarCliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem9_NuevaCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem9_NuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem9_NuevaCategoria.setText("Nueva Categoria");
        jMenuItem9_NuevaCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem9_NuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9_NuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9_NuevaCategoria);

        jMenuItem10_GestionarCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem10_GestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem10_GestionarCategoria.setText("Gestionar Categorias");
        jMenuItem10_GestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10_GestionarCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10_GestionarCategoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem11_NuevaVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem11_NuevaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem11_NuevaVenta.setText("Nueva Venta");
        jMenuItem11_NuevaVenta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem11_NuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11_NuevaVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11_NuevaVenta);

        jMenuItem12_GestionarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem12_GestionarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem12_GestionarVenta.setText("Gestionar Ventas");
        jMenuItem12_GestionarVenta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem12_GestionarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12_GestionarVentaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12_GestionarVenta);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem13_RporteClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem13_RporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem13_RporteClientes.setText("Reportes Clientes");
        jMenuItem13_RporteClientes.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem13_RporteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13_RporteClientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem13_RporteClientes);

        jMenuItem14_ReporteCAtegorias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem14_ReporteCAtegorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem14_ReporteCAtegorias.setText("Reportes Categorias");
        jMenuItem14_ReporteCAtegorias.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem14_ReporteCAtegorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14_ReporteCAtegoriasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem14_ReporteCAtegorias);

        jMenuItem15_ReporteProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem15_ReporteProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem15_ReporteProducto.setText("Reportes Productos");
        jMenuItem15_ReporteProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem15_ReporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15_ReporteProductoActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15_ReporteProducto);

        jMenuItem16_ReporteVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem16_ReporteVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem16_ReporteVenta.setText("Reportes Ventas");
        jMenuItem16_ReporteVenta.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem16_ReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16_ReporteVentaActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem16_ReporteVenta);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu7.setText("Historia");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem17_VerHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem17_VerHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem17_VerHistorial.setText("Ver Historial");
        jMenuItem17_VerHistorial.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem17_VerHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17_VerHistorialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem17_VerHistorial);

        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu8.setText("Cerrar Sesion");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 50));

        jMenuItem18_CerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18_CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem18_CerrarSesion.setText("Cerrar Sesion");
        jMenuItem18_CerrarSesion.setPreferredSize(new java.awt.Dimension(150, 30));
        jMenuItem18_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18_CerrarSesionActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18_CerrarSesion);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>                        

    private void jMenuItem2_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        InterUsuario InterUsuario = new InterUsuario();
        jDesktopPane_menu.add(InterUsuario);
        InterUsuario.setVisible(true);
    }                                                       

    private void jMenuItem10_GestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {                                                               
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDesktopPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);

    }                                                              

    private void jMenuItem9_NuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }                                                         

    private void jMenuItem4_NuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        InterProducto interProducto = new InterProducto();
        jDesktopPane_menu.add(interProducto);
        interProducto.setVisible(true);

    }                                                        

    private void jMenuItem5_GestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDesktopPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }                                                            

    private void jMenuItem7_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        InterCliente Intercliente = new InterCliente();
        jDesktopPane_menu.add(Intercliente);
        Intercliente.setVisible(true);
    }                                                       

    private void jMenuItem8_GestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        InterGestionarCliente IntergestionarCliente = new InterGestionarCliente();
        jDesktopPane_menu.add(IntergestionarCliente);
        IntergestionarCliente.setVisible(true);
    }                                                           

    private void jMenuItem6_ActualizarStockActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        InterActualizarStock InterActualizarstock = new InterActualizarStock();
        jDesktopPane_menu.add(InterActualizarstock);
        InterActualizarstock.setVisible(true);


    }                                                          

    private void jMenuItem18_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // Cierra la ventana actual
    this.dispose();

    // Abre la pantalla de inicio de sesión
    FrmLogin frmLogin = new FrmLogin();
    frmLogin.setVisible(true);
    }                                                        

    private void jMenuItem3_GestionDelUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        InterGestionarUsuario IntergestionarUsuario = new InterGestionarUsuario();
        jDesktopPane_menu.add(IntergestionarUsuario);
        IntergestionarUsuario.setVisible(true);
    }                                                            

    private void jMenuItem11_NuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        InterFacturacion Interfacturacion = new InterFacturacion();
        jDesktopPane_menu.add(Interfacturacion);
        Interfacturacion.setVisible(true);
    }                                                      

    private void jMenuItem12_GestionarVentaActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDesktopPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }                                                          

    private void jMenuItem13_RporteClientesActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        Reportes reporte = new Reportes();
        try {
            reporte.ReporteClientes();
        } catch (IOException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                          

    private void jMenuItem15_ReporteProductoActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        Reportes reporte = new Reportes();
        try {
            reporte.ReporteProductos();
        } catch (IOException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }                                                           

    private void jMenuItem14_ReporteCAtegoriasActionPerformed(java.awt.event.ActionEvent evt) {                                                              

        Reportes reporte = new Reportes();
        try {
            reporte.ReporteCategorias();
        } catch (IOException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                             

    private void jMenuItem16_ReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        
         Reportes reporte = new Reportes();
        try {
            reporte.ReporteVentas();
        } catch (IOException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                                        

    private void jMenuItem17_VerHistorialActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        InterGraficas Intergrafica = new InterGraficas();
        jDesktopPane_menu.add(Intergrafica);
        Intergrafica.setVisible(true);
    }                                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10_GestionarCategoria;
    private javax.swing.JMenuItem jMenuItem11_NuevaVenta;
    private javax.swing.JMenuItem jMenuItem12_GestionarVenta;
    private javax.swing.JMenuItem jMenuItem13_RporteClientes;
    private javax.swing.JMenuItem jMenuItem14_ReporteCAtegorias;
    private javax.swing.JMenuItem jMenuItem15_ReporteProducto;
    private javax.swing.JMenuItem jMenuItem16_ReporteVenta;
    private javax.swing.JMenuItem jMenuItem17_VerHistorial;
    private javax.swing.JMenuItem jMenuItem18_CerrarSesion;
    private javax.swing.JMenuItem jMenuItem2_nuevoUsuario;
    private javax.swing.JMenuItem jMenuItem3_GestionDelUsuario;
    private javax.swing.JMenuItem jMenuItem4_NuevoProducto;
    private javax.swing.JMenuItem jMenuItem5_GestionarProducto;
    private javax.swing.JMenuItem jMenuItem6_ActualizarStock;
    private javax.swing.JMenuItem jMenuItem7_NuevoCliente;
    private javax.swing.JMenuItem jMenuItem8_GestionarCliente;
    private javax.swing.JMenuItem jMenuItem9_NuevaCategoria;
    // End of variables declaration                   
}
