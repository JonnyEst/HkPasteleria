package co.edu.utadeo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class Baker extends Employee implements Serializable {

    @Column(length = 10, nullable = false)
    private String passportNumber;

    @Column(length = 2, nullable = false)
    private Byte experience;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Country country;

    @ManyToOne(fetch = FetchType.LAZY)
    private Baker suggestedBy;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "baker_cake",
            joinColumns = { @JoinColumn(name = "baker_id")},
            inverseJoinColumns = { @JoinColumn(name = "cake_id") }
    )
    private List<Cake> cakes;

    @OneToMany(mappedBy = "baker")
    private List<Ingredient> ingredients;

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Byte getExperience() {
        return experience;
    }

    public void setExperience(Byte experience) {
        this.experience = experience;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Baker getSuggestedBy() {
        return suggestedBy;
    }

    public void setSuggestedBy(Baker suggestedBy) {
        this.suggestedBy = suggestedBy;
    }

    public List<Cake> getCakes() {
        return cakes;
    }

    public void setCakes(List<Cake> cakes) {
        this.cakes = cakes;
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

        Baker baker = (Baker) o;

        return passportNumber != null ? passportNumber.equals(baker.passportNumber) : baker.passportNumber == null;
    }

    @Override
    public int hashCode() {
        return passportNumber != null ? passportNumber.hashCode() : 0;
    }

	@Override
	public String toString() {
		return "Baker [passportNumber=" + passportNumber + ", experience=" + experience + ", country=" + country
				+ ", suggestedBy=" + suggestedBy + ", cakes=" + cakes + ", ingredients=" + ingredients + "]";
	}

    
  /*  @Override
    public String toString() {
        return "Baker{" +
                "passportNumber='" + passportNumber + '\'' +
                ", experience=" + experience +
                ", country=" + country +
                '}';
    }*/
}
