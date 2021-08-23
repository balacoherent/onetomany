package spring.oneToMany.onetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.oneToMany.onetomany.Entity.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {
}
