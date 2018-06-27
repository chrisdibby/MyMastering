package logic.orders.domain;

import logic.auth.domain.CustomerEntity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="CUSTOMER_ORDERS")
public class CustomerOrderEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_customer_order;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_customer", nullable = false)
    private CustomerEntity customerEntities;

    @Column(name = "sphere_work")
    private String sphere_work;
    @Column(name="name")
    private String name;
    @Column (name="description")
    private String description;
    @Column (name="date_order")
    private Date date_order;
    @Column (name="date_work")
    private Date date_work;
    @Column (name="price")
    private Integer price;
    @Column (name="payment")
    private String payment;
    @Column (name="country")
    private String country;
    @Column (name="district")
    private String district;
    @Column (name="city")
    private String city;
    @Column (name="street")
    private String street;
    @Column (name="done_or_not")
    private Boolean done_or_not;
    @Column (name="master")
    private String master;
    @Column(name="index")
    private Long index;


    public Long getId_customer_order() {
        return id_customer_order;
    }

    public void setId_customer_order(Long id_customer_order) {
        this.id_customer_order = id_customer_order;
    }

    public CustomerEntity getCustomerEntities() {
        return customerEntities;
    }

    public void setCustomerEntities(CustomerEntity customerEntities) {
        this.customerEntities = customerEntities;
    }

    public String getSphere_work() {
        return sphere_work;
    }

    public void setSphere_work(String sphere_work) {
        this.sphere_work = sphere_work;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_order() {
        return date_order;
    }

    public void setDate_order(Date date_order) {
        this.date_order = date_order;
    }

    public Date getDate_work() {
        return date_work;
    }

    public void setDate_work(Date date_work) {
        this.date_work = date_work;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Boolean getDone_or_not() {
        return done_or_not;
    }

    public void setDone_or_not(Boolean done_or_not) {
        this.done_or_not = done_or_not;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }
}
