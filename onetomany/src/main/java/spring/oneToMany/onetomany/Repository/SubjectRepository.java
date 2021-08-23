package spring.oneToMany.onetomany.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import spring.oneToMany.onetomany.Entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
}
