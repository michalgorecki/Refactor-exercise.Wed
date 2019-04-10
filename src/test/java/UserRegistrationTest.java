import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class UserRegistrationTest {

    @Test
    void shouldAddUsersToList() {
        //given
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.firstName = "Andrzej";
        user1.lastName = "Gołota";
        user1.email = "andrzej@wp.pl";
        user1.age = 52;

        User user2 = new User();
        user2.firstName = "Mike";
        user2.lastName = "Tyson";
        user2.email = "mike@gmail.com";
        user2.age = 55;

        User user3 = new User();
        user3.firstName = "Muhammad";
        user3.lastName = "Ali";
        user3.email = "ali@mohammad.com";
        user3.age = 12;

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        UserRegistration registration = new UserRegistration(new ArrayList<>());
        //when
        registration.saveMultipleUsersToDatabaseList(userList);
        //then
        Assertions.assertTrue(registration.userDatabaseInArrayList.size() == 3);
        Assertions.assertEquals("Andrzej", registration.userDatabaseInArrayList.get(0).firstName);
        Assertions.assertEquals("Mike", registration.userDatabaseInArrayList.get(1).firstName);
    }

    @Test

    void shouldGetUsersFromList()
        {
        //given
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.firstName = "Andrzej";
        user1.lastName = "Gołota";
        user1.email = "andrzej@wp.pl";
        user1.age = 52;

        User user2 = new User();
        user2.firstName = "Mike";
        user2.lastName = "Tyson";
        user2.email = "mike@gmail.com";
            user2.age = 55;

        User user3 = new User();
        user3.firstName = "Muhammad";
        user3.lastName = "Ali";
        user3.email = "ali@mohammad.com";
user3.age = 12;

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        UserRegistration registration = new UserRegistration(userList);

        //when
        List<User> usersFromDb = registration.retrieveAllUsersFromDatabase();
        //then
        Assertions.assertTrue(usersFromDb.size() == 3);
                Assertions.assertEquals("Andrzej", usersFromDb.get(0).firstName);
            Assertions.assertEquals("Mike", usersFromDb.get(1).firstName);
    }

}