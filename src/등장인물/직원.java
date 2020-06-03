package 등장인물;

public class 직원 extends 조연 {

	public int 공격력 = 100;
	public int 방어력 = 100;
	public int 속도;
	public int 순찰;
	//신고받는다
	
	
	public int 공격한다() {
		return 공격력;
	}
	
	public void 공격받는다(int sum) {
		
		if(방어력 >= sum)
			체력 = 체력 -0;
		else
			체력 = 체력 + 방어력 - sum;
	}
	
}
