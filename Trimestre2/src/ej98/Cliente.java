package ej98;

public abstract class Cliente {

    protected String nombre;
    protected int idCliente;
    protected Compra hcompras[];

    public Cliente(String nombre, int id, int ncompras) {
        this.nombre = nombre;
        this.idCliente = id;
        hcompras = new Compra[ncompras];

    }

    public void realizarCompra(String fechita, int narticulos) {
        for (int i = 0; i < hcompras.length; i++) {
            if (hcompras[i] == null) {
                hcompras[i] = new Compra(fechita, hcompras[i].preciototal);
            }
        }
    }
    public void mostrarHistorial(){
        System.out.println("------------HISTORIAL DE COMPRA---------------");
        for (int i = 0; i < hcompras.length; i++) {
            System.out.println(hcompras[i]); 
        }
    }
    public abstract double calcularTotal();
}
