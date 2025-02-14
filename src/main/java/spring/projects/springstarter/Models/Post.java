package spring.projects.springstarter.Models;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Long Id;
    private LocalDateTime createdTime;
    @Column (columnDefinition = "TEXT")
    private String Text;
    private String Title;
    @ManyToOne()
    @JoinColumn(nullable = true,columnDefinition = "accountId",referencedColumnName = "id")
    private Account account;
}
