package Day12;

public class Grade {
	// �ʵ�
	int kor, eng, mat;

	// ������
	Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// �޼ҵ�
	double avg() {
		int sum = kor + eng + mat;
		return sum / 3;
	}

}
