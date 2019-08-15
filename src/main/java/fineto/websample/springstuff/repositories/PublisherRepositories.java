package fineto.websample.springstuff.repositories;


import fineto.websample.springstuff.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher,Long> {
}
