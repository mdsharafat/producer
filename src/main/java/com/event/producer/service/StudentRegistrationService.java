package com.event.producer.service;

import com.event.producer.model.request.CreateStudentRequest;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 12:24 PM
 ******************************************
 */
public interface StudentRegistrationService {
    public void register(CreateStudentRequest request);
}
