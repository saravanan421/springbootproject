package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import repository.placementrepository;

@RestController
public class placementcontroller {
@Autowired
placementrepository repo;
@PostMapping ("/student")
public Student addStudent(@RequestBody Student r) {
	return repo.save(r);
}
@GetMapping("Student")
public List<Student> getStudent(){
	return repo.findAll();
}
@GetMapping("/student/{id}")
public Student getstd(@PathVariable long id) {
	return repo.findById(id).get();
}
@DeleteMapping("/student/{id}")
	public void delete(@PathVariable long id) {
	repo.deleteById(id);
	}

}
