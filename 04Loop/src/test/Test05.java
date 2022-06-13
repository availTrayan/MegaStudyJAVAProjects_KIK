package test;

import java.util.Random;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// 1. 알파벳 출력
				/*
				// ascii 코드를 이용하는 방법
				for(char i = 'A'; i <= 'Z'; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
				*/
				
				// 2. 합 구하기
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("수를 입력 하세요 : ");
				int num = sc.nextInt();
				int sum = 0;
				for(int i = 1; i <= num; i++) {
					sum += i;
					
					if(sum > 100) {
						break;
					}
					
				}
				System.out.print(sum);
			}
			*/
		
				// 3. 등차수열
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("세개의 수를 입력하세요 : ");
				int a = sc.nextInt();
				int d = sc.nextInt();
				int n = sc.nextInt();
				
				// 반복 횟수는 구해야하는 순서의 숫자보다 1 적어야하므로
				for(int i = 1; i <= n - 1; i++) {
					a += d;
				}
				System.out.println(a);
				*/
				
				// 4. 소수 판별
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("수를 입력하세요 : ");
				int num = sc.nextInt();
				boolean isPrime = true;
				
				// 1은 모든수가 나눠지기 때문에 2부터 시작
				
				for(int i = 2; i < num; i++) {
				// 제곱근 만큼 구해도 절약 
				// for(int i = 2; i <= math.sqrt(num); i++)	
					if(num % i == 0) {
						System.out.println("소수가 아니다!");
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					System.out.println("소수 입니다.");
				}
				*/
				
				// 5. 가위 바위보 대결
				// 컴퓨터에게 랜덤으로 숫자 출력지시. 단 경우는 3개까지
	
				Scanner sc = new Scanner(System.in);
				Random random = new Random();
				
				int youWin = 0;
				int computerWin = 0;
				
			for(int i = 0; i < 5; i++) {
				// 1 2 3 만 출력하기 위해 0 1 2에 + 1
				int computer = random.nextInt(3) + 1 ;
				System.out.print("가위(1) 바위(2) 보(3)!! : ");
				
				int number = sc.nextInt();
				
				System.out.print("computer: (" + computer + ")");
				
				if(computer == number) {
					
					System.out.println("비겼습니다!");
					
				} else if (number == 1 && computer == 3 
						|| number == 2 && computer == 1 
						|| number == 3 && computer == 2) {
					
						System.out.println(" 이겼습니다!");
						youWin++;
						
				} else {
					
					System.out.println(" 졌습니다!");
					computerWin++;
				}
				
				if(youWin == 3 || computerWin == 3) {
		            break;
		        }
			}	
				
			System.out.print("최종결과: " + youWin + ":" + computerWin + "로 ");	
			if(youWin > computerWin) {
				System.out.println("당신이 이겼습니다.");
			} else if (youWin < computerWin) {
				System.out.println("당신이 졌습니다. ");
			} else {
				System.out.println("비겼습니다.");
			}
	}
	}
