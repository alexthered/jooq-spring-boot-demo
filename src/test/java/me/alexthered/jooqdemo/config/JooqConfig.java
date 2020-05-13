package me.alexthered.jooqdemo.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class JooqConfig {

  @Bean
  public DSLContext dslContext() {

    Settings settings = new Settings().withRenderNameStyle(RenderNameStyle.AS_IS);
    return DSL.using(SQLDialect.H2, settings);
  }
}
