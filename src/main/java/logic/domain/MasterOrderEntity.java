package logic.domain;


import javax.persistence.*;


@Entity
@Table(name="MASTER_ORDERS")
public class MasterOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_master_order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer_order", nullable = false)
    private CustomerOrderEntity customerorderEntities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_master")
    private MasterEntity masterEntities;

    @Column(name="description")
    private String description;

    public Long getId_master_order() {
        return id_master_order;
    }

    public void setId_master_order(Long id_master_orders) {
        this.id_master_order = id_master_orders;
    }

    public CustomerOrderEntity getCustomerorderEntities() {
        return customerorderEntities;
    }

    public void setCustomerorderEntities(CustomerOrderEntity customerorderEntities) {
        this.customerorderEntities = customerorderEntities;
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
