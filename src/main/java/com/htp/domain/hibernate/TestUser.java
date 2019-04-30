package com.htp.domain.hibernate;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "test_user")
public class TestUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_surname")
    private String userSurname;

    @Column(name = "birth_date")
    private Timestamp birthDate;

    public TestUser() {
    }

    public TestUser(String userName, String userSurname, Timestamp birthDate) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.birthDate = birthDate;
    }

    public TestUser(Long userId, String userName, String userSurname, Timestamp birthDate) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
        this.birthDate = birthDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestUser testUser = (TestUser) o;
        return Objects.equals(userId, testUser.userId) &&
                Objects.equals(userName, testUser.userName) &&
                Objects.equals(userSurname, testUser.userSurname) &&
                Objects.equals(birthDate, testUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSurname, birthDate);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
