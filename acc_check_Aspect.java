package p1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class acc_check_Aspect {
	@Before("execution(* p4.*.*(..))")
	public void acc_check(JoinPoint joinpoint)
	{
		Object[] args = joinpoint.getArgs();
		String acc = (String) args[0];
		if(!p2.User.acc.contains(acc))
		{
			throw new RuntimeException("Enter a valid account number!");
		}
		System.out.print("Valid account number");
		
	}

}
