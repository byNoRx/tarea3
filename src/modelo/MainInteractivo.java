import java.util.Scanner;

public class MainInteractivo {
    public static void imprimirProductos() {
        System.out.println("\nIngrese el número del producto que desea comprar: ");
        System.out.println("0. SALIR");
        System.out.println(ProductoTipo.COCA.getNumero() + ". " + ProductoTipo.COCA.toString() + " $" + ProductoTipo.COCA.getPrecio());
        System.out.println(ProductoTipo.FANTA.getNumero() + ". " + ProductoTipo.FANTA.toString() + " $" + ProductoTipo.FANTA.getPrecio());
        System.out.println(ProductoTipo.SPRITE.getNumero() + ". " + ProductoTipo.SPRITE.toString() + " $" + ProductoTipo.SPRITE.getPrecio());
        System.out.println(ProductoTipo.SNICKERS.getNumero() + ". " + ProductoTipo.SNICKERS.toString() + " $" + ProductoTipo.SNICKERS.getPrecio());
        System.out.println(ProductoTipo.SUPER8.getNumero() + ". " + ProductoTipo.SUPER8.toString() + " $" + ProductoTipo.SUPER8.getPrecio());
        System.out.print("Opción: ");
    }

    public static void imprimirMonedas() {
        System.out.println("\nIngrese el número de la moneda que desea introducir:");
        System.out.println("1. MONEDA DE 100");
        System.out.println("2. MONEDA DE 500");
        System.out.println("3. MONEDA DE 1000");
        System.out.println("4. MONEDA DE 1500");
        System.out.print("Opción: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Expendedor exp = new Expendedor(5);

        boolean salir = false;

        System.out.println("----Expendedor----");
        while (!salir) {
            imprimirProductos();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                salir = true;
                System.out.println("----Gracias por usar el expendedor----");
                break;
            }

            imprimirMonedas();
            int tipoMoneda = scanner.nextInt();

            Moneda moneda = null;
            if (tipoMoneda == 1) {
                moneda = new Moneda100();
            } else if (tipoMoneda == 2) {
                moneda = new Moneda500();
            } else if (tipoMoneda == 3) {
                moneda = new Moneda1000();
            } else if (tipoMoneda == 4) {
                moneda = new Moneda1500();
            }

            try {
                Comprador comprador = new Comprador(moneda, opcion, exp);
                System.out.println("Has comprado " + comprador.queConsumiste());
                System.out.println("Vuelto: $" + comprador.cuantoVuelto());
            } catch (PagoIncorrectoException e) {
                System.out.println(e.getMessage());
            } catch (PagoInsuficienteException e) {
                System.out.println(e.getMessage());
            } catch (NoHayProductoException e) {
                System.out.println(e.getMessage());
            }

        }

        scanner.close();
    }
}
