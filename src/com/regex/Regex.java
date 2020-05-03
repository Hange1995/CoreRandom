package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String pattern = "^ASCENDING-\\w+";
        Pattern p =Pattern.compile(pattern);
        Matcher matcher= p.matcher("");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
