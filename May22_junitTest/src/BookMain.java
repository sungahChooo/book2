
public class BookMain {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
        bm.addBook(1, "자바 기초", "Jane", 2021);
        bm.addBook(1, "가나다라", "마바사", 1234);//id만 이미 있는 것

        bm.searchBook(1);
        
        bm.addBook(2, "소프트웨어 공학", "Tom", 2014);
        bm.addBook(3, "분산 컴퓨팅", "Yoon", 2024);

        bm.searchBook(1);
        bm.searchBook(2);
        bm.searchBook(3);
        bm.searchBook(4);

        bm.addBook(1, "자바 기초", "Jane", 2021);
        bm.addBook(2, "소프트웨어 공학", "Tom", 2014);

        bm.removeBook(1);
        bm.removeBook(1);//이미 삭제한 것 삭제 반복
        bm.searchBook(1);//이미 삭제한 것 검색
	}
}
