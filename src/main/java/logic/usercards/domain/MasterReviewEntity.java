package logic.usercards.domain;


import logic.auth.domain.CustomerEntity;
import logic.auth.domain.MasterEntity;

import javax.persistence.*;

@Entity
@Table(name="MASTER_REVIEWS")
public class MasterReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_master_review;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer_order")
    private CustomerEntity customerEntities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_master", nullable = false)
    private MasterEntity masterEntities;

    @Column(name = "description")
    private String description;

    public Long getId_master_review() {
        return id_master_review;
    }

    public void setId_master_review(Long id_master_reviews) {
        this.id_master_review = id_master_reviews;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
