package com.event.producer.service;

import com.event.producer.entity.Student;
import com.event.producer.model.request.CreateStudentRequest;
import com.event.producer.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 12:24 PM
 ******************************************
 */

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void register(CreateStudentRequest request) {
        Student student = Student.builder()
                .id(request.getId())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        studentRepository.save(student);
    }
}
