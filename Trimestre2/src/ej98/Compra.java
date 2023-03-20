package ej98;

public class Compra {

    String fecha;
    Articulo articulos[];
    int preciototal;
    boolean descuento;

    public Compra(String fecha,  int narticulos) {
        this.fecha = fecha;
        this.preciototal = 0;
        this.descuento = false;
        this.articulos = new Articulo[narticulos];
        for (int i = 0; i < narticulos; i++) {
            this.articulos[i] = null;
        }
    }
    public void añadirACompra(String nombre, int precio){
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i]==null) {
                articulos[i]=new Articulo(nombre, precio);
                preciototal+=precio;
            }
        }
    }
    public void mostrarCompras(){
        for (int i = 0; i < articulos.length; i++) {
            System.out.println(articulos[i]);
        }
    }

    public String toString() {
        String res = "------------------Compra realizada------------------\n"
                + "Fecha de la compra: " + this.fecha;
        for (int i = 0; i < this.articulos.length; i++) {
            res += "\nArticulo " + i + ": " + this.articulos[i].toString();

        }
        res += "\nTotal: " + this.preciototal + " €";
        return res;
    }
}
