package day02;
/*
     ***
         변수 만드는 형식
         
         데이터타입     변수이름 = 데이터 ;
     
     예]
    		 1. 문자
    		 char ch = 'A';
    		 
    		 2. 논리값
    		  boolean bool = ture;
    		 
    		 3. 정수
    		     int no = 7;
    		 
    		 4. 실수
    		    double val = 3.14;
    		 
    		 5. 문자열 : 문자열은 기본형 타입은 아니지만
    		             빈번히 사용되는 데이터 이기때문에
    		             자바에서 편의를 제공해주고 있다.
    		             
    		             a.
    		                string str1 = "abcd";
    		             
    		             b.
    		                string str2 = new string("abcd");
    		             
    	변수 작성 형식
    	
    	    [접근지정자] [속성] 데이터타입 변수이름 = 데이터;
    	          
*/
public class Test02 {
	// 문자열 변수
	static String msg = "내일은 ";
	static int month = 2;
	static int day = 12;
	
	int num1 = 100;
	int num2 = 500;
	
	public static void main(String[] args) {
		System.out.println(msg + month + "월 " + day + "일 입니다.");
	}

	/*
	    class2와 단어와 Teacher를 결합해서 변수의 이름을 만들경우
	    
	       1. camel표기법
	       
	           String class2Teacher = "전은석";
	          
	       2. snake 표기법
	           String class2_teacher = "전은석";
	          
	 */
}
