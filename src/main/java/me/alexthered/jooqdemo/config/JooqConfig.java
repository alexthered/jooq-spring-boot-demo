package me.alexthered.jooqdemo.config;

import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JooqConfig {

  @Bean
  public Settings settings() {
    return new Settings()
        .withExecuteWithOptimisticLocking(true)
        .withRenderNameStyle(RenderNameStyle.AS_IS);
  }
}
