package my.framework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import my.framework.spring5webapp.model.Book;
import my.framework.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
