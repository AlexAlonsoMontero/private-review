package com.private_reviews.adapters.web.group;

import com.private_reviews.application.group.CreateGroupUseCase;
import com.private_reviews.domain.group.Group;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groups")
public class GroupController {
  private final CreateGroupUseCase createGroupUseCase;

  public GroupController(CreateGroupUseCase createGroupUseCase) {
    this.createGroupUseCase = createGroupUseCase;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public GroupResponse create(@RequestBody CreateGroupRequest request) {
    Group group = createGroupUseCase.execute(request.getName(), request.getCreatorId());
    return new GroupResponse(group.getId(), group.getName(), group.getCreatorId(), group.isActive());
  }

  public static class CreateGroupRequest {
    private String name;
    private UUID creatorId;

    public String getName() {
      return name;
    }

    public UUID getCreatorId() {
      return creatorId;
    }
  }

  public static class GroupResponse {
    private final UUID id;
    private final String name;
    private final UUID creatorId;
    private final boolean active;

    public GroupResponse(UUID id, String name, UUID creatorId, boolean active) {
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
}
