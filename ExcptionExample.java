
package excptionexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExcptionExample {

   
    public static void main(String[] args) {
        
        try {
            User u = readUserData("C:\\Users\\HP\\Desktop\\txt.txt");
        } catch (FileNotFoundException ex) {
           System.out.println("file is not found");
        }
        catch(InvalidUserInformation ex){
           System.out.println(ex.getMessage());

        }
                   
    }
    
    public static User readUserData(String FilePath) throws FileNotFoundException{
       
        File file =new File (FilePath);
         Scanner scan= new Scanner (file);
        String name =scan.nextLine();
        String email=scan.nextLine();
        User user =new User (name,email);
        if (!email.contains("@") && !email.contains(".")){
        throw new InvalidUserInformation(user,"ther's no email");
        }
        
        
        return user;
}
}
