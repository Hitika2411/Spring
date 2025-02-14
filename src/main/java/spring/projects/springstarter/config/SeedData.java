package spring.projects.springstarter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring.projects.springstarter.Models.Post;
import spring.projects.springstarter.Service.PostService;
@Component
public class SeedData implements CommandLineRunner{
    @Autowired
    private PostService ps;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        List<Post>posts=ps.getAll();
        if(posts.size()==0){
            Post p1=new Post();
            p1.setTitle("Post1");
            p1.setText("qwertyuiop[]");
            ps.save(p1);
            Post p2=new Post();
            p2.setTitle("Post2");
            p2.setText("asdfghjkl;");
            ps.save(p2);
        }
    }

}
