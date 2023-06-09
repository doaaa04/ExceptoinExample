/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excptionexample;

/**
 *
 * @author HP
 */
public class InvalidUserInformation extends IllegalArgumentException {
    private User user;
    
    public InvalidUserInformation(User user,String message){
        super(message);
        this.user=user;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
