package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById ===");	
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department findAll ===");	
		List<Department> list = depDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n=== TEST 3:  Department Insert ===");	
		Department newDep= new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New Id = " + newDep.getId());
		
		System.out.println("\n=== TEST 4: Department Update ===");	
		dep = depDao.findById(1);
		dep.setName("Computers");
		depDao.update(dep);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TEST 5: Department delete ===");	
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
		
	}

}
