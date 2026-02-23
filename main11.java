package p3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p4.BankService;

public class main11 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("p5/con1.xml");
		
		   BankService service = ctx.getBean(BankService.class);
	        try {
	               service.transferMoney();
	               service.transferMoney();
	        }
	        catch(Exception e) {
	        System.out.println(e.getMessage());
	        }
	                }

	}


