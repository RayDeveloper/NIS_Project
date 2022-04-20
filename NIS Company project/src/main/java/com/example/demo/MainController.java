//813117991

package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

 

@Controller
public class MainController {
	

	

@Autowired
EmployeeService service;

EmployeeRepo employeeRepo;
 
 
	// to display the home page
	@GetMapping("/homepage")
	public String showHomePage(Model model) {
	    model.addAttribute("employee", new Employee());
	    return "index";
	}//end showHomePage()
	
    //get the registration form
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "register_form";
    }//end showForm()
    
    
    // save the form into the H2 database
    @Valid
    @PostMapping("/register")
    public String saveEmployee(@Valid @ModelAttribute ("employee") Employee employee, BindingResult bindingResult) {
    	if(service.existsById(employee.getid())== true ) {
    		return "ExistAlready";
    	}else {
    		if(bindingResult.hasErrors()) {
    			return "register_form";
    		}else {
    			service.save(employee);//saves employee
    			service.GenerateSlip(employee.getid());//new employees NIS info is calculated right away
    			return "register_success"; 	
    		}//end if bindingErrors
    	}//end if existsById
    }//end saveEmployee
    
    //View all the employees in the database
    @GetMapping("/viewAll")
    public String ViewList(Model model) {
    	
    	List<Employee> listEmployee = service.listAll();
    	for(Employee element_employee : listEmployee) {
    		 service.GenerateSlip(element_employee.getid());//add NIS info for records that come from db that doesn't have any NIS info created.
    	}//end for
    	model.addAttribute("listemployee",listEmployee);
    	return "viewlist";
    }//end viewALL()
    
    
    //get the edit form
    @GetMapping("/search/{id}")
    public String showFormEditForm(@ModelAttribute ("employee") Employee employee,@PathVariable("id")Long id, Model model,BindingResult bindingResult) {
    	if(bindingResult.hasErrors()) {
    		return "edit_form";
    	}else {
    	Employee listEmployee = service.getEmployeeId(id);//using the id to find the employee
    	model.addAttribute("employee", listEmployee);  	
       return "edit_form";
    	}//end if
    }//end showFormEditForm()
    
    
    //save the updated/edited employee
    @PostMapping("/search")
    public String  ShowEditPage(@ModelAttribute ("employee") Employee employee,BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
        	return "edit_form";
        }else {
    	service.updateEmployee(employee, employee.getid());//saves the updated employee
    	service.GenerateSlip(employee.getid());
        return "edit_sucess";     
        }//end if bindingErrors
    }//end ShowEditPage()
    
    
    	//display the edit single employee form
	    @GetMapping("/singleEmp")
	    public String getSingleForm(Model model) {
	        model.addAttribute("employee", new Employee());
	        System.out.println("End of method");
	        return "edit_employee";
	   }//end getSingleForm()
    
        
	    //displays the employee that is found in a table
        @PostMapping("/oneEmp/{id}")
        public String ViewList_Emp(@ModelAttribute ("employee") Employee employee,@RequestParam(value = "id", required = false)Long id,BindingResult bindingResult,Model model) {
        	if(service.existsById(id)== true ) {//checks if emp exisit
            	Employee listEmployee = service.getEmployeeId(id);
            	model.addAttribute("listemployee",listEmployee);
            	return "edit_viewlist";
        	}else {
        		return "notExist";
        	}//end if
        }//end ViewList_Emp()
        
  

		//display the delete single employee form
	    @GetMapping("/deleteForm")
	    public String getDeleteForm(Model model) {
	        model.addAttribute("employee", new Employee());
	        System.out.println("end of method deleteform");
	        return "delete_employee";
	   }//end getDeleteForm()
	    
	    
	    //delete employee from the viewing of all employees
        @GetMapping("/delEmp/{id}")
        public String DelViewList_Emp(@ModelAttribute ("employee") Employee employee,@RequestParam(value = "id", required = false)Long id,Model model) {
        		service.delete(employee, employee.getid());//delete employee
        		return "delete_success";
        }//end DelViewList_Emp
        	

	    
        
        //delete the employee using the search option
        @PostMapping("/delete/{id}")
        public String  DeleteEmp(@ModelAttribute ("employee") Employee employee,@RequestParam(value = "id", required = false)Long id,BindingResult bindingResult) {
        	
        	if(service.existsById(id)== true ) {//check if employee exist
        	
        	if(bindingResult.hasErrors()) {
        		return "delete_employee";
        	}else {
        	service.delete(employee, employee.getid());
            return "delete_success";
        	}
        	
        	}else {
        		return "notExist";
        	}//end if
        	
        }//end DeleteEmp()
        
        
        //get the single payslip form
        @GetMapping("/payslip")
	    public String getSinglePaySlip(Model model) {
	        model.addAttribute("employee", new Employee());
	        System.out.println("End of method");
	        return "payslipForm";
	   }//end getSinglePaySlip()
        
        
       
        @GetMapping("/slip/{id}")
        public String Payslip(@ModelAttribute ("employee") Employee employee,@PathVariable("id")Long id,Model model) {
        	Employee listEmployee = service.GenerateSlip(id);//generate slip for 1 employee
        	model.addAttribute("listemployee",listEmployee);
        	return "payslip";
        }//end Payslip()
        
        
        
        //Generate the payslip the employee
        @PostMapping("/payslip/{id}")
        public String  GenSlip(@ModelAttribute ("employee") Employee employee,@RequestParam(value = "id", required = false)Long id,Model model) {
        	
        	if(service.existsById(id)== true ) {
            	Employee listEmployee = service.GenerateSlip(id);//generate slip for employee
            	model.addAttribute("listemployee",listEmployee);
            return "payslip";
        	
        	}else {
        		return "notExist";
        	}//end if
        	
        }//end GenSlip()
        
    
    
    
     
}//end MainController


