package ru.students.testsecurity2dbthymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.students.testsecurity2dbthymleaf.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
