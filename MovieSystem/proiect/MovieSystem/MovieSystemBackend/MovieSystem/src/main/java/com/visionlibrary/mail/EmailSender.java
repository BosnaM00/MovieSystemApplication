package com.visionlibrary.mail;


public interface EmailSender {
    void send(String to, String email);
}