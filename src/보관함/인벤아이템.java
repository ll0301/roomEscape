package ������;

public class �κ������� {

	public String �̸�;
	public String �����۾��̵�;
	public int ����;
	

	
	
	
	
	public �κ�������(String �̸�, String �����۾��̵� ) {
		this.�̸� = �̸�;
		this.�����۾��̵� = �����۾��̵�;
		this.���� = 0;
	}
	
	public void �߰��ϱ�() {
		this.���� ++;
	}
	
	public void �����(){
		this.���� --;
	}
	
	public String �̸����() {
		return this.�̸�;
	}
	
	public String �����۾��̵���() {
		return this.�����۾��̵�;
	}
	
	public int �������() {
		return this.����;
	}
	
	public String toString() {
		String s = "";
		s += this.�̸�;  		
		
		
		return s;
	}
	
}
