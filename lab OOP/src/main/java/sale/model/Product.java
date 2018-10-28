package sale.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import sale.enums.ProductType;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Product {

    private UUID id;

    private ProductType type;

    private long price;

    private List<Discount> discounts;

    private Boolean allreadyInDiscount = false;

    public Product(ProductType type, long price) {
        this.id = UUID.randomUUID();
        this.type = type;
        this.price = price;
        discounts = new ArrayList<>();
    }

    public Product(Product product) {
        this.id = product.id;
        this.type = product.type;
        this.price = product.price;
        this.discounts = product.discounts;
        this.allreadyInDiscount = product.allreadyInDiscount;
    }

    public void addSale(Discount sale) {
        discounts.add(sale);
    }
}