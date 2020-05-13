package me.alexthered.jooqdemo.repository;

import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@JooqTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase
@Sql(scripts = {"schema.sql"})
class PostRepositoryTest {

  @Autowired
  private PostRepository postRepository;

  @Sql(statements = "insert into public.posts(id, title, content, created_on) values(1, 'Post 1', 'This is post 1', '2016-01-03');")
  @Test
  void when_get_posts_return_correctly() {

    var posts = postRepository.getAllPost();

    assertEquals(1, posts.size());
  }

  @TestConfiguration
  static class Configuration {

    @Autowired
    private DSLContext dslContext;

    @Bean
    public PostRepository postRepository() {
      return new PostRepository(dslContext);
    }
  }

}