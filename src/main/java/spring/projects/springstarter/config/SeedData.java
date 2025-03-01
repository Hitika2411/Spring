package spring.projects.springstarter.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import spring.projects.springstarter.Models.Account;
import spring.projects.springstarter.Models.Post;
import spring.projects.springstarter.Service.AccountService;
import spring.projects.springstarter.Service.PostService;
@Component
public class SeedData implements CommandLineRunner{
    @Autowired
    private AccountService as;
    @Autowired
    private PostService ps;
    @Override
    public void run(String... args) throws Exception {

        Account acc1=new Account();
        acc1.setEmail("acc1.user1@gmail.com");
        acc1.setPassword("password_acc1");
        acc1.setName("User1");
        as.save(acc1);
        Account acc2=new Account();
        acc2.setEmail("acc2.user2@gmail.com");
        acc2.setPassword("password_acc2");
        acc2.setName("User2");
        as.save(acc2);
        List<Post>posts=ps.getAll();
        if(posts.size()==0){
            Post p1=new Post();
            p1.setTitle("Post1");
            p1.setText("qwertyuiop[]");
            p1.setAccount(acc2);
            ps.save(p1);
            Post p2=new Post();
            p2.setTitle("Post2");
            p2.setText("asdfghjkl;");
            p2.setAccount(acc1);
            ps.save(p2);
            
        }
    }

}
