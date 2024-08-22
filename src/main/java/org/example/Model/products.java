package org.example.Model;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class products {
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @ManyToOne
    @JoinColumn(name = "client_id",referencedColumnName = "client_id")
    private clients clients;

    @Column(name = "product_name")
    private String product_name;

    @OneToOne(mappedBy = "products",cascade = CascadeType.ALL)
    private characters characters;

    @OneToOne(mappedBy = "products",cascade = CascadeType.ALL)
    private price price;

    public products() {
    }

    public products(org.example.Model.clients clients, String product_name) {
        this.clients = clients;
        this.product_name = product_name;
    }

    public org.example.Model.characters getCharacters() {
        return characters;
    }

    public void setCharacters(org.example.Model.characters characters) {
        this.characters = characters;
    }

    public org.example.Model.price getPrice() {
        return price;
    }

    public void setPrice(org.example.Model.price price) {
        this.price = price;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public org.example.Model.clients getClients() {
        return clients;
    }

    public void setClients(org.example.Model.clients clients) {
        this.clients = clients;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
