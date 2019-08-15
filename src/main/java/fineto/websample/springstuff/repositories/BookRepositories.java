package fineto.websample.springstuff.repositories;


import fineto.websample.springstuff.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepositories extends CrudRepository<Book,Long> {
}
