package com.event.producer.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 12:20 PM
 ******************************************
 */

//@Entity
//@Table(name = "student")
@Document(collection = "Student")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @Field("id")
    private Long id;

    @Field("firstName")
    private String firstName;

    @Field("lastName")
    private String lastName;

    @Field("email")
    private String email;
}
