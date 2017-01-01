package repositories;

import java.util.List;

import ask.models.Ask;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AskRepository extends CrudRepository<Ask, Long> {
	
	
	
	List<Ask> findFirst10ByIdNotIn(List<Long> posts);
}
