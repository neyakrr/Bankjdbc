package p2;

import java.util.ArrayList;
import java.util.List;

public class User {


public static  List<Integer> acc = new ArrayList<>();

    {
       
    	AccountDAOJDBC a = new AccountDAOJDBC(); 
        acc = a.getAcc();
    }


     

}