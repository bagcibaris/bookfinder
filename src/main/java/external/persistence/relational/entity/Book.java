package external.persistence.relational.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    @Id
    private String isbn;

    @Column(name = "book_name", nullable = false)
    private String bookName;

    @Column(name = "page_number", nullable = false)
    private int pageNumber;

    @Column(name = "book_volume", nullable = false)
    private int bookVolume;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "genre", nullable = false)
    private String genre;


}
