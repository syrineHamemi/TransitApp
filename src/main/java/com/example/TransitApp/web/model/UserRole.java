package com.example.TransitApp.web.model;

import javax.persistence.*;


@Entity
@Table(name = "User_Role", //
        uniqueConstraints = { //
                @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"user_Id", "role_Id"})})
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, referencedColumnName = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false, referencedColumnName = "role_id")
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getAppUser() {
        return user;
    }

    public void setAppUser(User user) {
        this.user = user;
    }

    public Role getAppRole() {
        return role;
    }

    public void setAppRole(Role role) {
        this.role = role;
    }

}