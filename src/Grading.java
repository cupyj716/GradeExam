
public class Grading {
	
	public static void main(String[] args) {
		
		if(args.length!=10){
			System.out.println("정답의 개수가 맞지 않습니다.");
			return;
		}
		
		int student[][]= {{1,3,2,4,3,1,4,2,2,1},
						{3,2,4,2,2,1,1,3,4,1},
						{2,4,3,2,1,2,1,3,3,4},
						{2,3,3,1,1,3,2,2,4,4},
						{3,1,1,2,4,1,2,3,1,3}};	//학생이 제출한 답
		int dap[]=new int[10]; // 문제에 대한 답
		double score[]={10.5, 10, 9.8, 9.2, 10.5, 9, 9.5, 9.5, 10.2, 10.8}; // 한 문제 당 점수
		double sum[]={0,0,0,0,0}; // 점수 총 합
		
		for(int a=0; a<args.length; a++){
			dap[a]=Integer.parseInt(args[a]); // 명령행매개변수 -> dap배열에 넣기
		}
		
		for(int i=0; i<student.length; i++){
			for(int j=0; j<student[i].length; j++){
				if(dap[j] == student[i][j]){ //답과 학생이 제출한 답과 맞는지
					sum[i]+=score[j]; //맞으면 j번째에 해당하는 점수 부여
					System.out.print("o\t"); //점오표 o
				}
				else System.out.print("x\t"); //틀릴경우 점오표 x
			}
			System.out.println("학생" + (i+1) + "의 점수 : " + sum[i] + "점");
		}
		
	}
	
}
