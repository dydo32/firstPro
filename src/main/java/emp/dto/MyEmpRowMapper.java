package emp.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyEmpRowMapper implements RowMapper<EmpDTO>{

	@Override
	public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		//레코드 하나를 dto와 매핑한 후에 리턴 - query메소드 내부에 while문 같은 반복문 안에서 호출될 메소드
		//System.out.println("maprow=>"+rowNum);
		EmpDTO user = new EmpDTO(rs.getString(1), rs.getString(2), rs.getString(3), 
				rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
		return user;
	}
}
