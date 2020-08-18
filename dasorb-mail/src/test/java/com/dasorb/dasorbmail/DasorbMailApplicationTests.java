package com.dasorb.dasorbmail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest
class DasorbMailApplicationTests {

    @Autowired
    private JavaMailSender javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1424332438@qq.com");
        message.setTo("15822241932@163.com");
        message.setSubject("邮件主题");
        message.setText("邮件内容");
        this.javaMailSender.send(message);
    }

}
