package com.springboot.demo.restcontroller;
@org.springframework.web.bind.annotation.RestController
@org.springframework.web.bind.annotation.RequestMapping("/rest")
public class RestCtrl {
	java.util.List<com.springboot.demo.entity.Employee> emplist=null;
	
	public RestCtrl() {
		// TODO Auto-generated constructor stub
		emplist = new java.util.ArrayList<>();
		emplist.add(new com.springboot.demo.entity.Employee(1, "Pravin"));
		emplist.add(new com.springboot.demo.entity.Employee(2, "Pravin"));
		emplist.add(new com.springboot.demo.entity.Employee(3, "Pravin"));
	}
	@org.springframework.web.bind.annotation.RequestMapping("/all")
	public org.springframework.http.ResponseEntity<java.util.List<com.springboot.demo.entity.Employee>> getAllEmp(){
		return new org.springframework.http.ResponseEntity<java.util.List<com.springboot.demo.entity.Employee>>(emplist, org.springframework.http.HttpStatus.OK);
		
	}

}
