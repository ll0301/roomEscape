package ��Ż��;



import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Track;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import �����ι�.����;
import �����ι�.��ȭ;
import �����ι�.���ΰ�;
import �������.����;
import ������.�κ�������;
import ������.�κ��丮;
import ��������.��������;
import ��������.Ÿ�̸�;
import ������.��������Ʈ;
import ������.����������;
import ������.������;
import ������.��Ʈ;




public class �����÷���  {

	
	public static void main(String[] args)throws InterruptedException {
		
		
		��Ʈ ��Ʈ = new ��Ʈ();
		��������Ʈ ��������Ʈ = new ��������Ʈ();
		�κ��丮 �κ��丮 = new �κ��丮();
		���ΰ� ���ΰ� = new ���ΰ�();
		���������� ���������� = new ����������();
		������ ������ = new ������();
		
		
		
		Scanner s = new Scanner(System.in);
		int slot = 3;
		int scount = 0;
		int ����[] = new int[slot];
		int ���Թ迭[][] = new int[slot][slot];
		int ���Ա��� = ����.length;

		int ����= 1;
		int ����Ǯ = 1;
		int ÿ�� =1;
		int ���� =1;
		int ��Ʈ�� =1;
		int ������ =1;
		Random random = new Random();
		
		


		���� �������1 = new ����("Day_of_Chaos.mp3", true);
		�������1.start();
	System.out.println("***********************************"); Thread.sleep(500);
	System.out.println("���� ������ ��򰡿� �����ִ�.");Thread.sleep(500);
	System.out.println("���� ��Ȳ���� ������߰ڴ�......."); Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("-----------------------------------");
	System.out.println("Skip �Ͻø� ������ ����˴ϴ�.");
	System.out.println("skip�� 1 + Enter�Դϴ�.");
	System.out.println("-----------------------------------");
	int ��ŵ1 = s.nextInt();
	ȭ�������();
	

	
	while(true) {
		
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("         STAGE 1 - �ǹ��ǹ�");
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("-----------------------------------");
	System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
	if(���ΰ�.����ִ¾�����()==null) {
		System.out.println("����������  : ����");
	}else {
	System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.�ܼ�");
	System.out.println("2.������");
	System.out.println("3.��������Ʈ");
	System.out.println("-----------------------------------");
	System.out.println("4.Ż���ϱ�");
	System.out.println("5.å�󼭶�");
	System.out.println("6.ħ��");
	System.out.println("-----------------------------------");
	int ��������1 = s.nextInt();
	
	//�ܼ�
	if(��������1==1) {

		��Ʈ.��Ʈ����Ʈ����();
		System.out.println("-----------------------------------");
		System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
		System.out.println("-----------------------------------");
		int ��Ʈ1 = s.nextInt();
	}
	
	
	//�����۸��
	if(��������1==2) {
		while(true) {
		�κ��丮.�κ��丮���();
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.�����ۼ���");
		System.out.println("3.�����۰���");
		System.out.println("4.�����ۺи�");
		System.out.println("-----------------------------------");
		int ������1 = s.nextInt();
		
		if(������1==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(������1==2) {
			System.out.println("-----------------------------------");
			System.out.println("����� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۼ��� = s.next();
			
			if ("Į".equals(�����ۼ���)) {
				���ΰ�.����������("Į");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			} else if ("�հſ�".equals(�����ۼ���)) {
				���ΰ�.����������("�հſ�");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			} else if ("����1".equals(�����ۼ���)) {
				���ΰ�.����������("����1");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			} else {
				System.out.println("-----------------------------------");
				System.out.println("������ �� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		if(������1==3) {
			System.out.println("-----------------------------------");
			System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����۰���1 = s.next();
			String �����۰���2 = s.next();
			if("Ŀ��Į��".equals(�����۰���1)&&"Ŀ��Į��".equals(�����۰���2)) {
				�κ��丮.�����۸����("Į", "6");
				�κ��丮.��������("Į");
				�κ��丮.��������("Ŀ��Į��");
				�κ��丮.��������("Ŀ��Į��");
				���ΰ�.��Ʈ����Ʈ += 20;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("Į�� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}else if ("Ŀ��Į��".equals(�����۰���1)&&"Ŀ��Į��".equals(�����۰���2)) {
				�κ��丮.�����۸����("Į", "6");
				�κ��丮.��������("Į");
				�κ��丮.��������("Ŀ��Į��");
				�κ��丮.��������("Ŀ��Į��");
				���ΰ�.��Ʈ����Ʈ += 20;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("Į�� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}	else {
				System.out.println("-----------------------------------");
				System.out.println("������ �� ���� �����Դϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(������1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("�и��� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۺи�1 = s.next();
			
			if("����1".equals(�����ۺи�1)) {
				if(��Ʈ.����==0) {
					
				System.out.println("������������������������������������");Thread.sleep(500);
				System.out.println("�̰��� ���ź����Դϴ�.");Thread.sleep(500);
				System.out.println("���� ������......");Thread.sleep(500);
				System.out.println("���Կ� ���踦 ���ܳ����ϴ�. ");Thread.sleep(500);
				System.out.println("�׸��� �����鿡�� ��Ű���ʰ� ������ �ֵ��� ");Thread.sleep(500);
				System.out.println("���� Ż���� ��Ʈ�� ��Ʈ�� ������ ���ܵξ����ϴ�. ");Thread.sleep(500);
				System.out.println("�ε� Ż���Ͻñ�... ");Thread.sleep(500);
				System.out.println("������������������������������������");Thread.sleep(500);
				��Ʈ.��Ʈ�����("���� �ӿ� ���谡 �ִ�.", 1);
				�κ��丮.��������("����1");
				���ΰ�.��Ʈ����Ʈ += 20;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (��Ʈ.����>0) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}else {
				System.out.println("-----------------------------------");
				System.out.println("�и��� �� �� ���� �������Դϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		
		}
	}
	//�����۸�� 

	
	
	//��������Ʈ
	if(��������1==3) {
		while(true) {
		��������Ʈ.��������Ʈ����Ʈ����();
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.����Ȯ��");
		System.out.println("3.��Ʈ����Ʈ 10");
		System.out.println("4.��Ʈ����Ʈ 20");
		System.out.println("-----------------------------------");
		System.out.println("������ ��Ʈ�� Ȯ���ϼ���.");
		System.out.println("��Ʈ ����Ʈ�� ���� Ȯ�� �����մϴ�.");
		System.out.println("-----------------------------------");
		int ��Ʈ���� = s.nextInt();
		
		if(��Ʈ����==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(��Ʈ����==2&&���ΰ�.��Ʈ����Ʈ>=0&&��������Ʈ.����==0) {
			��������Ʈ.��������Ʈ�����("��Ʈ����Ʈ Ȱ���", 1);
			���ΰ�.��Ʈ����Ʈ += 10;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("��Ʈ����Ʈ�� ���������� ����Ǿ��� �� ���޵˴ϴ�. ");
			System.out.println("��Ʈ����Ʈ�� �������� �ܼ��� ȹ���� �� �ֽ��ϴ�.");
			System.out.println("���ѽð��� ������ �����������ʹ� ");
			System.out.println("���ѽð� �������ε� ����� �� �ֽ��ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("��Ʈ����Ʈ�� 10 ȹ���Ͽ����ϴ�.");
			System.out.println("-----------------------------------");
		}else if(��Ʈ����==2&&���ΰ�.��Ʈ����Ʈ>=0&&��������Ʈ.����>0){
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("��Ʈ����Ʈ�� ���������� ����Ǿ��� �� ���޵˴ϴ�. ");
			System.out.println("��Ʈ����Ʈ�� �������� �ܼ��� ȹ���� �� �ֽ��ϴ�.");
			System.out.println("���ѽð��� ������ �����������ʹ� ");
			System.out.println("���ѽð� �������ε� ����� �� �ֽ��ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
		}
		
		if(��Ʈ����==3&&���ΰ�.��Ʈ����Ʈ>=10&&��������Ʈ.����==1) {
			��������Ʈ.��������Ʈ�����("�������� �����Ѵ�.", 2);
			���ΰ�.��Ʈ����Ʈ -= 10;
			���ΰ�.��Ʈ����Ʈ += 20;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�������� �������� ���ο� �������� ���� �� �ִ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("��Ʈ����Ʈ�� 10 ����߽��ϴ�.");
			System.out.println("��Ʈ����Ʈ�� 20 ȹ���Ͽ����ϴ�.");
			System.out.println("-----------------------------------");
		} else if(��Ʈ����==3&&���ΰ�.��Ʈ����Ʈ>=20&&��������Ʈ.��ȣ>1){
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�������� �������� ���ο� �������� ���� �� �ִ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
		}
		
		
		if(��Ʈ����==4&&���ΰ�.��Ʈ����Ʈ>=20&&��������Ʈ.����==2) {
			��������Ʈ.��������Ʈ�����("�հſ�", 3);
			���ΰ�.��Ʈ����Ʈ -= 20;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�հſ��� Ȱ���ϼ���");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("��Ʈ����Ʈ�� 20 ����߽��ϴ�.");
			System.out.println("-----------------------------------");
		}else if(��Ʈ����==4&&���ΰ�.��Ʈ����Ʈ>=20&&��������Ʈ.����>3){
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�հſ��� Ȱ���ϼ���");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
		}
		
		
		
		}
	}
	//��������Ʈ

	
	
	//å�󼭶�
	if(��������1==5) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.ù��°����");
		System.out.println("3.�ι�°����");
		System.out.println("4.å��");
		System.out.println("-----------------------------------");
		int å�󼭶� = s.nextInt();
		
		if(å�󼭶� ==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(å�󼭶� == 2) {
			if(������.�հſ�==0) {
			�κ��丮.�����۸����("�հſ�", "3");
			�κ��丮.��������("�հſ�");
			������.�հſ� += 1;
			System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�հſ��� ȹ���Ͽ����ϴ�.");
			System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
		} else if(������.�հſ�==1) {
			����������.���������۸����("��ì��",1);
			System.out.println("-----------------------------------");
			System.out.println("Ư���Ѱ��� �����ϴ�.");
			System.out.println("-----------------------------------");
		}
		
		}	
		if(å�󼭶� == 3) {
			if(������.Ŀ��Į�� ==0) {
			�κ��丮.�����۸����("Ŀ��Į��", "1");
			�κ��丮.��������("Ŀ��Į��");
			������.Ŀ��Į�� += 1;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("Ŀ��Į���� ȹ���Ͽ����ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
		}else if(������.Ŀ��Į��==1) {
			����������.���������۸����("��ì��",1);
			System.out.println("-----------------------------------");
			System.out.println("Ư���Ѱ��� �����ϴ�.");
			System.out.println("-----------------------------------");
		}
			
		}
		if(å�󼭶� ==4) {
			if(������.Ŀ��Į�� ==0) {
			�κ��丮.�����۸����("Ŀ��Į��", "2");
			�κ��丮.��������("Ŀ��Į��");
			������.Ŀ��Į�� += 1;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("Ŀ��Į���� ȹ���Ͽ����ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.Ŀ��Į��==1) {
				����������.���������۸����("��ì��",1);
				System.out.println("-----------------------------------");
				System.out.println("Ư���Ѱ��� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		}

		
		}
	}
	//å�󼭶�
	

	
	
	//ħ��
	if(��������1==6) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.�̺�");
		System.out.println("3.����");
		
		if("�հſ�".equals(���ΰ�.����ִ¾�����())) {
			System.out.println("4.ħ��Ʒ�");
		} else {
			
		}
		
		System.out.println("-----------------------------------");
		int ħ�� = s.nextInt();
		
		
		//��������
		if(ħ��==1) {
			break;
		}
		//�̺�
		if(ħ��==2) {
			����������.���������۸����("��ì��",1);
			System.out.println("-----------------------------------");
			System.out.println("Ư���Ѱ��� �����ϴ�.");
			System.out.println("-----------------------------------");
		}
		//�̺�
		
		//����
		if(ħ��==3) {
			
		if("Į".equals(���ΰ�.����ִ¾�����())) {
			if(������.����1==0) {
			�κ��丮.�����۸����("����1", "4");
			�κ��丮.��������("����1");
			������.����1 += 1;
			���ΰ�.��Ʈ����Ʈ += 20;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("���踦 ȹ���Ͽ����ϴ�.");
			System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.����1>0) {
				����������.���������۸����("��ì��",1);
				System.out.println("-----------------------------------");
				System.out.println("Ư���Ѱ��� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		}else {
			����������.���������۸����("��ì��",1);
			System.out.println("-----------------------------------");
			System.out.println("Ư���Ѱ��� �����ϴ�.");
			System.out.println("-----------------------------------");
		}
		}
		//����
		

		if(ħ��==4) {
			if("�հſ�".equals(���ΰ�.����ִ¾�����())){
				if(������.����1==0) {
				�κ��丮.�����۸����("����1", "5");
				�κ��丮.��������("����1");
				������.����1 += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("������ ȹ���Ͽ����ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if(������.����1>0) {
					����������.���������۸����("��ì��",1);
					System.out.println("-----------------------------------");
					System.out.println("Ư���Ѱ��� �����ϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			else {
				
			}
		}
		
		
	}
    }
	//ħ��
	
	//Ż���ϱ�
	if(��������1==4) {
		if(������.����1==1) {
		if("����1".equals(���ΰ�.����ִ¾�����())) {
			���ΰ�.��������Ż��("Ż��");
			
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Ż�⿡ �����մϴ�.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			break;	
		}else{
			���ΰ�.��������������("���");
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�.");
			System.out.println("-----------------------------------");
		}
		
		
		} else if(������.����1==0) {
			���ΰ�.��������������("���");
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�.");
			System.out.println("-----------------------------------");
		}
		
		
    }
	//Ż���ϱ�
	
	
	}// while 
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("���� �ƿ� ����ֳ�......");Thread.sleep(500); ���ΰ�.��������������("���");
	System.out.println("���� ������ ������������......");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	int ��ŵ2 = s.nextInt();
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("         STAGE 1 - ��� ");
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("-----------------------------------");
	System.out.println("ȹ���� ������ "); 
	�κ��丮.�κ��丮���();
	System.out.println("ȹ���� ��Ʈ "); 
	��Ʈ.��Ʈ����Ʈ����();
	���ΰ�.��Ʈ����Ʈ += 500;
	System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
	System.out.println("-----------------------------------");
	
	
	int ��ŵ3 = s.nextInt();
	
	�κ��丮.��������("�հſ�");
	�κ��丮.��������("Į");
	�κ��丮.��������("Ŀ��Į��");
	�κ��丮.��������("Ŀ��Į��");
	�κ��丮.��������("�հſ�");
	�κ��丮.��������("����1");
	�κ��丮.��������("����1");
	��Ʈ.��Ʈ�����("�����", 10);
	��������Ʈ.��������Ʈ�����("�����",10);
	����������.���������������("����", 10);
	���ΰ�.����������("����");
	�������1.close();
	
	���� �̺�Ʈ����1 = new ����("Micro.mp3", true);
	�̺�Ʈ����1.start();
	while(true) {	
		scount += 1;
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("         EVENT - ���Ըӽ�");
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("-----------------------------------");
	System.out.println("��ȸ�� 3���Դϴ�.");
	System.out.println("������ ����ּ���. /skip/");
	System.out.println("-----------------------------------");
	int ����1 = s.nextInt();
	���ΰ�.���Ըӽ�("��ܴ��");
	for (int i = 0; i < ���Ա��� ; i  ++) {
		for(int ����=0; ����<���Ա���; ����++) {  
		����[����] = (int)(Math.random()*slot)+1;
	}
	for ( int j = 0; j < ���Ա��� ; j ++) { // ������ �� ����  ������ ����  
	
		���Թ迭[i][j] = ����[j];
		
	}
	
	}
	
	
	for(int a=0; a<���Ա���; a++) {

		for (int b=0; b<���Ա���; b++) {
					System.out.print(���Թ迭[a][b]);Thread.sleep(900);		
		}
		System.out.println("");
		
	}
	if(���Թ迭[0][0]==1&&���Թ迭[0][1]==1&&���Թ迭[0][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 150;
	}
	else if(���Թ迭[0][0]==2&&���Թ迭[0][1]==2&&���Թ迭[0][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 150; System.out.println("������!");
	}
	else if(���Թ迭[0][0]==3&&���Թ迭[0][1]==3&&���Թ迭[0][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==1&&���Թ迭[1][1]==1&&���Թ迭[1][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==2&&���Թ迭[1][1]==2&&���Թ迭[1][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==3&&���Թ迭[1][1]==3&&���Թ迭[1][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==1&&���Թ迭[2][1]==1&&���Թ迭[2][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==2&&���Թ迭[2][1]==2&&���Թ迭[2][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==3&&���Թ迭[2][1]==3&&���Թ迭[2][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 150;  System.out.println("������!");
	}
	if(scount==3) {
		System.out.println("-----------------------------------");
		System.out.println("ȹ��������Ʈ : " + ���ΰ�.��Ʈ����Ʈ+ "/skip/");
		System.out.println("-----------------------------------");
		int ���Խ�ŵ = s.nextInt();
		scount = 0;
		break;
		
	}
		
			}

	
	
	
	//////////////////////////////////////stage 2

	
	
	ȭ�������();
	�̺�Ʈ����1.close();
	Ÿ�̸� Ÿ�̸� = new Ÿ�̸�();
	Ÿ�̸�.start();
	���� �������2 = new ����("Day_of_Chaos.mp3", true);
	�������2.start();
	while(true) {
		
		
		
		
		
			if(Ÿ�̸�.getŸ�̸�()==0) {
				�������2.close();
				���� �������� = new ���� ("Lasting_Hope.mp3",  true);
				��������.start();
				
				while(true) {
					System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
					System.out.println("�������� 2 - ���� "); 
					System.out.println("ȹ���� ������ "); 
					�κ��丮.�κ��丮���();
					System.out.println("ȹ���� ��Ʈ "); 
					��Ʈ.��Ʈ����Ʈ����();
					System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
					System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
					int ����1 = s.nextInt();
					
					if(����1==20) {
						break;
					}
				}
			}
		
		
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("         STAGE 2 - ����ִ� ��");
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("-----------------------------------");
	System.out.println("���ѽð� :" + Ÿ�̸�.getŸ�̸�());
	System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
	if(���ΰ�.����ִ¾�����()==null) {
		System.out.println("����������  : ����");
	}else {
	System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.�ܼ�");
	System.out.println("2.������");
	System.out.println("3.��������Ʈ");
	System.out.println("4.���ѽð��߰�");
	System.out.println("-----------------------------------");
	System.out.println("5.Ż���ϱ�");
	System.out.println("6.�繰��");
	System.out.println("7.�Խ���");
	if("������o".equals(���ΰ�.����ִ¾�����())) {
	System.out.println("8.��ȭ��");}
	System.out.println("-----------------------------------");
	int ��������2 = s.nextInt();
	
	//�ܼ�
	if(��������2==1) {
		��Ʈ.��Ʈ����Ʈ����();
		System.out.println("-----------------------------------");
		System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
		System.out.println("-----------------------------------");
		int ��Ʈ1 = s.nextInt();
	}
	
	
	//�����۸��
	if(��������2==2) {
		while(true) {
		�κ��丮.�κ��丮���();
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.�����ۼ���");
		System.out.println("3.�����۰���");
		System.out.println("4.�����ۺи�");
		System.out.println("-----------------------------------");
		int ������1 = s.nextInt();
		
		if(������1==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(������1==2) {
			System.out.println("-----------------------------------");
			System.out.println("����� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۼ��� = s.next();
			
			if ("�η���ī��".equals(�����ۼ���)) {
				���ΰ�.����������("�η���ī��");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			} else if ("������o".equals(�����ۼ���)) {
				���ΰ�.����������("������o");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			}else {
				System.out.println("-----------------------------------");
				System.out.println("������ �� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		if(������1==3) {
			System.out.println("-----------------------------------");
			System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����۰���1 = s.next();
			String �����۰���2 = s.next();
			
			if("������x".equals(�����۰���1)&&"������".equals(�����۰���2)) {
				�κ��丮.�����۸����("������o", "1");
				�κ��丮.��������("������o");
				������.������o += 1;
				���ΰ�.��Ʈ����Ʈ += 20;
				�κ��丮.��������("������x");
				�κ��丮.��������("������");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�������� ����� �� �ֽ��ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}else if ("������".equals(�����۰���1)&&"������x".equals(�����۰���2)) {
				�κ��丮.�����۸����("������o", "1");
				�κ��丮.��������("������o");
				������.������o += 1;
				���ΰ�.��Ʈ����Ʈ += 20;
				�κ��丮.��������("������x");
				�κ��丮.��������("������");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�������� ����� �� �ֽ��ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}	else {
				System.out.println("-----------------------------------");
				System.out.println("������ �� ���� �����Դϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(������1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("�и��� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۺи�1 = s.next();
			
			
			
			
			if("����".equals(�����ۺи�1)) {
				if(��Ʈ.����==0) {
					
				System.out.println("������������������������������������");Thread.sleep(500);
				System.out.println("���� �����⵵��?");Thread.sleep(500);
				System.out.println("������������������������������������");Thread.sleep(500);
				��Ʈ.��Ʈ�����("���������⵵�� �繰��", 1);
				�κ��丮.��������("����");
				���ΰ�.��Ʈ����Ʈ += 20;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (��Ʈ.����>0) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			
			if("����������".equals(�����ۺи�1)) {
				if(��Ʈ.����==1) {
					
				System.out.println("������������������������������������");Thread.sleep(500);
				System.out.println("����ð�ǥ�ڿ�");Thread.sleep(500);
				System.out.println("������������������������������������");Thread.sleep(500);
				��Ʈ.��Ʈ�����("����ð�ǥ�ڿ�", 2);
				�κ��丮.��������("����������");
				���ΰ�.��Ʈ����Ʈ += 20;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (��Ʈ.����>1) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			else {
				System.out.println("-----------------------------------");
				System.out.println("�и��� �� �� ���� �������Դϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		
		}
	}
	//�����۸�� 

	
	
	//��������Ʈ
	if(��������2==3) {
		while(true) {
		��������Ʈ.��������Ʈ����Ʈ����();
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.��Ʈ����Ʈ - 100��");
		System.out.println("-----------------------------------");
		System.out.println("������ ��Ʈ�� Ȯ���ϼ���.");
		System.out.println("��Ʈ ����Ʈ�� ���� Ȯ�� �����մϴ�.");
		System.out.println("-----------------------------------");
		int ��Ʈ���� = s.nextInt();
		
		if(��Ʈ����==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(��Ʈ����==2) {
			if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ>100) {
				���ΰ�.��Ʈ����Ʈ -= 100; 
			��������Ʈ.��������Ʈ�����("���������⵵ = ���糯¥ - ���", 1);
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("���� �����⵵�� �繰�� ��й�ȣ�Դϴ�.");
			System.out.println("���� ��������� �Խ��� ����������......");
			System.out.println("���糯¥�� �Խ��� ����ð�ǥ��......");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("��Ʈ����Ʈ�� - 100 �����˴ϴ�.");
			System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
			System.out.println("-----------------------------------");
			int ��������Ʈ1 = s.nextInt();
			}
			else if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ<100) {
				System.out.println("-----------------------------------");
				System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
				System.out.println("-----------------------------------");
			}
			else if(��������Ʈ.����>0) {
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("���� �����⵵�� �繰�� ��й�ȣ�Դϴ�.");
				System.out.println("���� ��������� �Խ��� ����������......");
				System.out.println("���糯¥�� �Խ��� ����ð�ǥ��....../skip/");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				int ��������Ʈ1 = s.nextInt();
			}
		}
		
		
		}
	}
	//��������Ʈ
	
	//���ѽð��߰�
	if(��������2==4) {
		while(true) {
		Ÿ�̸�.get����();
		System.out.println("-----------------------------------");
		System.out.println("���ѽð��� �߰��� �� �ֽ��ϴ�.");
		System.out.println("-----------------------------------");
		System.out.println("  ���ѽð�        ��Ʈ����Ʈ");
		System.out.println("1. ��������");
		System.out.println("2. 50         100");
		System.out.println("3. 100        200");
		System.out.println("-----------------------------------");
		int ���ѽð� = s.nextInt(); 
		
		if(���ѽð�==2) {
			if(���ΰ�.��Ʈ����Ʈ>=100) {
				���ΰ�.��Ʈ����Ʈ -= 100; 
				Ÿ�̸�.setŸ�̸�(Ÿ�̸�.Ÿ�̸�+50);
				System.out.println("-----------------------------------");
				System.out.println("���ѽð��� 50 �߰��մϴ�.");
				System.out.println("-----------------------------------");
			}else if(���ΰ�.��Ʈ����Ʈ<100) {
				System.out.println("-----------------------------------");
				System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		if(���ѽð�==3) {
			if(���ΰ�.��Ʈ����Ʈ>=200) {
				���ΰ�.��Ʈ����Ʈ -= 200; 
				Ÿ�̸�.setŸ�̸�(Ÿ�̸�.Ÿ�̸� + 100);
				System.out.println("-----------------------------------");
				System.out.println("���ѽð��� 100 �߰��մϴ�.");
				System.out.println("-----------------------------------");
			}else if(���ΰ�.��Ʈ����Ʈ<200) {
				System.out.println("-----------------------------------");
				System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(���ѽð�==1) {
			break;
		}
		}
	}
	//���ѽð��߰�
	
	
	
	
	//Ż���ϱ� 
	if(��������2==5) {
		if(������.�η���ī��==1) {
		if("�η���ī��".equals(���ΰ�.����ִ¾�����())) {
			���ΰ�.��������Ż��("Ż��");
			Ÿ�̸�.stop();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("Ż�⿡ �����մϴ�.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			break;
			
		}else {
			���ΰ�.��������������("���");
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�.");
			System.out.println("-----------------------------------");
		} 
		}else if(������.�η���ī��==0) {
		���ΰ�.��������������("���");
		System.out.println("-----------------------------------");
		System.out.println("����ֽ��ϴ�.");
		System.out.println("-----------------------------------");
	}
			
	
	}
	//Ż���ϱ�  
	
	//�繰��
	if(��������2==6) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.ù��° ĭ");
		System.out.println("2.�ι�° ĭ");
		System.out.println("3.����° ĭ");
		System.out.println("4.��������");
		System.out.println("-----------------------------------");
		int �繰�� = s.nextInt();
		
		//ù��°ĭ 
		if(�繰��==1) {
			if(������.������x==0) {
			�κ��丮.�����۸����("������x", "4");
			�κ��丮.��������("������x");
			������.������x += 1;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�������� ȹ���Ͽ����ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.������o>0) {
				����������.���������۸����("��ì��",1);
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		//�ι�°ĭ
		if(�繰��==2) {
			if(������.������==0) {
			�κ��丮.�����۸����("������", "3");
			�κ��丮.��������("������");
			������.������ += 1;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�������� ȹ���Ͽ����ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.������>1) {
				����������.���������۸����("��ì��",1);
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		
		//����°ĭ 
		if(�繰��==3) {
			���ΰ�.��������������("���");
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�. ");
			System.out.println("��й�ȣ�� �Է��ϼ���. ");
			System.out.println("-----------------------------------");
			int ��й�ȣ = s.nextInt();
			
			if(��й�ȣ==1892) {
			if(������.����������==0) {
				System.out.println("-----------------------------------");
				System.out.println("���Ƚ��ϴ�.");
				System.out.println("-----------------------------------");
				�κ��丮.�����۸����("����������", "5");
				�κ��丮.��������("����������");
				������.���������� += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("���������̸� ȹ���Ͽ����ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.����������>0) {
				����������.���������۸����("��ì��",1);
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�.");
				System.out.println("-----------------------------------");
			}
			}
			if(��й�ȣ!=1892) {
				 try
				 {
				 AudioInputStream ais12 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\psxx.wav"));
				Clip clip12 = AudioSystem.getClip();
				clip12.stop();
				clip12.open(ais12);
				clip12.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				System.out.println("-----------------------------------");
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(�繰��==4){
			break;
		}
		
		}//while
	}
	//�繰��
	
	//�Խ���
	if(��������2==7) {
		while(true) {
		System.out.println("-----------------------------------");
		
		if("������o".equals(���ΰ�.����ִ¾�����())) {
			System.out.println("1.����ð�ǥ");
			System.out.println("2.��������");
			System.out.println("3.�����Խ���");
			System.out.println("4.����������");
			System.out.println("5.��������");
		}else {
			System.out.println("��ο��� �� ������ �ʽ��ϴ�.");
			break;
		}
		System.out.println("-----------------------------------");
		int �Խ��� = s.nextInt();
		
		//����ð�ǥ
		if(�Խ���==1&&��Ʈ.����==2) {
			if(������.�η���ī��==0) {
			�κ��丮.�����۸����("�η���ī��", "2");
			�κ��丮.��������("�η���ī��");
			������.�η���ī�� +=1;
			���ΰ�.��Ʈ����Ʈ += 20;
			
			try
			 {
			 AudioInputStream ais14 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\Tearing Paper.wav"));
			Clip clip14 = AudioSystem.getClip();
			clip14.stop();
			clip14.open(ais14);
			clip14.start();
			 }
			 catch (Exception ex) {
				 
			 }
			System.out.println("-----------------------------------");
			System.out.println("������ǥ�� ������ϴ�.");
			System.out.println("-----------------------------------");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�η���ī�带 ȹ���Ͽ����ϴ�.");
			System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			else if(������.�η���ī��>0) {
				System.out.println("-----------------------------------");
				System.out.println("�ƹ��͵� �������� �ʽ��ϴ�.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		
		if(�Խ���==1&&��Ʈ.����<2) {
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("���� ���ź��� ����ð�ǥ");
			System.out.println("�� 1����� : 10:00 ~ 18:00");
			System.out.println("�� 2����� : 10:00 ~ 18:00");
			System.out.println("�� 3����� : 10:00 ~ 19:00");
			System.out.println("�� 4����� : 10:00 ~ 16:00");
			System.out.println("���ɽð� : 10:00 ~ 18:00");
			System.out.println("2012�� 12�� 5��  �����ٹ��� ��ö��");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("����ð�ǥ�Դϴ�. /skip/");
			System.out.println("-----------------------------------");
			int ����ð�ǥ = s.nextInt();
		}
		//��������
		if(�Խ���==2) {
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�ʿ� �� ");
			System.out.println("���� ��ġ�� ����� + �˴ϴ�.");
			System.out.println("-���������ڻ�-");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("���������Դϴ�. /skip/");
			System.out.println("-----------------------------------");
			int �������� = s.nextInt();
		}
		
		//�����Խ���
				if(�Խ���==3) {
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("����Ͻô� �����е� �����ϴ�. -������-");
			System.out.println("5���� �� �ǳ� ����ֳ���? -3�Կ��� �ֻ���-");
			System.out.println("1�Կ��� �������� �峭���� ã���ϴ� -������-");
			System.out.println("�弳�̳� ����� �ﰡ���ּ��� -�Խ��ǰ�����-");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("�����Խ��� �Դϴ�. /skip/");
			System.out.println("-----------------------------------");
			int �����Խ��� = s.nextInt();
				}
		
		//����������		
			if(�Խ���==4) {
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("������ ��ó�� ���� ����� �翡�� ");
			System.out.println("������ ȯ�ڸ� ���� �����ϴ� �������� ");
			System.out.println("�����а� �Բ��ؿ� 120���� �ð�......");
			System.out.println("������ �ð��� ������ ������ ��������");
			System.out.println("�������� ������ ġ���ϰڽ��ϴ�.");
			System.out.println("���� ���Ű� ������ ������");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("���������� �Դϴ�. /skip/");
			System.out.println("-----------------------------------");
					int ���������� = s.nextInt();
			}
			
			//��������
			if(�Խ���==5) {
				break;
			}
		
		}
	}
	//�Խ���
	
	//��ȭ��
	if(��������2==8) {
		if(������.����==0) {
			�κ��丮.�����۸����("����", "6");
			�κ��丮.��������("����");
			������.���� += 6;
			System.out.println("-----------------------------------");
			System.out.println("��ȭ�� �Ʒ����� ������ �߰��մϴ�.");
			System.out.println("-----------------------------------");
		}
		else if(������.����>0) {
			System.out.println("-----------------------------------");
			System.out.println("��ȭ���Դϴ�.");
			System.out.println("-----------------------------------");
		}
	}
	//��ȭ�� 
	
	
	}//while 
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");Thread.sleep(500); ���ΰ�.��������������("���");
	System.out.println("����!");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("-----------------------------------");
	System.out.println("�����߽��ϴ�. /skip/");
	System.out.println("-----------------------------------");
	int ��ŵ4 = s.nextInt();
	
	
	
	
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("         STAGE 2 - ��� ");
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("-----------------------------------");
	System.out.println("ȹ���� ������ "); 
	�κ��丮.�κ��丮���();
	System.out.println("ȹ���� ��Ʈ "); 
	��Ʈ.��Ʈ����Ʈ����();
	���ΰ�.��Ʈ����Ʈ += 500;
	���ΰ�.��Ʈ����Ʈ += Ÿ�̸�.getŸ�̸�();
	System.out.println("���� ��Ʈ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
	System.out.println("-----------------------------------");
	
	
	int ��ŵ5 = s.nextInt();
	
	�κ��丮.��������("������o");
	�κ��丮.��������("�η���ī��");
	�κ��丮.��������("����������");
	�κ��丮.��������("����");
	��Ʈ.��Ʈ�����("�����", 10);
	��������Ʈ.��������Ʈ�����("�����", 10);
	����������.���������������("����", 10);
	�������2.close();
	���� �̺�Ʈ����2 = new ����("Micro.mp3", true);
	�̺�Ʈ����2.start();
	
	
	
	while(true) {	
		scount += 1;
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("         EVENT - ���Ըӽ�");
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("-----------------------------------");
	System.out.println("��ȸ�� 3���Դϴ�.");
	System.out.println("������ ����ּ���. /skip/");
	System.out.println("-----------------------------------");
	int ����2 = s.nextInt();
	���ΰ�.���Ըӽ�("��ܴ��");
	for (int i = 0; i < ���Ա��� ; i  ++) {
		for(int ����=0; ����<���Ա���; ����++) {  
		����[����] = (int)(Math.random()*slot)+1;
	}
	for ( int j = 0; j < ���Ա��� ; j ++) { // ������ �� ����  ������ ����  
	
		���Թ迭[i][j] = ����[j];
		
	}
	
	}
	
	
	for(int a=0; a<���Ա���; a++) {

		for (int b=0; b<���Ա���; b++) {
					System.out.print(���Թ迭[a][b]);Thread.sleep(900);		
		}
		System.out.println("");
		
	}
	if(���Թ迭[0][0]==1&&���Թ迭[0][1]==1&&���Թ迭[0][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 100;
	}
	else if(���Թ迭[0][0]==2&&���Թ迭[0][1]==2&&���Թ迭[0][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 100; System.out.println("������!");
	}
	else if(���Թ迭[0][0]==3&&���Թ迭[0][1]==3&&���Թ迭[0][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==1&&���Թ迭[1][1]==1&&���Թ迭[1][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==2&&���Թ迭[1][1]==2&&���Թ迭[1][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[1][0]==3&&���Թ迭[1][1]==3&&���Թ迭[1][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==1&&���Թ迭[2][1]==1&&���Թ迭[2][2]==1) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==2&&���Թ迭[2][1]==2&&���Թ迭[2][2]==2) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	else if(���Թ迭[2][0]==3&&���Թ迭[2][1]==3&&���Թ迭[2][2]==3) {
		���ΰ�.��Ʈ����Ʈ += 100;  System.out.println("������!");
	}
	if(scount==3) {
		System.out.println("-----------------------------------");
		System.out.println("ȹ��������Ʈ : " + ���ΰ�.��Ʈ����Ʈ+ "/skip/");
		System.out.println("-----------------------------------");
		int ���Խ�ŵ2 = s.nextInt();
		scount = 0;
		break;
		
	}
		
			}
	
	�̺�Ʈ����2.close();
	
		
		
		
			
		
	
	���� �������3 = new ����("Day_of_Chaos.mp3", true);
	�������3.start();

	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("......?");Thread.sleep(500);
	System.out.println("���� �����?  /skip/");
	System.out.println("***********************************");Thread.sleep(500);
	int ��ŵ53 = s.nextInt();
	
	
	���� ����1 = new ����();
	Ÿ�̸� Ÿ�̸�2 = new Ÿ�̸�();
	Ÿ�̸�2.start();
	����1.start();
	
	while(true) {
			
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("         STAGE 3 - ���ο��");
	System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
	System.out.println("-----------------------------------");
	System.out.println("���ѽð� :" + Ÿ�̸�2.getŸ�̸�());
	System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
	if(���ΰ�.����ִ¾�����()==null) {
		System.out.println("����������  : ����");
	}else {
	System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.�ܼ�");
	System.out.println("2.������");
	System.out.println("3.��������Ʈ");
	System.out.println("4.���ѽð��߰�");
	System.out.println("-----------------------------------");
	System.out.println("5.Ż���ϱ�");
	System.out.println("6.���̹ڽ�");
	System.out.println("7.�ݰ�");
	System.out.println("8.������");
	System.out.println("9.Ź��");
	System.out.println("10.������");
	System.out.println("11.����");
	System.out.println("-----------------------------------");
	int ��������3 = s.nextInt();

	
	//��������  Ÿ�ӿ���
	if(Ÿ�̸�2.getŸ�̸�()==0) {
		�������3.close();
		����1.stop();	
		���� �������� = new ���� ("Lasting_Hope.mp3",  true);
		��������.start();
		while(true) {
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.println("�������� 3 - ���� "); 
			System.out.println("ȹ���� ������ "); 
			�κ��丮.�κ��丮���();
			System.out.println("ȹ���� ��Ʈ "); 
			��Ʈ.��Ʈ����Ʈ����();
			System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
			int ����1 = s.nextInt();
			
			if(����1==20) {
				break;
			}
		}
	}
	// �������� Ÿ�ӿ��� 
	
	
	
	//�ܼ�
	if(��������3==1) {
		��Ʈ.��Ʈ����Ʈ����();
		System.out.println("-----------------------------------");
		System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
		System.out.println("-----------------------------------");
		int ��Ʈ1 = s.nextInt();
	}
	
	
	//�����۸��
	if(��������3==2) {
		while(true) {
		�κ��丮.�κ��丮���();
		System.out.println("-----------------------------------");
		System.out.println("1.��������");
		System.out.println("2.�����ۼ���");
		System.out.println("3.�����۰���");
		System.out.println("4.�����ۺи�");
		System.out.println("-----------------------------------");
		int ������1 = s.nextInt();
		
		if(������1==1) {
			System.out.println("-----------------------------------");
			System.out.println("���ư��ϴ�.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(������1==2) {
			System.out.println("-----------------------------------");
			System.out.println("����� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۼ��� = s.next();
			
			if ("��ġ".equals(�����ۼ���)) {
				���ΰ�.����������("��ġ");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			} else if ("�����忭��".equals(�����ۼ���)) {
				���ΰ�.����������("�����忭��");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			}else if ("�ݰ���".equals(�����ۼ���)) {
				���ΰ�.����������("�ݰ���");
				System.out.println("-----------------------------------");
				System.out.println("�������� �����մϴ�.");
				System.out.println("-----------------------------------");
			}else {
				System.out.println("-----------------------------------");
				System.out.println("������ �� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		if(������1==3) {
			System.out.println("-----------------------------------");
			System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����۰���1 = s.next();
			String �����۰���2 = s.next();

				System.out.println("-----------------------------------");
				System.out.println("������ �� ���� �����Դϴ�.");
				System.out.println("-----------------------------------");		
		}
		if(������1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("�и��� �������� �̸��� �Է����ּ���.");
			System.out.println("-----------------------------------");
			String �����ۺи�1 = s.next();

			if("��������".equals(�����ۺи�1)) {
				if(��Ʈ.����==0) {
					
				System.out.println("������������������������������������");Thread.sleep(500);
				System.out.println("���ڿ� �����ִ� ����");Thread.sleep(500);
				System.out.println("������������������������������������");Thread.sleep(500);
				��Ʈ.��Ʈ�����("���ڿ� �����ִ� ����", 1);
				�κ��丮.��������("��������");
				���ΰ�.��Ʈ����Ʈ += 30;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 30 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (��Ʈ.����>0) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			
			if("�����ȼ�ø".equals(�����ۺи�1)) {
				if(��Ʈ.����==1) {
					
				System.out.println("������������������������������������");Thread.sleep(500);
				System.out.println("+1���� ����ΰ�?");Thread.sleep(500);
				System.out.println("������������������������������������");Thread.sleep(500);
				��Ʈ.��Ʈ�����("+1���� ����ΰ�?", 2);
				�κ��丮.��������("�����ȼ�ø");
				���ΰ�.��Ʈ����Ʈ += 30;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 30 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (��Ʈ.����>1) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			} if("õ��ġ".equals(�����ۺи�1)) {
				if(������.�����忭��==0) {
				�κ��丮.�����۸����("�����忭��", "2");
				�κ��丮.��������("�����忭��");
				�κ��丮.��������("õ��ġ");
				���ΰ�.��Ʈ����Ʈ += 30;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�����忭�踦 ȹ���Ͽ����ϴ�.");
				System.out.println("��Ʈ����Ʈ�� 30 �ö󰩴ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if (������.�����忭��>0) {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}else {
				System.out.println("-----------------------------------");
				System.out.println("�и��� �� �� ���� �������Դϴ�.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		}
		}
		
		//��������Ʈ
		if(��������3==3) {
			while(true) {
			��������Ʈ.��������Ʈ����Ʈ����();
			System.out.println("-----------------------------------");
			System.out.println("1.��������");
			System.out.println("2.��Ʈ����Ʈ - 100��");
			if(��������Ʈ.����==1) {
			System.out.println("3.��Ʈ����Ʈ - 1500��");
			}
			System.out.println("-----------------------------------");
			System.out.println("������ ��Ʈ�� Ȯ���ϼ���.");
			System.out.println("��Ʈ ����Ʈ�� ���� Ȯ�� �����մϴ�.");
			System.out.println("-----------------------------------");
			int ��Ʈ���� = s.nextInt();
			
			if(��Ʈ����==1) {
				System.out.println("-----------------------------------");
				System.out.println("���ư��ϴ�.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(��Ʈ����==2) {
				if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ>100) {
					���ΰ�.��Ʈ����Ʈ -= 100; 
				��������Ʈ.��������Ʈ�����("���������⵵ = ���糯¥ - ���", 1);
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("���ڳ��� + �����ȼ�ø����");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("-----------------------------------");
				System.out.println("��Ʈ����Ʈ�� - 100 �����˴ϴ�.");
				System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
				System.out.println("-----------------------------------");
				int ��������Ʈ1 = s.nextInt();
				}
				else if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ<100) {
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� �����մϴ�.  /skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ2 = s.nextInt();
				}
				else if(��������Ʈ.����>0) {
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("���ڳ��� + �����ȼ�ø����");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					int ��������Ʈ3 = s.nextInt();
				}
			}
			if(��Ʈ����==3) {
				if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ>1500) {
					���ΰ�.��Ʈ����Ʈ -= 1500; 
				��������Ʈ.��������Ʈ�����("���ڳ��� + �����ȼ�ø", 1);
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("Ż�� ��й�ȣ�� 922312");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("-----------------------------------");
				System.out.println("��Ʈ����Ʈ�� - 1500 �����˴ϴ�.");
				System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
				System.out.println("-----------------------------------");
				int ��������Ʈ4 = s.nextInt();
				}
				else if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ<1500) {
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� �����մϴ�. /skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ5 = s.nextInt();
				}
				else if(��������Ʈ.����>1) {
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("Ż�� ��й�ȣ�� 922312");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					int ��������Ʈ6 = s.nextInt();
				}
			}
			
			}
		}
		//��������Ʈ
		
		//���ѽð��߰�
		if(��������3==4) {
			while(true) {
			Ÿ�̸�2.get����();
			System.out.println("-----------------------------------");
			System.out.println("���ѽð��� �߰��� �� �ֽ��ϴ�.");
			System.out.println("-----------------------------------");
			System.out.println("  ���ѽð�        ��Ʈ����Ʈ");
			System.out.println("1. ��������");
			System.out.println("2. 50         100");
			System.out.println("3. 100        200");
			System.out.println("-----------------------------------");
			int ���ѽð� = s.nextInt(); 
			
			if(���ѽð�==1) {
				break;
			}
			
			if(���ѽð�==2) {
				if(���ΰ�.��Ʈ����Ʈ>=100) {
					���ΰ�.��Ʈ����Ʈ -= 100; 
					Ÿ�̸�2.setŸ�̸�(Ÿ�̸�2.Ÿ�̸�+50);
					System.out.println("-----------------------------------");
					System.out.println("���ѽð��� 50 �߰��մϴ�.");
					System.out.println("-----------------------------------");
				}else if(���ΰ�.��Ʈ����Ʈ<100) {
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
					System.out.println("-----------------------------------");
				}
				
			}
			
			if(���ѽð�==3) {
				if(���ΰ�.��Ʈ����Ʈ>=200) {
					���ΰ�.��Ʈ����Ʈ -= 200; 
					Ÿ�̸�2.setŸ�̸�(Ÿ�̸�2.Ÿ�̸� + 100);
					System.out.println("-----------------------------------");
					System.out.println("���ѽð��� 100 �߰��մϴ�.");
					System.out.println("-----------------------------------");
				}else if(���ΰ�.��Ʈ����Ʈ<200) {
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
					System.out.println("-----------------------------------");
				}
				
			}
			
			}
		}
		//���ѽð��߰�
		
		//Ż���ϱ�
		if(��������3==5) {

			���ΰ�.��������������("���");
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�. ");
			System.out.println("��й�ȣ�� �Է��ϼ���. ");
			System.out.println("-----------------------------------");
			int ��й�ȣ = s.nextInt();
			
			if(��й�ȣ==922312) {
				���ΰ�.��������Ż��("Ż��");
				Ÿ�̸�2.stop();
				����1.stop();
				System.out.println("-----------------------------------");
				System.out.println("���Ƚ��ϴ�.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(��й�ȣ!=922312) {
				 try
				 {
				 AudioInputStream ais12 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\psxx.wav"));
				Clip clip12 = AudioSystem.getClip();
				clip12.stop();
				clip12.open(ais12);
				clip12.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				System.out.println("-----------------------------------");
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int Ż��3 = s.nextInt();
			}
		}
		//���̹ڽ�
		if(��������3==6) {
			����������.���������۸����("��ì��",1);
			System.out.println("-----------------------------------");
			System.out.println("����ֽ��ϴ�. /skip/");
			System.out.println("-----------------------------------");
			int ���̹ڽ� = s.nextInt();
		}
		
		//�ݰ�
		if(��������3==7) {
			
			if("�ݰ���".equals(���ΰ�.����ִ¾�����())) {
			if(������.�����ȼ�ø==0) {
				�κ��丮.�����۸����("�����ȼ�ø", "5");
				�κ��丮.��������("�����ȼ�ø");
				������.�����ȼ�ø += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�����ȼ�ø�� ȹ���Ͽ����ϴ�. /skip/");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				int �ݰ�1 = s.nextInt();
			}else if(������.�����ȼ�ø>0) {
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int �ݰ�2 = s.nextInt();
			}
			
			}else {
				���ΰ�.��������������("���");
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int �ݰ�3 = s.nextInt();
			}
			
		} //�ݰ� 
		
		//������
		if(��������3==8) {
			if(������.õ��ġ==0) {
				�κ��丮.�����۸����("õ��ġ", "4");
				�κ��丮.��������("õ��ġ");
				������.õ��ġ += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("õ��ġ�� ȹ���Ͽ����ϴ�. /skip/");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				int ������1 = s.nextInt();
			}
			if(������.õ��ġ>0) {
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int ������2 = s.nextInt();
			}
		}
		
		//Ź��
		if(��������3==9) {
			while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.��������");
			if(������.��������==0) {
			System.out.println("2.����");
			}
			if(������.�ݰ���==0) {
			System.out.println("3.�ɺ�");}
			System.out.println("-----------------------------------");
			int Ź�� = s.nextInt();
			
			if(Ź��==1) {
				break;
			}
			
			//����
			if(Ź��==2) {
			if(������.��������==0) {
			�κ��丮.�����۸����("��������", "2");
			�κ��丮.��������("��������");
			������.�������� += 1;
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");	
			System.out.println("������ ȹ���Ͽ����ϴ�. /skip/ ");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			int ����1 = s.nextInt();
			
			}
			
			}//����
			
		if(Ź��==3) {
			if(������.�ݰ���==0) {
			if("��ġ".equals(���ΰ�.����ִ¾�����())) {
				try
				 {
				 AudioInputStream ais3 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\windowbroke.wav"));
				Clip clip3 = AudioSystem.getClip();
				clip3.stop();
				clip3.open(ais3);
				clip3.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				�κ��丮.�����۸����("�ݰ���", "3");
				�κ��丮.��������("�ݰ���");
				������.�ݰ��� += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");	
				System.out.println("�ݰ��踦 ȹ���Ͽ����ϴ�. ");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				int �ɺ�1 = s.nextInt();
			}else {
				System.out.println("-----------------------------------");
				System.out.println("�ɺ��Դϴ�. /skip/");
				System.out.println("-----------------------------------");
				int �ɺ�2 = s.nextInt();
			}
			}
		
		}
			
			}//while
		}
		
		//������
		if(��������3==10) {
			if("�����忭��".equals(���ΰ�.����ִ¾�����())) {
				try
				 {
				 AudioInputStream ais3 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\boxopen.wav"));
				Clip clip3 = AudioSystem.getClip();
				clip3.stop();
				clip3.open(ais3);
				clip3.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				if(������.��ġ==0) {
					
				�κ��丮.�����۸����("��ġ", "1");
				�κ��丮.��������("��ġ");
				������.��ġ += 1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");	
				System.out.println("��ġ�� ȹ���Ͽ����ϴ�. /skip/");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				int ������1 =s.nextInt();
				}
				else if (������.��ġ>0) {
					System.out.println("-----------------------------------");
					System.out.println("����ֽ��ϴ�. /skip/");
					System.out.println("-----------------------------------");
					int ������2 =s.nextInt();
				}
			}else {
				���ΰ�.��������������("���");
				System.out.println("-----------------------------------");
				System.out.println("��� �ֽ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int ������3 =s.nextInt();
			}
			
		}
		
		//����
		if(��������3==11) {
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("�λ��� ������ 9ȸ�� 2�ƿ� 2��Ʈ��ũ 3��ó��...");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("-----------------------------------");
			System.out.println("���� �Դϴ�. /skip/");
			System.out.println("-----------------------------------");
			int ���� = s.nextInt();
		}
		
		
		
		//�������Ե�Ŵ ���ӿ���
		if(����1.üũ==1) {
			�������3.close();
			Ÿ�̸�2.stop();
			���� ��������1 = new ���� ("Lasting_Hope.mp3",  true);
			��������1.start();
			����1.setŸ�̹�(2);
			while(true) {
				
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("�������� 3 - ���� "); 
				System.out.println("ȹ���� ������ "); 
				�κ��丮.�κ��丮���();
				System.out.println("ȹ���� ��Ʈ "); 
				��Ʈ.��Ʈ����Ʈ����();
				System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				int ����1 = s.nextInt();
				
				if(����1==20) {
					break;
				}
		}
		}
		//�������Ե��� ���ӿ���  
		
		
	}//while
	//�����۸�� 
	
	
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("��......���Դ�......");Thread.sleep(500);
	System.out.println("��� ��ø�� ����� �� �����ִ�!");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
	System.out.println("��Ʈ�� ȹ���Ͽ����ϴ�.");
	System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
	System.out.println("-----------------------------------");
	System.out.println("���� ���������� �̵��մϴ�. /skip/");
	System.out.println("-----------------------------------");
	int ��ŵ44 = s.nextInt();
	
	
	
	
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("         STAGE 3 - ��� ");
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("-----------------------------------");
	System.out.println("ȹ���� ������ "); 
	�κ��丮.�κ��丮���();
	System.out.println("ȹ���� ��Ʈ "); 
	��Ʈ.��Ʈ����Ʈ����();
	���ΰ�.��Ʈ����Ʈ += 500;
	���ΰ�.��Ʈ����Ʈ += Ÿ�̸�2.getŸ�̸�();
	System.out.println("���� ��Ʈ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
	System.out.println("-----------------------------------");
	
	
	int ��ŵ6 = s.nextInt();
	
	�κ��丮.��������("��ġ");
	�κ��丮.��������("�����ȼ�ø");
	�κ��丮.��������("��������");
	�κ��丮.��������("�����忭��");
	�κ��丮.��������("�ݰ���");
	�κ��丮.��������("õ��ġ");
	��Ʈ.��Ʈ�����("�����", 10);
	��������Ʈ.��������Ʈ�����("�����", 10);
	����������.���������������("����", 10);
	�������3.close();
	
	
	���� �̺�Ʈ����3 = new ����("Micro.mp3", true);
	�̺�Ʈ����3.start();

	��Ʈ.��Ʈ�����("���Ű� ����Ƿ� ���ÿ�.", 1);

	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("          EVENT - ���� ");
	System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
	System.out.println("---------------------------------");
	System.out.println("����Ʈ�� �ɰ� �¹��и� ���纸����.");
	System.out.println("���߸� 2��� �����޽��ϴ�.");
	System.out.println("3���� ��Ⱑ �غ����Դϴ�.");
	System.out.println("---------------------------------");
	System.out.println("���纸���� ����Ʈ : "+ ���ΰ�.��Ʈ����Ʈ);
	System.out.print("����� �ݾ�:");
	int toto = s.nextInt(); 
	
	���ΰ�.��Ʈ����Ʈ -= toto;

	
	System.out.println("---------------------------------");	
	System.out.println("���� vs ����Ǯ");
	System.out.println("1. ���� ��");
	System.out.println("2. ����Ǯ ��");
	System.out.println("3. ���º� ");
	System.out.println("---------------------------------");
	int to1 = s.nextInt();
	
	// ����1���϶�
	if(to1==1) {
		
		���� += random.nextInt(3);
		����Ǯ += random.nextInt(3);
		if(����>����Ǯ) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("������ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �¸��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");	
		}else if (����<����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");	
		} else if (����==����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ��"+����+":"+����Ǯ+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");	
		}	
	}// ����1����
	
	if(to1==2) {
		���� += random.nextInt(3);
		����Ǯ += random.nextInt(3);
		if(����>����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �¸��մϴ�.");
			System.out.println("---------------------------------");	
		}else if (����<����Ǯ) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("������ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �й��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");	
		} else if (����==����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ��"+����+":"+����Ǯ+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");	
		}	
	}
	if(to1==3) {
		���� += random.nextInt(3);
		����Ǯ += random.nextInt(3);
		if(����>����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �¸��մϴ�.");
		
			System.out.println("---------------------------------");	
		}else if (����<����Ǯ) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ����Ǯ����"+����+":"+����Ǯ+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");	
		} else if (����==����Ǯ) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("������ϴ�!");
			System.out.println("������ ����Ǯ��"+����+":"+����Ǯ+"���ھ�� ���º��Դϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");	
		}	
	}  //���� 1 
	
	
	
	System.out.println("---------------------------------");	
	System.out.println("ÿ�� vs ����");
	System.out.println("1. ÿ�� ��");
	System.out.println("2. ���� ��");
	System.out.println("3. ���º� ");
	System.out.println("---------------------------------");	
	
	int to2 = s.nextInt();

	// ����2���϶�
	if(to2==1) {
		
		���� += random.nextInt(3);
		ÿ�� += random.nextInt(5);
		if(����>ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �¸��մϴ�.");
			System.out.println("---------------------------------");	
		}else if (����<ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("������ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �й��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	

		} else if (����==ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ð� "+����+":"+ÿ��+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");	
		}	
	}// ����1����
	
	if(to2==2) {
		���� += random.nextInt(3);
		ÿ�� += random.nextInt(5);
		if(����>ÿ��) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("������ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �¸��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");	
		}else if (����<ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");	
		} else if (����==ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ð� "+����+":"+ÿ��+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");	
		}	
	}
	if(to2==3) {
		���� += random.nextInt(3);
		ÿ�� += random.nextInt(5);
		if(����>ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �¸��մϴ�.");
			System.out.println("---------------------------------");	
		}else if (����<ÿ��) {
			System.out.println("---------------------------------");	
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������ ÿ�ÿ���"+����+":"+ÿ��+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");	
		} else if (����==ÿ��) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("������ϴ�!");
			System.out.println("������ ÿ�ð� "+����+":"+ÿ��+"���ھ�� ���º��Դϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");	
		}	
	}//����2 
	
	
	System.out.println("---------------------------------");
	System.out.println("��Ʈ�� vs ������");
	System.out.println("1. ��Ʈ�� ��");
	System.out.println("2. ������ ��");
	System.out.println("3. ���º� ");
	System.out.println("---------------------------------");
	
	int to3 = s.nextInt();

	// ����3���϶�
	if(to3==1) {
		
		������ += random.nextInt(2);
		��Ʈ�� += random.nextInt(3);
		if(������>��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �¸��մϴ�.");
			System.out.println("---------------------------------");
		}else if (������<��Ʈ��) {
			System.out.println("---------------------------------");
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("������ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �й��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");
		} else if (������==��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������� ��Ʈ���� "+������+":"+��Ʈ��+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");
		}	
		
	}
	
	if(to3==2) {
		������ += random.nextInt(2);
		��Ʈ�� += random.nextInt(3);
		if(������>��Ʈ��) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("������ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �¸��մϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");
		}else if (������<��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");
		} else if (������==��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("������� ��Ʈ���� "+������+":"+��Ʈ��+"���ھ�� ���º��Դϴ�.");
			System.out.println("---------------------------------");
		}	
		
	}
	if(to3==3) {
		������ += random.nextInt(2);
		��Ʈ�� += random.nextInt(3);
		if(������>��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �¸��մϴ�.");
			System.out.println("---------------------------------");
		}else if (������<��Ʈ��) {
			System.out.println("---------------------------------");
			System.out.println("Ʋ�Ƚ��ϴ�!");
			System.out.println("�����尡 ��Ʈ�ѿ���"+������+":"+��Ʈ��+"���ھ�� �й��մϴ�.");
			System.out.println("---------------------------------");
		} else if (������==��Ʈ��) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("������ϴ�!");
			System.out.println("������� ��Ʈ���� "+������+":"+��Ʈ��+"���ھ�� ���º��Դϴ�.");
			���ΰ�.��Ʈ����Ʈ += toto*2;
			System.out.println("---------------------------------");
		}
	}//����3
	
	System.out.println("������ ����Ʈ : "+���ΰ�.��Ʈ����Ʈ+ "   /skip/");
	int ��ŵ = s.nextInt();
	try
	 {
	 AudioInputStream ais10 = 
	AudioSystem.getAudioInputStream
	(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\door-open-7.wav"));
	Clip clip10 = AudioSystem.getClip();
	clip10.stop();
	clip10.open(ais10);
	clip10.start();
	 }
	 catch (Exception ex)
	 {
	  } 
	
		�̺�Ʈ����3.stop();
		
		���� �������4 = new ����("Day_of_Chaos.mp3", true);
		�������4.start();
		���� ����2 = new ����(); 
		Ÿ�̸� Ÿ�̸�3 = new Ÿ�̸�();
		Ÿ�̸�3.start();
		����2.start();
		��ȭ ��ȭ1 = new ��ȭ();
		��ȭ1.start();
		
		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("������̴�......");Thread.sleep(500); ���ΰ�.��������������("���");
		System.out.println("���� ������ ����....../skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int ��ŵ8 = s.nextInt();
		System.out.println(��ȭ1.üũ);
	
		
		while(true) {	
			
			
			
			
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("         STAGE 4-1  �����");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("-----------------------------------");
		System.out.println("���ѽð� :" + Ÿ�̸�3.getŸ�̸�());
		System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
		if(���ΰ�.����ִ¾�����()==null) {
			System.out.println("����������  : ����");
		}else {
		System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.�ܼ�");
		System.out.println("2.������");
		System.out.println("3.��������Ʈ");
		System.out.println("4.���ѽð��߰�");
		System.out.println("-----------------------------------");
		System.out.println("5.���ư���");
		System.out.println("6.������");
		System.out.println("7.����");
		System.out.println("8.������");
		System.out.println("9.�����å��");
		System.out.println("10.���� ��");
		System.out.println("-----------------------------------");
		int ��������4 = s.nextInt();
		
	
		
		
		//��������  Ÿ�ӿ���
		if(Ÿ�̸�3.getŸ�̸�()==0) {
			�������4.close();
			����2.stop();	
			���� �������� = new ���� ("Lasting_Hope.mp3",  true);
			��������.start();
			while(true) {
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("�������� 3 - ���� "); 
				System.out.println("ȹ���� ������ "); 
				�κ��丮.�κ��丮���();
				System.out.println("ȹ���� ��Ʈ "); 
				��Ʈ.��Ʈ����Ʈ����();
				System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				int ����1 = s.nextInt();
				
				if(����1==20) {
					break;
				}
			}
		}
		// �������� Ÿ�ӿ��� 
		
		
		
		//�ܼ�
		if(��������4==1) {
			��Ʈ.��Ʈ����Ʈ����();
			System.out.println("-----------------------------------");
			System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
			System.out.println("-----------------------------------");
			int ��Ʈ1 = s.nextInt();
		}
		
		
		//�����۸��
		if(��������4==2) {
			while(true) {
			�κ��丮.�κ��丮���();
			System.out.println("-----------------------------------");
			System.out.println("1.��������");
			System.out.println("2.�����ۼ���");
			System.out.println("3.�����۰���");
			System.out.println("4.�����ۺи�");
			System.out.println("-----------------------------------");
			int ������1 = s.nextInt();
			
			if(������1==1) {
				System.out.println("-----------------------------------");
				System.out.println("���ư��ϴ�.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(������1==2) {
				System.out.println("-----------------------------------");
				System.out.println("����� �������� �̸��� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����ۼ��� = s.next();
				
				if ("�ش�Į".equals(�����ۼ���)) {
					���ΰ�.����������("�ش�Į");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
			}
			if(������1==3) {
				System.out.println("-----------------------------------");
				System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����۰���1 = s.next();
				String �����۰���2 = s.next();
				
				if("�ش�".equals(�����۰���1)&&"Į��".equals(�����۰���2)) {
					�κ��丮.�����۸����("�ش�Į", "1");
					�κ��丮.��������("�ش�Į");
					������.�ش�Į += 1;
					���ΰ�.��Ʈ����Ʈ += 20;
					�κ��丮.��������("�ش�");
					�κ��丮.��������("Į��");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ش�Į�� ����� �� �ֽ��ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if ("�ش�".equals(�����۰���1)&&"Į��".equals(�����۰���2)) {
					�κ��丮.�����۸����("�ش�Į", "1");
					�κ��丮.��������("�ش�Į");
					������.�ش�Į += 1;
					���ΰ�.��Ʈ����Ʈ += 20;
					�κ��丮.��������("�ش�");
					�κ��丮.��������("Į��");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ش�Į�� ����� �� �ֽ��ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 20 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("������ �� ���� �����Դϴ�.");
					System.out.println("-----------------------------------");
				}
				
					System.out.println("-----------------------------------");
					System.out.println("������ �� ���� �����Դϴ�.");
					System.out.println("-----------------------------------");		
			}
			if(������1==4) {
				
				System.out.println("-----------------------------------");
				System.out.println("�и��� �������� �̸��� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����ۺи�1 = s.next();

				if("�ʱ�������".equals(�����ۺи�1)) {
					if(��Ʈ.����==0) {
						
					System.out.println("������������������������������������");Thread.sleep(500);
					System.out.println("LOSE ��� �ܾ ����϶�.");Thread.sleep(500);
					System.out.println("������������������������������������");Thread.sleep(500);
					��Ʈ.��Ʈ�����("LOSE��� �ܾ ����϶�.", 1);
					�κ��丮.��������("�ʱ�������");
					���ΰ�.��Ʈ����Ʈ += 30;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 30 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}else if (��Ʈ.����>0) {
						System.out.println("-----------------------------------");
						System.out.println("�и��� �������Դϴ�.");
						System.out.println("-----------------------------------");
					}
				}
				
				if("��Ʈ����".equals(�����ۺи�1)) {
					if(��Ʈ.����==1) {
						
					System.out.println("������������������������������������");Thread.sleep(500);
					System.out.println("LOSE�� �ٸ�������..");Thread.sleep(500);
					System.out.println("������������������������������������");Thread.sleep(500);
					��Ʈ.��Ʈ�����("LOSE�� �ٸ�������..", 2);
					�κ��丮.��������("��Ʈ����");
					���ΰ�.��Ʈ����Ʈ += 30;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 30 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}else if (��Ʈ.����>1) {
						System.out.println("-----------------------------------");
						System.out.println("�и��� �������Դϴ�.");
						System.out.println("-----------------------------------");
					}
				} else {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �� �� ���� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			}
			}
			
			//��������Ʈ
			if(��������4==3) {
				while(true) {
				��������Ʈ.��������Ʈ����Ʈ����();
				System.out.println("-----------------------------------");
				System.out.println("1.��������");
				System.out.println("2.��Ʈ����Ʈ - 200��");
				if(��������Ʈ.����==1) {
				System.out.println("3.��Ʈ����Ʈ - 2000��");
				}
				System.out.println("-----------------------------------");
				System.out.println("������ ��Ʈ�� Ȯ���ϼ���.");
				System.out.println("��Ʈ ����Ʈ�� ���� Ȯ�� �����մϴ�.");
				System.out.println("-----------------------------------");
				int ��Ʈ���� = s.nextInt();
				
				if(��Ʈ����==1) {
					System.out.println("-----------------------------------");
					System.out.println("���ư��ϴ�.");
					System.out.println("-----------------------------------");
					break;
				}
				
				if(��Ʈ����==2) {
					if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ>200) {
						���ΰ�.��Ʈ����Ʈ -= 200; 
					��������Ʈ.��������Ʈ�����("LOSE�Ųٷ� ����?", 1);
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("LOSE �Ųٷ� ���� ?");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� - 100 �����˴ϴ�.");
					System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ1 = s.nextInt();
					}
					else if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ<200) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�.  /skip/");
						System.out.println("-----------------------------------");
						int ��������Ʈ2 = s.nextInt();
					}
					else if(��������Ʈ.����>0) {
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("LOSE �Ųٷ� ���� ?  /skip/");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						int ��������Ʈ3 = s.nextInt();
					}
				}
				if(��Ʈ����==3) {
					if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ>2000) {
						���ΰ�.��Ʈ����Ʈ -= 2000; 
					��������Ʈ.��������Ʈ�����("LOSE�� �������� 3507", 2);
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("LOSE�� �������� 3507�̴� /skip/");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� - 1500 �����˴ϴ�.");
					System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ4 = s.nextInt();
					}
					else if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ<2000) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�. /skip/");
						System.out.println("-----------------------------------");
						int ��������Ʈ5 = s.nextInt();
					}
					else if(��������Ʈ.����>1) {
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("LOSE�� �����̸� 3507�̴�.  /skip/");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						int ��������Ʈ6 = s.nextInt();
					}
				}
				
				}
			}
			//��������Ʈ
			
			//���ѽð��߰�
			if(��������4==4) {
				while(true) {
				Ÿ�̸�3.get����();
				System.out.println("-----------------------------------");
				System.out.println("���ѽð��� �߰��� �� �ֽ��ϴ�.");
				System.out.println("-----------------------------------");
				System.out.println("  ���ѽð�        ��Ʈ����Ʈ");
				System.out.println("1. ��������");
				System.out.println("2. 50         100");
				System.out.println("3. 100        200");
				System.out.println("-----------------------------------");
				int ���ѽð� = s.nextInt(); 
				
				if(���ѽð�==1) {
					break;
				}
				
				if(���ѽð�==2) {
					if(���ΰ�.��Ʈ����Ʈ>=100) {
						���ΰ�.��Ʈ����Ʈ -= 100; 
						Ÿ�̸�3.setŸ�̸�(Ÿ�̸�3.Ÿ�̸�+50);
						System.out.println("-----------------------------------");
						System.out.println("���ѽð��� 50 �߰��մϴ�.");
						System.out.println("-----------------------------------");
					}else if(���ΰ�.��Ʈ����Ʈ<100) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
						System.out.println("-----------------------------------");
					}
					
				}
				
				if(���ѽð�==3) {
					
					if(���ΰ�.��Ʈ����Ʈ>=200) {
						���ΰ�.��Ʈ����Ʈ -= 200; 
						Ÿ�̸�3.setŸ�̸�(Ÿ�̸�3.Ÿ�̸� + 100);
						System.out.println("-----------------------------------");
						System.out.println("���ѽð��� 100 �߰��մϴ�.");
						System.out.println("-----------------------------------");
					}else if(���ΰ�.��Ʈ����Ʈ<200) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�.");
						System.out.println("-----------------------------------");
					}
					
				}
				
				}
			}
			//���ѽð��߰�
			
			//���ư���
			if(��������4==5) {
				System.out.println("-----------------------------------");
				System.out.println("���� ����ֽ��ϴ�. /skip/");
				System.out.println("-----------------------------------");
				int ���ư��� = s.nextInt();
			}
			
			//������ 
			if(��������4==6) {
				if(������.�ش�==0) {
					�κ��丮.�����۸����("�ش�", "1");
					�κ��丮.��������("�ش�");
					������.�ش� += 1;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ش븦 ȹ���Ͽ����ϴ�. /skip/");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					int ������1 = s.nextInt();
					
				}
				else if(������.Į��>0) {
					System.out.println("-----------------------------------");
					System.out.println("�������Դϴ�.. /skip/");
					System.out.println("-----------------------------------");
					int ������2 = s.nextInt();
				}
				
			}
			
			//����
			if(��������4==7) {
				if(������.Į��==0) {
					�κ��丮.�����۸����("Į��", "1");
					�κ��丮.��������("Į��");
					������.Į�� += 1;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("Į���� ȹ���Ͽ����ϴ�. /skip/");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					int ����1 = s.nextInt();
					
				}
				else if(������.Į��>0) {
					System.out.println("-----------------------------------");
					System.out.println("�����Դϴ�.. /skip/");
					System.out.println("-----------------------------------");
					int ����2 = s.nextInt();
				}
			}
			
			//������
			if(��������4==8) {
				
				
				if("�ش�Į".equals(���ΰ�.����ִ¾�����())) {
					
					if(������.��Ʈ����==0) {
					�κ��丮.�����۸����("��Ʈ����", "1");
					�κ��丮.��������("��Ʈ����");
					������.��Ʈ���� += 1;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("��Ʈ������ ȹ���Ͽ����ϴ�. /skip/");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					int �˼�����������1 = s.nextInt();
					}else if(������.��Ʈ����>0) {
						System.out.println("-----------------------------------");
						System.out.println("������ �������Դϴ�. /skip/");
						System.out.println("-----------------------------------");
						int �˼�����������2 = s.nextInt();
					}

				}else {
					if(������.��Ʈ����==0) {
					System.out.println("-----------------------------------");
					System.out.println("�� �� ���� �������Դϴ�. /skip/");
					System.out.println("-----------------------------------");
				int �˼����������� = s.nextInt();
					}
					else if(������.��Ʈ����>0) {
						System.out.println("-----------------------------------");
						System.out.println("������ �������Դϴ�. /skip/");
						System.out.println("-----------------------------------");
						int �˼�����������4 = s.nextInt();
					}
				}
			}
			
			//�����å��
			if(��������4==9) {
				while(true) {
				System.out.println("-----------------------------------");
				System.out.println("1.��������");
				System.out.println("2.��ȭ��");
				System.out.println("-----------------------------------");
				int �����å�� = s.nextInt();
				
				if(�����å��==1) {
					break;
				}
				
				if(�����å��==2) {

					if(������.�ʱ�������==0) {
					if(��ȭ1.üũ==0) {
						System.out.println("-----------------------------------");
						System.out.println("��ȭ���Դϴ�.");
						System.out.println("-----------------------------------");
					}
					else if(��ȭ1.üũ==1) {
						�κ��丮.�����۸����("�ʱ�������", "1");
						�κ��丮.��������("�ʱ�������");
						������.�ʱ������� += 1;
						��ȭ1.stop();
						��ȭ1.üũ = 0;
						System.out.println("***********************************");Thread.sleep(500);
						System.out.println("���մϴ� �޾���������......");Thread.sleep(500);
						System.out.println("����� ��� ���Ѻ��� �ֽ��ϴ�......");Thread.sleep(500); 
						System.out.println("�ǵ��Ƽ� ���� ���� �����̴ϴ�......");Thread.sleep(500); 
						System.out.println("������ ��й�ȣ�� LOSE......");Thread.sleep(500);
						System.out.println("......?......");Thread.sleep(500);
						System.out.println("***********************************");Thread.sleep(500);
						System.out.println("-----------------------------------");
						System.out.println("��ȭ�� ������ϴ�.");
						System.out.println("-----------------------------------");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("�ʱ��������� ȹ���Ͽ����ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						int ��ȭ�� = s.nextInt();
					}
					}
					else if(������.�ʱ�������>0) {
						System.out.println("-----------------------------------");
						System.out.println("��ȭ���Դϴ�.");
						System.out.println("-----------------------------------");
					}
				}
				
				
				}
			}
			
			//�ٸ���
			if(��������4==10) {
				
				���ΰ�.��������������("���");
				System.out.println("-----------------------------------");
				System.out.println("����ֽ��ϴ�. ");
				System.out.println("��й�ȣ�� �Է��ϼ���. ");
				System.out.println("-----------------------------------");
				int ��й�ȣ1 = s.nextInt();
				
				if(��й�ȣ1==3507) {
					���ΰ�.��������Ż��("Ż��");
					Ÿ�̸�3.stop();
					����2.stop();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("Ż�⿡ �����մϴ�.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				
				if(��й�ȣ1!=3507) {
					 try
					 {
					 AudioInputStream ais12 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\psxx.wav"));
					Clip clip12 = AudioSystem.getClip();
					clip12.stop();
					clip12.open(ais12);
					clip12.start();
					 }
					 catch (Exception ex)
					 {
					  } 
					System.out.println("-----------------------------------");
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. /skip/");
					System.out.println("-----------------------------------");
					int Ż��4 = s.nextInt();
				}
			}
			
			//�������Ե�Ŵ ���ӿ���
			if(����2.üũ==1) {
				�������4.close();
				Ÿ�̸�3.stop();
				���� ��������1 = new ���� ("Lasting_Hope.mp3",  true);
				��������1.start();
				����2.setŸ�̹�(2);
				while(true) {
					
					System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
					System.out.println("�������� 3 - ���� "); 
					System.out.println("ȹ���� ������ "); 
					�κ��丮.�κ��丮���();
					System.out.println("ȹ���� ��Ʈ "); 
					��Ʈ.��Ʈ����Ʈ����();
					System.out.println("ȹ���� ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
					System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
					int ����1 = s.nextInt();
					
					if(����1==20) {
						break;
					}
			}
			}
			//�������Ե��� ���ӿ���  
			
			
				
	}//while
	
		
		
		
		
		
		
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("         STAGE 4-1  ��� ");
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("-----------------------------------");
		System.out.println("ȹ���� ������ "); 
		�κ��丮.�κ��丮���();
		System.out.println("ȹ���� ��Ʈ "); 
		��Ʈ.��Ʈ����Ʈ����();
		���ΰ�.��Ʈ����Ʈ += 300;
		���ΰ�.��Ʈ����Ʈ += Ÿ�̸�3.getŸ�̸�();
		System.out.println("���� ��Ʈ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
		System.out.println("-----------------------------------");
		
		
		int ��ŵ16 = s.nextInt();
		
		�κ��丮.��������("�ش�");
		�κ��丮.��������("Į��");
		�κ��丮.��������("�ش�Į");
		�κ��丮.��������("��Ʈ����");
		�κ��丮.��������("�ʱ�������");
		��Ʈ.��Ʈ�����("�����", 10);
		��������Ʈ.��������Ʈ�����("�����", 10);
		����������.���������������("����", 10);
		
		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("���� �׳� ������ݾ�?");Thread.sleep(500);
		System.out.println("�ٴ� ���� �� ����� �Ѱ���?");Thread.sleep(500); 
		System.out.println("�׷��� �ѹ� ������߰ڴ�. /skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int ��������42 = s.nextInt();
		
		while(true) {
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("          STAGE 4-2 ������ ");
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("-----------------------------------");
		System.out.println("���ѽð� : ����");
		System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
		if(���ΰ�.����ִ¾�����()==null) {
			System.out.println("����������  : ����");
		}else {
		System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.�ܼ�");
		System.out.println("2.������");
		System.out.println("3.��������Ʈ");
		System.out.println("4.���ѽð��߰�");
		System.out.println("---------------------------------");
		System.out.println("5.���� ��");
		System.out.println("6.���� ��");
		System.out.println("7.������ ��");
		if(������.��������==0) {
		System.out.println("8.����");}
		if(������.������==0) {
		System.out.println("9.������");}
		if(������.������==0) {
		System.out.println("10.������");}
		
		System.out.println("---------------------------------");
		int ������ = s.nextInt();

		//�ܼ�
		if(������==1) {
			��Ʈ.��Ʈ����Ʈ����();
			System.out.println("-----------------------------------");
			System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
			System.out.println("-----------------------------------");
			int ��Ʈ1 = s.nextInt();
		}
		
		
		//�����۸��
		if(������==2) {
			while(true) {
			�κ��丮.�κ��丮���();
			System.out.println("-----------------------------------");
			System.out.println("1.��������");
			System.out.println("2.�����ۼ���");
			System.out.println("3.�����۰���");
			System.out.println("4.�����ۺи�");
			System.out.println("-----------------------------------");
			int ������1 = s.nextInt();
			
			if(������1==1) {
				System.out.println("-----------------------------------");
				System.out.println("���ư��ϴ�.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(������1==2) {
				System.out.println("-----------------------------------");
				System.out.println("����� �������� �̸��� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����ۼ��� = s.next();
				
				if ("��������".equals(�����ۼ���)) {
					���ΰ�.����������("��������");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				}else if ("������".equals(�����ۼ���)) {
					���ΰ�.����������("������");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
			}
			if(������1==3) {
				System.out.println("-----------------------------------");
				System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����۰���1 = s.next();
				String �����۰���2 = s.next();
				
				if("��������".equals(�����۰���1)&&"������".equals(�����۰���2)) {
					�κ��丮.�����۸����("��������", "1");
					�κ��丮.��������("��������");
					������.�������� += 1;
					�κ��丮.��������("��������");
					�κ��丮.��������("������");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ش�Į�� ����� �� �ֽ��ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if ("������".equals(�����۰���1)&&"��������".equals(�����۰���2)) {
					�κ��丮.�����۸����("��������", "1");
					�κ��丮.��������("��������");
					������.�������� += 1;
					�κ��丮.��������("��������");
					�κ��丮.��������("������");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ش�Į�� ����� �� �ֽ��ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("������ �� ���� �����Դϴ�.");
					System.out.println("-----------------------------------");
				}
				
					System.out.println("-----------------------------------");
					System.out.println("������ �� ���� �����Դϴ�.");
					System.out.println("-----------------------------------");		
			}
			if(������1==4) {
					System.out.println("-----------------------------------");
					System.out.println("�и� �������� �����ϴ�.");
					System.out.println("-----------------------------------");
			}
			
			
			}
			}
			
			//��������Ʈ
			if(������==3) {
				System.out.println("-----------------------------------");
				System.out.println("��������Ʈ�� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
			//��������Ʈ
			
			//���ѽð��߰�
			if(������==4) {
				System.out.println("-----------------------------------");
				System.out.println("���ѽð��� �����ϴ�.");
				System.out.println("-----------------------------------");
			}
		
		
		//���麮 
		if(������==5) {
			System.out.println("-----------------------------------");
			System.out.println("���Դϴ�.");
			System.out.println("-----------------------------------");
		}
		
		//���ʺ�
		if(������==6) {
			if("��������".equals(���ΰ�.����ִ¾�����())) {
				System.out.println("-----------------------------------");
				System.out.println("�к��� ��鸳�ϴ�.");
				System.out.println("������ ƴ���� �ٶ��� ���̳��ɴϴ�. /skip/");
				System.out.println("-----------------------------------");
				int ���ʺ� = s.nextInt();
				
			}
			
			else if("������".equals(���ΰ�.����ִ¾�����())) {
				System.out.println("-----------------------------------");Thread.sleep(500);
				System.out.println("�������� ������ ƴ�� ���μ��ϴ�....");Thread.sleep(500);
				System.out.println("������ ƴ���� ����� �߰ߵǾ����ϴ�.. /skip/");Thread.sleep(500);
				System.out.println("-----------------------------------");Thread.sleep(500);
				int ���ʺ�2 = s.nextInt();
				�κ��丮.��������("��������");
				�κ��丮.��������("��������");
				�κ��丮.��������("������");
				�κ��丮.��������("������");
				���ΰ�.��������Ż��("Ż��");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("Ż�⿡ �����մϴ�.");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;

			}
			else {
			System.out.println("-----------------------------------");
			System.out.println("���Դϴ�.");
			System.out.println("-----------------------------------");
			}
		}
		
		//�����ʺ�
		if(������==7) {
			System.out.println("-----------------------------------");
			System.out.println("���Դϴ�.");
			System.out.println("-----------------------------------");

		}
		
		//��������
		if(������==8) {
			if(������.��������==0) {
				�κ��丮.�����۸����("��������", "1");
				�κ��丮.��������("��������");
				������.�������� +=1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�������ʸ� ȹ���Ͽ����ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
			
		}
		//������
		if(������==9) {
			if(������.������==0) {
				�κ��丮.�����۸����("������", "1");
				�κ��丮.��������("������");
				������.������ +=1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�����͸� ȹ���Ͽ����ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
		}
		//������
		if(������==10) {
			if(������.������==0) {
				�κ��丮.�����۸����("������", "1");
				�κ��丮.��������("������");
				������.������ +=1;
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				System.out.println("�������� ȹ���Ͽ����ϴ�.");
				System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
			}
		}
		
		}
	

		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("���� �����?......");Thread.sleep(500); 
		System.out.println("�������ΰ�?....../skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int ��ŵ18 = s.nextInt();
	
		
		while(true) {	
			
			
			
			
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("           FINAL STAGE");
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("-----------------------------------");
		System.out.println("��Ʈ����Ʈ :" + ���ΰ�.��Ʈ����Ʈ);
		if(���ΰ�.����ִ¾�����()==null) {
			System.out.println("����������  : ����");
		}else {
		System.out.println("����������  :" + ���ΰ�.����ִ¾�����());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.�ܼ�");
		System.out.println("2.������");
		System.out.println("3.��������Ʈ");
		System.out.println("4.���Ըӽ�(����ƮEVNET)");
		System.out.println("-----------------------------------");
		System.out.println("5.ĥ��");
		System.out.println("6.������");
		System.out.println("7.�ſ�");
		System.out.println("8.ī��");
		System.out.println("9.��ǻ��");
		System.out.println("10.�ڵ���");
		System.out.println("-----------------------------------");
		int ��������5 = s.nextInt();
	
		//�ܼ�
		if(��������5==1) {
			��Ʈ.��Ʈ����Ʈ����();
			System.out.println("-----------------------------------");
			System.out.println("�ܼ��� Ȯ���ϼ���. /skip/");
			System.out.println("-----------------------------------");
			int ��Ʈ1 = s.nextInt();
		}
		
		
		//�����۸��
		if(��������5==2) {
			while(true) {
			�κ��丮.�κ��丮���();
			System.out.println("-----------------------------------");
			System.out.println("1.��������");
			System.out.println("2.�����ۼ���");
			System.out.println("3.�����۰���");
			System.out.println("4.�����ۺи�");
			System.out.println("-----------------------------------");
			int ������1 = s.nextInt();
			
			if(������1==1) {
				System.out.println("-----------------------------------");
				System.out.println("���ư��ϴ�.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(������1==2) {
				System.out.println("-----------------------------------");
				System.out.println("����� �������� �̸��� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����ۼ��� = s.next();
				
				if ("������".equals(�����ۼ���)) {
					���ΰ�.����������("������");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
				if ("��Ű".equals(�����ۼ���)) {
					���ΰ�.����������("��Ű");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
				if ("�����ڵ�".equals(�����ۼ���)) {
					���ΰ�.����������("�����ڵ�");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
				if ("���ʰ���".equals(�����ۼ���)) {
					���ΰ�.����������("���ʰ���");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
				if ("������".equals(�����ۼ���)) {
					���ΰ�.����������("������");
					System.out.println("-----------------------------------");
					System.out.println("�������� �����մϴ�.");
					System.out.println("-----------------------------------");
				} 
				
				
			}
			if(������1==3) {
				System.out.println("-----------------------------------");
				System.out.println("������ ������ 2���� �̸��� ������� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����۰���1 = s.next();
				String �����۰���2 = s.next();
				
				if("����".equals(�����۰���1)&&"����".equals(�����۰���2)) {
					�κ��丮.�����۸����("���ʰ���", "1");
					�κ��丮.��������("���ʰ���");
					������.���ʰ��� += 1;
					���ΰ�.��Ʈ����Ʈ += 50;
					�κ��丮.��������("����");
					�κ��丮.��������("����");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("���ʰ��縦 ����� �� �ֽ��ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}else if ("����".equals(�����۰���1)&&"����".equals(�����۰���2)) {
					�κ��丮.�����۸����("���ʰ���", "1");
					�κ��丮.��������("���ʰ���");
					������.���ʰ��� += 1;
					���ΰ�.��Ʈ����Ʈ += 50;
					�κ��丮.��������("����");
					�κ��丮.��������("����");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("���ʰ��縦 ����� �� �ֽ��ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("������ �� ���� �����Դϴ�.");
					System.out.println("-----------------------------------");
				}
				
						
			}
			if(������1==4) {
				
				System.out.println("-----------------------------------");
				System.out.println("�и��� �������� �̸��� �Է����ּ���.");
				System.out.println("-----------------------------------");
				String �����ۺи�1 = s.next();

				if("����Ʈ������".equals(�����ۺи�1)) {
					if(��Ʈ.����==0) {
					System.out.println("������������������������������������");Thread.sleep(500);
					System.out.println("�ſ��� �߿��ϴ�.");Thread.sleep(500);
					System.out.println("������������������������������������");Thread.sleep(500);
					��Ʈ.��Ʈ�����("�ſ��� �߿��ϴ�", 1);
					�κ��丮.��������("����Ʈ������");
					���ΰ�.��Ʈ����Ʈ += 50;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}else if (��Ʈ.����>0) {
						System.out.println("-----------------------------------");
						System.out.println("�и��� �������Դϴ�.");
						System.out.println("-----------------------------------");
					}
				}
				
				if("��й�ȣ�ڷ�".equals(�����ۺи�1)) {
					if(��Ʈ.����==1) {
						
					System.out.println("������������������������������������");Thread.sleep(500);
					System.out.println("N�� ������ ������");Thread.sleep(500);
					System.out.println("������������������������������������");Thread.sleep(500);
					��Ʈ.��Ʈ�����("N�� ���������", 2);
					�κ��丮.��������("��й�ȣ�ڷ�");
					���ΰ�.��Ʈ����Ʈ += 50;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ܼ��� ȹ���Ͽ����ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}else if (��Ʈ.����>1) {
						System.out.println("-----------------------------------");
						System.out.println("�и��� �������Դϴ�.");
						System.out.println("-----------------------------------");
					}
				} else {
					System.out.println("-----------------------------------");
					System.out.println("�и��� �� �� ���� �������Դϴ�.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			}
			}
			
			//��������Ʈ
			if(��������5==3) {
				while(true) {
				��������Ʈ.��������Ʈ����Ʈ����();
				System.out.println("-----------------------------------");
				System.out.println("1.��������");
				System.out.println("2.��Ʈ����Ʈ - 1000��");
				if(��������Ʈ.����==1) {
				System.out.println("3.��Ʈ����Ʈ - 2000��");
				}
				System.out.println("-----------------------------------");
				System.out.println("������ ��Ʈ�� Ȯ���ϼ���.");
				System.out.println("��Ʈ ����Ʈ�� ���� Ȯ�� �����մϴ�.");
				System.out.println("-----------------------------------");
				int ��Ʈ���� = s.nextInt();
				
				if(��Ʈ����==1) {
					System.out.println("-----------------------------------");
					System.out.println("���ư��ϴ�.");
					System.out.println("-----------------------------------");
					break;
				}
				
				if(��Ʈ����==2) {
					if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ>1000) {
						���ΰ�.��Ʈ����Ʈ -= 1000; 
					��������Ʈ.��������Ʈ�����("�ſ� - ������ - ��Ű", 1);
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("�ſ� - ������ - ��Ű");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� - 100 �����˴ϴ�.");
					System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ1 = s.nextInt();
					}
					else if(��������Ʈ.����==0&&���ΰ�.��Ʈ����Ʈ<1000) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�.  /skip/");
						System.out.println("-----------------------------------");
						int ��������Ʈ2 = s.nextInt();
					}
					else if(��������Ʈ.����>0) {
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("�ſ� - ������ - ��Ű  /skip/");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						int ��������Ʈ3 = s.nextInt();
					}
				}
				if(��Ʈ����==3) {
					if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ>2000) {
						���ΰ�.��Ʈ����Ʈ -= 2000; 
					��������Ʈ.��������Ʈ�����("����+���� = ���ʰ��� --> �ڵ���", 2);
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("����+���� = ���ʰ��� --> �ڵ���");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("-----------------------------------");
					System.out.println("��Ʈ����Ʈ�� - 1500 �����˴ϴ�.");
					System.out.println("������Ʈ����Ʈ :" +���ΰ�.��Ʈ����Ʈ + "/skip/");
					System.out.println("-----------------------------------");
					int ��������Ʈ4 = s.nextInt();
					}
					else if(��������Ʈ.����==1&&���ΰ�.��Ʈ����Ʈ<2000) {
						System.out.println("-----------------------------------");
						System.out.println("��Ʈ����Ʈ�� �����մϴ�. /skip/");
						System.out.println("-----------------------------------");
						int ��������Ʈ5 = s.nextInt();
					}
					else if(��������Ʈ.����>1) {
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("����+���� = ���ʰ��� --> �ڵ���  /skip/");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						int ��������Ʈ6 = s.nextInt();
					}
				}
				
				}
			}
			//��������Ʈ
			
			if(��������5==4) {
				
				while(true) {	
					scount += 1;
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("         EVENT - ���Ըӽ�");
				System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
				System.out.println("-----------------------------------");
				System.out.println("��ȸ�� 3���Դϴ�.");
				System.out.println("������ ����ּ���. /skip/");
				System.out.println("-----------------------------------");
				int ����2 = s.nextInt();
				���ΰ�.���Ըӽ�("��ܴ��");
				for (int i = 0; i < ���Ա��� ; i  ++) {
					for(int ����=0; ����<���Ա���; ����++) {  
					����[����] = (int)(Math.random()*slot)+1;
				}
				for ( int j = 0; j < ���Ա��� ; j ++) { // ������ �� ����  ������ ����  
				
					���Թ迭[i][j] = ����[j];
					
				}
				
				}
				
				
				for(int a=0; a<���Ա���; a++) {

					for (int b=0; b<���Ա���; b++) {
								System.out.print(���Թ迭[a][b]);Thread.sleep(900);		
					}
					System.out.println("");
					
				}
				if(���Թ迭[0][0]==1&&���Թ迭[0][1]==1&&���Թ迭[0][2]==1) {
					���ΰ�.��Ʈ����Ʈ += 50;
				}
				else if(���Թ迭[0][0]==2&&���Թ迭[0][1]==2&&���Թ迭[0][2]==2) {
					���ΰ�.��Ʈ����Ʈ += 50; System.out.println("������!");
				}
				else if(���Թ迭[0][0]==3&&���Թ迭[0][1]==3&&���Թ迭[0][2]==3) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[1][0]==1&&���Թ迭[1][1]==1&&���Թ迭[1][2]==1) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[1][0]==2&&���Թ迭[1][1]==2&&���Թ迭[1][2]==2) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[1][0]==3&&���Թ迭[1][1]==3&&���Թ迭[1][2]==3) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[2][0]==1&&���Թ迭[2][1]==1&&���Թ迭[2][2]==1) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[2][0]==2&&���Թ迭[2][1]==2&&���Թ迭[2][2]==2) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				else if(���Թ迭[2][0]==3&&���Թ迭[2][1]==3&&���Թ迭[2][2]==3) {
					���ΰ�.��Ʈ����Ʈ += 50;  System.out.println("������!");
				}
				if(scount==3) {
					System.out.println("-----------------------------------");
					System.out.println("ȹ��������Ʈ : " + ���ΰ�.��Ʈ����Ʈ+ "/skip/");
					System.out.println("-----------------------------------");
					int ���Խ�ŵ2 = s.nextInt();
					scount = 0;
					break;
					
				}
					
						}	
			}
			//ĥ��
			if(��������5==5) {
				while(true) {
				System.out.println("-----------------------------------");
				if(������.����==0) {
				System.out.println("1.����");}
				if(������.������==0) {
				System.out.println("2.������");}
				System.out.println("3.��������");
				System.out.println("-----------------------------------");
				int ĥ�� = s.nextInt();
				
				if(ĥ��==1) {
					if(������.����==0) {
						�κ��丮.�����۸����("����", "1");
						�κ��丮.��������("����");
						������.���� += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("������ ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.����>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}
				if(ĥ��==2) {
					if(������.������==0) {
						�κ��丮.�����۸����("������", "1");
						�κ��丮.��������("������");
						������.������ += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("�����⸦ ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.������>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}
				if(ĥ��==3) {
				break;	
				}
				}
			}
			
			//������
			if(��������5==6) {
				while(true) {
				System.out.println("-----------------------------------");
				if(������.����==0) {
				System.out.println("1.����");}
				if(������.������==0) {
				System.out.println("2.������");}
				if(������.��Ű==0) {
				System.out.println("3.��Ű");}
				System.out.println("4.��������");
				System.out.println("-----------------------------------");
				int ������ = s.nextInt();
				
				if(������==1) {
					if(������.����==0) {
						�κ��丮.�����۸����("����", "1");
						�κ��丮.��������("����");
						������.���� += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("������ ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.����>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}
				if(������==2) {
					if(������.������==0) {
						�κ��丮.�����۸����("������", "1");
						�κ��丮.��������("������");
						������.������ += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("�������� ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.������>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}
				if(������==3) {
					if(������.��Ű==0) {
						�κ��丮.�����۸����("��Ű", "1");
						�κ��丮.��������("��Ű");
						������.��Ű += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("�����⸦ ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.��Ű>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}

				if(������==4) {
				break;	
				}
				
			}
			}
			//�ſ�
			if(��������5==7) {
				
				if(������.�ſｺũ��ġ==0) {
					System.out.println("-----------------------------------");
					System.out.println("�ſ��Դϴ�. /skip/");
					System.out.println("-----------------------------------");
					int �ſ� = s.nextInt();
				}
				if("������".equals(���ΰ�.����ִ¾�����())) {
					if(������.�ſｺũ��ġ==0) {
					������.�ſｺũ��ġ += 1;
					}
					System.out.println("-----------------------------------");
					System.out.println("�ſ￡ ���� ������ �ֽ��ϴ�. /skip/");
					System.out.println("-----------------------------------");
					int �ſ�4 = s.nextInt();
				}
				
				
				else if(������.�ſｺũ��ġ==1) {
				if("������".equals(���ΰ�.����ִ¾�����())) {
					������.�ſｺũ��ġ += 1;
					System.out.println("-----------------------------------");
					System.out.println("�������� �ٿ����ϴ�. /skip/");
					System.out.println("-----------------------------------");
					
					int �ſ�2 = s.nextInt();
				}else {
					System.out.println("-----------------------------------");
					System.out.println("�ſ��Դϴ�. /skip/");
					System.out.println("-----------------------------------");
					int �ſ�3 = s.nextInt();
				}
				
				}
				else if(������.�ſｺũ��ġ==2&&������.�����ڵ�==0) {
					if("��Ű".equals(���ΰ�.����ִ¾�����())) {
						�κ��丮.�����۸����("�����ڵ�", "1");
						�κ��丮.��������("�����ڵ�");
						������.�����ڵ� += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("������ ��Ʈ���ϴ�!");
						System.out.println("�����ڵ尡 ���� ������ �߰��մϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
				} else if(������.�ſｺũ��ġ==2&&������.�����ڵ�==1) {
					System.out.println("-----------------------------------");
					System.out.println("�ſ��Դϴ�. /skip/");
					System.out.println("-----------------------------------");
					int �ſ�5 = s.nextInt();
				}
			}
			
			//ī��
			if(��������5==8) {
				while(true){
				System.out.println("-----------------------------------");
				if(������.CD==0) {
				System.out.println("1.CD");}
				if(������.����Ʈ������==0) {
				System.out.println("2.����Ʈ��");}
				System.out.println("3.��������");
				System.out.println("-----------------------------------");
				int ī�� = s.nextInt();
				
				if(ī��==1) {
				if(������.CD==0) {
					�κ��丮.�����۸����("CD", "1");
					�κ��丮.��������("CD");
					������.CD += 1;
					���ΰ�.��Ʈ����Ʈ += 50;
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("CD�� ȹ���Ͽ����ϴ�.");
					System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
				}
				else if(������.CD>0) {
					System.out.println("-----------------------------------");
					System.out.println("ȹ��Ϸ�");
					System.out.println("-----------------------------------");
				}
				}
				if(ī��==2) {
					if(������.����Ʈ������==0) {
						�κ��丮.�����۸����("����Ʈ������", "1");
						�κ��丮.��������("����Ʈ������");
						������.����Ʈ������ += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("����Ʈ���� ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.����Ʈ������>0) {
						System.out.println("-----------------------------------");
						System.out.println("ȹ��Ϸ�");
						System.out.println("-----------------------------------");
					}
				}
				if(ī��==3) {
					break;
				}
				
			}
			}
			
			//��ǻ��
			if(��������5==9) {
				if("�����ڵ�".equals(���ΰ�.����ִ¾�����())) {
					
					if(������.��й�ȣ�ڷ�==0) {
						�κ��丮.�����۸����("��й�ȣ�ڷ�", "1");
						�κ��丮.��������("��й�ȣ�ڷ�");
						������.��й�ȣ�ڷ� += 1;
						���ΰ�.��Ʈ����Ʈ += 50;
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
						System.out.println("��й�ȣ�ڷḦ ȹ���Ͽ����ϴ�.");
						System.out.println("��Ʈ����Ʈ�� 50 �ö󰩴ϴ�.");
						System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					}
					else if(������.��й�ȣ�ڷ�>0) {
						System.out.println("-----------------------------------");
						System.out.println("���̻� ���캼���� �����ϴ�.");
						System.out.println("-----------------------------------");
					}
					
				}else {
					System.out.println("-----------------------------------");
					System.out.println("��ǻ�Ͱ� ����ֽ��ϴ�.");
					System.out.println("-----------------------------------");
					int ��ǻ�� = s.nextInt();
				}
			}
			
			//�ڵ���
			if(��������5==10) {
				if("���ʰ���".equals(���ΰ�.����ִ¾�����())) {
					
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("��й�ȣ ���ǿ� ���ʰ��縦 �Ѹ��ϴ�. ");
					System.out.println("������ ���ϰ� �����͸� �����ݴϴ�.");
					System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءء�");
					System.out.println("-----------------------------------");
					System.out.println("            3");
					System.out.println("4     5      ");
					System.out.println("            9");
					System.out.println("             ");
					System.out.println("-----------------------------------");
					System.out.println("���� ����ֽ��ϴ�.");
					System.out.println("��й�ȣ 4�ڸ��� �Է��ϼ���");
					System.out.println("-----------------------------------");
				}
				else {
				System.out.println("-----------------------------------");
				System.out.println("1     2     3");
				System.out.println("4     5     6");
				System.out.println("7     8     9");
				System.out.println("*     0     #");
				System.out.println("-----------------------------------");
				System.out.println("���� ����ֽ��ϴ�.");
				System.out.println("��й�ȣ 4�ڸ��� �Է��ϼ���");
				System.out.println("-----------------------------------");
				}
				int �ڵ������ = s.nextInt();
				
				if(�ڵ������ ==3954) {
					���ΰ�.��������Ż��("Ż��");
					�������4.close();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("Ż�⿡ �����մϴ�.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				
				if(�ڵ������ != 3954) {
					
					 try
					 {
					 AudioInputStream ais12 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\��Ż��\\sound\\psxx.wav"));
					Clip clip12 = AudioSystem.getClip();
					clip12.stop();
					clip12.open(ais12);
					clip12.start();
					 }
					 catch (Exception ex)
					 {
					  } 
					System.out.println("-----------------------------------");
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					System.out.println("-----------------------------------");
					int �ڵ��� = s.nextInt();
					
				}
				
				
			}
			
}//while  
		
		���� �������� = new ���� ("Lasting_Hope.mp3",  true);
		��������.start();
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("        FINAL STAGE - ��� ");
		System.out.println("�١١١١١١١١١١١١١١١١١١١١١١١١١١١١�");
		System.out.println("-----------------------------------");
		System.out.println("ȹ���� ������ "); 
		�κ��丮.�κ��丮���();
		System.out.println("ȹ���� ��Ʈ "); 
		��Ʈ.��Ʈ����Ʈ����();
		���ΰ�.��Ʈ����Ʈ += 500;
		System.out.println("�� ��Ʈ����Ʈ : " +���ΰ�.��Ʈ����Ʈ );
		System.out.println("-----------------------------------");
		int ���� = s.nextInt();
		
	
	}
	
	
	
	
//�ܼ�ȭ�� ����� �޼ҵ� 
	public static void ȭ�������() {
		for(int i = 0; i < 80; i++) {
			System.out.println("");
		}
	}
//�ܼ��ϸ� ����� �޼ҵ� ������ ���ϸ� �̷�°� 

	
}