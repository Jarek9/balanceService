package com.balance.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class BalanceDto {

    private UserDto user;
    private BigDecimal balance;

    public BalanceDto(UserDto user, BigDecimal balance) {
        this.user = user;
        this.balance = balance;
    }


    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        BalanceDto that = (BalanceDto) o;
        return Objects.equals(user, that.user) && Objects.equals(balance, that.balance);
    }

    @Override public int hashCode() {
        return Objects.hash(user, balance);
    }

    @Override public String toString() {
        return "BalanceDto{" +
                "user=" + user +
                ", balance=" + balance +
                '}';
    }
}
