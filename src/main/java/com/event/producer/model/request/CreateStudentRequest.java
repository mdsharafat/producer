package com.event.producer.model.request;

import lombok.*;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 12:19 PM
 ******************************************
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateStudentRequest {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
}
