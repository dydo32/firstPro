package emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.MyEmpDAO;
import emp.dto.EmpDTO;

@Controller
public class ReadController {
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	@RequestMapping(value="/read.do")
	public ModelAndView read(String id){
		ModelAndView mav = new ModelAndView();
		EmpDTO user = dao.read(id);
		mav.addObject("user", user);
		mav.setViewName("emp/emp_read");
		return mav;
	}
}
