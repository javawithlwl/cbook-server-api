package com.careerit.cbook.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "contact")
public class Contact extends BaseEntity {
    @Id
    private UUID id;
    private String name;
    private String email;
    private String mobile;
    private String city;

    @PrePersist
    public void onPrePersist() {
        this.id = UUID.randomUUID();
        super.onPrePersist();
    }
}
