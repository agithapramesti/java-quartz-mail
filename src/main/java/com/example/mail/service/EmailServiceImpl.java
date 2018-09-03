package com.example.mail.service;

import com.example.mail.model.MyContants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{
    @Autowired
    public JavaMailSender javaMailSender;

    public void setJavaMailSender(JavaMailSenderImpl javaMailSender)
    {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendMailService(){

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(MyContants.friendEmail);
        message.setFrom(MyContants.myEmail);

        message.setSubject("HAI GENDUT");
        message.setText("ANYYEONG");

        this.javaMailSender.send(message);

    }
}
