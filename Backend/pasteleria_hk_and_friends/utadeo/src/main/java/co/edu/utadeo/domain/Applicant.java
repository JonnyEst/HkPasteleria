package co.edu.utadeo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Applicant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(mappedBy = "applicant")
    private Company company;

    @OneToOne(mappedBy = "applicant")
    private ExternalPerson externalPerson;

  /*  @OneToOne(mappedBy = "applicant")
    private List<Employee> employee;*/

    @OneToMany(mappedBy = "applicant")
    private List<Order> orders;

    @OneToMany(mappedBy = "applicant")
    private List<Ingredient> ingredients;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ExternalPerson getExternalPerson() {
        return externalPerson;
    }

    public void setExternalPerson(ExternalPerson externalPerson) {
        this.externalPerson = externalPerson;
    }

  /*  public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }*/

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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

        Applicant applicant = (Applicant) o;

        return id != null ? id.equals(applicant.id) : applicant.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                '}';
    }
}
