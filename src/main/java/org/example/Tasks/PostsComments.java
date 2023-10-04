package org.example.Tasks;

//"postId": 30,
//        "id": 146,
//        "name": "est qui debitis",
//        "email": "Vivienne@willis.org",
//        "body": "pos

public class PostsComments {
    public Long postId;
    public Long id;
    public String name;
    public String email;
    public String body;

    public PostsComments(Long postId, Long id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
