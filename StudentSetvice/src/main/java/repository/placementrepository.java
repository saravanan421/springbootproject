package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Student;

public interface placementrepository extends JpaRepository<Student,Long >{

 }
