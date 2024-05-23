package com.hydra.joblisting;

import com.hydra.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobRepository extends MongoRepository<Post, String> {
}
