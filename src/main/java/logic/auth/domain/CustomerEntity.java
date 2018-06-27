package logic.auth.domain;

import logic.usercards.domain.CustomerReviewEntity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table (name = "CUSTOMERS")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_customer;

    @Column (name="email")
    private String email;
    @Column (name="password")
    private String password;
    @Column (name = "first_name")
    private String first_name;
    @Column (name ="second_name")
    private String second_name;
    @Column (name="patronomyc_name")
    private String patronomyc_name;
    @Column (name = "country")
    private String country;
    @Column (name = "district")
    private String district;
    @Column (name="city")
    private String city;
    @Column (name = "count_orders")
    private Long count_orders;
    @Column (name = "telephone")
    private Long telephone;
    @Column (name="is_active")
    private Boolean is_active;
    
    @OneToMany (fetch = FetchType.EAGER)
    private Set<CustomerReviewEntity> customerreviewEntities;
    public Set<CustomerReviewEntity> getCustomerreviewEntities() {
        return customerreviewEntities;
    }
    public void setCustomerreviewEntities(Set<CustomerReviewEntity> customerreviewEntities) {
        this.customerreviewEntities = customerreviewEntities;
    }


    public Long getId_customer() {
        return id_customer;
    }

    public void setId_customer (Long id_customer) {
        this.id_customer = id_customer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getPatronomyc_name() {
        return patronomyc_name;
    }

    public void setPatronomyc_name(String patronomyc_name) {
        this.patronomyc_name = patronomyc_name;
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

    public Long getCount_orders() {
        return count_orders;
    }

    public void setCount_orders(Long count_orders) {
        this.count_orders = count_orders;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}
