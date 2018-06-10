package de.tutorial.tutorial.repository;

import de.tutorial.tutorial.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

    List<Student> findAllByNameStartingWith(String name);
    List<Student> findAllByPhoneAndNameEndingWith(String phone, String name);
    Student findById(long id);

    @Query(value = "select name from student where id=?", nativeQuery = true)
    String findNameById(long id);

}
