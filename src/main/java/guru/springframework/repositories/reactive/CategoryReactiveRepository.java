package guru.springframework.repositories.reactive;
/*
Author: BeGieU
Date: 21.02.2019
*/

import guru.springframework.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;



public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, String>
{
    Mono<Category> findByDescription(String description);
}
