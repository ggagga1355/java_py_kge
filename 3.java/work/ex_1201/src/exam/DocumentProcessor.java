package exam;

public class DocumentProcessor implements Sortable {

	@Override
	public void print() {
		System.out.println("문서 출력");
	}

	@Override
	public void sort() {
		System.out.println("문서 정렬");
	}
	
}
