package uriipep.springframework.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import uriipep.springframework.Spring5WebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
