package com.private_reviews.domain.group;

import java.util.UUID;

public class Group {
  private final UUID id;
  private final String name;
  private final UUID creatorId;
  private final boolean active;

  public Group(UUID id, String name, UUID creatorId, boolean active) {
    this.id = id;
    this.name = name;
    this.creatorId = creatorId;
    this.active = active;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public UUID getCreatorId() {
    return creatorId;
  }

  public boolean isActive() {
    return active;
  }
}
