package uz.reem.adapterPattern.services;

import uz.reem.adapterPattern.entities.Post;

import java.util.ArrayList;
import java.util.List;

public class PostService {

    private final List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        Post post = new Post()
                .setId(1L)
                .setTitle("Post 1 Title")
                .setBody("Post 1 Body");
        posts.add(post);

        try {
            Post post1 = post.clone();
            post1.setId(2L)
                    .setTitle("Post 2 Title")
                    .setBody("Post 2 Body");
            posts.add(post1);

            Post post2 = post.clone();
            post2.setId(3L)
                    .setTitle("Post 3 Title")
                    .setBody("Post 3 Body");
            posts.add(post2);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return posts;
    }

}
