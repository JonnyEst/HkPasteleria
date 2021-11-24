package co.edu.utadeo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cake implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30)
    private String name;

    @Column(length = 2, nullable = false)
    private Double minimumWeight;

    @Column(length = 2)
    private Double finalWeight;

    @OneToOne(mappedBy = "cake")
    private Order order;

    @OneToOne(fetch = FetchType.LAZY)
    private Decor decor;

    @OneToOne(fetch = FetchType.LAZY)
    private Bake bake;

    @ManyToMany(mappedBy = "cakes")
    private List<Baker> bakers;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TypeCake typeCake;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Stage stage;

    @OneToMany(mappedBy = "cake")
    private List<Ingredient> ingredients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinimumWeight() {
        return minimumWeight;
    }

    public void setMinimumWeight(Double minimumWeight) {
        this.minimumWeight = minimumWeight;
    }

    public Double getFinalWeight() {
        return finalWeight;
    }

    public void setFinalWeight(Double finalWeight) {
        this.finalWeight = finalWeight;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Decor getDecor() {
        return decor;
    }

    public void setDecor(Decor decor) {
        this.decor = decor;
    }

    public Bake getBake() {
        return bake;
    }

    public void setBake(Bake bake) {
        this.bake = bake;
    }

    public List<Baker> getBakers() {
        return bakers;
    }

    public void setBakers(List<Baker> bakers) {
        this.bakers = bakers;
    }

    public TypeCake getTypeCake() {
        return typeCake;
    }

    public void setTypeCake(TypeCake typeCake) {
        this.typeCake = typeCake;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cake cake = (Cake) o;

        return id != null ? id.equals(cake.id) : cake.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minimumWeight=" + minimumWeight +
                ", finalWeight=" + finalWeight +
                '}';
    }
}
