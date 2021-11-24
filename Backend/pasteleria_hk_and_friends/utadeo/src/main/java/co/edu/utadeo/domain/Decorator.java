package co.edu.utadeo.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class Decorator extends Employee implements Serializable {

    @OneToMany(mappedBy = "decorator")
    private List<Decor> decors;

    public List<Decor> getDecors() {
        return decors;
    }

    public void setDecors(List<Decor> decors) {
        this.decors = decors;
    }
}
