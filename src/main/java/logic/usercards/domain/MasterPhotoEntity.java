package logic.usercards.domain;

import logic.auth.domain.MasterEntity;

import javax.persistence.*;


@Entity
@Table(name="MASTER_PHOTOS")
public class MasterPhotoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_master_photo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_master", nullable = false)
    private MasterEntity masterEntities;

    @Column(name="photo")
    private String photo;


    public Long getId_master_photo() {
        return id_master_photo;
    }

    public void setId_master_photo(Long id_master_photo) {
        this.id_master_photo = id_master_photo;
    }

    public MasterEntity getMasterEntities() {
        return masterEntities;
    }

    public void setMasterEntities(MasterEntity masterEntities) {
        this.masterEntities = masterEntities;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
