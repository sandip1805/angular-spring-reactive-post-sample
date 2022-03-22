package com.inventiverhino.post.services;

import com.inventiverhino.post.pojo.Username;

import java.time.LocalDateTime;

public interface PersistentEntity {
    String getId();
    void setId(String id);

    Username getCreatedBy();
    void setCreatedBy(Username username);

    Username getLastModifiedBy();
    void setLastModifiedBy(Username username);

    LocalDateTime getCreatedDate();
    void setCreatedDate(LocalDateTime createdDate);

    LocalDateTime getLastModifiedDate();
    void setLastModifiedDate(LocalDateTime lastModifiedDate);
}
