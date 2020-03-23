package com.excepetion;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Account account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }

    }
}
