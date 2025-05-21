package com.userMailing.emailToUser.feignClient;
import com.userMailing.emailToUser.mailDTO.MailDtoClass;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mail-service", url = "http://localhost:8082") // URL can change if using Eureka
public interface MailServiceClient {

    @PostMapping("/mail/send")
    String sendMail(@RequestBody MailDtoClass mailRequestDTO);
}

