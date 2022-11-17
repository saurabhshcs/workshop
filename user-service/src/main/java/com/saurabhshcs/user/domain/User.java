package com.saurabhshcs.user.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@Setter
@Getter
@Entity
@Data
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

}
