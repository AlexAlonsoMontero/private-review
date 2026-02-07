package com.private_reviews.domain.group.port;

import com.private_reviews.domain.group.Group;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GroupRepository {
  Group save(Group group);

  Optional<Group> findById(UUID groupId);

  List<Group> findByCreatorId(UUID creatorId);
}
