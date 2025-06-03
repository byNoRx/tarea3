import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Test sort de monedas
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda500());
        monedas.add(new Moneda1500());
        monedas.add(new Moneda1500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        
        System.out.println("\n----Monedas sin ordenar----\n");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.println(monedas.get(i).toString());
        }

        // Ordenar las monedas
        monedas.sort(null);

        // Mostrar monedas ordenadas
        System.out.println("\n----Monedas ordenadas:----\n");
        for (int i = 0; i < monedas.size(); i++) {
            System.out.println(monedas.get(i).toString());
        }

        // Test de excepciones
        Moneda moneda = null;
        Expendedor expendedor = null;
        Comprador comprador = null;
        ProductoTipo producto = null;

        System.out.println("\n----Intentar comprar producto sin dinero suficiente:----\n");

        moneda = new Moneda100();
        expendedor = new Expendedor(1);
        try {
            comprador = new Comprador(moneda, ProductoTipo.COCA.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto sin moneda:----\n");

        moneda = null;
        expendedor = new Expendedor(1);
        try {
            new Comprador(null, ProductoTipo.FANTA.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto con deposito vacio:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(0);
        try {
            comprador = new Comprador(moneda, ProductoTipo.SNICKERS.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto que no existe:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(1);
        try {
            comprador = new Comprador(moneda, 123, expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----Intentar comprar producto con dinero justo para el precio:----\n");

        moneda = new Moneda500();
        expendedor = new Expendedor(1);
        producto = ProductoTipo.SUPER8;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto());

        System.out.println("\n----Intentar comprar producto con dinero de sobra:----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(1);
        producto = ProductoTipo.SPRITE;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto());

        System.out.println("\n----Probar enumeración----\n");

        System.out.println(ProductoTipo.COCA.getNumero() + ", " + ProductoTipo.COCA.toString() + ", $" + ProductoTipo.COCA.getPrecio());
        System.out.println(ProductoTipo.FANTA.getNumero() + ", " + ProductoTipo.FANTA.toString() + ", $" + ProductoTipo.FANTA.getPrecio());
        System.out.println(ProductoTipo.SPRITE.getNumero() + ", " + ProductoTipo.SPRITE.toString() + ", $" + ProductoTipo.SPRITE.getPrecio());
        System.out.println(ProductoTipo.SNICKERS.getNumero() + ", " + ProductoTipo.SNICKERS.toString() + ", $" + ProductoTipo.SNICKERS.getPrecio());
        System.out.println(ProductoTipo.SUPER8.getNumero() + ", " + ProductoTipo.SUPER8.toString() + ", $" + ProductoTipo.SUPER8.getPrecio());

        System.out.println("\n----Probar productos----\n");

        Producto cocacola = new CocaCola(1);
        Producto fanta = new Fanta(2);
        Producto sprite = new Sprite(3);
        Producto snickers = new Snickers(4);
        Producto super8 = new Super8(5);
        System.out.println("serie: " + cocacola.getSerie() + ", sabor: " + cocacola.getSabor());
        System.out.println("serie: " + fanta.getSerie() + ", sabor: " + fanta.getSabor());
        System.out.println("serie: " + sprite.getSerie() + ", sabor: " + sprite.getSabor());
        System.out.println("serie: " + snickers.getSerie() + ", sabor: " + snickers.getSabor());
        System.out.println("serie: " + super8.getSerie() + ", sabor: " + super8.getSabor());

        System.out.println("\n----Probar monedas----\n");

        Moneda m100 = new Moneda100();
        Moneda m500 = new Moneda500();
        Moneda m1000 = new Moneda1000();
        Moneda m1500 = new Moneda1500();
        System.out.println("serie: " + m100.getSerie() + ", valor: $" + m100.getValor());
        System.out.println("serie: " + m500.getSerie() + ", valor: $" + m500.getValor());
        System.out.println("serie: " + m1000.getSerie() + ", valor: $" + m1000.getValor());
        System.out.println("serie: " + m1500.getSerie() + ", valor: $" + m1500.getValor());

        System.out.println("\n----Probar compra de cada producto----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(1);
        producto = ProductoTipo.COCA;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto() + "\n");

        producto = ProductoTipo.FANTA;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto() + "\n");

        producto = ProductoTipo.SPRITE;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto() + "\n");

        producto = ProductoTipo.SNICKERS;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto() + "\n");
        System.out.println();

        producto = ProductoTipo.SUPER8;
        try {
            comprador = new Comprador(moneda, producto.getNumero(), expendedor);
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Valor de la moneda: $" + moneda.getValor());
        System.out.println("Precio del producto: $" + producto.getPrecio());
        System.out.println("Consumió " + comprador.queConsumiste() + ". Vuelto: $" + comprador.cuantoVuelto() + "\n");

        System.out.println("\n----Test de depósito----\n");

        // Lenar depósito con productos
        Deposito<Producto> depositoProductos = new Deposito<>();
        depositoProductos.addObjeto(new CocaCola(1));
        depositoProductos.addObjeto(new Fanta(2));
        depositoProductos.addObjeto(new Sprite(3));
        depositoProductos.addObjeto(new Snickers(4));
        depositoProductos.addObjeto(new Super8(5));

        Producto p = depositoProductos.getObjeto();
        while (p != null) {
            System.out.println("producto sabor " + p.getSabor() + " con serie " + p.getSerie() + " ha sido retirado del depósito");
            p = depositoProductos.getObjeto();
        }
        System.out.println("Depósito vaciado.");

        System.out.println("\n----Probar expendedor----\n");

        moneda = new Moneda1500();
        expendedor = new Expendedor(3);
        producto = ProductoTipo.COCA;
        System.out.println("Precio del producto: $" + producto.getPrecio());
        try {
            System.out.println("Comprar " + expendedor.comprarProducto(moneda, producto.getNumero()).getSabor() + " con $" + moneda.getValor());
            System.out.println("Comprar " + expendedor.comprarProducto(moneda, producto.getNumero()).getSabor() + " con $" + moneda.getValor());
            System.out.println("Comprar " + expendedor.comprarProducto(moneda, producto.getNumero()).getSabor() + " con $" + moneda.getValor());
            System.out.println("Comprar " + expendedor.comprarProducto(moneda, producto.getNumero()).getSabor() + " con $" + moneda.getValor());
        } catch (PagoIncorrectoException e) {
            System.out.println(e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (NoHayProductoException e) {
            System.out.println(e.getMessage());
        }

        Moneda m = expendedor.getVuelto();
        while (m != null) {
            System.out.println("Moneda $" + m.getValor() + " ha sido retirada del depósito");
            m = expendedor.getVuelto();
        }
        System.out.println("Depósito vaciado.");
        
    }
}



