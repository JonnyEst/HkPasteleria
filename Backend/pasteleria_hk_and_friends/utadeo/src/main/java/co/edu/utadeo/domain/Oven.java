package co.edu.utadeo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Oven implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 9, nullable = false)
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Brand brand;

    @OneToMany(mappedBy = "oven")
    private List<Bake> bakes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public List<Bake> getBakes() {
        return bakes;
    }

    public void setBakes(List<Bake> bakes) {
        this.bakes = bakes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oven oven = (Oven) o;

        return id != null ? id.equals(oven.id) : oven.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
