package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Пётр", "Первый", (byte) 35);
        userService.saveUser("Александр", "Второй", (byte) 48);
        userService.saveUser("Даниил", "Великий", (byte) 17);
        userService.saveUser("Ирина", "Семьянинова", (byte) 52);


        userService.getAllUsers().forEach(out::println);

        userService.removeUserById(1);

        userService.dropUsersTable();

        userService.cleanUsersTable();

    }
}
