package logic.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="STAFF")
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_staff;

    @Column (name="login")
    private String login;
    @Column (name="password")
    private String password;
    @Column (name="name")
    private String name;
    @Column (name = "last_name")
    private String last_name;

    @OneToMany (fetch = FetchType.EAGER)
    private Set<StaffEntity> staffEntities;

    public Long getId_staff() {
        return id_staff;
    }

    public void setId_staff(Long id_staff) {
        this.id_staff = id_staff;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Set<StaffEntity> getStaffEntities() {
        return staffEntities;
    }

    public void setStaffEntities(Set<StaffEntity> staffEntities) {
        this.staffEntities = staffEntities;
    }
}
