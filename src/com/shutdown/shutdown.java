package com.shutdown;

import java.io.IOException;

public class shutdown {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("shutdown -s -t 10");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
