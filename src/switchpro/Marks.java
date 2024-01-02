package switchpro;

public class Marks {

	public static void main(String[] args) {
		int m = 95 ;
		if(m < 35) {
			System.out.println("fail");
		}	else if(m == 35) {
			System.out.println("pass");
		} else if(m>=35 && m<=45) {
			System.out.println("Grade D");
		}else if(m>=45 && m<=60) {
			System.out.println("Grade C");
		}else if(m>=60 && m<=70) {
			System.out.println("Grade B");
		}else if(m>=70 && m<=95) {
			System.out.println("Grade A");
		}else if(m>=95 && m<=100) {
			System.out.println("Grade O");
		} else if(m>100)
				{
			System.out.println("invalid");
		}
			
			
		}
		
	}





