package my.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;


import my.framework.spring5webapp.model.Book;

/**
 * Created by bandyopadh on 2/25/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
