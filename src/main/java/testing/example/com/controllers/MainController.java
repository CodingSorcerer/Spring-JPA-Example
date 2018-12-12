package testing.example.com.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.example.com.dataObjects.Employee;
import testing.example.com.repositories.EmployeeRepository;

import java.util.ArrayList;

@RestController
public class MainController
{
    private EmployeeRepository repo;

    MainController (EmployeeRepository repo)
    {
        this.repo = repo;
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<Employee>> doGet()
    {
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Iterable<Employee>> doPost(@RequestBody ArrayList<Employee> employees)
    {
        repo.saveAll(employees);
        return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
    }
}
