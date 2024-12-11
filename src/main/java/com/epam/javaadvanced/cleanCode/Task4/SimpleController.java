package com.epam.javaadvanced.cleanCode.Task4;

import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleController {
    @GetMapping("/unsafe")
    public String unsafeMethod(String input) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:emm:testdb", "sa", "password");
            Statement statement = connection.createStatement();
            statement.executeQuery("SELECT * FROM user_data WHERE user_name = '" + input + "'");
            return "Data Retrieved";
        } catch (SQLException e) {
            return "Error is SQL Handling";
        }
    }

    @GetMapping("/logic-error")
    public int faultyLogic() {
        int a = 10;
        int b = 0;
        return a / b;
    }

    @GetMapping("/duplicated-code")
    public String duplicatedCode() {
        String message = "This is duplicated code.";
        System.out.println(message);
        return message;
    }
}
