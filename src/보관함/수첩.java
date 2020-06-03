package 보관함;

import 아이템.아이템;

public class 수첩 {

	public void 힌트보관(아이템 아이템) {
		힌트.수량 ++;
	}
	
	public int 수첩크기;
    public 수첩 [] 수첩;
    public 아이템 힌트;
    
    //아이템 관련 
    public int 순서;
    public String 이름;
    public int 스택힌트;
    

    public 수첩(){
        수첩크기 = 2;
    }
    
    public void 수첩추가(int 순서, String 이름, int 스택아이템){

    }
    
    public void 수첩최대크기 (int 수첩크기){
        this.수첩크기 = 수첩크기;
        	수첩 = new 수첩[수첩크기];
    }
    
    public void 힌트넣기(int 아이디){

    }
	
	

	
}
