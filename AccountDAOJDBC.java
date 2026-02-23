package p2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;



public class AccountDAOJDBC implements AccountDAO {
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	private JdbcTemplate jdbcTemplate;
	
	public void update(Account e) {
		String sql = "UPDATE account SET bal=? WHERE acc_no=?";
		jdbcTemplate.update(sql , e.getBalance() , e.getAcc_no());
		System.out.println("Account Updated");
	}
	public List<Integer> getAcc()
	{
		String sql = "SELECT acc_no  FROM account";
		return jdbcTemplate.query(sql , new EmployeeRowMapper());
	}

}
