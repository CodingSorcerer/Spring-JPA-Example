package testing.example.com.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testing.example.com.dataObjects.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,String>
{
}
