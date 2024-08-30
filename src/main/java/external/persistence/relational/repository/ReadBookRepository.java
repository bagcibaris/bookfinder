package external.persistence.relational.repository;

import external.persistence.relational.entity.ReadBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadBookRepository extends JpaRepository<ReadBook, Long> {
}
