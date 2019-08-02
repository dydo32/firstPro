package emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import emp.dao.MyEmpDAO;
import emp.dto.EmpDTO;

@Controller
public class SearchController {
	@Autowired
	@Qualifier("empdao")
	MyEmpDAO dao;
	
	//get방식으로 요청될때 실행될 메소드
	//	- search할 addr을 입력할 수 있는 페이지가 response되어여함
	@RequestMapping(value="/search.do",method=RequestMethod.GET)	//method -> get방식일때
	public String showView(){
		return "emp/search";
	}
	
	@RequestMapping(value="/search.do",method=RequestMethod.POST)	//method -> post방식일때
	public ModelAndView search(@RequestParam String addr, String test){	//@RequestParam을 사용해서 받아도 되고, name이 같게 String으로 매개변수 주어도됨 name�� ���� String���� �Ű����� �־��
		System.out.println("addr=>"+addr);
		System.out.println("test=>"+test);
		ModelAndView mav = new ModelAndView();
		List<EmpDTO> emplist = dao.findByAddr(addr);
		mav.addObject("emplist", emplist);
		mav.setViewName("emp/emp_list");
		return mav;
	}
	
}
