package com.example.mail.reminders;

import com.example.mail.service.EmailService;
import com.example.mail.service.EmailServiceImpl;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class EmailJobReminder extends QuartzJobBean {

    @Autowired
    private EmailServiceImpl emailService;

    public void setEmailService(EmailServiceImpl emailService)
    {
        this.emailService = emailService;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        System.out.println("Sending Email Reminder....");
        emailService.sendMailService();
        System.out.println("Done");
    }


}
