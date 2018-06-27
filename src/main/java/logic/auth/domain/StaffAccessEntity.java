package logic.auth.domain;

import javax.persistence.*;


@Entity
@Table(name="STAFF_ACCESS")
public class StaffAccessEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_staff_access;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_staff", nullable = false)
    private StaffEntity staffEntities;

    @Column(name="access")
    private String access;


    public Long getId_staff_access() {
        return id_staff_access;
    }

    public void setId_staff_access(Long id_staff_access) {
        this.id_staff_access = id_staff_access;
    }

    public StaffEntity getStaffEntities() {
        return staffEntities;
    }

    public void setStaffEntities(StaffEntity staffEntities) {
        this.staffEntities = staffEntities;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }
}
