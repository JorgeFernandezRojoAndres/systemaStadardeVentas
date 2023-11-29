package modelo;

/**
 *
 * @author Jorge
 */
public class DetalleVenta {
    //Atributos
    private int IdDetalleDeVenta;
    private int IdcabeceraDeVenta;
    private int IdProducto;
    //esta de mas
    private String nombre;
    private int cantidad;
    private double PrecioUnitario;
    private double subtotal;
    private double descuento;
    private double iva;
    private double totalApagar;
    private int estado;
    
    //contructor

    public DetalleVenta() {
        this.IdDetalleDeVenta = 0;
        this.IdcabeceraDeVenta = 0;
        this.IdProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.PrecioUnitario = 0.0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.iva = 0.0;
        this.totalApagar = 0.0;
        this.estado = 0;
    }
//contructor lleno
    public DetalleVenta(int IdDetalleDeVenta, int IdcabeceraDeVenta, int IdProducto, String nombre, int cantidad, double PrecioUnitario, double subtotal, double descuento, double iva, double totalApagar, int estado) {
        this.IdDetalleDeVenta = IdDetalleDeVenta;
        this.IdcabeceraDeVenta = IdcabeceraDeVenta;
        this.IdProducto = IdProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.PrecioUnitario = PrecioUnitario;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalApagar = totalApagar;
        this.estado = estado;
    }

    public int getIdDetalleDeVenta() {
        return IdDetalleDeVenta;
    }

    public void setIdDetalleDeVenta(int IdDetalleDeVenta) {
        this.IdDetalleDeVenta = IdDetalleDeVenta;
    }

    public int getIdcabeceraDeVenta() {
        return IdcabeceraDeVenta;
    }

    public void setIdcabeceraDeVenta(int IdcabeceraDeVenta) {
        this.IdcabeceraDeVenta = IdcabeceraDeVenta;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    public void setPrecioUnitario(double PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(double totalApagar) {
        this.totalApagar = totalApagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //toString

    @Override
    public String toString() {
        return "DetalleVenta{" + "IdDetalleDeVenta=" + IdDetalleDeVenta + ", IdcabeceraDeVenta=" + IdcabeceraDeVenta + ", IdProducto=" + IdProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", PrecioUnitario=" + PrecioUnitario + ", subtotal=" + subtotal + ", descuento=" + descuento + ", iva=" + iva + ", totalApagar=" + totalApagar + ", estado=" + estado + '}';
    }
    
    
    
    
}
