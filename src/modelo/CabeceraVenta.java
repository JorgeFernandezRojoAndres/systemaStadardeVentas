package modelo;

/**
 *
 * @author Jorge
 */
public class CabeceraVenta {
    //atributos
    private int idCabeceraventa;
    private int idCliente;
    private double valorApagar;
    private String fechaVenta;
    private int estado;
    
   // contructor vacio
    
    public CabeceraVenta() {
        this.idCabeceraventa = 0;
        this.idCliente = 0;
        this.valorApagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }
    //contructor lleno

    public CabeceraVenta(int idCabeceraventa, int idCliente, double valorApagar, String fechaApagar, int estado) {
        this.idCabeceraventa = idCabeceraventa;
        this.idCliente = idCliente;
        this.valorApagar = valorApagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }
    
    //get and setter

    public int getIdCabeceraventa() {
        return idCabeceraventa;
    }

    public void setIdCabeceraventa(int idCabeceraventa) {
        this.idCabeceraventa = idCabeceraventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(double valorApagar) {
        this.valorApagar = valorApagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaApagar(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    //toStrin metodo

    @Override
    public String toString() {
        return "CabeceraVenta{" + "idCabeceraventa=" + idCabeceraventa + ", idCliente=" + idCliente + ", valorApagar=" + valorApagar + ", fechaApagar=" + fechaVenta + ", estado=" + estado + '}';
    }
    
}
