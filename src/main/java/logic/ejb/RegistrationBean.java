package logic.ejb;

import logic.domain.UserEntity;
import org.apache.commons.lang3.StringUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
public class RegistrationBean {

    @PersistenceContext(unitName = "MyMasteringPU")
    private EntityManager entityManager;

    public boolean checkPassword(String login, String password, String email){
        if(StringUtils.isEmpty(login) || StringUtils.isEmpty(password) || StringUtils.isEmpty(email)){
            return false;
        }

        UserEntity userEntity = entityManager.find(UserEntity.class, login);
        if(userEntity == null){
            return false;
        }

        if(password.equals(userEntity.getPassword())){
            return true;
        }

        return false;
    }

    public boolean createUser(String login, String password, String email){
        if(StringUtils.isEmpty(login) || StringUtils.isEmpty(password) || StringUtils.isEmpty(email)){
            return false;
        }

        UserEntity userEntity = entityManager.find(UserEntity.class, login);
        if(userEntity != null){
            return false;
        }

        userEntity = new UserEntity();
        userEntity.setLogin(login);
        userEntity.setPassword(password);
        userEntity.setEmail(email);
        entityManager.persist(userEntity);

        return true;
    }

    public List<UserEntity> getAllUsers(){
        Query query = entityManager.createQuery("select entity from UserEntity entity");
        return query.getResultList();
    }
}
