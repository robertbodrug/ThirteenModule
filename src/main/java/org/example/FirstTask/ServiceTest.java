package org.example.FirstTask;

import java.io.File;

public class ServiceTest {
    public static void main(String[] args) throws Exception {
        System.out.println(UsersService.post(new File("C:\\Users\\agrte\\IdeaProjects\\ThirteenModule\\src\\main\\java\\org\\example\\FirstTask\\User.json")));

        System.out.println(UsersService.put(new File("C:\\Users\\agrte\\IdeaProjects\\ThirteenModule\\src\\main\\java\\org\\example\\FirstTask\\User.json")));
        System.out.println(UsersService.delete());

    }
}
