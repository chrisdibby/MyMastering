package logic.usercards.domain;


import logic.auth.domain.MasterEntity;

import javax.persistence.*;

@Entity
@Table(name="WORK_SPHERES")
public class WorkSpheresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_work_spheres;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_master", nullable = false)
    private MasterEntity masterEntities;

    @Column(name="category")
    private String category;

    public Long getId_work_spheres() {
        return id_work_spheres;
    }

    public void setId_work_spheres(Long id_work_sphere) {
        this.id_work_spheres = id_work_sphere;
    }

    public MasterEntity getMasterEntities() {
        return masterEntities;
    }

    public void setMasterEntities(MasterEntity masterEntities) {
        this.masterEntities = masterEntities;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
