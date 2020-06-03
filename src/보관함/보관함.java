package 보관함;

import 아이템.아이템;

public class 보관함 {

	
	public void 아이템보관(아이템 아이템) {
		아이템.수량 ++;
	}
	
	public int 보관함크기;
    public 보관함 [] 보관함;
    public 아이템 아이템;
    
    //아이템 관련 
    public int 아이디;
    public String 이름;
    public int 의상아이템;
    

    public 보관함(){
        	보관함크기 = 2;
    }
    
    public void 보관함추가(int 아이디, String 이름, int 스택아이템){

    }
    
    public void 보관함최대크기 (int 보관함크기){
        this.보관함크기 = 보관함크기;
        보관함 = new 보관함[보관함크기];
    }
    
    public void 아이템넣기(int 아이디){

    }
	
}
