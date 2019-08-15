package fineto.websample.springstuff.repositories;

import fineto.websample.springstuff.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepositories extends CrudRepository<Author,Long>
{
}
