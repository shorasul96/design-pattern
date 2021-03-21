package uz.reem.adapterPattern.targets.adapters;

import lombok.RequiredArgsConstructor;
import uz.reem.adapterPattern.targets.PostTarget;
import uz.reem.adapterPattern.entities.Post;
import uz.reem.adapterPattern.services.PostService;

import java.util.List;

@RequiredArgsConstructor
public class PostAdapter implements PostTarget {

    private final PostService adapterService;

    @Override
    public List<Post> getAllPost() {
        return adapterService.getPosts();
    }
}
