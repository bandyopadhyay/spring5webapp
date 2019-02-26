package my.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import my.framework.spring5webapp.model.Author;

/**
 * Created by bandyopadh on 2/25/19.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
