package ru.students.testsecurity2dbthymleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.students.testsecurity2dbthymleaf.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
