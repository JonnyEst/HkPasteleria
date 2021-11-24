package co.edu.utadeo.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date orderDate;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date deadline;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDelivery;

    @Column(length = 500)
    private String description;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Employee attendedBy;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private Cake cake;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Applicant applicant;
    
    public Order(Integer id, Date orderDate, Date deadline, Date dateDelivery, String description, Employee attendedBy,
			Cake cake, Applicant applicant) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.deadline = deadline;
		this.dateDelivery = dateDelivery;
		this.description = description;
		this.attendedBy = attendedBy;
		this.cake = cake;
		this.applicant = applicant;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getAttendedBy() {
        return attendedBy;
    }

    public void setAttendedBy(Employee attendedBy) {
        this.attendedBy = attendedBy;
    }

    public Cake getCake() {
        return cake;
    }

    public void setCake(Cake cake) {
        this.cake = cake;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deadline=" + deadline +
                ", dateDelivery=" + dateDelivery +
                ", description='" + description + '\'' +
                '}';
    }
}
