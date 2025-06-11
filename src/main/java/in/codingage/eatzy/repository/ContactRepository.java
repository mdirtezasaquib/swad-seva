package in.codingage.eatzy.repository;

import in.codingage.eatzy.model.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
}
