package org.example.Model;
import javax.persistence.*;

@Entity
@Table(name = "price")
public class price {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "price")
    private int price;

    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private products products;

    public price() {
    }

    public price(int price, org.example.Model.products products) {
        this.price = price;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public org.example.Model.products getProducts() {
        return products;
    }

    public void setProducts(org.example.Model.products products) {
        this.products = products;
    }
}
