package entidades.clases;

import clases.principal.Productos;
import java.util.TreeSet;

public class EntidadesProductos {

    TreeSet<Productos> products;

    public EntidadesProductos() {
        this.products = new TreeSet();
    }

    public EntidadesProductos(TreeSet<Productos> products) {
        this.products = products;
    }

    public TreeSet<Productos> getProducts() {
        return products;
    }

    public void setProducts(TreeSet<Productos> products) {
        this.products = products;
    }
    
    
    
    
}
