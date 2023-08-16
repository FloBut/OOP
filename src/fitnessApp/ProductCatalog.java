package fitnessApp;

public class ProductCatalog {
    Product[] products;
    final int maxNumberOfProducts = 100;//constanta pentru toate obiectele din clasa ProductCatalog
    int numberOfProducts;

    public ProductCatalog(Product[] products) {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public ProductCatalog() {

    }

    public void printProducts() { //afisez lista de produse
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
        }

    }
    public boolean addProduct(Product product) { //adaug sau nu produsul in lista
        if (isProductAdded(product) || numberOfProducts == maxNumberOfProducts) {
            System.out.println("Produsul " + product.name + " nu poate fi adaugat in lista");
            return false;
        } else {
            products[numberOfProducts++] = product;
            System.out.println("Produsul " + product.name + " a fost adaugat in lista");
            return true;
        }
    }

    public boolean isProductAdded(Product product) {
        if (numberOfProducts == 0) {
            return false;
        }
        for (int i = 0; i < products.length; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName(String name) {
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (products[i].name.equals(name)) {
                return products[i];
            }
        }
        System.out.println("Produsul nu a fost gasit");
        return null;
    }

    //public boolean deleteProduct(String name) {
      //  return true;
    //}
}
