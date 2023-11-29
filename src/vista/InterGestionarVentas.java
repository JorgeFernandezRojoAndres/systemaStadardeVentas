package vista;

import conexion.Conexion;
import controlador.Ctrl_RegistrarVenta;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.CabeceraVenta;

/**
 * @author JorgeFernandez
 */
public class InterGestionarVentas extends javax.swing.JInternalFrame {

    private int idCliente = 0;
    private int idVenta;

    public InterGestionarVentas() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Ventas");

        //carga tabla
        this.CargarComboClientes();
        this.CargarTablaVentas();

        //insertar imagen en nuestro Jlabel
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel3_wallpaper.setIcon(icono);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Ventas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1_Actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_totalpagar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jComboBox1_Estado = new javax.swing.JComboBox<>();
        jComboBox_Cliente = new javax.swing.JComboBox<>();
        jLabel3_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administras Venta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1_Ventas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1_Actualizar.setBackground(new java.awt.Color(51, 204, 0));
        jButton1_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1_Actualizar.setText("Actualizar");
        jButton1_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Total Pagar :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_totalpagar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_totalpagar.setEnabled(false);
        jPanel3.add(txt_totalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Fecha :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cliente:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 80, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 80, -1));

        txt_fecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_fecha.setEnabled(false);
        jPanel3.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        jComboBox1_Estado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel3.add(jComboBox1_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 170, -1));

        jComboBox_Cliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Cliente:", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 170, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));
        getContentPane().add(jLabel3_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ActualizarActionPerformed
        CabeceraVenta cabeceraVenta = new CabeceraVenta();
        Ctrl_RegistrarVenta controlRegistrarVenta = new Ctrl_RegistrarVenta();
        String cliente, estado;
        cliente = jComboBox_Cliente.getSelectedItem().toString().trim();
        estado = jComboBox1_Estado.getSelectedItem().toString().trim();

        //obtener el id de cliente
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select idCliente, concat(nombre, ' ', apellido) as cliente "
                            + "from tb_clientes where concat(nombre, ' ', apellido) = ?");
            pst.setString(1, cliente);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                idCliente = rs.getInt("idCliente");
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("error al cargar el id cliente:" + e);
        }

        //Actualizar Datos
        if (!cliente.equalsIgnoreCase("Seleccione Cliente")) {
            cabeceraVenta.setIdCliente(idCliente);
            if (estado.equalsIgnoreCase("Activo")) {
                cabeceraVenta.setEstado(1);
            } else {
                cabeceraVenta.setEstado(0);
            }
            if (controlRegistrarVenta.actualizar(cabeceraVenta, idVenta)) {
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                this.CargarTablaVentas();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione registro para actualizar datos ");
        }


    }//GEN-LAST:event_jButton1_ActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Actualizar;
    public static javax.swing.JComboBox<String> jComboBox1_Estado;
    public static javax.swing.JComboBox<String> jComboBox_Cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel3_wallpaper;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1_Ventas;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_totalpagar;
    // End of variables declaration//GEN-END:variables
     /*Metodo para limpiar
     */
    private void Limpiar() {
        this.txt_totalpagar.setText("");
        this.txt_fecha.setText("");
        this.jComboBox_Cliente.setSelectedItem("Seleccione cliente :");
        this.jComboBox1_Estado.setSelectedItem("Activo");
        idCliente = 0;

    }

    /*Metodo para mostrar todas los clientes registrados
     */
    private void CargarTablaVentas() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT cv.idCabeceraVenta as id, CONCAT(c.nombre, ' ', c.apellido) as cliente,"
                + " cv.valorPagar as total, cv.fechaVenta as fecha, cv.estado "
                + "FROM tb_cabecera_venta as cv, tb_clientes as c where cv.idCliente = c.idCliente;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarVentas.jTable1_Ventas = new JTable(model);
            InterGestionarVentas.jScrollPane1.setViewportView(InterGestionarVentas.jTable1_Ventas);

            model.addColumn("N°");//id
            model.addColumn("cliente");
            model.addColumn("total pagar");
            model.addColumn("fecha venta");
            model.addColumn("estado");
            while (rs.next()) {
                Object fila[] = new Object[5];
                for (int i = 0; i < 5; i++) {
                    if (i == 4) {
                        String estado = String.valueOf(rs.getObject(i + 1));
                        if (estado.equalsIgnoreCase("1")) {
                            fila[i] = "Activo";
                        } else {
                            fila[i] = "Inactivo";
                        }
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla de venta: " + e);
        }
        jTable1_Ventas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable1_Ventas.rowAtPoint(e.getPoint());
                int columna_point = 0;
                if (fila_point > -1) {
                    idVenta = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosVentaSeleccionada(idVenta);//metodo
                }
            }
        });
    }

//Metodo que envia  datos seleccionados↓↓
    private void EnviarDatosVentaSeleccionada(int idVenta) {
        try {
            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement("SELECT cv.idCabeceraVenta , cv.idCliente ,"
                    + " CONCAT(c.nombre, ' ', c.apellido) as cliente, cv.valorPagar , cv.fechaVenta , "
                    + "cv.estado FROM tb_cabecera_venta as cv, tb_clientes as c "
                    + "where cv.idCabeceraVenta = '" + idVenta + "' and cv.idCliente = c.idCliente; ");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                jComboBox_Cliente.setSelectedItem(rs.getString("cliente"));
                txt_totalpagar.setText(rs.getString("valorPagar"));
                txt_fecha.setText(rs.getString("fechaVenta"));
                int estado = rs.getInt("estado");
                if (estado == 1) {
                    jComboBox1_Estado.setSelectedItem("Activo");
                } else {
                    jComboBox1_Estado.setSelectedItem("Inactivo");
                }
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al Seleccionar Venta: " + e);
        }

    }

    //metodo para cargar clientes en el jcombobox
    private void CargarComboClientes() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_clientes";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_Cliente.removeAllItems();
            jComboBox_Cliente.addItem("Seleccione Cliente:");
            while (rs.next()) {
                jComboBox_Cliente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.print("Error al cargar el cliente," + e);

        }

    }

}
