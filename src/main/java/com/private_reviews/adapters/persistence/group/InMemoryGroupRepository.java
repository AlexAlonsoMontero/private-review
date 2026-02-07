package com.private_reviews.adapters.persistence.group;

import com.private_reviews.domain.group.Group;
import com.private_reviews.domain.group.port.GroupRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGroupRepository implements GroupRepository {
  private final ConcurrentMap<UUID, Group> storage = new ConcurrentHashMap<>();

  @Override
  public Group save(Group group) {
    storage.put(group.getId(), group);
    return group;
  }

  @Override
  public Optional<Group> findById(UUID groupId) {
    return Optional.ofNullable(storage.get(groupId));
  }

  @Override
  public List<Group> findByCreatorId(UUID creatorId) {
    List<Group> results = new ArrayList<>();
    for (Group group : storage.values()) {
      if (group.getCreatorId().equals(creatorId)) {
        results.add(group);
      }
    }
    return results;
  }
}
