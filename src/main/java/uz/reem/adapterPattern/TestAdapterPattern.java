package uz.reem.adapterPattern;

import uz.reem.adapterPattern.targets.adapters.PostAdapter;
import uz.reem.adapterPattern.targets.PostTarget;
import uz.reem.adapterPattern.services.PostService;

public class TestAdapterPattern {
    public static void main(String[] args) {
        PostService postService = new PostService();
        PostTarget target = new PostAdapter(postService);

        System.out.println(target.getAllPost());

    }
}
