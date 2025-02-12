package spring.projects.springstarter.Models;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
}
