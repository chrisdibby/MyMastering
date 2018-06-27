package logic.orders.domain;


import logic.orders.domain.CustomerOrderEntity;

import javax.persistence.*;

@Entity
@Table(name="ORDER_PHOTOS")
public class OrderPhotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_order_photo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_customer_order", nullable = false)
    private CustomerOrderEntity customerorderEntities;

    @Column(name="photo")
    private String photo;

    public Long getId_order_photo() {
        return id_order_photo;
    }

    public void setId_order_photo(Long id_order_photo) {
        this.id_order_photo = id_order_photo;
    }

    public CustomerOrderEntity getCustomerorderEntities() {
        return customerorderEntities;
    }

    public void setCustomerorderEntities(CustomerOrderEntity customerorderEntities) {
        this.customerorderEntities = customerorderEntities;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
