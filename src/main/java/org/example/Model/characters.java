package org.example.Model;
import javax.persistence.*;

@Entity
@Table(name = "characters")
public class characters {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "about")
    private String about;

    @OneToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private products products;

    public characters() {
    }

    public characters(String about, org.example.Model.products products) {
        this.about = about;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public org.example.Model.products getProducts() {
        return products;
    }

    public void setProducts(org.example.Model.products products) {
        this.products = products;
    }
}
