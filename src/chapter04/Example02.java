package chapter04;

public class Example02 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 총점과 평균을 출력하고 전체 총점과 평균출력.
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };//3행 x열
		/*
		{ 95, 86 }  0=>1행
		{ 83, 92, 96 } 1=>2행
		{ 78, 83, 93, 87, 88 } 2=>3행
		*/
		double avg = 0;//각 행의 평균
		double totalavg = 0;//전체 요소의 평균
		int total=0; //각 행의 합
		int alltotal = 0; //전체 배열의 합
		int count = 0; //전체 요소의 갯수
		//array.length : 3
		//for문을 이용 -> 각 행을 가져와서 / 각행의 열을 읽어서 /sum에 누적하고(count++) 평균까지 구하여 출력
		for(int i=0;i<array.length;i++) {//각 행을 가져와서
			for(int j=0;j<array[i].length;j++) {//각행의 열을 읽어서
				total+=array[i][j]; //array[1][0],array[1][1],array[1]2]
				count++; //전체 평균에 사용될 카운트
			}//for
			alltotal+=total;
			avg=(double)total/array[i].length;
			System.out.println((i+1)+"행의 합: "+total);
			System.out.println((i+1)+"행의 평균: "+avg);
			System.out.println("--------------");
			total=0; //다음 행의 계산을 위해서 쓰레기값 버림
		}//for
		
		System.out.println("전체 행의 합: "+alltotal);
		totalavg=(double)alltotal/count;
		System.out.println("전체 데이터의 합: "+totalavg);
		
	}//main
}//class
