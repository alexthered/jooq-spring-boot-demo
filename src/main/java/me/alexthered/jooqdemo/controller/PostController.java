package me.alexthered.jooqdemo.controller;

import lombok.RequiredArgsConstructor;
import me.alexthered.jooqdemo.model.Comment;
import me.alexthered.jooqdemo.model.Post;
import me.alexthered.jooqdemo.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {

  private final PostService postService;

  @GetMapping
  public List<Post> getAllPosts() {
    return postService.getAllPost();
  }

  @GetMapping("/{id}/comments")
  public List<Comment> getCommentForPost(@PathVariable("id") Long id) {
    return postService.getCommentForPost(id);
  }
}
