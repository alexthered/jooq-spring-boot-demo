package me.alexthered.jooqdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Value;
import java.time.LocalDateTime;

@Builder
@Value
public class Comment {

  Long id;
  @JsonIgnore
  Long postId;
  String name;
  String email;
  String content;
  LocalDateTime createdOn;
}