package logic.ejb;

import logic.domain.UserEntity;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class Registration implements Serializable{

    private String login;
    private String password;
    private String email;

    private boolean loginSuccess;
    private boolean createSuccess;

    @EJB
    private RegistrationBean registrationBean;

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

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public boolean isCreateSuccess() {
        return createSuccess;
    }

    public void setCreateSuccess(boolean createSuccess) {
        this.createSuccess = createSuccess;
    }

    public void checkPassword(){
        loginSuccess = registrationBean.checkPassword(login, password, email);
    }

    public void createUser(){
        createSuccess = registrationBean.createUser(login, password, email);
    }

    public List<UserEntity> getAllUsers(){
        return registrationBean.getAllUsers();
    }
}
