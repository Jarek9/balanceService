package com.balance.dto;

import java.util.UUID;

public class UserDto {

    private UUID userUUID;

    public UserDto(UUID userUUID) {
        this.userUUID = userUUID;
    }

    public UUID getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(UUID userUUID) {
        this.userUUID = userUUID;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        UserDto userDto = (UserDto) o;

        return userUUID != null ? userUUID.equals(userDto.userUUID) : userDto.userUUID == null;
    }

    @Override public int hashCode() {
        return userUUID != null ? userUUID.hashCode() : 0;
    }

    @Override public String toString() {
        return "UserDto{" +
                "userUUID=" + userUUID +
                '}';
    }
}
