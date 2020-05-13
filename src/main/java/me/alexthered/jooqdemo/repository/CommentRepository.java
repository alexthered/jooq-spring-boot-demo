package me.alexthered.jooqdemo.repository;

import lombok.RequiredArgsConstructor;
import me.alexthered.jooqdemo.generated.tables.Comments;
import me.alexthered.jooqdemo.model.Comment;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {

  private final DSLContext dsl;

  private static final Comments COMMENTS = Comments.COMMENTS;

  public List<Comment> getCommentsForPost(Long postId) {

    return dsl.selectFrom(COMMENTS)
        .where(COMMENTS.POST_ID.eq(postId))
        .fetch()
        .into(Comment.class);
  }
}
