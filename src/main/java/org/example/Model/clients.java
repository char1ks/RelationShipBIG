package org.example.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class clients {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int client_id;

    @Column(name = "client_name" )
    private String client_name;

    @OneToMany(mappedBy = "clients",cascade = CascadeType.ALL)
    private List<products> products;

    public clients() {
    }
    public clients(String client_name) {
        this.client_name = client_name;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public List<org.example.Model.products> getProducts() {
        return products;
    }

    public void setProducts(List<org.example.Model.products> products) {
        this.products = products;
    }
}
