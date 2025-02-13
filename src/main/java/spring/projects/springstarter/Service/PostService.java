package spring.projects.springstarter.Service;
import spring.projects.springstarter.Models.Post;
import java.util.*;
import java.time.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.projects.springstarter.Repository.PostRepository;

@Service
public class PostService {
    @Autowired
    PostRepository pr;
    public Optional<Post> getbyId(Long id){
        return pr.findById(id);
    }
    public List<Post> getAll(){
        return pr.findAll();
    }
    public void delete(Post post){
        pr.delete(post);
    }
    public Post save(Post post){
        if(post.getId()==null){
            post.setCreatedTime(LocalDateTime.now());
        }
        return pr.save(post);
    }
}
