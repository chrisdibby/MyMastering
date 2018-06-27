package logic.ejb;

import logic.domain.CustomerEntity;
import org.apache.commons.lang3.StringUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;


@Stateless
public class Authentication {

    @PersistenceContext(unitName = "MyMasteringPU")
    private EntityManager entityManager;

    public boolean checkPassword(String email, String password){
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
            return false;
        }

        CustomerEntity customerEntity = entityManager.find(CustomerEntity.class, email);
        if(customerEntity == null){
            return false;
        }

        if(password.equals(customerEntity.getPassword())){
            return true;
        }

        return false;
    }

    public boolean createUser(String email, String password){
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
            return false;
        }

        CustomerEntity customerEntity = entityManager.find(CustomerEntity.class, email);
        if(customerEntity != null){
            return false;
        }

        customerEntity = new CustomerEntity();
        customerEntity.setEmail(email);
        customerEntity.setPassword(password);
        entityManager.persist(customerEntity);

        return true;
    }

    public List<CustomerEntity> getAllUsers(){
        Query query = entityManager.createQuery("select entity from CustomerEntity entity");
        return query.getResultList();
    }
}
