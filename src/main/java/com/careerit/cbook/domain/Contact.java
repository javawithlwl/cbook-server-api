package com.careerit.cbook.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "contact")
public class Contact extends BaseEntity {

    private String name;
    private String email;
    private String mobile;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @PrePersist
    @Override
    public void onPrePersist() {
        super.onPrePersist();
    }
}
