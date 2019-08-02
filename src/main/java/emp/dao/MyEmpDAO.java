package emp.dao;
import java.util.List;

import emp.dto.EmpDTO;

public interface MyEmpDAO {
	EmpDTO read(String id);
	//회원인원수 조회
	int count();
	//회원가입
	int insert(EmpDTO user);
	//회원정보수정
	int update(EmpDTO userInfo);
	//회원탈퇴
	int delete(String id);
	//로그인
	EmpDTO login(String id,String pass);
	//회원목록보기
	List<EmpDTO> getMemberList();
	//주소로 검색
	List<EmpDTO> findByAddr(String addr);
	
}









