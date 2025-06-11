package in.codingage.eatzy.repository;

import in.codingage.eatzy.model.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {
}
