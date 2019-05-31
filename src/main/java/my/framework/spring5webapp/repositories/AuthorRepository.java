package my.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import my.framework.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
