package guru.springframework.repositories.reactive;
/*
Author: BeGieU
Date: 21.02.2019
*/

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure, String>
{
    Mono<UnitOfMeasure> findByDescription(String description);
}
