package fineto.websample.springstuff.bootstrap;


import fineto.websample.springstuff.model.Author;
import fineto.websample.springstuff.model.Book;
import fineto.websample.springstuff.model.Publisher;
import fineto.websample.springstuff.repositories.AuthorRepositories;
import fineto.websample.springstuff.repositories.BookRepositories;
import fineto.websample.springstuff.repositories.PublisherRepositories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepositories authorRepositories;
    private BookRepositories bookRepositories;
    private PublisherRepositories publisherRepositories;

    public DevBootstrap(AuthorRepositories authorRepositories, BookRepositories bookRepositories,PublisherRepositories publisherRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
        this.publisherRepositories=publisherRepositories;
    }

    private void initData()
    {
        //Million
        Publisher publisherMillion=new Publisher("Mega","Bola");
        publisherRepositories.save(publisherMillion);

        Author authorMillion=new Author("million","seleshi");
        Book bookMillion=new Book("34-32434","javaEE",publisherMillion);


        authorMillion.getBooks().add(bookMillion);
        bookMillion.getAuthors().add(authorMillion);

        authorRepositories.save(authorMillion);
        bookRepositories.save(bookMillion);



        //pappy
        Publisher publisherPappy=new Publisher("AsterNega","mexico");
        publisherRepositories.save(publisherPappy);

        Author authorPappy=new Author("pappy","seleshi");
        Book bookPappy=new Book("23-12314134","PHP",publisherPappy);

        authorPappy.getBooks().add(bookPappy);
        bookPappy.getAuthors().add(authorPappy);

        authorRepositories.save(authorPappy);
        bookRepositories.save(bookPappy);

    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
