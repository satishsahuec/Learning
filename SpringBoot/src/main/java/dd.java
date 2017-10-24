import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableMongoRepositories(basePackages = "org.baeldung.repository")
public class SimpleMongoConfig {
  
    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
 
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "test");
    }
}