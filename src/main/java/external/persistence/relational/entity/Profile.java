package external.persistence.relational.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false, unique = true)
    private Long userId;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<BookToRead> bookToReads;

    @OneToMany(mappedBy = "profile", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private  List<ReadBook> readBooks;

}
