package com.userMailing.emailToUser.controller;

import com.userMailing.emailToUser.mailDTO.MailDtoClass;
import com.userMailing.emailToUser.service.SendMailToUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
//@Validated // Ensures that validation annotations in MailDTO are triggered
public class MailController {

    @Autowired
    private SendMailToUserService sendMailToUserService;
    @GetMapping("/sendEmail")
    public String sendEmail(){
        sendMailToUserService.sendEmail("pulagamram123@gmail.com","Dear customer your order is on the way","order details");
        return "mail sent successfully";
    }


}
