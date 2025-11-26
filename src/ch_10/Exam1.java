package ch_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		
		//단일 문자 배열에 단어와 숫자를 섞어 넣는다.
	      char[] cards = {'1','L','O','2','V','3','E'};
	      String myWord = "";
	      
	      //알파벳만 추출해서 myword넣고 출력하기
		  for(int i = 0; i < cards.length; i++) {
			  if(cards[i] >= 'a' && cards[i] <= 'z' || cards[i] >= 'A' && cards[i] <= 'Z') {
				  myWord += cards[i];
			  }
		  }
	      System.out.println(myWord);
	      
	      //키보드에서 배열의 길이를 입력받는다
	      //입력받은 배열의 길이만큼 알파벳을 요소로 넣고 출력해주세요
	      //예시
	      //배열의 길이를 정해주세요 : 5
	      //ABCDE
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("배열의 길이를 정해주세요 : ");
	      
	      int length = sc.nextInt();
	      
	      char[] word = new char [length];
	      
	      char ch = 'A';
	      
	      for(int i = 0; i < word.length; i++) {
	    	  word[i] = ch++;
	      }
	      
	      System.out.println(Arrays.toString(word));
	      
	      //변수 money에 10~5000사이의 난수를 발생시켜 넣는다.
	      //단 1의자리는 반드시 0이 되도록 한다.
	      //ex) 3450, 2100, 60
	      
	      //발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지 출력
	      
	      //가능한 적은 수의 동전을 사용한다.
	      
	      int[] coin = {500,100,50,10}; 
	      
	      int money = (new Random().nextInt(500)+1)*10;
	      
	      System.out.println("금액 : "+ money );
	      
	      for(int i = 0; i < coin.length; i++) {
	    	  int res = money / coin[i];
	    	  System.out.println(coin[i] + "원 : " + res + "개");
	    	  money %= coin[i];
	      }
	      
	      //배열의 모든 요소의 합 구하기
	      int[][] arr = {
	    		  {1,2,3},
	    		  {4,5,6,7,8},
	    		  {9},
	    		  {10,11,12,13},
	    		  {14,15},
	    		  {16,17,18,19,20}
	      };
	      
	      int sum = 0;
	      
	      for(int i = 0; i < arr.length; i++) {
	    	  for(int j = 0; j < arr[i].length; j++) {
	    		  sum += arr[i][j];
	    	  }
	      }
	      System.out.println("총합 : " + sum);
	      
	      //1~45사이의 난수를 발생시켜 로또번호 6개를 배열에 저장하는 프로그램 만들기
	      //겹치는건 x
	      int[] lotto = new int[6];//o
	      
	     outer : for(int i = 0; i < lotto.length;) {
	    	  lotto[i] = new Random().nextInt(45)+1;
	    	  //겹치는게 있는지 없는지 검증
	    	  for(int j = 0; j < i; j++) {
	    		  if(lotto[i] == lotto[j]) {
	    			 continue outer; 
	    		  }
	    	  }
	    	  System.out.print(lotto[i] + " ");
	    	  i++; //겹치는게 없을때 증가 	  
	      }
	      
	      
	      
	      
	      
	      
	      
	     
	}
}
