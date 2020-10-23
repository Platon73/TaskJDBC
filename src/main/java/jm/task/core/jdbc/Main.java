package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util util = new Util();
        UserService userService = new UserServiceImpl();
        //Создание таблицы User(ов)
        userService.createUsersTable();

        // Добавление 4 User(ов) в таблицу с данными на свой выбор.
        // После каждого добавления должен быть вывод в консоль ( User с именем – name добавлен в базу данных )
        userService.saveUser("Ivan1", "Ivanov1", (byte) 31);
        System.out.println("User с именем – Ivan1 добавлен в базу данных");
        userService.saveUser("Ivan2", "Ivanov2", (byte) 32);
        System.out.println("User с именем – Ivan2 добавлен в базу данных");
        userService.saveUser("Ivan3", "Ivanov3", (byte) 33);
        System.out.println("User с именем – Ivan3 добавлен в базу данных");
        userService.saveUser("Ivan4", "Ivanov4", (byte) 34);
        System.out.println("User с именем – Ivan4 добавлен в базу данных");

        // Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
        List<User> userList = userService.getAllUsers();
        for (User user : userList) System.out.println(user);

        // Очистка таблицы User(ов)
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}
