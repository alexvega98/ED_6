package ed_tema6;


/**
 *
 * @author alexv
 */
public class Tarea6EDClase {
  public void aplicarDescuento(double precioProducto, int cantidadProductos) {
        CalculoTotalApagar(cantidadProductos, precioProducto);
    } 

    public void CalculoTotalApagar(int cantidadProductos, double precioProducto) {
        double total;
        if (cantidadProductos > 3) {
            precioProducto -= 5;
        }
        if (cantidadProductos != 0) {
            total = precioProducto * Constant_no_cero;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        } else {
            total = precioProducto * Constant_cero;
            System.out.println("El total a pagar es: " + total);
            System.out.println("Enviado");
        }
    } 
    public static final double Constant_cero = 0.95;
    public static final double Constant_no_cero = 0.8;
}
