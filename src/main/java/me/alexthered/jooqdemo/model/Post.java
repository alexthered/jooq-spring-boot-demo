package me.alexthered.jooqdemo.model;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDateTime;

@Builder
@Value
public class Post {
  Long id;
  String content;
  String title;
  LocalDateTime createdOn;
}
