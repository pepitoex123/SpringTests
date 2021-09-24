package uriipep.springframework.Spring5WebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import uriipep.springframework.Spring5WebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
