package edu.io.pack5.run;

import edu.io.pack5.service.프로필사진Service;

public class 프로필사진Run {
    public static void main(String[] args) {

        프로필사진Service service = new 프로필사진Service();

        service.createProfileFolder();
    }
}
