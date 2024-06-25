package com.event.producer.controller;

import com.event.producer.model.request.CreateStudentRequest;
import com.event.producer.service.StudentRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 10:57 AM
 ******************************************
 */

@RestController
@Slf4j
@RequestMapping("api/student")
public class ProducerController {

    @Autowired
    StudentRegistrationService studentRegistrationService;

    @RequestMapping(value = "/register/v1", method = RequestMethod.POST)
    public void create(@RequestBody CreateStudentRequest createStudentRequest) {
        log.info("Get request for student registration. Student Model: {}", createStudentRequest);
        studentRegistrationService.register(createStudentRequest);
    }
}
