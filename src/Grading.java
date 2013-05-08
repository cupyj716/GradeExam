
public class Grading {
	
	public static void main(String[] args) {
		
		if(args.length!=10){
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
			return;
		}
		
		int student[][]= {{1,3,2,4,3,1,4,2,2,1},
						{3,2,4,2,2,1,1,3,4,1},
						{2,4,3,2,1,2,1,3,3,4},
						{2,3,3,1,1,3,2,2,4,4},
						{3,1,1,2,4,1,2,3,1,3}};	//�л��� ������ ��
		int dap[]=new int[10]; // ������ ���� ��
		double score[]={10.5, 10, 9.8, 9.2, 10.5, 9, 9.5, 9.5, 10.2, 10.8}; // �� ���� �� ����
		double sum[]={0,0,0,0,0}; // ���� �� ��
		
		for(int a=0; a<args.length; a++){
			dap[a]=Integer.parseInt(args[a]); // �����Ű����� -> dap�迭�� �ֱ�
		}
		
		for(int i=0; i<student.length; i++){
			for(int j=0; j<student[i].length; j++){
				if(dap[j] == student[i][j]){ //��� �л��� ������ ��� �´���
					sum[i]+=score[j]; //������ j��°�� �ش��ϴ� ���� �ο�
					System.out.print("o\t"); //����ǥ o
				}
				else System.out.print("x\t"); //Ʋ����� ����ǥ x
			}
			System.out.println("�л�" + (i+1) + "�� ���� : " + sum[i] + "��");
		}
		
	}
	
}
