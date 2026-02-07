package com.private_reviews.application.group;

import com.private_reviews.domain.group.Group;
import com.private_reviews.domain.group.port.GroupRepository;
import java.util.UUID;

public class CreateGroupUseCase {
  private final GroupRepository groupRepository;

  public CreateGroupUseCase(GroupRepository groupRepository) {
    this.groupRepository = groupRepository;
  }

  public Group execute(String name, UUID creatorId) {
    Group group = new Group(UUID.randomUUID(), name, creatorId, true);
    return groupRepository.save(group);
  }
}
