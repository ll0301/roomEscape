package 보관함;

public class 인벤아이템 {

	public String 이름;
	public String 아이템아이디;
	public int 수량;
	

	
	
	
	
	public 인벤아이템(String 이름, String 아이템아이디 ) {
		this.이름 = 이름;
		this.아이템아이디 = 아이템아이디;
		this.수량 = 0;
	}
	
	public void 추가하기() {
		this.수량 ++;
	}
	
	public void 지우기(){
		this.수량 --;
	}
	
	public String 이름얻기() {
		return this.이름;
	}
	
	public String 아이템아이디얻기() {
		return this.아이템아이디;
	}
	
	public int 수량얻기() {
		return this.수량;
	}
	
	public String toString() {
		String s = "";
		s += this.이름;  		
		
		
		return s;
	}
	
}
