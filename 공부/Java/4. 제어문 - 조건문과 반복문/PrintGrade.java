package ch04condition;

/**
 * 등급 계산하는 객체 작성
 * 테스트 : 경계선 테스트 / 단위 테스트(조건 처리 테스트) <-> 통합 테스트(main() 테스트)
 * 테스트 데이터 : 101,100,90,89,80,79,70,69,60,0,-1
 */

import java.util.Scanner;

public class PrintGrade {

	public static void main(String[] args) {
		
		// console에서 입력할 때 사용되는 객체 변수 선언 초기값(키보드)
		// 사용자에게 점수 입력요청 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 -> ");
		// 점수 입력
		int score = Integer.parseInt(scanner.nextLine());
		
		// 테스트 데이터 선언과 세팅
		// int[] testScores = {101,100,90,89,80,79,70,69,60,0,-1};
		// 테스트 반복 시작
		// testScores의 데이터를 차례로 한개씩 꺼내서 score에 담아서 처리한다. score는 for문 안에서만
		// for(int score : testScores) {
		// 1. 받은 점수 출력
		System.out.println("입력한 점수 : " + score);
		
		// 2. 등급 계산
		char grade;
		
		// if-else문을 사용하여 점수에 따른 등급을 계산
		if(score > 100) grade = 'O'; // 점수가 100보다 크면 오류처리
		else if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if(score >= 60) grade = 'D';
		else if(score >= 0) grade = 'F';
		else grade = 'U'; // 점수가 0미만이면 잘못된 처리로 U처리
		
		// 등급 출력 - O, U 처리한다.
		if(grade == 'O') System.out.println("점수 오류 : 100 초과");
		else if (grade == 'U') System.out.println("점수 오류 : 0 미만");
		else System.out.println("등급 : " + grade);
		
		switch(grade) {
		case 'O' :
			System.out.println("점수 오류 : 100 초과");
			break;
		case 'U' :
			System.out.println("점수 오류 : 0 미만");
			break;
		default :
			System.out.println("등급 : " + grade);
			break;
		}
		
		// 테스트 반복 끝
		scanner.close(); // scanner 자원 닫기 = 자원 회수
		
	} // main() 끝
} // 클래스의 끝
