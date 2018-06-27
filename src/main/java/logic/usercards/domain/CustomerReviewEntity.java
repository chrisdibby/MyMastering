package logic.usercards.domain;

import logic.auth.domain.CustomerEntity;
import logic.auth.domain.MasterEntity;
import logic.orders.domain.CustomerOrderEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="CUSTOMER_REVIEWS")
public class CustomerReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_customer_review;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer", nullable = false)
    private CustomerEntity customerEntities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_master", nullable=false)
    private MasterEntity masterEntities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_customer_order", nullable=false)
    private CustomerOrderEntity customerorderEntities;

    @Column(name="date")
    private Date date;
    @Column(name="text")
    private String text;
    @Column (name="rating")
    private Integer rating;

    public Long getId_customer_review() {
        return id_customer_review;
    }

    public void setId_customer_review(Long id_customer_review) {
        this.id_customer_review = id_customer_review;
    }

    public CustomerEntity getCustomerEntities() {
        return customerEntities;
    }

    public void setCustomerEntities(CustomerEntity customerEntities) {
        this.customerEntities = customerEntities;
    }

    public MasterEntity getMasterEntities() {
        return masterEntities;
    }

    public void setMasterEntities(MasterEntity masterEntities) {
        this.masterEntities = masterEntities;
    }

    public CustomerOrderEntity getCustomerorderEntities() {
        return customerorderEntities;
    }

    public void setCustomerorderEntities(CustomerOrderEntity orderEntities) {
        this.customerorderEntities = orderEntities;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


}
