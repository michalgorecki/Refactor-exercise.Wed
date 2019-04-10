
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


//TODO
// Something's definitely wrong here. Can you refactor the code to make it better?
// TIP: You might want to look for:
// -redundant or repeated code,
// -confusing variable and method names,
// -access modifiers
// Try to use as many IntelliJ Code shortcuts and features as you can.

public class UserRegistration {

    public List<User> userDatabaseInArrayList;

    public UserRegistration(List<User> userDatabaseInArrayList) {
        this.userDatabaseInArrayList = userDatabaseInArrayList;
    }

    public void saveCurrentUserToDatabaseList(User user) {

        if(!user.firstName.isEmpty() && !user.lastName.isEmpty() && user.age > 0){
            if(Pattern.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]+",user.email)){
                this.userDatabaseInArrayList.add(user);
            }
            else
            {
                //TODO maybe throw an exception or print error to console?
            }
        }

    }

    public void saveMultipleUsersToDatabaseList(List<User> users) {
        for (User user : users) {

            if(!user.firstName.isEmpty() && !user.lastName.isEmpty() && user.age > 0){
                if(Pattern.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]+",user.email)){
                    this.userDatabaseInArrayList.add(user);
                }
                else
                {
                    //TODO maybe throw an exception or print error to console?
                }
            }
        }
    }

    public List<User> retrieveAllUsersFromDatabase() {
        return userDatabaseInArrayList;
    }

    public List<User> retrieveUsersOlderThan(int threshold){
        List<User> outputList = new ArrayList<>();
        for (int i = 0; i< userDatabaseInArrayList.size(); i++) {
            if(userDatabaseInArrayList.get(i).age <= threshold) {
                outputList.add(userDatabaseInArrayList.get(i));
            }
        }
        return outputList;
    }
}
