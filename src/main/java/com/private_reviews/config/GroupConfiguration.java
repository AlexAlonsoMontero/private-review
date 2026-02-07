package com.private_reviews.config;

import com.private_reviews.application.group.CreateGroupUseCase;
import com.private_reviews.domain.group.port.GroupRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GroupConfiguration {
  @Bean
  public CreateGroupUseCase createGroupUseCase(GroupRepository groupRepository) {
    return new CreateGroupUseCase(groupRepository);
  }
}
