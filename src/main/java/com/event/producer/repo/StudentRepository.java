package com.event.producer.repo;

import com.event.producer.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/*****************************************
 * @author - Md. Sharafat Hossain
 * @email - mdsharafat047@gmail.com
 * @date - 14 Jun, 2024 at 12:33 PM
 ******************************************
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
}
