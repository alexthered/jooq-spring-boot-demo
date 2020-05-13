package me.alexthered.jooqdemo.service;

import lombok.RequiredArgsConstructor;
import me.alexthered.jooqdemo.model.Comment;
import me.alexthered.jooqdemo.model.Post;
import me.alexthered.jooqdemo.repository.CommentRepository;
import me.alexthered.jooqdemo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

  private final PostRepository postRepository;
  private final CommentRepository commentRepository;

  public List<Post> getAllPost() {
    return postRepository.getAllPost();
  }

  public List<Comment> getCommentForPost(Long postId) {
    return commentRepository.getCommentsForPost(postId);
  }

}
