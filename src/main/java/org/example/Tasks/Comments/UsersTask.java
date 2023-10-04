package org.example.Tasks.Comments;
//    "userId": 5,
//            "id": 81,
//            "title": "suscipit qui totam",
//            "completed": true
public class UsersTask {
    public Long userId;
    public Long id;
    public String title;
    public Boolean completed;

    public UsersTask(Long userId, Long id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
}
