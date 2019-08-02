package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.dao.MyEmpDAO;
import emp.dto.EmpDTO;

@Controller
public class InsertController {
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String showView(){
		return "emp/register";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insert(EmpDTO user){
		System.out.println("userinfo=>"+user);
		dao.insert(user);
		return "redirect:/list.do";
	}
}
