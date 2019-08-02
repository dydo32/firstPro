package emp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import emp.dto.EmpDTO;
import emp.dto.MyEmpRowMapper;

@Repository("empdao")
public class MyEmpDAOImpl implements MyEmpDAO {
	@Autowired
	private JdbcTemplate template;

	@Override
	public int count() {
		return template.queryForObject("select count(id) from kitriemp", Integer.class);
	}
	
	@Override
	public int insert(EmpDTO user) {
		String sql = "insert into kitriemp values(?,?,?,?,sysdate,?,1000,?)";
		//?(물음표)순서대로 update메소드에 정의한다.
		int result = template.update(sql,user.getId(),user.getPass(),user.getName(),user.getAddr(),user.getGrade(),user.getDeptNo());
		return result;
	}
	@Override
	public int update(EmpDTO userInfo) {
		String sql = "update kitriemp set pass=?,addr=?,grade=? where id=?";
		int result = template.update(sql,userInfo.getPass(), userInfo.getAddr(),userInfo.getGrade(), userInfo.getId());
		return result;
	}
	@Override
	public int delete(String id) {
		String sql = "delete from kitriemp where id=?";
		int result = template.update(sql,id);
		return result;
	}
	@Override
	public EmpDTO login(String id, String pass) {
		try{
			return template.queryForObject("select * from kitriemp where id=? and pass=?", new Object[]{id,pass}, new MyEmpRowMapper() );
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
	@Override
	public List<EmpDTO> getMemberList() {
		return template.query("select * from kitriemp", new MyEmpRowMapper());
	}
	@Override
	public List<EmpDTO> findByAddr(String addr) {
		return template.query("select * from kitriemp where addr like ?",new Object[]{"%"+addr+"%"}, new MyEmpRowMapper());
	}
	
	@Override
	public EmpDTO read(String id) {
		try{
			return template.queryForObject("select * from kitriemp where id=?", new Object[]{id}, new MyEmpRowMapper() );
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
	

}
