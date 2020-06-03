package 보관함;

import 아이템.아이템;

public class 개발자수첩 {


		public void 개발자힌트보관(아이템 아이템) {
			개발자힌트.수량 ++;
		}
		
		public int 개발자수첩크기;
	    public 개발자수첩 [] 개발자수첩;
	    public 아이템 개발자힌트;
	    
	    //아이템 관련 
	    public int 순서;
	    public String 이름;
	    public int 스택힌트;
	    

	    public 개발자수첩(){
	        개발자수첩크기 = 2;
	    }
	    
	    public void 개발자수첩추가(int 순서, String 이름, int 스택아이템){

	    }
	    
	    public void 개발자수첩최대크기 (int 개발자수첩크기){
	        this.개발자수첩크기 = 개발자수첩크기;
	        	개발자수첩 = new 개발자수첩[개발자수첩크기];
	    }
	    
	    public void 개발자힌트넣기(int 아이디){

	    }
	
}
