package 방탈출;



import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.Track;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import 등장인물.순찰;
import 등장인물.전화;
import 등장인물.주인공;
import 배경음악.뮤직;
import 보관함.인벤아이템;
import 보관함.인벤토리;
import 스테이지.스테이지;
import 스테이지.타이머;
import 아이템.개발자힌트;
import 아이템.도구아이템;
import 아이템.아이템;
import 아이템.힌트;




public class 게임플레이  {

	
	public static void main(String[] args)throws InterruptedException {
		
		
		힌트 힌트 = new 힌트();
		개발자힌트 개발자힌트 = new 개발자힌트();
		인벤토리 인벤토리 = new 인벤토리();
		주인공 주인공 = new 주인공();
		도구아이템 도구아이템 = new 도구아이템();
		아이템 아이템 = new 아이템();
		
		
		
		Scanner s = new Scanner(System.in);
		int slot = 3;
		int scount = 0;
		int 슬롯[] = new int[slot];
		int 슬롯배열[][] = new int[slot][slot];
		int 슬롯길이 = 슬롯.length;

		int 맨유= 1;
		int 리버풀 = 1;
		int 첼시 =1;
		int 번리 =1;
		int 토트넘 =1;
		int 왓포드 =1;
		Random random = new Random();
		
		


		뮤직 배경음악1 = new 뮤직("Day_of_Chaos.mp3", true);
		배경음악1.start();
	System.out.println("***********************************"); Thread.sleep(500);
	System.out.println("눈을 떠보니 어딘가에 갇혀있다.");Thread.sleep(500);
	System.out.println("무슨 상황인지 살펴봐야겠다......."); Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("-----------------------------------");
	System.out.println("Skip 하시면 게임이 진행됩니다.");
	System.out.println("skip은 1 + Enter입니다.");
	System.out.println("-----------------------------------");
	int 스킵1 = s.nextInt();
	화면지우기();
	

	
	while(true) {
		
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("         STAGE 1 - 의문의방");
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("-----------------------------------");
	System.out.println("힌트포인트 :" + 주인공.힌트포인트);
	if(주인공.들고있는아이템()==null) {
		System.out.println("장착아이템  : 없음");
	}else {
	System.out.println("장착아이템  :" + 주인공.들고있는아이템());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.단서");
	System.out.println("2.아이템");
	System.out.println("3.개발자힌트");
	System.out.println("-----------------------------------");
	System.out.println("4.탈출하기");
	System.out.println("5.책상서랍");
	System.out.println("6.침대");
	System.out.println("-----------------------------------");
	int 스테이지1 = s.nextInt();
	
	//단서
	if(스테이지1==1) {

		힌트.힌트리스트보기();
		System.out.println("-----------------------------------");
		System.out.println("단서를 확인하세요. /skip/");
		System.out.println("-----------------------------------");
		int 힌트1 = s.nextInt();
	}
	
	
	//아이템목록
	if(스테이지1==2) {
		while(true) {
		인벤토리.인벤토리출력();
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.아이템선택");
		System.out.println("3.아이템결합");
		System.out.println("4.아이템분리");
		System.out.println("-----------------------------------");
		int 아이템1 = s.nextInt();
		
		if(아이템1==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(아이템1==2) {
			System.out.println("-----------------------------------");
			System.out.println("사용할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템선택 = s.next();
			
			if ("칼".equals(아이템선택)) {
				주인공.장착아이템("칼");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			} else if ("손거울".equals(아이템선택)) {
				주인공.장착아이템("손거울");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			} else if ("열쇠1".equals(아이템선택)) {
				주인공.장착아이템("열쇠1");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			} else {
				System.out.println("-----------------------------------");
				System.out.println("장착할 수 없습니다.");
				System.out.println("-----------------------------------");
			}
		}
		if(아이템1==3) {
			System.out.println("-----------------------------------");
			System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템결합1 = s.next();
			String 아이템결합2 = s.next();
			if("커터칼날".equals(아이템결합1)&&"커터칼집".equals(아이템결합2)) {
				인벤토리.아이템만들기("칼", "6");
				인벤토리.수량증가("칼");
				인벤토리.수량감소("커터칼집");
				인벤토리.수량감소("커터칼날");
				주인공.힌트포인트 += 20;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("칼을 획득하였습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}else if ("커터칼집".equals(아이템결합1)&&"커터칼날".equals(아이템결합2)) {
				인벤토리.아이템만들기("칼", "6");
				인벤토리.수량증가("칼");
				인벤토리.수량감소("커터칼집");
				인벤토리.수량감소("커터칼날");
				주인공.힌트포인트 += 20;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("칼을 획득하였습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}	else {
				System.out.println("-----------------------------------");
				System.out.println("결합할 수 없는 조합입니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(아이템1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("분리할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템분리1 = s.next();
			
			if("쪽지1".equals(아이템분리1)) {
				if(힌트.순서==0) {
					
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				System.out.println("이곳은 정신병원입니다.");Thread.sleep(500);
				System.out.println("아주 위험한......");Thread.sleep(500);
				System.out.println("베게에 열쇠를 숨겨놨습니다. ");Thread.sleep(500);
				System.out.println("그리고 직원들에게 들키지않고 나갈수 있도록 ");Thread.sleep(500);
				System.out.println("제가 탈출한 루트로 힌트를 곳곳에 숨겨두었습니다. ");Thread.sleep(500);
				System.out.println("부디 탈출하시길... ");Thread.sleep(500);
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				힌트.힌트만들기("베게 속에 열쇠가 있다.", 1);
				인벤토리.수량감소("쪽지1");
				주인공.힌트포인트 += 20;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("단서를 획득하였습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (힌트.순서>0) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}else {
				System.out.println("-----------------------------------");
				System.out.println("분리를 할 수 없는 아이템입니다.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		
		}
	}
	//아이템목록 

	
	
	//개발자힌트
	if(스테이지1==3) {
		while(true) {
		개발자힌트.개발자힌트리스트보기();
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.무료확인");
		System.out.println("3.힌트포인트 10");
		System.out.println("4.힌트포인트 20");
		System.out.println("-----------------------------------");
		System.out.println("개발자 힌트를 확인하세요.");
		System.out.println("힌트 포인트에 따라 확인 가능합니다.");
		System.out.println("-----------------------------------");
		int 힌트가격 = s.nextInt();
		
		if(힌트가격==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(힌트가격==2&&주인공.힌트포인트>=0&&개발자힌트.순서==0) {
			개발자힌트.개발자힌트만들기("힌트포인트 활용법", 1);
			주인공.힌트포인트 += 10;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("힌트포인트는 스테이지가 종료되었을 때 지급됩니다. ");
			System.out.println("힌트포인트로 결정적인 단서를 획득할 수 있습니다.");
			System.out.println("제한시간이 나오는 스테이지부터는 ");
			System.out.println("제한시간 연장으로도 사용할 수 있습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("힌트포인트를 10 획득하였습니다.");
			System.out.println("-----------------------------------");
		}else if(힌트가격==2&&주인공.힌트포인트>=0&&개발자힌트.순서>0){
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("힌트포인트는 스테이지가 종료되었을 때 지급됩니다. ");
			System.out.println("힌트포인트로 결정적인 단서를 획득할 수 있습니다.");
			System.out.println("제한시간이 나오는 스테이지부터는 ");
			System.out.println("제한시간 연장으로도 사용할 수 있습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
		}
		
		if(힌트가격==3&&주인공.힌트포인트>=10&&개발자힌트.순서==1) {
			개발자힌트.개발자힌트만들기("아이템은 장착한다.", 2);
			주인공.힌트포인트 -= 10;
			주인공.힌트포인트 += 20;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("아이템의 결합으로 새로운 아이템을 만들 수 있다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("힌트포인트를 10 사용했습니다.");
			System.out.println("힌트포인트를 20 획득하였습니다.");
			System.out.println("-----------------------------------");
		} else if(힌트가격==3&&주인공.힌트포인트>=20&&개발자힌트.번호>1){
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("아이템의 결합으로 새로운 아이템을 만들 수 있다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
		}
		
		
		if(힌트가격==4&&주인공.힌트포인트>=20&&개발자힌트.순서==2) {
			개발자힌트.개발자힌트만들기("손거울", 3);
			주인공.힌트포인트 -= 20;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("손거울을 활용하세요");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("힌트포인트를 20 사용했습니다.");
			System.out.println("-----------------------------------");
		}else if(힌트가격==4&&주인공.힌트포인트>=20&&개발자힌트.순서>3){
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("손거울을 활용하세요");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
		}
		
		
		
		}
	}
	//개발자힌트

	
	
	//책상서랍
	if(스테이지1==5) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.첫번째서랍");
		System.out.println("3.두번째서랍");
		System.out.println("4.책장");
		System.out.println("-----------------------------------");
		int 책상서랍 = s.nextInt();
		
		if(책상서랍 ==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(책상서랍 == 2) {
			if(아이템.손거울==0) {
			인벤토리.아이템만들기("손거울", "3");
			인벤토리.수량증가("손거울");
			아이템.손거울 += 1;
			System.out.println("힌트포인트가 20 올라갑니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("손거울을 획득하였습니다.");
			System.out.println("힌트포인트가 20 올라갑니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
		} else if(아이템.손거울==1) {
			도구아이템.도구아이템만들기("잔챙이",1);
			System.out.println("-----------------------------------");
			System.out.println("특별한것이 없습니다.");
			System.out.println("-----------------------------------");
		}
		
		}	
		if(책상서랍 == 3) {
			if(아이템.커터칼날 ==0) {
			인벤토리.아이템만들기("커터칼날", "1");
			인벤토리.수량증가("커터칼날");
			아이템.커터칼날 += 1;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("커터칼날을 획득하였습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
		}else if(아이템.커터칼날==1) {
			도구아이템.도구아이템만들기("잔챙이",1);
			System.out.println("-----------------------------------");
			System.out.println("특별한것이 없습니다.");
			System.out.println("-----------------------------------");
		}
			
		}
		if(책상서랍 ==4) {
			if(아이템.커터칼집 ==0) {
			인벤토리.아이템만들기("커터칼집", "2");
			인벤토리.수량증가("커터칼집");
			아이템.커터칼집 += 1;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("커터칼집을 획득하였습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.커터칼집==1) {
				도구아이템.도구아이템만들기("잔챙이",1);
				System.out.println("-----------------------------------");
				System.out.println("특별한것이 없습니다.");
				System.out.println("-----------------------------------");
			}
		}

		
		}
	}
	//책상서랍
	

	
	
	//침대
	if(스테이지1==6) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.이불");
		System.out.println("3.베게");
		
		if("손거울".equals(주인공.들고있는아이템())) {
			System.out.println("4.침대아래");
		} else {
			
		}
		
		System.out.println("-----------------------------------");
		int 침대 = s.nextInt();
		
		
		//이전으로
		if(침대==1) {
			break;
		}
		//이불
		if(침대==2) {
			도구아이템.도구아이템만들기("잔챙이",1);
			System.out.println("-----------------------------------");
			System.out.println("특별한것이 없습니다.");
			System.out.println("-----------------------------------");
		}
		//이불
		
		//베게
		if(침대==3) {
			
		if("칼".equals(주인공.들고있는아이템())) {
			if(아이템.열쇠1==0) {
			인벤토리.아이템만들기("열쇠1", "4");
			인벤토리.수량증가("열쇠1");
			아이템.열쇠1 += 1;
			주인공.힌트포인트 += 20;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("열쇠를 획득하였습니다.");
			System.out.println("힌트포인트가 20 올라갑니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.열쇠1>0) {
				도구아이템.도구아이템만들기("잔챙이",1);
				System.out.println("-----------------------------------");
				System.out.println("특별한것이 없습니다.");
				System.out.println("-----------------------------------");
			}
		}else {
			도구아이템.도구아이템만들기("잔챙이",1);
			System.out.println("-----------------------------------");
			System.out.println("특별한것이 없습니다.");
			System.out.println("-----------------------------------");
		}
		}
		//베게
		

		if(침대==4) {
			if("손거울".equals(주인공.들고있는아이템())){
				if(아이템.쪽지1==0) {
				인벤토리.아이템만들기("쪽지1", "5");
				인벤토리.수량증가("쪽지1");
				아이템.쪽지1 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("쪽지를 획득하였습니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if(아이템.쪽지1>0) {
					도구아이템.도구아이템만들기("잔챙이",1);
					System.out.println("-----------------------------------");
					System.out.println("특별한것이 없습니다.");
					System.out.println("-----------------------------------");
				}
			}
			else {
				
			}
		}
		
		
	}
    }
	//침대
	
	//탈출하기
	if(스테이지1==4) {
		if(아이템.열쇠1==1) {
		if("열쇠1".equals(주인공.들고있는아이템())) {
			주인공.스테이지탈출("탈출");
			
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("탈출에 성공합니다.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			break;	
		}else{
			주인공.스테이지못나감("잠김");
			System.out.println("-----------------------------------");
			System.out.println("잠겨있습니다.");
			System.out.println("-----------------------------------");
		}
		
		
		} else if(아이템.열쇠1==0) {
			주인공.스테이지못나감("잠김");
			System.out.println("-----------------------------------");
			System.out.println("잠겨있습니다.");
			System.out.println("-----------------------------------");
		}
		
		
    }
	//탈출하기
	
	
	}// while 
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("층이 아예 잠겨있네......");Thread.sleep(500); 주인공.스테이지못나감("잠김");
	System.out.println("지금 층부터 빠져나가보자......");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	int 스킵2 = s.nextInt();
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("         STAGE 1 - 결과 ");
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("-----------------------------------");
	System.out.println("획득한 아이템 "); 
	인벤토리.인벤토리출력();
	System.out.println("획득한 힌트 "); 
	힌트.힌트리스트보기();
	주인공.힌트포인트 += 500;
	System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
	System.out.println("-----------------------------------");
	
	
	int 스킵3 = s.nextInt();
	
	인벤토리.수량감소("손거울");
	인벤토리.수량감소("칼");
	인벤토리.수량감소("커터칼날");
	인벤토리.수량감소("커터칼집");
	인벤토리.수량감소("손거울");
	인벤토리.수량감소("열쇠1");
	인벤토리.수량감소("쪽지1");
	힌트.힌트지우기("지우기", 10);
	개발자힌트.개발자힌트지우기("지우기",10);
	도구아이템.도구아이템지우기("전부", 10);
	주인공.장착아이템("없음");
	배경음악1.close();
	
	뮤직 이벤트음악1 = new 뮤직("Micro.mp3", true);
	이벤트음악1.start();
	while(true) {	
		scount += 1;
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("         EVENT - 슬롯머신");
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("-----------------------------------");
	System.out.println("기회는 3번입니다.");
	System.out.println("레버를 당겨주세요. /skip/");
	System.out.println("-----------------------------------");
	int 슬롯1 = s.nextInt();
	주인공.슬롯머신("당겨당겨");
	for (int i = 0; i < 슬롯길이 ; i  ++) {
		for(int 랜덤=0; 랜덤<슬롯길이; 랜덤++) {  
		슬롯[랜덤] = (int)(Math.random()*slot)+1;
	}
	for ( int j = 0; j < 슬롯길이 ; j ++) { // 스도쿠 행 생성  행으로 나열  
	
		슬롯배열[i][j] = 슬롯[j];
		
	}
	
	}
	
	
	for(int a=0; a<슬롯길이; a++) {

		for (int b=0; b<슬롯길이; b++) {
					System.out.print(슬롯배열[a][b]);Thread.sleep(900);		
		}
		System.out.println("");
		
	}
	if(슬롯배열[0][0]==1&&슬롯배열[0][1]==1&&슬롯배열[0][2]==1) {
		주인공.힌트포인트 += 150;
	}
	else if(슬롯배열[0][0]==2&&슬롯배열[0][1]==2&&슬롯배열[0][2]==2) {
		주인공.힌트포인트 += 150; System.out.println("터졌다!");
	}
	else if(슬롯배열[0][0]==3&&슬롯배열[0][1]==3&&슬롯배열[0][2]==3) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==1&&슬롯배열[1][1]==1&&슬롯배열[1][2]==1) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==2&&슬롯배열[1][1]==2&&슬롯배열[1][2]==2) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==3&&슬롯배열[1][1]==3&&슬롯배열[1][2]==3) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==1&&슬롯배열[2][1]==1&&슬롯배열[2][2]==1) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==2&&슬롯배열[2][1]==2&&슬롯배열[2][2]==2) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==3&&슬롯배열[2][1]==3&&슬롯배열[2][2]==3) {
		주인공.힌트포인트 += 150;  System.out.println("터졌다!");
	}
	if(scount==3) {
		System.out.println("-----------------------------------");
		System.out.println("획득한포인트 : " + 주인공.힌트포인트+ "/skip/");
		System.out.println("-----------------------------------");
		int 슬롯스킵 = s.nextInt();
		scount = 0;
		break;
		
	}
		
			}

	
	
	
	//////////////////////////////////////stage 2

	
	
	화면지우기();
	이벤트음악1.close();
	타이머 타이머 = new 타이머();
	타이머.start();
	뮤직 배경음악2 = new 뮤직("Day_of_Chaos.mp3", true);
	배경음악2.start();
	while(true) {
		
		
		
		
		
			if(타이머.get타이머()==0) {
				배경음악2.close();
				뮤직 엔딩뮤직 = new 뮤직 ("Lasting_Hope.mp3",  true);
				엔딩뮤직.start();
				
				while(true) {
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("스테이지 2 - 실패 "); 
					System.out.println("획득한 아이템 "); 
					인벤토리.인벤토리출력();
					System.out.println("획득한 힌트 "); 
					힌트.힌트리스트보기();
					System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					int 엔딩1 = s.nextInt();
					
					if(엔딩1==20) {
						break;
					}
				}
			}
		
		
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("         STAGE 2 - 잠겨있는 층");
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("-----------------------------------");
	System.out.println("제한시간 :" + 타이머.get타이머());
	System.out.println("힌트포인트 :" + 주인공.힌트포인트);
	if(주인공.들고있는아이템()==null) {
		System.out.println("장착아이템  : 없음");
	}else {
	System.out.println("장착아이템  :" + 주인공.들고있는아이템());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.단서");
	System.out.println("2.아이템");
	System.out.println("3.개발자힌트");
	System.out.println("4.제한시간추가");
	System.out.println("-----------------------------------");
	System.out.println("5.탈출하기");
	System.out.println("6.사물함");
	System.out.println("7.게시판");
	if("손전등o".equals(주인공.들고있는아이템())) {
	System.out.println("8.소화기");}
	System.out.println("-----------------------------------");
	int 스테이지2 = s.nextInt();
	
	//단서
	if(스테이지2==1) {
		힌트.힌트리스트보기();
		System.out.println("-----------------------------------");
		System.out.println("단서를 확인하세요. /skip/");
		System.out.println("-----------------------------------");
		int 힌트1 = s.nextInt();
	}
	
	
	//아이템목록
	if(스테이지2==2) {
		while(true) {
		인벤토리.인벤토리출력();
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.아이템선택");
		System.out.println("3.아이템결합");
		System.out.println("4.아이템분리");
		System.out.println("-----------------------------------");
		int 아이템1 = s.nextInt();
		
		if(아이템1==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(아이템1==2) {
			System.out.println("-----------------------------------");
			System.out.println("사용할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템선택 = s.next();
			
			if ("부러진카드".equals(아이템선택)) {
				주인공.장착아이템("부러진카드");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			} else if ("손전등o".equals(아이템선택)) {
				주인공.장착아이템("손전등o");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			}else {
				System.out.println("-----------------------------------");
				System.out.println("장착할 수 없습니다.");
				System.out.println("-----------------------------------");
			}
		}
		if(아이템1==3) {
			System.out.println("-----------------------------------");
			System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템결합1 = s.next();
			String 아이템결합2 = s.next();
			
			if("손전등x".equals(아이템결합1)&&"건전지".equals(아이템결합2)) {
				인벤토리.아이템만들기("손전등o", "1");
				인벤토리.수량증가("손전등o");
				아이템.손전등o += 1;
				주인공.힌트포인트 += 20;
				인벤토리.수량감소("손전등x");
				인벤토리.수량감소("건전지");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("손전등을 사용할 수 있습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}else if ("건전지".equals(아이템결합1)&&"손전등x".equals(아이템결합2)) {
				인벤토리.아이템만들기("손전등o", "1");
				인벤토리.수량증가("손전등o");
				아이템.손전등o += 1;
				주인공.힌트포인트 += 20;
				인벤토리.수량감소("손전등x");
				인벤토리.수량감소("건전지");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("손전등을 사용할 수 있습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}	else {
				System.out.println("-----------------------------------");
				System.out.println("결합할 수 없는 조합입니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(아이템1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("분리할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템분리1 = s.next();
			
			
			
			
			if("편지".equals(아이템분리1)) {
				if(힌트.순서==0) {
					
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				System.out.println("병원 개원년도는?");Thread.sleep(500);
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				힌트.힌트만들기("병원개원년도와 사물함", 1);
				인벤토리.수량감소("편지");
				주인공.힌트포인트 += 20;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("단서를 획득하였습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (힌트.순서>0) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}
			
			if("구겨진종이".equals(아이템분리1)) {
				if(힌트.순서==1) {
					
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				System.out.println("진료시간표뒤에");Thread.sleep(500);
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				힌트.힌트만들기("진료시간표뒤에", 2);
				인벤토리.수량감소("구겨진종이");
				주인공.힌트포인트 += 20;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("단서를 획득하였습니다.");
				System.out.println("힌트포인트가 20 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (힌트.순서>1) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			else {
				System.out.println("-----------------------------------");
				System.out.println("분리를 할 수 없는 아이템입니다.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		
		}
	}
	//아이템목록 

	
	
	//개발자힌트
	if(스테이지2==3) {
		while(true) {
		개발자힌트.개발자힌트리스트보기();
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.힌트포인트 - 100개");
		System.out.println("-----------------------------------");
		System.out.println("개발자 힌트를 확인하세요.");
		System.out.println("힌트 포인트에 따라 확인 가능합니다.");
		System.out.println("-----------------------------------");
		int 힌트가격 = s.nextInt();
		
		if(힌트가격==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(힌트가격==2) {
			if(개발자힌트.순서==0&&주인공.힌트포인트>100) {
				주인공.힌트포인트 -= 100; 
			개발자힌트.개발자힌트만들기("병원개원년도 = 현재날짜 - 년수", 1);
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("병원 개원년도가 사물함 비밀번호입니다.");
			System.out.println("병원 개원년수는 게시판 병원포스터......");
			System.out.println("현재날짜는 게시판 진료시간표에......");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("힌트포인트가 - 100 차감됩니다.");
			System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
			System.out.println("-----------------------------------");
			int 개발자힌트1 = s.nextInt();
			}
			else if(개발자힌트.순서==0&&주인공.힌트포인트<100) {
				System.out.println("-----------------------------------");
				System.out.println("힌트포인트가 부족합니다.");
				System.out.println("-----------------------------------");
			}
			else if(개발자힌트.순서>0) {
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("병원 개원년도가 사물함 비밀번호입니다.");
				System.out.println("병원 개원년수는 게시판 병원포스터......");
				System.out.println("현재날짜는 게시판 진료시간표에....../skip/");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				int 개발자힌트1 = s.nextInt();
			}
		}
		
		
		}
	}
	//개발자힌트
	
	//제한시간추가
	if(스테이지2==4) {
		while(true) {
		타이머.get제한();
		System.out.println("-----------------------------------");
		System.out.println("제한시간을 추가할 수 있습니다.");
		System.out.println("-----------------------------------");
		System.out.println("  제한시간        힌트포인트");
		System.out.println("1. 이전으로");
		System.out.println("2. 50         100");
		System.out.println("3. 100        200");
		System.out.println("-----------------------------------");
		int 제한시간 = s.nextInt(); 
		
		if(제한시간==2) {
			if(주인공.힌트포인트>=100) {
				주인공.힌트포인트 -= 100; 
				타이머.set타이머(타이머.타이머+50);
				System.out.println("-----------------------------------");
				System.out.println("제한시간을 50 추가합니다.");
				System.out.println("-----------------------------------");
			}else if(주인공.힌트포인트<100) {
				System.out.println("-----------------------------------");
				System.out.println("힌트포인트가 부족합니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		if(제한시간==3) {
			if(주인공.힌트포인트>=200) {
				주인공.힌트포인트 -= 200; 
				타이머.set타이머(타이머.타이머 + 100);
				System.out.println("-----------------------------------");
				System.out.println("제한시간을 100 추가합니다.");
				System.out.println("-----------------------------------");
			}else if(주인공.힌트포인트<200) {
				System.out.println("-----------------------------------");
				System.out.println("힌트포인트가 부족합니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(제한시간==1) {
			break;
		}
		}
	}
	//제한시간추가
	
	
	
	
	//탈출하기 
	if(스테이지2==5) {
		if(아이템.부러진카드==1) {
		if("부러진카드".equals(주인공.들고있는아이템())) {
			주인공.스테이지탈출("탈출");
			타이머.stop();
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("탈출에 성공합니다.");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			break;
			
		}else {
			주인공.스테이지못나감("잠김");
			System.out.println("-----------------------------------");
			System.out.println("잠겨있습니다.");
			System.out.println("-----------------------------------");
		} 
		}else if(아이템.부러진카드==0) {
		주인공.스테이지못나감("잠김");
		System.out.println("-----------------------------------");
		System.out.println("잠겨있습니다.");
		System.out.println("-----------------------------------");
	}
			
	
	}
	//탈출하기  
	
	//사물함
	if(스테이지2==6) {
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.첫번째 칸");
		System.out.println("2.두번째 칸");
		System.out.println("3.세번째 칸");
		System.out.println("4.이전으로");
		System.out.println("-----------------------------------");
		int 사물함 = s.nextInt();
		
		//첫번째칸 
		if(사물함==1) {
			if(아이템.손전등x==0) {
			인벤토리.아이템만들기("손전등x", "4");
			인벤토리.수량증가("손전등x");
			아이템.손전등x += 1;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("손전등을 획득하였습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.손전등o>0) {
				도구아이템.도구아이템만들기("잔챙이",1);
				System.out.println("-----------------------------------");
				System.out.println("비어있습니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		//두번째칸
		if(사물함==2) {
			if(아이템.건전지==0) {
			인벤토리.아이템만들기("건전지", "3");
			인벤토리.수량증가("건전지");
			아이템.건전지 += 1;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("건전지를 획득하였습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.건전지>1) {
				도구아이템.도구아이템만들기("잔챙이",1);
				System.out.println("-----------------------------------");
				System.out.println("비어있습니다.");
				System.out.println("-----------------------------------");
			}
		}
		
		//세번째칸 
		if(사물함==3) {
			주인공.스테이지못나감("잠김");
			System.out.println("-----------------------------------");
			System.out.println("잠겨있습니다. ");
			System.out.println("비밀번호를 입력하세요. ");
			System.out.println("-----------------------------------");
			int 비밀번호 = s.nextInt();
			
			if(비밀번호==1892) {
			if(아이템.구겨진종이==0) {
				System.out.println("-----------------------------------");
				System.out.println("열렸습니다.");
				System.out.println("-----------------------------------");
				인벤토리.아이템만들기("구겨진종이", "5");
				인벤토리.수량증가("구겨진종이");
				아이템.구겨진종이 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("구겨진종이를 획득하였습니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.구겨진종이>0) {
				도구아이템.도구아이템만들기("잔챙이",1);
				System.out.println("-----------------------------------");
				System.out.println("비어있습니다.");
				System.out.println("-----------------------------------");
			}
			}
			if(비밀번호!=1892) {
				 try
				 {
				 AudioInputStream ais12 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\psxx.wav"));
				Clip clip12 = AudioSystem.getClip();
				clip12.stop();
				clip12.open(ais12);
				clip12.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				System.out.println("-----------------------------------");
				System.out.println("비밀번호가 틀렸습니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		if(사물함==4){
			break;
		}
		
		}//while
	}
	//사물함
	
	//게시판
	if(스테이지2==7) {
		while(true) {
		System.out.println("-----------------------------------");
		
		if("손전등o".equals(주인공.들고있는아이템())) {
			System.out.println("1.진료시간표");
			System.out.println("2.헌혈광고");
			System.out.println("3.쪽지게시판");
			System.out.println("4.병원포스터");
			System.out.println("5.이전으로");
		}else {
			System.out.println("어두워서 잘 보이지 않습니다.");
			break;
		}
		System.out.println("-----------------------------------");
		int 게시판 = s.nextInt();
		
		//진료시간표
		if(게시판==1&&힌트.순서==2) {
			if(아이템.부러진카드==0) {
			인벤토리.아이템만들기("부러진카드", "2");
			인벤토리.수량증가("부러진카드");
			아이템.부러진카드 +=1;
			주인공.힌트포인트 += 20;
			
			try
			 {
			 AudioInputStream ais14 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\Tearing Paper.wav"));
			Clip clip14 = AudioSystem.getClip();
			clip14.stop();
			clip14.open(ais14);
			clip14.start();
			 }
			 catch (Exception ex) {
				 
			 }
			System.out.println("-----------------------------------");
			System.out.println("진료기록표를 떼어냅니다.");
			System.out.println("-----------------------------------");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("부러진카드를 획득하였습니다.");
			System.out.println("힌트포인트가 20 올라갑니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			else if(아이템.부러진카드>0) {
				System.out.println("-----------------------------------");
				System.out.println("아무것도 적혀있지 않습니다.");
				System.out.println("-----------------------------------");
			}
			
		}
		
		
		if(게시판==1&&힌트.순서<2) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("세원 정신병원 진료시간표");
			System.out.println("제 1진료실 : 10:00 ~ 18:00");
			System.out.println("제 2진료실 : 10:00 ~ 18:00");
			System.out.println("제 3진료실 : 10:00 ~ 19:00");
			System.out.println("제 4진료실 : 10:00 ~ 16:00");
			System.out.println("점심시간 : 10:00 ~ 18:00");
			System.out.println("2012년 12월 5일  당직근무자 최철기");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("진료시간표입니다. /skip/");
			System.out.println("-----------------------------------");
			int 진료시간표 = s.nextInt();
		}
		//헌혈광고
		if(게시판==2) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("너와 나 ");
			System.out.println("힘을 합치면 사랑이 + 됩니다.");
			System.out.println("-대한적십자사-");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("헌혈광고입니다. /skip/");
			System.out.println("-----------------------------------");
			int 헌혈광고 = s.nextInt();
		}
		
		//쪽지게시판
				if(게시판==3) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("고생하시는 직원분들 고맙습니다. -지은이-");
			System.out.println("5층은 왜 맨날 잠겨있나요? -3입원실 최사장-");
			System.out.println("1입원실 고은이의 장난감을 찾습니다 -고은맘-");
			System.out.println("욕설이나 비방은 삼가해주세요 -게시판관리자-");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("쪽지게시판 입니다. /skip/");
			System.out.println("-----------------------------------");
			int 쪽지게시판 = s.nextInt();
				}
		
		//병원포스터		
			if(게시판==4) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("마음에 상처를 입은 사람들 곁에서 ");
			System.out.println("언제나 환자를 먼저 생각하는 마음으로 ");
			System.out.println("여러분과 함께해온 120년의 시간......");
			System.out.println("소중한 시간과 소중한 경험을 바탕으로");
			System.out.println("여러분의 마음을 치유하겠습니다.");
			System.out.println("세원 정신과 병원장 서지원");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("병원포스터 입니다. /skip/");
			System.out.println("-----------------------------------");
					int 병원포스터 = s.nextInt();
			}
			
			//이전으로
			if(게시판==5) {
				break;
			}
		
		}
	}
	//게시판
	
	//소화기
	if(스테이지2==8) {
		if(아이템.편지==0) {
			인벤토리.아이템만들기("편지", "6");
			인벤토리.수량증가("편지");
			아이템.편지 += 6;
			System.out.println("-----------------------------------");
			System.out.println("소화기 아래에서 편지를 발견합니다.");
			System.out.println("-----------------------------------");
		}
		else if(아이템.편지>0) {
			System.out.println("-----------------------------------");
			System.out.println("소화기입니다.");
			System.out.println("-----------------------------------");
		}
	}
	//소화기 
	
	
	}//while 
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");Thread.sleep(500); 주인공.스테이지못나감("잠김");
	System.out.println("으악!");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("-----------------------------------");
	System.out.println("기절했습니다. /skip/");
	System.out.println("-----------------------------------");
	int 스킵4 = s.nextInt();
	
	
	
	
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("         STAGE 2 - 결과 ");
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("-----------------------------------");
	System.out.println("획득한 아이템 "); 
	인벤토리.인벤토리출력();
	System.out.println("획득한 힌트 "); 
	힌트.힌트리스트보기();
	주인공.힌트포인트 += 500;
	주인공.힌트포인트 += 타이머.get타이머();
	System.out.println("현재 힌트포인트 : " +주인공.힌트포인트 );
	System.out.println("-----------------------------------");
	
	
	int 스킵5 = s.nextInt();
	
	인벤토리.수량감소("손전등o");
	인벤토리.수량감소("부러진카드");
	인벤토리.수량감소("구겨진종이");
	인벤토리.수량감소("편지");
	힌트.힌트지우기("지우기", 10);
	개발자힌트.개발자힌트지우기("지우기", 10);
	도구아이템.도구아이템지우기("전부", 10);
	배경음악2.close();
	뮤직 이벤트음악2 = new 뮤직("Micro.mp3", true);
	이벤트음악2.start();
	
	
	
	while(true) {	
		scount += 1;
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("         EVENT - 슬롯머신");
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("-----------------------------------");
	System.out.println("기회는 3번입니다.");
	System.out.println("레버를 당겨주세요. /skip/");
	System.out.println("-----------------------------------");
	int 슬롯2 = s.nextInt();
	주인공.슬롯머신("당겨당겨");
	for (int i = 0; i < 슬롯길이 ; i  ++) {
		for(int 랜덤=0; 랜덤<슬롯길이; 랜덤++) {  
		슬롯[랜덤] = (int)(Math.random()*slot)+1;
	}
	for ( int j = 0; j < 슬롯길이 ; j ++) { // 스도쿠 행 생성  행으로 나열  
	
		슬롯배열[i][j] = 슬롯[j];
		
	}
	
	}
	
	
	for(int a=0; a<슬롯길이; a++) {

		for (int b=0; b<슬롯길이; b++) {
					System.out.print(슬롯배열[a][b]);Thread.sleep(900);		
		}
		System.out.println("");
		
	}
	if(슬롯배열[0][0]==1&&슬롯배열[0][1]==1&&슬롯배열[0][2]==1) {
		주인공.힌트포인트 += 100;
	}
	else if(슬롯배열[0][0]==2&&슬롯배열[0][1]==2&&슬롯배열[0][2]==2) {
		주인공.힌트포인트 += 100; System.out.println("터졌다!");
	}
	else if(슬롯배열[0][0]==3&&슬롯배열[0][1]==3&&슬롯배열[0][2]==3) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==1&&슬롯배열[1][1]==1&&슬롯배열[1][2]==1) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==2&&슬롯배열[1][1]==2&&슬롯배열[1][2]==2) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[1][0]==3&&슬롯배열[1][1]==3&&슬롯배열[1][2]==3) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==1&&슬롯배열[2][1]==1&&슬롯배열[2][2]==1) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==2&&슬롯배열[2][1]==2&&슬롯배열[2][2]==2) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	else if(슬롯배열[2][0]==3&&슬롯배열[2][1]==3&&슬롯배열[2][2]==3) {
		주인공.힌트포인트 += 100;  System.out.println("터졌다!");
	}
	if(scount==3) {
		System.out.println("-----------------------------------");
		System.out.println("획득한포인트 : " + 주인공.힌트포인트+ "/skip/");
		System.out.println("-----------------------------------");
		int 슬롯스킵2 = s.nextInt();
		scount = 0;
		break;
		
	}
		
			}
	
	이벤트음악2.close();
	
		
		
		
			
		
	
	뮤직 배경음악3 = new 뮤직("Day_of_Chaos.mp3", true);
	배경음악3.start();

	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("......?");Thread.sleep(500);
	System.out.println("여긴 어디지?  /skip/");
	System.out.println("***********************************");Thread.sleep(500);
	int 스킵53 = s.nextInt();
	
	
	순찰 순찰1 = new 순찰();
	타이머 타이머2 = new 타이머();
	타이머2.start();
	순찰1.start();
	
	while(true) {
			
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("         STAGE 3 - 새로운방");
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println("-----------------------------------");
	System.out.println("제한시간 :" + 타이머2.get타이머());
	System.out.println("힌트포인트 :" + 주인공.힌트포인트);
	if(주인공.들고있는아이템()==null) {
		System.out.println("장착아이템  : 없음");
	}else {
	System.out.println("장착아이템  :" + 주인공.들고있는아이템());
	}
	System.out.println("-----------------------------------");
	System.out.println("1.단서");
	System.out.println("2.아이템");
	System.out.println("3.개발자힌트");
	System.out.println("4.제한시간추가");
	System.out.println("-----------------------------------");
	System.out.println("5.탈출하기");
	System.out.println("6.종이박스");
	System.out.println("7.금고");
	System.out.println("8.휴지통");
	System.out.println("9.탁자");
	System.out.println("10.서랍장");
	System.out.println("11.액자");
	System.out.println("-----------------------------------");
	int 스테이지3 = s.nextInt();

	
	//게임종료  타임오버
	if(타이머2.get타이머()==0) {
		배경음악3.close();
		순찰1.stop();	
		뮤직 엔딩뮤직 = new 뮤직 ("Lasting_Hope.mp3",  true);
		엔딩뮤직.start();
		while(true) {
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			System.out.println("스테이지 3 - 실패 "); 
			System.out.println("획득한 아이템 "); 
			인벤토리.인벤토리출력();
			System.out.println("획득한 힌트 "); 
			힌트.힌트리스트보기();
			System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			int 엔딩1 = s.nextInt();
			
			if(엔딩1==20) {
				break;
			}
		}
	}
	// 게임종료 타임오버 
	
	
	
	//단서
	if(스테이지3==1) {
		힌트.힌트리스트보기();
		System.out.println("-----------------------------------");
		System.out.println("단서를 확인하세요. /skip/");
		System.out.println("-----------------------------------");
		int 힌트1 = s.nextInt();
	}
	
	
	//아이템목록
	if(스테이지3==2) {
		while(true) {
		인벤토리.인벤토리출력();
		System.out.println("-----------------------------------");
		System.out.println("1.이전으로");
		System.out.println("2.아이템선택");
		System.out.println("3.아이템결합");
		System.out.println("4.아이템분리");
		System.out.println("-----------------------------------");
		int 아이템1 = s.nextInt();
		
		if(아이템1==1) {
			System.out.println("-----------------------------------");
			System.out.println("돌아갑니다.");
			System.out.println("-----------------------------------");
			break;
		}
		
		if(아이템1==2) {
			System.out.println("-----------------------------------");
			System.out.println("사용할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템선택 = s.next();
			
			if ("망치".equals(아이템선택)) {
				주인공.장착아이템("망치");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			} else if ("서랍장열쇠".equals(아이템선택)) {
				주인공.장착아이템("서랍장열쇠");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			}else if ("금고열쇠".equals(아이템선택)) {
				주인공.장착아이템("금고열쇠");
				System.out.println("-----------------------------------");
				System.out.println("아이템을 장착합니다.");
				System.out.println("-----------------------------------");
			}else {
				System.out.println("-----------------------------------");
				System.out.println("장착할 수 없습니다.");
				System.out.println("-----------------------------------");
			}
		}
		if(아이템1==3) {
			System.out.println("-----------------------------------");
			System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템결합1 = s.next();
			String 아이템결합2 = s.next();

				System.out.println("-----------------------------------");
				System.out.println("결합할 수 없는 조합입니다.");
				System.out.println("-----------------------------------");		
		}
		if(아이템1==4) {
			
			System.out.println("-----------------------------------");
			System.out.println("분리할 아이템의 이름을 입력해주세요.");
			System.out.println("-----------------------------------");
			String 아이템분리1 = s.next();

			if("접힌쪽지".equals(아이템분리1)) {
				if(힌트.순서==0) {
					
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				System.out.println("액자에 적혀있는 내용");Thread.sleep(500);
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				힌트.힌트만들기("액자에 적혀있는 내용", 1);
				인벤토리.수량감소("접힌쪽지");
				주인공.힌트포인트 += 30;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("단서를 획득하였습니다.");
				System.out.println("힌트포인트가 30 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (힌트.순서>0) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}
			
			if("오래된수첩".equals(아이템분리1)) {
				if(힌트.순서==1) {
					
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				System.out.println("+1년은 몇개월인가?");Thread.sleep(500);
				System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
				힌트.힌트만들기("+1년은 몇개월인가?", 2);
				인벤토리.수량감소("오래된수첩");
				주인공.힌트포인트 += 30;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("단서를 획득하였습니다.");
				System.out.println("힌트포인트가 30 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (힌트.순서>1) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			} if("천뭉치".equals(아이템분리1)) {
				if(아이템.서랍장열쇠==0) {
				인벤토리.아이템만들기("서랍장열쇠", "2");
				인벤토리.수량증가("서랍장열쇠");
				인벤토리.수량감소("천뭉치");
				주인공.힌트포인트 += 30;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("서랍장열쇠를 획득하였습니다.");
				System.out.println("힌트포인트가 30 올라갑니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if (아이템.서랍장열쇠>0) {
					System.out.println("-----------------------------------");
					System.out.println("분리한 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}else {
				System.out.println("-----------------------------------");
				System.out.println("분리를 할 수 없는 아이템입니다.");
				System.out.println("-----------------------------------");
			}
		}
		
		
		}
		}
		
		//개발자힌트
		if(스테이지3==3) {
			while(true) {
			개발자힌트.개발자힌트리스트보기();
			System.out.println("-----------------------------------");
			System.out.println("1.이전으로");
			System.out.println("2.힌트포인트 - 100개");
			if(개발자힌트.순서==1) {
			System.out.println("3.힌트포인트 - 1500개");
			}
			System.out.println("-----------------------------------");
			System.out.println("개발자 힌트를 확인하세요.");
			System.out.println("힌트 포인트에 따라 확인 가능합니다.");
			System.out.println("-----------------------------------");
			int 힌트가격 = s.nextInt();
			
			if(힌트가격==1) {
				System.out.println("-----------------------------------");
				System.out.println("돌아갑니다.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(힌트가격==2) {
				if(개발자힌트.순서==0&&주인공.힌트포인트>100) {
					주인공.힌트포인트 -= 100; 
				개발자힌트.개발자힌트만들기("병원개원년도 = 현재날짜 - 년수", 1);
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("액자내용 + 오래된수첩내용");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("-----------------------------------");
				System.out.println("힌트포인트가 - 100 차감됩니다.");
				System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
				System.out.println("-----------------------------------");
				int 개발자힌트1 = s.nextInt();
				}
				else if(개발자힌트.순서==0&&주인공.힌트포인트<100) {
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 부족합니다.  /skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트2 = s.nextInt();
				}
				else if(개발자힌트.순서>0) {
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("액자내용 + 오래된수첩내용");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					int 개발자힌트3 = s.nextInt();
				}
			}
			if(힌트가격==3) {
				if(개발자힌트.순서==1&&주인공.힌트포인트>1500) {
					주인공.힌트포인트 -= 1500; 
				개발자힌트.개발자힌트만들기("액자내용 + 오래된수첩", 1);
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("탈출 비밀번호는 922312");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("-----------------------------------");
				System.out.println("힌트포인트가 - 1500 차감됩니다.");
				System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
				System.out.println("-----------------------------------");
				int 개발자힌트4 = s.nextInt();
				}
				else if(개발자힌트.순서==1&&주인공.힌트포인트<1500) {
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 부족합니다. /skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트5 = s.nextInt();
				}
				else if(개발자힌트.순서>1) {
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("탈출 비밀번호는 922312");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					int 개발자힌트6 = s.nextInt();
				}
			}
			
			}
		}
		//개발자힌트
		
		//제한시간추가
		if(스테이지3==4) {
			while(true) {
			타이머2.get제한();
			System.out.println("-----------------------------------");
			System.out.println("제한시간을 추가할 수 있습니다.");
			System.out.println("-----------------------------------");
			System.out.println("  제한시간        힌트포인트");
			System.out.println("1. 이전으로");
			System.out.println("2. 50         100");
			System.out.println("3. 100        200");
			System.out.println("-----------------------------------");
			int 제한시간 = s.nextInt(); 
			
			if(제한시간==1) {
				break;
			}
			
			if(제한시간==2) {
				if(주인공.힌트포인트>=100) {
					주인공.힌트포인트 -= 100; 
					타이머2.set타이머(타이머2.타이머+50);
					System.out.println("-----------------------------------");
					System.out.println("제한시간을 50 추가합니다.");
					System.out.println("-----------------------------------");
				}else if(주인공.힌트포인트<100) {
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 부족합니다.");
					System.out.println("-----------------------------------");
				}
				
			}
			
			if(제한시간==3) {
				if(주인공.힌트포인트>=200) {
					주인공.힌트포인트 -= 200; 
					타이머2.set타이머(타이머2.타이머 + 100);
					System.out.println("-----------------------------------");
					System.out.println("제한시간을 100 추가합니다.");
					System.out.println("-----------------------------------");
				}else if(주인공.힌트포인트<200) {
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 부족합니다.");
					System.out.println("-----------------------------------");
				}
				
			}
			
			}
		}
		//제한시간추가
		
		//탈출하기
		if(스테이지3==5) {

			주인공.스테이지못나감("잠김");
			System.out.println("-----------------------------------");
			System.out.println("잠겨있습니다. ");
			System.out.println("비밀번호를 입력하세요. ");
			System.out.println("-----------------------------------");
			int 비밀번호 = s.nextInt();
			
			if(비밀번호==922312) {
				주인공.스테이지탈출("탈출");
				타이머2.stop();
				순찰1.stop();
				System.out.println("-----------------------------------");
				System.out.println("열렸습니다.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(비밀번호!=922312) {
				 try
				 {
				 AudioInputStream ais12 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\psxx.wav"));
				Clip clip12 = AudioSystem.getClip();
				clip12.stop();
				clip12.open(ais12);
				clip12.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				System.out.println("-----------------------------------");
				System.out.println("비밀번호가 틀렸습니다. /skip/");
				System.out.println("-----------------------------------");
				int 탈출3 = s.nextInt();
			}
		}
		//종이박스
		if(스테이지3==6) {
			도구아이템.도구아이템만들기("잔챙이",1);
			System.out.println("-----------------------------------");
			System.out.println("비어있습니다. /skip/");
			System.out.println("-----------------------------------");
			int 종이박스 = s.nextInt();
		}
		
		//금고
		if(스테이지3==7) {
			
			if("금고열쇠".equals(주인공.들고있는아이템())) {
			if(아이템.오래된수첩==0) {
				인벤토리.아이템만들기("오래된수첩", "5");
				인벤토리.수량증가("오래된수첩");
				아이템.오래된수첩 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("오래된수첩을 획득하였습니다. /skip/");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				int 금고1 = s.nextInt();
			}else if(아이템.오래된수첩>0) {
				System.out.println("-----------------------------------");
				System.out.println("비어있습니다. /skip/");
				System.out.println("-----------------------------------");
				int 금고2 = s.nextInt();
			}
			
			}else {
				주인공.스테이지못나감("잠김");
				System.out.println("-----------------------------------");
				System.out.println("잠겨있습니다. /skip/");
				System.out.println("-----------------------------------");
				int 금고3 = s.nextInt();
			}
			
		} //금고 
		
		//휴지통
		if(스테이지3==8) {
			if(아이템.천뭉치==0) {
				인벤토리.아이템만들기("천뭉치", "4");
				인벤토리.수량증가("천뭉치");
				아이템.천뭉치 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("천뭉치를 획득하였습니다. /skip/");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				int 휴지통1 = s.nextInt();
			}
			if(아이템.천뭉치>0) {
				System.out.println("-----------------------------------");
				System.out.println("비어있습니다. /skip/");
				System.out.println("-----------------------------------");
				int 휴지통2 = s.nextInt();
			}
		}
		
		//탁자
		if(스테이지3==9) {
			while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.이전으로");
			if(아이템.접힌쪽지==0) {
			System.out.println("2.쪽지");
			}
			if(아이템.금고열쇠==0) {
			System.out.println("3.꽃병");}
			System.out.println("-----------------------------------");
			int 탁자 = s.nextInt();
			
			if(탁자==1) {
				break;
			}
			
			//쪽지
			if(탁자==2) {
			if(아이템.접힌쪽지==0) {
			인벤토리.아이템만들기("접힌쪽지", "2");
			인벤토리.수량증가("접힌쪽지");
			아이템.접힌쪽지 += 1;
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");	
			System.out.println("쪽지를 획득하였습니다. /skip/ ");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			int 쪽지1 = s.nextInt();
			
			}
			
			}//쪽지
			
		if(탁자==3) {
			if(아이템.금고열쇠==0) {
			if("망치".equals(주인공.들고있는아이템())) {
				try
				 {
				 AudioInputStream ais3 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\windowbroke.wav"));
				Clip clip3 = AudioSystem.getClip();
				clip3.stop();
				clip3.open(ais3);
				clip3.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				인벤토리.아이템만들기("금고열쇠", "3");
				인벤토리.수량증가("금고열쇠");
				아이템.금고열쇠 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");	
				System.out.println("금고열쇠를 획득하였습니다. ");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				int 꽃병1 = s.nextInt();
			}else {
				System.out.println("-----------------------------------");
				System.out.println("꽃병입니다. /skip/");
				System.out.println("-----------------------------------");
				int 꽃병2 = s.nextInt();
			}
			}
		
		}
			
			}//while
		}
		
		//서랍장
		if(스테이지3==10) {
			if("서랍장열쇠".equals(주인공.들고있는아이템())) {
				try
				 {
				 AudioInputStream ais3 = 
				AudioSystem.getAudioInputStream
				(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\boxopen.wav"));
				Clip clip3 = AudioSystem.getClip();
				clip3.stop();
				clip3.open(ais3);
				clip3.start();
				 }
				 catch (Exception ex)
				 {
				  } 
				if(아이템.망치==0) {
					
				인벤토리.아이템만들기("망치", "1");
				인벤토리.수량증가("망치");
				아이템.망치 += 1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");	
				System.out.println("망치를 획득하였습니다. /skip/");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				int 서랍장1 =s.nextInt();
				}
				else if (아이템.망치>0) {
					System.out.println("-----------------------------------");
					System.out.println("비어있습니다. /skip/");
					System.out.println("-----------------------------------");
					int 서랍장2 =s.nextInt();
				}
			}else {
				주인공.스테이지못나감("잠김");
				System.out.println("-----------------------------------");
				System.out.println("잠겨 있습니다. /skip/");
				System.out.println("-----------------------------------");
				int 서랍장3 =s.nextInt();
			}
			
		}
		
		//액자
		if(스테이지3==11) {
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("인생은 언제나 9회말 2아웃 2스트라크 3볼처럼...");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("-----------------------------------");
			System.out.println("액자 입니다. /skip/");
			System.out.println("-----------------------------------");
			int 액자 = s.nextInt();
		}
		
		
		
		//직원에게들킴 게임오버
		if(순찰1.체크==1) {
			배경음악3.close();
			타이머2.stop();
			뮤직 엔딩뮤직1 = new 뮤직 ("Lasting_Hope.mp3",  true);
			엔딩뮤직1.start();
			순찰1.set타이밍(2);
			while(true) {
				
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("스테이지 3 - 실패 "); 
				System.out.println("획득한 아이템 "); 
				인벤토리.인벤토리출력();
				System.out.println("획득한 힌트 "); 
				힌트.힌트리스트보기();
				System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				int 엔딩1 = s.nextInt();
				
				if(엔딩1==20) {
					break;
				}
		}
		}
		//직원에게들켜 게임오버  
		
		
	}//while
	//아이템목록 
	
	
	
	
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("후......나왔다......");Thread.sleep(500);
	System.out.println("잠깐 수첩에 뭐라고 또 적혀있다!");Thread.sleep(500);
	System.out.println("***********************************");Thread.sleep(500);
	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
	System.out.println("힌트를 획득하였습니다.");
	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
	System.out.println("-----------------------------------");
	System.out.println("다음 스테이지로 이동합니다. /skip/");
	System.out.println("-----------------------------------");
	int 스킵44 = s.nextInt();
	
	
	
	
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("         STAGE 3 - 결과 ");
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("-----------------------------------");
	System.out.println("획득한 아이템 "); 
	인벤토리.인벤토리출력();
	System.out.println("획득한 힌트 "); 
	힌트.힌트리스트보기();
	주인공.힌트포인트 += 500;
	주인공.힌트포인트 += 타이머2.get타이머();
	System.out.println("현재 힌트포인트 : " +주인공.힌트포인트 );
	System.out.println("-----------------------------------");
	
	
	int 스킵6 = s.nextInt();
	
	인벤토리.수량감소("망치");
	인벤토리.수량감소("오래된수첩");
	인벤토리.수량감소("접힌쪽지");
	인벤토리.수량감소("서랍장열쇠");
	인벤토리.수량감소("금고열쇠");
	인벤토리.수량감소("천뭉치");
	힌트.힌트지우기("지우기", 10);
	개발자힌트.개발자힌트지우기("지우기", 10);
	도구아이템.도구아이템지우기("전부", 10);
	배경음악3.close();
	
	
	뮤직 이벤트음악3 = new 뮤직("Micro.mp3", true);
	이벤트음악3.start();

	힌트.힌트만들기("정신과 진료실로 가시오.", 1);

	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("          EVENT - 토토 ");
	System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
	System.out.println("---------------------------------");
	System.out.println("포인트를 걸고 승무패를 맞춰보세요.");
	System.out.println("맞추면 2배로 돌려받습니다.");
	System.out.println("3개의 경기가 준비중입니다.");
	System.out.println("---------------------------------");
	System.out.println("현재보유한 포인트 : "+ 주인공.힌트포인트);
	System.out.print("사용할 금액:");
	int toto = s.nextInt(); 
	
	주인공.힌트포인트 -= toto;

	
	System.out.println("---------------------------------");	
	System.out.println("맨유 vs 리버풀");
	System.out.println("1. 맨유 승");
	System.out.println("2. 리버풀 승");
	System.out.println("3. 무승부 ");
	System.out.println("---------------------------------");
	int to1 = s.nextInt();
	
	// 토토1번일때
	if(to1==1) {
		
		맨유 += random.nextInt(3);
		리버풀 += random.nextInt(3);
		if(맨유>리버풀) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("맞췄습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 승리합니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");	
		}else if (맨유<리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 패배합니다.");
			System.out.println("---------------------------------");	
		} else if (맨유==리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유와 리버풀이"+맨유+":"+리버풀+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");	
		}	
	}// 토토1번때
	
	if(to1==2) {
		맨유 += random.nextInt(3);
		리버풀 += random.nextInt(3);
		if(맨유>리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 승리합니다.");
			System.out.println("---------------------------------");	
		}else if (맨유<리버풀) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("맞췄습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 패배합니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");	
		} else if (맨유==리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유와 리버풀이"+맨유+":"+리버풀+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");	
		}	
	}
	if(to1==3) {
		맨유 += random.nextInt(3);
		리버풀 += random.nextInt(3);
		if(맨유>리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 승리합니다.");
		
			System.out.println("---------------------------------");	
		}else if (맨유<리버풀) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("맨유가 리버풀에게"+맨유+":"+리버풀+"스코어로 패배합니다.");
			System.out.println("---------------------------------");	
		} else if (맨유==리버풀) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("맞췄습니다!");
			System.out.println("맨유와 리버풀이"+맨유+":"+리버풀+"스코어로 무승부입니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");	
		}	
	}  //토토 1 
	
	
	
	System.out.println("---------------------------------");	
	System.out.println("첼시 vs 번리");
	System.out.println("1. 첼시 승");
	System.out.println("2. 번리 승");
	System.out.println("3. 무승부 ");
	System.out.println("---------------------------------");	
	
	int to2 = s.nextInt();

	// 토토2번일때
	if(to2==1) {
		
		번리 += random.nextInt(3);
		첼시 += random.nextInt(5);
		if(번리>첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 승리합니다.");
			System.out.println("---------------------------------");	
		}else if (번리<첼시) {
			System.out.println("---------------------------------");	
			System.out.println("맞췄습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 패배합니다.");
			주인공.힌트포인트 += toto*2;
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	

		} else if (번리==첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리와 첼시가 "+번리+":"+첼시+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");	
		}	
	}// 토토1번때
	
	if(to2==2) {
		번리 += random.nextInt(3);
		첼시 += random.nextInt(5);
		if(번리>첼시) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("맞췄습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 승리합니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");	
		}else if (번리<첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 패배합니다.");
			System.out.println("---------------------------------");	
		} else if (번리==첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리와 첼시가 "+번리+":"+첼시+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");	
		}	
	}
	if(to2==3) {
		번리 += random.nextInt(3);
		첼시 += random.nextInt(5);
		if(번리>첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 승리합니다.");
			System.out.println("---------------------------------");	
		}else if (번리<첼시) {
			System.out.println("---------------------------------");	
			System.out.println("틀렸습니다!");
			System.out.println("번리가 첼시에게"+번리+":"+첼시+"스코어로 패배합니다.");
			System.out.println("---------------------------------");	
		} else if (번리==첼시) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");	
			System.out.println("맞췄습니다!");
			System.out.println("번리와 첼시가 "+번리+":"+첼시+"스코어로 무승부입니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");	
		}	
	}//토토2 
	
	
	System.out.println("---------------------------------");
	System.out.println("토트넘 vs 왓포드");
	System.out.println("1. 토트넘 승");
	System.out.println("2. 왓포드 승");
	System.out.println("3. 무승부 ");
	System.out.println("---------------------------------");
	
	int to3 = s.nextInt();

	// 토토3번일때
	if(to3==1) {
		
		왓포드 += random.nextInt(2);
		토트넘 += random.nextInt(3);
		if(왓포드>토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 승리합니다.");
			System.out.println("---------------------------------");
		}else if (왓포드<토트넘) {
			System.out.println("---------------------------------");
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("맞췄습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 패배합니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");
		} else if (왓포드==토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드와 토트넘이 "+왓포드+":"+토트넘+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");
		}	
		
	}
	
	if(to3==2) {
		왓포드 += random.nextInt(2);
		토트넘 += random.nextInt(3);
		if(왓포드>토트넘) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("맞췄습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 승리합니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");
		}else if (왓포드<토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 패배합니다.");
			System.out.println("---------------------------------");
		} else if (왓포드==토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드와 토트넘이 "+왓포드+":"+토트넘+"스코어로 무승부입니다.");
			System.out.println("---------------------------------");
		}	
		
	}
	if(to3==3) {
		왓포드 += random.nextInt(2);
		토트넘 += random.nextInt(3);
		if(왓포드>토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 승리합니다.");
			System.out.println("---------------------------------");
		}else if (왓포드<토트넘) {
			System.out.println("---------------------------------");
			System.out.println("틀렸습니다!");
			System.out.println("왓포드가 토트넘에게"+왓포드+":"+토트넘+"스코어로 패배합니다.");
			System.out.println("---------------------------------");
		} else if (왓포드==토트넘) {
			 try
			 {
			 AudioInputStream ais8 = AudioSystem.getAudioInputStream
					 (new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\coins_5.wav"));
			Clip clip8 = AudioSystem.getClip();
			clip8.stop();
			clip8.open(ais8);
			clip8.start();
			 }
			 catch (Exception ex)
			 {
			 } 
			System.out.println("---------------------------------");
			System.out.println("맞췄습니다!");
			System.out.println("왓포드와 토트넘이 "+왓포드+":"+토트넘+"스코어로 무승부입니다.");
			주인공.힌트포인트 += toto*2;
			System.out.println("---------------------------------");
		}
	}//토토3
	
	System.out.println("보유한 포인트 : "+주인공.힌트포인트+ "   /skip/");
	int 스킵 = s.nextInt();
	try
	 {
	 AudioInputStream ais10 = 
	AudioSystem.getAudioInputStream
	(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\door-open-7.wav"));
	Clip clip10 = AudioSystem.getClip();
	clip10.stop();
	clip10.open(ais10);
	clip10.start();
	 }
	 catch (Exception ex)
	 {
	  } 
	
		이벤트음악3.stop();
		
		뮤직 배경음악4 = new 뮤직("Day_of_Chaos.mp3", true);
		배경음악4.start();
		순찰 순찰2 = new 순찰(); 
		타이머 타이머3 = new 타이머();
		타이머3.start();
		순찰2.start();
		전화 전화1 = new 전화();
		전화1.start();
		
		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("진료실이다......");Thread.sleep(500); 주인공.스테이지못나감("잠김");
		System.out.println("뭐야 저절로 잠기네....../skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int 스킵8 = s.nextInt();
		System.out.println(전화1.체크);
	
		
		while(true) {	
			
			
			
			
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("         STAGE 4-1  진료실");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("-----------------------------------");
		System.out.println("제한시간 :" + 타이머3.get타이머());
		System.out.println("힌트포인트 :" + 주인공.힌트포인트);
		if(주인공.들고있는아이템()==null) {
			System.out.println("장착아이템  : 없음");
		}else {
		System.out.println("장착아이템  :" + 주인공.들고있는아이템());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.단서");
		System.out.println("2.아이템");
		System.out.println("3.개발자힌트");
		System.out.println("4.제한시간추가");
		System.out.println("-----------------------------------");
		System.out.println("5.돌아가기");
		System.out.println("6.진열장");
		System.out.println("7.선반");
		System.out.println("8.포스터");
		System.out.println("9.진료실책상");
		System.out.println("10.작은 문");
		System.out.println("-----------------------------------");
		int 스테이지4 = s.nextInt();
		
	
		
		
		//게임종료  타임오버
		if(타이머3.get타이머()==0) {
			배경음악4.close();
			순찰2.stop();	
			뮤직 엔딩뮤직 = new 뮤직 ("Lasting_Hope.mp3",  true);
			엔딩뮤직.start();
			while(true) {
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("스테이지 3 - 실패 "); 
				System.out.println("획득한 아이템 "); 
				인벤토리.인벤토리출력();
				System.out.println("획득한 힌트 "); 
				힌트.힌트리스트보기();
				System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				int 엔딩1 = s.nextInt();
				
				if(엔딩1==20) {
					break;
				}
			}
		}
		// 게임종료 타임오버 
		
		
		
		//단서
		if(스테이지4==1) {
			힌트.힌트리스트보기();
			System.out.println("-----------------------------------");
			System.out.println("단서를 확인하세요. /skip/");
			System.out.println("-----------------------------------");
			int 힌트1 = s.nextInt();
		}
		
		
		//아이템목록
		if(스테이지4==2) {
			while(true) {
			인벤토리.인벤토리출력();
			System.out.println("-----------------------------------");
			System.out.println("1.이전으로");
			System.out.println("2.아이템선택");
			System.out.println("3.아이템결합");
			System.out.println("4.아이템분리");
			System.out.println("-----------------------------------");
			int 아이템1 = s.nextInt();
			
			if(아이템1==1) {
				System.out.println("-----------------------------------");
				System.out.println("돌아갑니다.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(아이템1==2) {
				System.out.println("-----------------------------------");
				System.out.println("사용할 아이템의 이름을 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템선택 = s.next();
				
				if ("붕대칼".equals(아이템선택)) {
					주인공.장착아이템("붕대칼");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
			}
			if(아이템1==3) {
				System.out.println("-----------------------------------");
				System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템결합1 = s.next();
				String 아이템결합2 = s.next();
				
				if("붕대".equals(아이템결합1)&&"칼날".equals(아이템결합2)) {
					인벤토리.아이템만들기("붕대칼", "1");
					인벤토리.수량증가("붕대칼");
					아이템.붕대칼 += 1;
					주인공.힌트포인트 += 20;
					인벤토리.수량감소("붕대");
					인벤토리.수량감소("칼날");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("붕대칼을 사용할 수 있습니다.");
					System.out.println("힌트포인트가 20 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if ("붕대".equals(아이템결합1)&&"칼날".equals(아이템결합2)) {
					인벤토리.아이템만들기("붕대칼", "1");
					인벤토리.수량증가("붕대칼");
					아이템.붕대칼 += 1;
					주인공.힌트포인트 += 20;
					인벤토리.수량감소("붕대");
					인벤토리.수량감소("칼날");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("붕대칼을 사용할 수 있습니다.");
					System.out.println("힌트포인트가 20 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("결합할 수 없는 조합입니다.");
					System.out.println("-----------------------------------");
				}
				
					System.out.println("-----------------------------------");
					System.out.println("결합할 수 없는 조합입니다.");
					System.out.println("-----------------------------------");		
			}
			if(아이템1==4) {
				
				System.out.println("-----------------------------------");
				System.out.println("분리할 아이템의 이름을 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템분리1 = s.next();

				if("필기한쪽지".equals(아이템분리1)) {
					if(힌트.순서==0) {
						
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					System.out.println("LOSE 라는 단어를 기억하라.");Thread.sleep(500);
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					힌트.힌트만들기("LOSE라는 단어를 기억하라.", 1);
					인벤토리.수량감소("필기한쪽지");
					주인공.힌트포인트 += 30;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("단서를 획득하였습니다.");
					System.out.println("힌트포인트가 30 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}else if (힌트.순서>0) {
						System.out.println("-----------------------------------");
						System.out.println("분리한 아이템입니다.");
						System.out.println("-----------------------------------");
					}
				}
				
				if("힌트쪽지".equals(아이템분리1)) {
					if(힌트.순서==1) {
						
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					System.out.println("LOSE를 다른각도로..");Thread.sleep(500);
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					힌트.힌트만들기("LOSE를 다른각도로..", 2);
					인벤토리.수량감소("힌트쪽지");
					주인공.힌트포인트 += 30;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("단서를 획득하였습니다.");
					System.out.println("힌트포인트가 30 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}else if (힌트.순서>1) {
						System.out.println("-----------------------------------");
						System.out.println("분리한 아이템입니다.");
						System.out.println("-----------------------------------");
					}
				} else {
					System.out.println("-----------------------------------");
					System.out.println("분리를 할 수 없는 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			}
			}
			
			//개발자힌트
			if(스테이지4==3) {
				while(true) {
				개발자힌트.개발자힌트리스트보기();
				System.out.println("-----------------------------------");
				System.out.println("1.이전으로");
				System.out.println("2.힌트포인트 - 200개");
				if(개발자힌트.순서==1) {
				System.out.println("3.힌트포인트 - 2000개");
				}
				System.out.println("-----------------------------------");
				System.out.println("개발자 힌트를 확인하세요.");
				System.out.println("힌트 포인트에 따라 확인 가능합니다.");
				System.out.println("-----------------------------------");
				int 힌트가격 = s.nextInt();
				
				if(힌트가격==1) {
					System.out.println("-----------------------------------");
					System.out.println("돌아갑니다.");
					System.out.println("-----------------------------------");
					break;
				}
				
				if(힌트가격==2) {
					if(개발자힌트.순서==0&&주인공.힌트포인트>200) {
						주인공.힌트포인트 -= 200; 
					개발자힌트.개발자힌트만들기("LOSE거꾸로 보면?", 1);
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("LOSE 거꾸로 보면 ?");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 - 100 차감됩니다.");
					System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트1 = s.nextInt();
					}
					else if(개발자힌트.순서==0&&주인공.힌트포인트<200) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다.  /skip/");
						System.out.println("-----------------------------------");
						int 개발자힌트2 = s.nextInt();
					}
					else if(개발자힌트.순서>0) {
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("LOSE 거꾸로 보면 ?  /skip/");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						int 개발자힌트3 = s.nextInt();
					}
				}
				if(힌트가격==3) {
					if(개발자힌트.순서==1&&주인공.힌트포인트>2000) {
						주인공.힌트포인트 -= 2000; 
					개발자힌트.개발자힌트만들기("LOSE를 뒤집으면 3507", 2);
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("LOSE를 뒤집으면 3507이다 /skip/");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 - 1500 차감됩니다.");
					System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트4 = s.nextInt();
					}
					else if(개발자힌트.순서==1&&주인공.힌트포인트<2000) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다. /skip/");
						System.out.println("-----------------------------------");
						int 개발자힌트5 = s.nextInt();
					}
					else if(개발자힌트.순서>1) {
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("LOSE를 뒤집이면 3507이다.  /skip/");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						int 개발자힌트6 = s.nextInt();
					}
				}
				
				}
			}
			//개발자힌트
			
			//제한시간추가
			if(스테이지4==4) {
				while(true) {
				타이머3.get제한();
				System.out.println("-----------------------------------");
				System.out.println("제한시간을 추가할 수 있습니다.");
				System.out.println("-----------------------------------");
				System.out.println("  제한시간        힌트포인트");
				System.out.println("1. 이전으로");
				System.out.println("2. 50         100");
				System.out.println("3. 100        200");
				System.out.println("-----------------------------------");
				int 제한시간 = s.nextInt(); 
				
				if(제한시간==1) {
					break;
				}
				
				if(제한시간==2) {
					if(주인공.힌트포인트>=100) {
						주인공.힌트포인트 -= 100; 
						타이머3.set타이머(타이머3.타이머+50);
						System.out.println("-----------------------------------");
						System.out.println("제한시간을 50 추가합니다.");
						System.out.println("-----------------------------------");
					}else if(주인공.힌트포인트<100) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다.");
						System.out.println("-----------------------------------");
					}
					
				}
				
				if(제한시간==3) {
					
					if(주인공.힌트포인트>=200) {
						주인공.힌트포인트 -= 200; 
						타이머3.set타이머(타이머3.타이머 + 100);
						System.out.println("-----------------------------------");
						System.out.println("제한시간을 100 추가합니다.");
						System.out.println("-----------------------------------");
					}else if(주인공.힌트포인트<200) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다.");
						System.out.println("-----------------------------------");
					}
					
				}
				
				}
			}
			//제한시간추가
			
			//돌아가기
			if(스테이지4==5) {
				System.out.println("-----------------------------------");
				System.out.println("문이 잠겨있습니다. /skip/");
				System.out.println("-----------------------------------");
				int 돌아가기 = s.nextInt();
			}
			
			//진열장 
			if(스테이지4==6) {
				if(아이템.붕대==0) {
					인벤토리.아이템만들기("붕대", "1");
					인벤토리.수량증가("붕대");
					아이템.붕대 += 1;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("붕대를 획득하였습니다. /skip/");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					int 진열장1 = s.nextInt();
					
				}
				else if(아이템.칼날>0) {
					System.out.println("-----------------------------------");
					System.out.println("진열장입니다.. /skip/");
					System.out.println("-----------------------------------");
					int 진열장2 = s.nextInt();
				}
				
			}
			
			//선반
			if(스테이지4==7) {
				if(아이템.칼날==0) {
					인벤토리.아이템만들기("칼날", "1");
					인벤토리.수량증가("칼날");
					아이템.칼날 += 1;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("칼날을 획득하였습니다. /skip/");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					int 선반1 = s.nextInt();
					
				}
				else if(아이템.칼날>0) {
					System.out.println("-----------------------------------");
					System.out.println("선반입니다.. /skip/");
					System.out.println("-----------------------------------");
					int 선반2 = s.nextInt();
				}
			}
			
			//포스터
			if(스테이지4==8) {
				
				
				if("붕대칼".equals(주인공.들고있는아이템())) {
					
					if(아이템.힌트쪽지==0) {
					인벤토리.아이템만들기("힌트쪽지", "1");
					인벤토리.수량증가("힌트쪽지");
					아이템.힌트쪽지 += 1;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("힌트쪽지를 획득하였습니다. /skip/");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					int 알수없는포스터1 = s.nextInt();
					}else if(아이템.힌트쪽지>0) {
						System.out.println("-----------------------------------");
						System.out.println("찢겨진 포스터입니다. /skip/");
						System.out.println("-----------------------------------");
						int 알수없는포스터2 = s.nextInt();
					}

				}else {
					if(아이템.힌트쪽지==0) {
					System.out.println("-----------------------------------");
					System.out.println("알 수 없는 포스터입니다. /skip/");
					System.out.println("-----------------------------------");
				int 알수없는포스터 = s.nextInt();
					}
					else if(아이템.힌트쪽지>0) {
						System.out.println("-----------------------------------");
						System.out.println("찢겨진 포스터입니다. /skip/");
						System.out.println("-----------------------------------");
						int 알수없는포스터4 = s.nextInt();
					}
				}
			}
			
			//진료실책상
			if(스테이지4==9) {
				while(true) {
				System.out.println("-----------------------------------");
				System.out.println("1.이전으로");
				System.out.println("2.전화기");
				System.out.println("-----------------------------------");
				int 진료실책상 = s.nextInt();
				
				if(진료실책상==1) {
					break;
				}
				
				if(진료실책상==2) {

					if(아이템.필기한쪽지==0) {
					if(전화1.체크==0) {
						System.out.println("-----------------------------------");
						System.out.println("전화기입니다.");
						System.out.println("-----------------------------------");
					}
					else if(전화1.체크==1) {
						인벤토리.아이템만들기("필기한쪽지", "1");
						인벤토리.수량증가("필기한쪽지");
						아이템.필기한쪽지 += 1;
						전화1.stop();
						전화1.체크 = 0;
						System.out.println("***********************************");Thread.sleep(500);
						System.out.println("급합니다 받아적으세요......");Thread.sleep(500);
						System.out.println("당신을 계속 지켜보고 있습니다......");Thread.sleep(500); 
						System.out.println("되돌아서 나갈 수는 없을겁니다......");Thread.sleep(500); 
						System.out.println("작은문 비밀번호는 LOSE......");Thread.sleep(500);
						System.out.println("......?......");Thread.sleep(500);
						System.out.println("***********************************");Thread.sleep(500);
						System.out.println("-----------------------------------");
						System.out.println("전화가 끊겼습니다.");
						System.out.println("-----------------------------------");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("필기한쪽지를 획득하였습니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						int 전화기 = s.nextInt();
					}
					}
					else if(아이템.필기한쪽지>0) {
						System.out.println("-----------------------------------");
						System.out.println("전화기입니다.");
						System.out.println("-----------------------------------");
					}
				}
				
				
				}
			}
			
			//다른문
			if(스테이지4==10) {
				
				주인공.스테이지못나감("잠김");
				System.out.println("-----------------------------------");
				System.out.println("잠겨있습니다. ");
				System.out.println("비밀번호를 입력하세요. ");
				System.out.println("-----------------------------------");
				int 비밀번호1 = s.nextInt();
				
				if(비밀번호1==3507) {
					주인공.스테이지탈출("탈출");
					타이머3.stop();
					순찰2.stop();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("탈출에 성공합니다.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				
				if(비밀번호1!=3507) {
					 try
					 {
					 AudioInputStream ais12 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\psxx.wav"));
					Clip clip12 = AudioSystem.getClip();
					clip12.stop();
					clip12.open(ais12);
					clip12.start();
					 }
					 catch (Exception ex)
					 {
					  } 
					System.out.println("-----------------------------------");
					System.out.println("비밀번호가 틀렸습니다. /skip/");
					System.out.println("-----------------------------------");
					int 탈출4 = s.nextInt();
				}
			}
			
			//직원에게들킴 게임오버
			if(순찰2.체크==1) {
				배경음악4.close();
				타이머3.stop();
				뮤직 엔딩뮤직1 = new 뮤직 ("Lasting_Hope.mp3",  true);
				엔딩뮤직1.start();
				순찰2.set타이밍(2);
				while(true) {
					
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("스테이지 3 - 실패 "); 
					System.out.println("획득한 아이템 "); 
					인벤토리.인벤토리출력();
					System.out.println("획득한 힌트 "); 
					힌트.힌트리스트보기();
					System.out.println("획득한 포인트 : " +주인공.힌트포인트 );
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					int 엔딩1 = s.nextInt();
					
					if(엔딩1==20) {
						break;
					}
			}
			}
			//직원에게들켜 게임오버  
			
			
				
	}//while
	
		
		
		
		
		
		
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("         STAGE 4-1  결과 ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("-----------------------------------");
		System.out.println("획득한 아이템 "); 
		인벤토리.인벤토리출력();
		System.out.println("획득한 힌트 "); 
		힌트.힌트리스트보기();
		주인공.힌트포인트 += 300;
		주인공.힌트포인트 += 타이머3.get타이머();
		System.out.println("현재 힌트포인트 : " +주인공.힌트포인트 );
		System.out.println("-----------------------------------");
		
		
		int 스킵16 = s.nextInt();
		
		인벤토리.수량감소("붕대");
		인벤토리.수량감소("칼날");
		인벤토리.수량감소("붕대칼");
		인벤토리.수량감소("힌트쪽지");
		인벤토리.수량감소("필기한쪽지");
		힌트.힌트지우기("지우기", 10);
		개발자힌트.개발자힌트지우기("지우기", 10);
		도구아이템.도구아이템지우기("전부", 10);
		
		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("뭐야 그냥 빈방이잖아?");Thread.sleep(500);
		System.out.println("근대 굳이 왜 들어가라고 한거지?");Thread.sleep(500); 
		System.out.println("그래도 한번 살펴봐야겠다. /skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int 스테이지42 = s.nextInt();
		
		while(true) {
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("          STAGE 4-2 작은방 ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("-----------------------------------");
		System.out.println("제한시간 : 없음");
		System.out.println("힌트포인트 :" + 주인공.힌트포인트);
		if(주인공.들고있는아이템()==null) {
			System.out.println("장착아이템  : 없음");
		}else {
		System.out.println("장착아이템  :" + 주인공.들고있는아이템());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.단서");
		System.out.println("2.아이템");
		System.out.println("3.개발자힌트");
		System.out.println("4.제한시간추가");
		System.out.println("---------------------------------");
		System.out.println("5.정면 벽");
		System.out.println("6.왼쪽 벽");
		System.out.println("7.오른쪽 벽");
		if(아이템.꺼진양초==0) {
		System.out.println("8.양초");}
		if(아이템.라이터==0) {
		System.out.println("9.라이터");}
		if(아이템.파이프==0) {
		System.out.println("10.파이프");}
		
		System.out.println("---------------------------------");
		int 작은방 = s.nextInt();

		//단서
		if(작은방==1) {
			힌트.힌트리스트보기();
			System.out.println("-----------------------------------");
			System.out.println("단서를 확인하세요. /skip/");
			System.out.println("-----------------------------------");
			int 힌트1 = s.nextInt();
		}
		
		
		//아이템목록
		if(작은방==2) {
			while(true) {
			인벤토리.인벤토리출력();
			System.out.println("-----------------------------------");
			System.out.println("1.이전으로");
			System.out.println("2.아이템선택");
			System.out.println("3.아이템결합");
			System.out.println("4.아이템분리");
			System.out.println("-----------------------------------");
			int 아이템1 = s.nextInt();
			
			if(아이템1==1) {
				System.out.println("-----------------------------------");
				System.out.println("돌아갑니다.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(아이템1==2) {
				System.out.println("-----------------------------------");
				System.out.println("사용할 아이템의 이름을 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템선택 = s.next();
				
				if ("켜진양초".equals(아이템선택)) {
					주인공.장착아이템("켜진양초");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				}else if ("파이프".equals(아이템선택)) {
					주인공.장착아이템("파이프");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
			}
			if(아이템1==3) {
				System.out.println("-----------------------------------");
				System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템결합1 = s.next();
				String 아이템결합2 = s.next();
				
				if("꺼진양초".equals(아이템결합1)&&"라이터".equals(아이템결합2)) {
					인벤토리.아이템만들기("켜진양초", "1");
					인벤토리.수량증가("켜진양초");
					아이템.켜진양초 += 1;
					인벤토리.수량감소("꺼진양초");
					인벤토리.수량감소("라이터");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("붕대칼을 사용할 수 있습니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if ("라이터".equals(아이템결합1)&&"꺼진양초".equals(아이템결합2)) {
					인벤토리.아이템만들기("켜진양초", "1");
					인벤토리.수량증가("켜진양초");
					아이템.켜진양초 += 1;
					인벤토리.수량감소("꺼진양초");
					인벤토리.수량감소("라이터");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("붕대칼을 사용할 수 있습니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("결합할 수 없는 조합입니다.");
					System.out.println("-----------------------------------");
				}
				
					System.out.println("-----------------------------------");
					System.out.println("결합할 수 없는 조합입니다.");
					System.out.println("-----------------------------------");		
			}
			if(아이템1==4) {
					System.out.println("-----------------------------------");
					System.out.println("분리 아이템이 없습니다.");
					System.out.println("-----------------------------------");
			}
			
			
			}
			}
			
			//개발자힌트
			if(작은방==3) {
				System.out.println("-----------------------------------");
				System.out.println("개발자힌트가 없습니다.");
				System.out.println("-----------------------------------");
			}
			//개발자힌트
			
			//제한시간추가
			if(작은방==4) {
				System.out.println("-----------------------------------");
				System.out.println("제한시간이 없습니다.");
				System.out.println("-----------------------------------");
			}
		
		
		//정면벽 
		if(작은방==5) {
			System.out.println("-----------------------------------");
			System.out.println("벽입니다.");
			System.out.println("-----------------------------------");
		}
		
		//왼쪽벽
		if(작은방==6) {
			if("켜진양초".equals(주인공.들고있는아이템())) {
				System.out.println("-----------------------------------");
				System.out.println("촛불이 흔들립니다.");
				System.out.println("갈라진 틈으로 바람이 많이나옵니다. /skip/");
				System.out.println("-----------------------------------");
				int 왼쪽벽 = s.nextInt();
				
			}
			
			else if("파이프".equals(주인공.들고있는아이템())) {
				System.out.println("-----------------------------------");Thread.sleep(500);
				System.out.println("파이프로 갈라진 틈을 깨부숩니다....");Thread.sleep(500);
				System.out.println("갈라진 틈으로 계단이 발견되었습니다.. /skip/");Thread.sleep(500);
				System.out.println("-----------------------------------");Thread.sleep(500);
				int 왼쪽벽2 = s.nextInt();
				인벤토리.수량감소("켜진양초");
				인벤토리.수량감소("꺼진양초");
				인벤토리.수량감소("라이터");
				인벤토리.수량감소("파이프");
				주인공.스테이지탈출("탈출");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				System.out.println("탈출에 성공합니다.");
				System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
				break;

			}
			else {
			System.out.println("-----------------------------------");
			System.out.println("벽입니다.");
			System.out.println("-----------------------------------");
			}
		}
		
		//오른쪽벽
		if(작은방==7) {
			System.out.println("-----------------------------------");
			System.out.println("벽입니다.");
			System.out.println("-----------------------------------");

		}
		
		//꺼진양초
		if(작은방==8) {
			if(아이템.꺼진양초==0) {
				인벤토리.아이템만들기("꺼진양초", "1");
				인벤토리.수량증가("꺼진양초");
				아이템.꺼진양초 +=1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("꺼진양초를 획득하였습니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
			
		}
		//라이터
		if(작은방==9) {
			if(아이템.라이터==0) {
				인벤토리.아이템만들기("라이터", "1");
				인벤토리.수량증가("라이터");
				아이템.라이터 +=1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("라이터를 획득하였습니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
		}
		//파이프
		if(작은방==10) {
			if(아이템.파이프==0) {
				인벤토리.아이템만들기("파이프", "1");
				인벤토리.수량증가("파이프");
				아이템.파이프 +=1;
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				System.out.println("파이프를 획득하였습니다.");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
			}
		}
		
		}
	

		System.out.println("***********************************");Thread.sleep(500);
		System.out.println("여긴 어디지?......");Thread.sleep(500); 
		System.out.println("수술실인가?....../skip/");Thread.sleep(500);
		System.out.println("***********************************");Thread.sleep(500);
		int 스킵18 = s.nextInt();
	
		
		while(true) {	
			
			
			
			
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("           FINAL STAGE");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("-----------------------------------");
		System.out.println("힌트포인트 :" + 주인공.힌트포인트);
		if(주인공.들고있는아이템()==null) {
			System.out.println("장착아이템  : 없음");
		}else {
		System.out.println("장착아이템  :" + 주인공.들고있는아이템());
		}
		System.out.println("-----------------------------------");
		System.out.println("1.단서");
		System.out.println("2.아이템");
		System.out.println("3.개발자힌트");
		System.out.println("4.슬롯머신(포인트EVNET)");
		System.out.println("-----------------------------------");
		System.out.println("5.칠판");
		System.out.println("6.공구함");
		System.out.println("7.거울");
		System.out.println("8.카펫");
		System.out.println("9.컴퓨터");
		System.out.println("10.자동문");
		System.out.println("-----------------------------------");
		int 스테이지5 = s.nextInt();
	
		//단서
		if(스테이지5==1) {
			힌트.힌트리스트보기();
			System.out.println("-----------------------------------");
			System.out.println("단서를 확인하세요. /skip/");
			System.out.println("-----------------------------------");
			int 힌트1 = s.nextInt();
		}
		
		
		//아이템목록
		if(스테이지5==2) {
			while(true) {
			인벤토리.인벤토리출력();
			System.out.println("-----------------------------------");
			System.out.println("1.이전으로");
			System.out.println("2.아이템선택");
			System.out.println("3.아이템결합");
			System.out.println("4.아이템분리");
			System.out.println("-----------------------------------");
			int 아이템1 = s.nextInt();
			
			if(아이템1==1) {
				System.out.println("-----------------------------------");
				System.out.println("돌아갑니다.");
				System.out.println("-----------------------------------");
				break;
			}
			
			if(아이템1==2) {
				System.out.println("-----------------------------------");
				System.out.println("사용할 아이템의 이름을 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템선택 = s.next();
				
				if ("테이프".equals(아이템선택)) {
					주인공.장착아이템("테이프");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
				if ("몽키".equals(아이템선택)) {
					주인공.장착아이템("몽키");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
				if ("직원코드".equals(아이템선택)) {
					주인공.장착아이템("직원코드");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
				if ("분필가루".equals(아이템선택)) {
					주인공.장착아이템("분필가루");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
				if ("돋보기".equals(아이템선택)) {
					주인공.장착아이템("돋보기");
					System.out.println("-----------------------------------");
					System.out.println("아이템을 장착합니다.");
					System.out.println("-----------------------------------");
				} 
				
				
			}
			if(아이템1==3) {
				System.out.println("-----------------------------------");
				System.out.println("결합할 아이템 2개의 이름을 순서대로 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템결합1 = s.next();
				String 아이템결합2 = s.next();
				
				if("사포".equals(아이템결합1)&&"분필".equals(아이템결합2)) {
					인벤토리.아이템만들기("분필가루", "1");
					인벤토리.수량증가("분필가루");
					아이템.분필가루 += 1;
					주인공.힌트포인트 += 50;
					인벤토리.수량감소("사포");
					인벤토리.수량감소("분필");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("분필가루를 사용할 수 있습니다.");
					System.out.println("힌트포인트가 50 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}else if ("분필".equals(아이템결합1)&&"사포".equals(아이템결합2)) {
					인벤토리.아이템만들기("분필가루", "1");
					인벤토리.수량증가("분필가루");
					아이템.분필가루 += 1;
					주인공.힌트포인트 += 50;
					인벤토리.수량감소("사포");
					인벤토리.수량감소("분필");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("분필가루를 사용할 수 있습니다.");
					System.out.println("힌트포인트가 50 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}	else {
					System.out.println("-----------------------------------");
					System.out.println("결합할 수 없는 조합입니다.");
					System.out.println("-----------------------------------");
				}
				
						
			}
			if(아이템1==4) {
				
				System.out.println("-----------------------------------");
				System.out.println("분리할 아이템의 이름을 입력해주세요.");
				System.out.println("-----------------------------------");
				String 아이템분리1 = s.next();

				if("포스트잇쪽지".equals(아이템분리1)) {
					if(힌트.순서==0) {
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					System.out.println("거울은 중요하다.");Thread.sleep(500);
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					힌트.힌트만들기("거울은 중요하다", 1);
					인벤토리.수량감소("포스트잇쪽지");
					주인공.힌트포인트 += 50;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("단서를 획득하였습니다.");
					System.out.println("힌트포인트가 50 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}else if (힌트.순서>0) {
						System.out.println("-----------------------------------");
						System.out.println("분리한 아이템입니다.");
						System.out.println("-----------------------------------");
					}
				}
				
				if("비밀번호자료".equals(아이템분리1)) {
					if(힌트.순서==1) {
						
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					System.out.println("N의 역방향 순서로");Thread.sleep(500);
					System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");Thread.sleep(500);
					힌트.힌트만들기("N의 역방향순서", 2);
					인벤토리.수량감소("비밀번호자료");
					주인공.힌트포인트 += 50;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("단서를 획득하였습니다.");
					System.out.println("힌트포인트가 50 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}else if (힌트.순서>1) {
						System.out.println("-----------------------------------");
						System.out.println("분리한 아이템입니다.");
						System.out.println("-----------------------------------");
					}
				} else {
					System.out.println("-----------------------------------");
					System.out.println("분리를 할 수 없는 아이템입니다.");
					System.out.println("-----------------------------------");
				}
			}
			
			
			}
			}
			
			//개발자힌트
			if(스테이지5==3) {
				while(true) {
				개발자힌트.개발자힌트리스트보기();
				System.out.println("-----------------------------------");
				System.out.println("1.이전으로");
				System.out.println("2.힌트포인트 - 1000개");
				if(개발자힌트.순서==1) {
				System.out.println("3.힌트포인트 - 2000개");
				}
				System.out.println("-----------------------------------");
				System.out.println("개발자 힌트를 확인하세요.");
				System.out.println("힌트 포인트에 따라 확인 가능합니다.");
				System.out.println("-----------------------------------");
				int 힌트가격 = s.nextInt();
				
				if(힌트가격==1) {
					System.out.println("-----------------------------------");
					System.out.println("돌아갑니다.");
					System.out.println("-----------------------------------");
					break;
				}
				
				if(힌트가격==2) {
					if(개발자힌트.순서==0&&주인공.힌트포인트>1000) {
						주인공.힌트포인트 -= 1000; 
					개발자힌트.개발자힌트만들기("거울 - 테이프 - 몽키", 1);
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("거울 - 테이프 - 몽키");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 - 100 차감됩니다.");
					System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트1 = s.nextInt();
					}
					else if(개발자힌트.순서==0&&주인공.힌트포인트<1000) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다.  /skip/");
						System.out.println("-----------------------------------");
						int 개발자힌트2 = s.nextInt();
					}
					else if(개발자힌트.순서>0) {
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("거울 - 테이프 - 몽키  /skip/");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						int 개발자힌트3 = s.nextInt();
					}
				}
				if(힌트가격==3) {
					if(개발자힌트.순서==1&&주인공.힌트포인트>2000) {
						주인공.힌트포인트 -= 2000; 
					개발자힌트.개발자힌트만들기("분필+사포 = 분필가루 --> 자동문", 2);
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("분필+사포 = 분필가루 --> 자동문");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("-----------------------------------");
					System.out.println("힌트포인트가 - 1500 차감됩니다.");
					System.out.println("현재힌트포인트 :" +주인공.힌트포인트 + "/skip/");
					System.out.println("-----------------------------------");
					int 개발자힌트4 = s.nextInt();
					}
					else if(개발자힌트.순서==1&&주인공.힌트포인트<2000) {
						System.out.println("-----------------------------------");
						System.out.println("힌트포인트가 부족합니다. /skip/");
						System.out.println("-----------------------------------");
						int 개발자힌트5 = s.nextInt();
					}
					else if(개발자힌트.순서>1) {
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("분필+사포 = 분필가루 --> 자동문  /skip/");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						int 개발자힌트6 = s.nextInt();
					}
				}
				
				}
			}
			//개발자힌트
			
			if(스테이지5==4) {
				
				while(true) {	
					scount += 1;
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("         EVENT - 슬롯머신");
				System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
				System.out.println("-----------------------------------");
				System.out.println("기회는 3번입니다.");
				System.out.println("레버를 당겨주세요. /skip/");
				System.out.println("-----------------------------------");
				int 슬롯2 = s.nextInt();
				주인공.슬롯머신("당겨당겨");
				for (int i = 0; i < 슬롯길이 ; i  ++) {
					for(int 랜덤=0; 랜덤<슬롯길이; 랜덤++) {  
					슬롯[랜덤] = (int)(Math.random()*slot)+1;
				}
				for ( int j = 0; j < 슬롯길이 ; j ++) { // 스도쿠 행 생성  행으로 나열  
				
					슬롯배열[i][j] = 슬롯[j];
					
				}
				
				}
				
				
				for(int a=0; a<슬롯길이; a++) {

					for (int b=0; b<슬롯길이; b++) {
								System.out.print(슬롯배열[a][b]);Thread.sleep(900);		
					}
					System.out.println("");
					
				}
				if(슬롯배열[0][0]==1&&슬롯배열[0][1]==1&&슬롯배열[0][2]==1) {
					주인공.힌트포인트 += 50;
				}
				else if(슬롯배열[0][0]==2&&슬롯배열[0][1]==2&&슬롯배열[0][2]==2) {
					주인공.힌트포인트 += 50; System.out.println("터졌다!");
				}
				else if(슬롯배열[0][0]==3&&슬롯배열[0][1]==3&&슬롯배열[0][2]==3) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[1][0]==1&&슬롯배열[1][1]==1&&슬롯배열[1][2]==1) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[1][0]==2&&슬롯배열[1][1]==2&&슬롯배열[1][2]==2) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[1][0]==3&&슬롯배열[1][1]==3&&슬롯배열[1][2]==3) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[2][0]==1&&슬롯배열[2][1]==1&&슬롯배열[2][2]==1) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[2][0]==2&&슬롯배열[2][1]==2&&슬롯배열[2][2]==2) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				else if(슬롯배열[2][0]==3&&슬롯배열[2][1]==3&&슬롯배열[2][2]==3) {
					주인공.힌트포인트 += 50;  System.out.println("터졌다!");
				}
				if(scount==3) {
					System.out.println("-----------------------------------");
					System.out.println("획득한포인트 : " + 주인공.힌트포인트+ "/skip/");
					System.out.println("-----------------------------------");
					int 슬롯스킵2 = s.nextInt();
					scount = 0;
					break;
					
				}
					
						}	
			}
			//칠판
			if(스테이지5==5) {
				while(true) {
				System.out.println("-----------------------------------");
				if(아이템.분필==0) {
				System.out.println("1.분필");}
				if(아이템.돋보기==0) {
				System.out.println("2.돋보기");}
				System.out.println("3.이전으로");
				System.out.println("-----------------------------------");
				int 칠판 = s.nextInt();
				
				if(칠판==1) {
					if(아이템.분필==0) {
						인벤토리.아이템만들기("분필", "1");
						인벤토리.수량증가("분필");
						아이템.분필 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("분필을 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.분필>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}
				if(칠판==2) {
					if(아이템.돋보기==0) {
						인벤토리.아이템만들기("돋보기", "1");
						인벤토리.수량증가("돋보기");
						아이템.돋보기 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("돋보기를 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.돋보기>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}
				if(칠판==3) {
				break;	
				}
				}
			}
			
			//공구함
			if(스테이지5==6) {
				while(true) {
				System.out.println("-----------------------------------");
				if(아이템.사포==0) {
				System.out.println("1.사포");}
				if(아이템.테이프==0) {
				System.out.println("2.테이프");}
				if(아이템.몽키==0) {
				System.out.println("3.몽키");}
				System.out.println("4.이전으로");
				System.out.println("-----------------------------------");
				int 공구함 = s.nextInt();
				
				if(공구함==1) {
					if(아이템.사포==0) {
						인벤토리.아이템만들기("사포", "1");
						인벤토리.수량증가("사포");
						아이템.사포 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("사포를 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.분필>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}
				if(공구함==2) {
					if(아이템.테이프==0) {
						인벤토리.아이템만들기("테이프", "1");
						인벤토리.수량증가("테이프");
						아이템.테이프 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("테이프를 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.테이프>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}
				if(공구함==3) {
					if(아이템.몽키==0) {
						인벤토리.아이템만들기("몽키", "1");
						인벤토리.수량증가("몽키");
						아이템.몽키 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("돋보기를 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.몽키>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}

				if(공구함==4) {
				break;	
				}
				
			}
			}
			//거울
			if(스테이지5==7) {
				
				if(아이템.거울스크래치==0) {
					System.out.println("-----------------------------------");
					System.out.println("거울입니다. /skip/");
					System.out.println("-----------------------------------");
					int 거울 = s.nextInt();
				}
				if("돋보기".equals(주인공.들고있는아이템())) {
					if(아이템.거울스크래치==0) {
					아이템.거울스크래치 += 1;
					}
					System.out.println("-----------------------------------");
					System.out.println("거울에 묘한 흠집이 있습니다. /skip/");
					System.out.println("-----------------------------------");
					int 거울4 = s.nextInt();
				}
				
				
				else if(아이템.거울스크래치==1) {
				if("테이프".equals(주인공.들고있는아이템())) {
					아이템.거울스크래치 += 1;
					System.out.println("-----------------------------------");
					System.out.println("테이프를 붙였습니다. /skip/");
					System.out.println("-----------------------------------");
					
					int 거울2 = s.nextInt();
				}else {
					System.out.println("-----------------------------------");
					System.out.println("거울입니다. /skip/");
					System.out.println("-----------------------------------");
					int 거울3 = s.nextInt();
				}
				
				}
				else if(아이템.거울스크래치==2&&아이템.직원코드==0) {
					if("몽키".equals(주인공.들고있는아이템())) {
						인벤토리.아이템만들기("직원코드", "1");
						인벤토리.수량증가("직원코드");
						아이템.직원코드 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("유리를 깨트립니다!");
						System.out.println("직원코드가 적힌 쪽지를 발견합니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
				} else if(아이템.거울스크래치==2&&아이템.직원코드==1) {
					System.out.println("-----------------------------------");
					System.out.println("거울입니다. /skip/");
					System.out.println("-----------------------------------");
					int 거울5 = s.nextInt();
				}
			}
			
			//카펫
			if(스테이지5==8) {
				while(true){
				System.out.println("-----------------------------------");
				if(아이템.CD==0) {
				System.out.println("1.CD");}
				if(아이템.포스트잇쪽지==0) {
				System.out.println("2.포스트잇");}
				System.out.println("3.이전으로");
				System.out.println("-----------------------------------");
				int 카펫 = s.nextInt();
				
				if(카펫==1) {
				if(아이템.CD==0) {
					인벤토리.아이템만들기("CD", "1");
					인벤토리.수량증가("CD");
					아이템.CD += 1;
					주인공.힌트포인트 += 50;
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("CD를 획득하였습니다.");
					System.out.println("힌트포인트가 50 올라갑니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
				}
				else if(아이템.CD>0) {
					System.out.println("-----------------------------------");
					System.out.println("획득완료");
					System.out.println("-----------------------------------");
				}
				}
				if(카펫==2) {
					if(아이템.포스트잇쪽지==0) {
						인벤토리.아이템만들기("포스트잇쪽지", "1");
						인벤토리.수량증가("포스트잇쪽지");
						아이템.포스트잇쪽지 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("포스트잇을 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.포스트잇쪽지>0) {
						System.out.println("-----------------------------------");
						System.out.println("획득완료");
						System.out.println("-----------------------------------");
					}
				}
				if(카펫==3) {
					break;
				}
				
			}
			}
			
			//컴퓨터
			if(스테이지5==9) {
				if("직원코드".equals(주인공.들고있는아이템())) {
					
					if(아이템.비밀번호자료==0) {
						인벤토리.아이템만들기("비밀번호자료", "1");
						인벤토리.수량증가("비밀번호자료");
						아이템.비밀번호자료 += 1;
						주인공.힌트포인트 += 50;
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
						System.out.println("비밀번호자료를 획득하였습니다.");
						System.out.println("힌트포인트가 50 올라갑니다.");
						System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					}
					else if(아이템.비밀번호자료>0) {
						System.out.println("-----------------------------------");
						System.out.println("더이상 살펴볼것이 없습니다.");
						System.out.println("-----------------------------------");
					}
					
				}else {
					System.out.println("-----------------------------------");
					System.out.println("컴퓨터가 잠겨있습니다.");
					System.out.println("-----------------------------------");
					int 컴퓨터 = s.nextInt();
				}
			}
			
			//자동문
			if(스테이지5==10) {
				if("분필가루".equals(주인공.들고있는아이템())) {
					
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("비밀번호 자판에 분필가루를 뿌립니다. ");
					System.out.println("지문이 진하게 뭍은것만 보여줍니다.");
					System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※");
					System.out.println("-----------------------------------");
					System.out.println("            3");
					System.out.println("4     5      ");
					System.out.println("            9");
					System.out.println("             ");
					System.out.println("-----------------------------------");
					System.out.println("문이 잠겨있습니다.");
					System.out.println("비밀번호 4자리를 입력하세요");
					System.out.println("-----------------------------------");
				}
				else {
				System.out.println("-----------------------------------");
				System.out.println("1     2     3");
				System.out.println("4     5     6");
				System.out.println("7     8     9");
				System.out.println("*     0     #");
				System.out.println("-----------------------------------");
				System.out.println("문이 잠겨있습니다.");
				System.out.println("비밀번호 4자리를 입력하세요");
				System.out.println("-----------------------------------");
				}
				int 자동문비번 = s.nextInt();
				
				if(자동문비번 ==3954) {
					주인공.스테이지탈출("탈출");
					배경음악4.close();
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.out.println("탈출에 성공합니다.");
					System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					break;
				}
				
				if(자동문비번 != 3954) {
					
					 try
					 {
					 AudioInputStream ais12 = 
					AudioSystem.getAudioInputStream
					(new File("C:\\Users\\wante\\eclipse-workspace\\방탈출\\sound\\psxx.wav"));
					Clip clip12 = AudioSystem.getClip();
					clip12.stop();
					clip12.open(ais12);
					clip12.start();
					 }
					 catch (Exception ex)
					 {
					  } 
					System.out.println("-----------------------------------");
					System.out.println("비밀번호가 틀렸습니다.");
					System.out.println("-----------------------------------");
					int 자동문 = s.nextInt();
					
				}
				
				
			}
			
}//while  
		
		뮤직 엔딩뮤직 = new 뮤직 ("Lasting_Hope.mp3",  true);
		엔딩뮤직.start();
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("        FINAL STAGE - 결과 ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("-----------------------------------");
		System.out.println("획득한 아이템 "); 
		인벤토리.인벤토리출력();
		System.out.println("획득한 힌트 "); 
		힌트.힌트리스트보기();
		주인공.힌트포인트 += 500;
		System.out.println("총 힌트포인트 : " +주인공.힌트포인트 );
		System.out.println("-----------------------------------");
		int 엔딩 = s.nextInt();
		
	
	}
	
	
	
	
//콘솔화면 지우는 메소드 
	public static void 화면지우기() {
		for(int i = 0; i < 80; i++) {
			System.out.println("");
		}
	}
//콘솔하면 지우는 메소드 엄밀히 말하면 미루는것 

	
}