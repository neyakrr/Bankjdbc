package p2;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper {

		
		public Integer mapRow(ResultSet rs , int rowNum) throws SQLException {

			return rs.getInt("acc_no");
			
		}

	}



