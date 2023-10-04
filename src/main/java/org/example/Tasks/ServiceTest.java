package org.example.Tasks;


import org.example.Tasks.Comments.UsersTask;

public class ServiceTest {
    public static void main(String[] args) throws Exception {
        //FirstTask
//        System.out.println(UsersService.post(new File("C:\\Users\\agrte\\IdeaProjects\\ThirteenModule\\src\\main\\java\\org\\example\\Tasks\\User.json")));
//        System.out.println(UsersService.put(new File("C:\\Users\\agrte\\IdeaProjects\\ThirteenModule\\src\\main\\java\\org\\example\\Tasks\\User.json"),8L));
//        System.out.println(UsersService.delete(2L));
//        System.out.println(UsersService.getAll());
//        System.out.println(UsersService.getByID(4L));
//        System.out.println(UsersService.getByUsername("Antonette"));
        //SecondTask
//        System.out.println(UsersService.getCommentsByID(3L));
//        System.out.println(UsersService.getCommentsByID(7L));
//        System.out.println(UsersService.getCommentsByID(1L));
        //ThirdTask
        System.out.println(UsersService.getNotCompletedTasksByID(5L));

    }
}
