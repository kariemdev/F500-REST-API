package Stock;


import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepo  extends MongoRepository<Stock, String> {
}
