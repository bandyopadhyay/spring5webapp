package my.framework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import my.framework.spring5webapp.model.Author;
import my.framework.spring5webapp.model.Book;
import my.framework.spring5webapp.model.Publisher;
import my.framework.spring5webapp.repositories.AuthorRepository;
import my.framework.spring5webapp.repositories.BookRepository;
import my.framework.spring5webapp.repositories.PublisherRepository;


@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
    private void initData(){

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        Publisher publisher = new Publisher("Example" ,"122 S Road");
        publisherRepository.save(publisher);
        ddd.setPublisher(publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Wrox" );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);


    }


}
