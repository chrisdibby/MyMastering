package logic.auth.domain;

import logic.usercards.domain.CustomerReviewEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table (name = "MASTERS")
public class MasterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_master;

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
    @Column (name = "is_ip")
    private Boolean is_ip;
    @Column (name="form_ip")
    private String form_ip;
    @Column (name="name_ip")
    private String name_ip;
    @Column (name="unp_ip")
    private Long unp_ip;
    @Column (name="inn_ip")
    private Long inn_ip;
    @Column (name="adress_ur")
    private Character adress_ur;
    @Column (name = "adress_fact")
    private Character adress_fact;
    @Column (name="bic")
    private Long bic;
    @Column (name="count_done_orders")
    private Integer count_done_orders;
    @Column (name="rating")
    private Integer rating;



    @OneToMany (fetch = FetchType.EAGER)
    private Set<CustomerReviewEntity> reviewEntities;

    public Set<CustomerReviewEntity> getReviewEntities() {
        return reviewEntities;
    }

    public void setReviewEntities(Set<CustomerReviewEntity> reviewEntities) {
        this.reviewEntities = reviewEntities;
    }



    public Long getId_master() {
        return id_master;
    }

    public void setId_master (Long id_master) {
        this.id_master = id_master;
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

    public Boolean getIs_ip() {
        return is_ip;
    }

    public void setIs_ip(Boolean is_ip) {
        this.is_ip = is_ip;
    }

    public String getForm_ip() {
        return form_ip;
    }

    public void setForm_ip(String form_ip) {
        this.form_ip = form_ip;
    }

    public String getName_ip() {
        return name_ip;
    }

    public void setName_ip(String name_ip) {
        this.name_ip = name_ip;
    }

    public Long getUnp_ip() {
        return unp_ip;
    }

    public void setUnp_ip(Long unp_ip) {
        this.unp_ip = unp_ip;
    }

    public Long getInn_ip() {
        return inn_ip;
    }

    public void setInn_ip(Long inn_ip) {
        this.inn_ip = inn_ip;
    }

    public Character getAdress_ur() {
        return adress_ur;
    }

    public void setAdress_ur(Character adress_ur) {
        this.adress_ur = adress_ur;
    }

    public Character getAdress_fact() {
        return adress_fact;
    }

    public void setAdress_fact(Character adress_fact) {
        this.adress_fact = adress_fact;
    }

    public Long getBic() {
        return bic;
    }

    public void setBic(Long bic) {
        this.bic = bic;
    }

    public Integer getCount_done_orders() {
        return count_done_orders;
    }

    public void setCount_done_orders(Integer count_done_orders) {
        this.count_done_orders = count_done_orders;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
