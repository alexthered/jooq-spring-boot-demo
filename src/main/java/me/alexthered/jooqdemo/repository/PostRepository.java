package me.alexthered.jooqdemo.repository;

import lombok.RequiredArgsConstructor;
import me.alexthered.jooqdemo.generated.Tables;
import me.alexthered.jooqdemo.model.Post;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class PostRepository {

  private final DSLContext dsl;

  public List<Post> getAllPost() {
    return dsl.selectFrom(Tables.POSTS)
       .fetch().into(Post.class)
       .stream()
       .collect(Collectors.toList());
  }
}
