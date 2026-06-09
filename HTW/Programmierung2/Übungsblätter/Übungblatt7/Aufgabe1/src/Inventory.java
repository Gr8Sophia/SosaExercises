import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Inventory {
    private Map<Integer, Product> products = new LinkedHashMap<Integer, Product>();

    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    public boolean removeProduct(int productId) {
        return products.remove(productId) != null;
    }

    public Product findProductById(int productId) {
        return products.get(productId);
    }

    public List<Product> findProductsByCategory(String category) {
        List<Product> productList = new ArrayList<Product>();
        for (Product product : products.values()) {
            if(product.getCategory().equals(category)) {
            productList.add(product);
            }
        }
        return productList;
    }

    public List<Product> getAllProducts() {
       return new ArrayList<Product>(products.values());
    }
    public List<Product> sortProductsByName(){
        List<Product> sortedProducts = new ArrayList<>(products.values());
        sortedProducts.sort((a, b) -> a.getName().compareTo(b.getName()));
        return sortedProducts;
    }
    public List<Product> sortProductsByPrice(){
        List<Product>sortedProducts=new ArrayList<>(products.values());
        sortedProducts.sort((a,b) -> Double.compare(a.getPrice(),b.getPrice()));
        return sortedProducts;

    }
    public List<Product> getLowStockProducts(int threshold){
        List<Product> lowStockProducts = new ArrayList<>();
        for(Product product : products.values()){
            if(product.getQuantity() < threshold){
                lowStockProducts.add(product);
            }
        }
        return lowStockProducts;
    }
    public List<Product> filterProducts (Predicate<Product> filter){
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product : products.values()){
            if(filter.test(product)){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public void applyToProducts(Consumer<Product> consumer){
        for(Product product : products.values()){
            consumer.accept(product);
        }
    }
}
