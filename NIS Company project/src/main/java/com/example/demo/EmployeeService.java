//813117991

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> listAll(){//lists all the records in the table
		return (List<Employee>) repo.findAll();
	}//end listAll()
	
	public Employee get(Long id) {//get method for ids
		return repo.findById(id).get();
	}//end get()
	


	public void save(Employee employee) {//saves/register a new employee
		repo.save(employee);	
	}//end save()

	public Employee getEmployeeId(Long id) {//gets the employee ID
		
		Optional<Employee> employee = repo.findById(id);
		return employee.get();
	}//end getEmployeeId()

	public Employee updateEmployee(Employee employee, Long id) {//update/edit employee method
		
		Employee emp = repo.findById(id).get();
		
		
		emp.setFname(employee.getFname());
		emp.setLname(employee.getLname());
		emp.setnis_num(employee.getnis_num());
		emp.setWeek1(employee.getWeek1());
		emp.setWeek2(employee.getWeek2());
		emp.setWeek3(employee.getWeek3());
		emp.setWeek4(employee.getWeek4());
		emp.setWeek5(employee.getWeek5());
		return repo.save(emp);

	}//end updateEmployee()

	public void delete(Employee employee, Long id) {//deletes an employee
		
		repo.deleteById(id);
	}//end delete()

	public boolean existsById(Long id) {//checks if an employee exists in the database
		if(repo.findById(id).isPresent() == true) {
			return true;
			}else {
				return false;
		}//end if
	}//end existById()

	public Employee GenerateSlip(Long id) {// method to calculate the NIS contributions and total contributions
		

		Employee emp = repo.findById(id).get();
		
			
	if(emp.getWeek1() >= 200.00 &&  emp.getWeek1() <= 339.99 ) {
				
				emp.setWeek1Nis(11.90);
				emp.setWeek1NisTotal(35.70);
	}else if(emp.getWeek1() >= 340.00 &&  emp.getWeek1() <= 449.99){
				emp.setWeek1Nis(17.40);
				emp.setWeek1NisTotal(52.20);	
				
	}else if(emp.getWeek1() >= 450.00 &&  emp.getWeek1() <= 609.99) {
				emp.setWeek1Nis(23.30);
				emp.setWeek1NisTotal(69.70);
	
	}else if(emp.getWeek1() >= 610.00 &&  emp.getWeek1() <= 759.99){
				emp.setWeek1Nis(30.10);
				emp.setWeek1NisTotal(90.30);
	
	}else if(emp.getWeek1() >= 760.00 &&  emp.getWeek1() <= 929.99){
				emp.setWeek1Nis(37.20);
				emp.setWeek1NisTotal(111.60);
				
	}else if(emp.getWeek1() >= 930.00 &&  emp.getWeek1() <= 1119.99){
				emp.setWeek1Nis(45.10);
				emp.setWeek1NisTotal(135.30);
		
	}else if(emp.getWeek1() >= 1120.00 &&  emp.getWeek1() <= 1299.99){
				emp.setWeek1Nis(53.20);
				emp.setWeek1NisTotal(159.60);
				
	}else if(emp.getWeek1() >= 1300.00 &&  emp.getWeek1() <= 1489.99){
				emp.setWeek1Nis(61.40);
				emp.setWeek1NisTotal(184.20);
				
	}else if(emp.getWeek1() >= 1490.00 &&  emp.getWeek1() <= 1709.99){
				emp.setWeek1Nis(70.40);
				emp.setWeek1NisTotal(211.20);
	}else if(emp.getWeek1() >= 1710.00 &&  emp.getWeek1() <= 1909.99){
				emp.setWeek1Nis(79.60);
				emp.setWeek1NisTotal(238.80);
				
	}else if(emp.getWeek1() >= 1910.00 &&  emp.getWeek1() <= 2139.99){
				emp.setWeek1Nis(89.10);
				emp.setWeek1NisTotal(267.30);
		
	}else if(emp.getWeek1() >= 2140.00 &&  emp.getWeek1() <= 2379.99){
				emp.setWeek1Nis(99.40);
				emp.setWeek1NisTotal(298.20);
	}else if(emp.getWeek1() >= 2380.00 &&  emp.getWeek1() <= 2629.99){
				emp.setWeek1Nis(110.20);
				emp.setWeek1NisTotal(330.60);
	}else if(emp.getWeek1() >= 2630.00 &&  emp.getWeek1() <= 2919.99){
				emp.setWeek1Nis(122.10);
				emp.setWeek1NisTotal(366.30);
	}else if(emp.getWeek1() >= 2920.00 &&  emp.getWeek1() <= 3137.99){
				emp.setWeek1Nis(133.30);
				emp.setWeek1NisTotal(399.90);
	}else if(emp.getWeek1() >= 3138.00){
				emp.setWeek1Nis(138.10);
				emp.setWeek1NisTotal(414.30);
	}else {
				emp.setWeek1Nis(0);
				emp.setWeek1NisTotal(0);
	}
	//-----------------------------------------------------------------
	
		if(emp.getWeek2() >= 200.00 &&  emp.getWeek2() <= 339.99 ) {
			
			emp.setWeek2Nis(11.90);
			emp.setWeek2NisTotal(35.70);
	}else if(emp.getWeek2() >= 340.00 &&  emp.getWeek2() <= 449.99){
			emp.setWeek2Nis(17.40);
			emp.setWeek2NisTotal(52.20);	
			
	}else if(emp.getWeek2() >= 450.00 &&  emp.getWeek2() <= 609.99) {
			emp.setWeek2Nis(23.30);
			emp.setWeek2NisTotal(69.70);
	
	}else if(emp.getWeek2() >= 610.00 &&  emp.getWeek2() <= 759.99){
			emp.setWeek2Nis(30.10);
			emp.setWeek2NisTotal(90.30);
	
	}else if(emp.getWeek2() >= 760.00 &&  emp.getWeek2() <= 929.99){
			emp.setWeek2Nis(37.20);
			emp.setWeek2NisTotal(111.60);
			
	}else if(emp.getWeek2() >= 930.00 &&  emp.getWeek2() <= 1119.99){
			emp.setWeek2Nis(45.10);
			emp.setWeek2NisTotal(135.30);
	
	}else if(emp.getWeek2() >= 1120.00 &&  emp.getWeek2() <= 1299.99){
			emp.setWeek2Nis(53.20);
			emp.setWeek2NisTotal(159.60);
			
	}else if(emp.getWeek2() >= 1300.00 &&  emp.getWeek2() <= 1489.99){
			emp.setWeek2Nis(61.40);
			emp.setWeek2NisTotal(184.20);
			
	}else if(emp.getWeek2() >= 1490.00 &&  emp.getWeek2() <= 1709.99){
			emp.setWeek2Nis(70.40);
			emp.setWeek2NisTotal(211.20);
	}else if(emp.getWeek2() >= 1710.00 &&  emp.getWeek2() <= 1909.99){
			emp.setWeek2Nis(79.60);
			emp.setWeek2NisTotal(238.80);
			
	}else if(emp.getWeek2() >= 1910.00 &&  emp.getWeek2() <= 2139.99){
			emp.setWeek2Nis(89.10);
			emp.setWeek2NisTotal(267.30);
	
	}else if(emp.getWeek2() >= 2140.00 &&  emp.getWeek2() <= 2379.99){
			emp.setWeek2Nis(99.40);
			emp.setWeek2NisTotal(298.20);
	}else if(emp.getWeek2() >= 2380.00 &&  emp.getWeek2() <= 2629.99){
			emp.setWeek2Nis(110.20);
			emp.setWeek2NisTotal(330.60);
	}else if(emp.getWeek2() >= 2630.00 &&  emp.getWeek2() <= 2919.99){
			emp.setWeek2Nis(122.10);
			emp.setWeek2NisTotal(366.30);
	}else if(emp.getWeek2() >= 2920.00 &&  emp.getWeek2() <= 3137.99){
			emp.setWeek2Nis(133.30);
			emp.setWeek2NisTotal(399.90);
	}else if(emp.getWeek2() >= 3138.00){
			emp.setWeek2Nis(138.10);
			emp.setWeek2NisTotal(414.30);
	}else {
			emp.setWeek2Nis(0);
			emp.setWeek2NisTotal(0);
	}
		
//------------------------------------------------------------------
		
		if(emp.getWeek3() >= 200.00 &&  emp.getWeek3() <= 339.99 ) {
			
			emp.setWeek3Nis(11.90);
			emp.setWeek3NisTotal(35.70);
	}else if(emp.getWeek3() >= 340.00 &&  emp.getWeek3() <= 449.99){
			emp.setWeek3Nis(17.40);
			emp.setWeek3NisTotal(52.20);	
			
	}else if(emp.getWeek3() >= 450.00 &&  emp.getWeek3() <= 609.99) {
			emp.setWeek3Nis(23.30);
			emp.setWeek3NisTotal(69.70);
	
	}else if(emp.getWeek3() >= 610.00 &&  emp.getWeek3() <= 759.99){
			emp.setWeek3Nis(30.10);
			emp.setWeek3NisTotal(90.30);
	
	}else if(emp.getWeek3() >= 760.00 &&  emp.getWeek3() <= 929.99){
			emp.setWeek3Nis(37.20);
			emp.setWeek3NisTotal(111.60);
			
	}else if(emp.getWeek3() >= 930.00 &&  emp.getWeek3() <= 1119.99){
			emp.setWeek3Nis(45.10);
			emp.setWeek3NisTotal(135.30);
	
	}else if(emp.getWeek3() >= 1120.00 &&  emp.getWeek3() <= 1299.99){
			emp.setWeek3Nis(53.20);
			emp.setWeek3NisTotal(159.60);
			
	}else if(emp.getWeek3() >= 1300.00 &&  emp.getWeek3() <= 1489.99){
			emp.setWeek3Nis(61.40);
			emp.setWeek3NisTotal(184.20);
			
	}else if(emp.getWeek3() >= 1490.00 &&  emp.getWeek3() <= 1709.99){
			emp.setWeek3Nis(70.40);
			emp.setWeek3NisTotal(211.20);
	}else if(emp.getWeek3() >= 1710.00 &&  emp.getWeek3() <= 1909.99){
			emp.setWeek3Nis(79.60);
			emp.setWeek3NisTotal(238.80);
			
	}else if(emp.getWeek3() >= 1910.00 &&  emp.getWeek3() <= 2139.99){
			emp.setWeek3Nis(89.10);
			emp.setWeek3NisTotal(267.30);
	
	}else if(emp.getWeek3() >= 2140.00 &&  emp.getWeek3() <= 2379.99){
			emp.setWeek3Nis(99.40);
			emp.setWeek3NisTotal(298.20);
	}else if(emp.getWeek3() >= 2380.00 &&  emp.getWeek3() <= 2629.99){
			emp.setWeek3Nis(110.20);
			emp.setWeek3NisTotal(330.60);
	}else if(emp.getWeek3() >= 2630.00 &&  emp.getWeek3() <= 2919.99){
			emp.setWeek3Nis(122.10);
			emp.setWeek3NisTotal(366.30);
	}else if(emp.getWeek3() >= 2920.00 &&  emp.getWeek3() <= 3137.99){
			emp.setWeek3Nis(133.30);
			emp.setWeek3NisTotal(399.90);
	}else if(emp.getWeek3() >= 3138.00){
			emp.setWeek3Nis(138.10);
			emp.setWeek3NisTotal(414.30);
	}else {
			emp.setWeek3Nis(0);
			emp.setWeek3NisTotal(0);
	}
		
//----------------------------------------------------------------		

		if(emp.getWeek4() >= 200.00 &&  emp.getWeek4() <= 339.99 ) {
			
			emp.setWeek4Nis(11.90);
			emp.setWeek4NisTotal(35.70);
	}else if(emp.getWeek4() >= 340.00 &&  emp.getWeek4() <= 449.99){
			emp.setWeek4Nis(17.40);
			emp.setWeek4NisTotal(52.20);	
			
	}else if(emp.getWeek4() >= 450.00 &&  emp.getWeek4() <= 609.99) {
			emp.setWeek4Nis(23.30);
			emp.setWeek4NisTotal(69.70);
	
	}else if(emp.getWeek4() >= 610.00 &&  emp.getWeek4() <= 759.99){
			emp.setWeek4Nis(30.10);
			emp.setWeek4NisTotal(90.30);
	
	}else if(emp.getWeek4() >= 760.00 &&  emp.getWeek4() <= 929.99){
			emp.setWeek4Nis(37.20);
			emp.setWeek4NisTotal(111.60);
			
	}else if(emp.getWeek4() >= 930.00 &&  emp.getWeek4() <= 1119.99){
			emp.setWeek4Nis(45.10);
			emp.setWeek4NisTotal(135.30);
	
	}else if(emp.getWeek4() >= 1120.00 &&  emp.getWeek4() <= 1299.99){
			emp.setWeek4Nis(53.20);
			emp.setWeek4NisTotal(159.60);
			
	}else if(emp.getWeek4() >= 1300.00 &&  emp.getWeek4() <= 1489.99){
			emp.setWeek4Nis(61.40);
			emp.setWeek4NisTotal(184.20);
			
	}else if(emp.getWeek4() >= 1490.00 &&  emp.getWeek4() <= 1709.99){
			emp.setWeek4Nis(70.40);
			emp.setWeek4NisTotal(211.20);
	}else if(emp.getWeek4() >= 1710.00 &&  emp.getWeek4() <= 1909.99){
			emp.setWeek4Nis(79.60);
			emp.setWeek4NisTotal(238.80);
			
	}else if(emp.getWeek4() >= 1910.00 &&  emp.getWeek4() <= 2139.99){
			emp.setWeek4Nis(89.10);
			emp.setWeek4NisTotal(267.30);
	
	}else if(emp.getWeek4() >= 2140.00 &&  emp.getWeek4() <= 2379.99){
			emp.setWeek4Nis(99.40);
			emp.setWeek4NisTotal(298.20);
	}else if(emp.getWeek4() >= 2380.00 &&  emp.getWeek4() <= 2629.99){
			emp.setWeek4Nis(110.20);
			emp.setWeek4NisTotal(330.60);
	}else if(emp.getWeek4() >= 2630.00 &&  emp.getWeek4() <= 2919.99){
			emp.setWeek4Nis(122.10);
			emp.setWeek4NisTotal(366.30);
	}else if(emp.getWeek4() >= 2920.00 &&  emp.getWeek4() <= 3137.99){
			emp.setWeek4Nis(133.30);
			emp.setWeek4NisTotal(399.90);
	}else if(emp.getWeek4() >= 3138.00){
			emp.setWeek4Nis(138.10);
			emp.setWeek4NisTotal(414.30);
	}else {
			emp.setWeek4Nis(0);
			emp.setWeek4NisTotal(0);
	}
		
		
//---------------------------------------------------------------
		if(emp.getWeek5() >= 200.00 &&  emp.getWeek5() <= 339.99 ) {
			emp.setWeek5Nis(11.90);
			emp.setWeek5NisTotal(35.70);
	}else if(emp.getWeek5() >= 340.00 &&  emp.getWeek5() <= 449.99){
			emp.setWeek5Nis(17.40);
			emp.setWeek5NisTotal(52.20);	
			
	}else if(emp.getWeek5() >= 450.00 &&  emp.getWeek5() <= 609.99) {
			emp.setWeek5Nis(23.30);
			emp.setWeek5NisTotal(69.70);
	
	}else if(emp.getWeek5() >= 610.00 &&  emp.getWeek5() <= 759.99){
			emp.setWeek5Nis(30.10);
			emp.setWeek5NisTotal(90.30);
	
	}else if(emp.getWeek5() >= 760.00 &&  emp.getWeek5() <= 929.99){
			emp.setWeek5Nis(37.20);
			emp.setWeek5NisTotal(111.60);
			
	}else if(emp.getWeek5() >= 930.00 &&  emp.getWeek5() <= 1119.99){
			emp.setWeek5Nis(45.10);
			emp.setWeek5NisTotal(135.30);
	
	}else if(emp.getWeek5() >= 1120.00 &&  emp.getWeek5() <= 1299.99){
			emp.setWeek5Nis(53.20);
			emp.setWeek5NisTotal(159.60);
			
	}else if(emp.getWeek5() >= 1300.00 &&  emp.getWeek5() <= 1489.99){
			emp.setWeek5Nis(61.40);
			emp.setWeek5NisTotal(184.20);
			
	}else if(emp.getWeek5() >= 1490.00 &&  emp.getWeek5() <= 1709.99){
			emp.setWeek5Nis(70.40);
			emp.setWeek5NisTotal(211.20);
	}else if(emp.getWeek5() >= 1710.00 &&  emp.getWeek5() <= 1909.99){
			emp.setWeek5Nis(79.60);
			emp.setWeek5NisTotal(238.80);
			
	}else if(emp.getWeek5() >= 1910.00 &&  emp.getWeek5() <= 2139.99){
			emp.setWeek5Nis(89.10);
			emp.setWeek5NisTotal(267.30);
	
	}else if(emp.getWeek5() >= 2140.00 &&  emp.getWeek5() <= 2379.99){
			emp.setWeek5Nis(99.40);
			emp.setWeek5NisTotal(298.20);
	}else if(emp.getWeek5() >= 2380.00 &&  emp.getWeek5() <= 2629.99){
			emp.setWeek5Nis(110.20);
			emp.setWeek5NisTotal(330.60);
	}else if(emp.getWeek5() >= 2630.00 &&  emp.getWeek5() <= 2919.99){
			emp.setWeek5Nis(122.10);
			emp.setWeek5NisTotal(366.30);
	}else if(emp.getWeek5() >= 2920.00 &&  emp.getWeek5() <= 3137.99){
			emp.setWeek5Nis(133.30);
			emp.setWeek5NisTotal(399.90);
	}else if(emp.getWeek5() >= 3138.00){
			emp.setWeek5Nis(138.10);
			emp.setWeek5NisTotal(414.30);
	}else {
			emp.setWeek5Nis(0);
			emp.setWeek5NisTotal(0);
	}
			
		
		
		repo.save(emp);//saves the new calculations to the database
			return emp;
		
		
		
		
		
		
		
	}//end generatePayslip()

	

}//end EmployeeService
