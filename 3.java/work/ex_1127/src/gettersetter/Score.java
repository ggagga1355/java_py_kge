package gettersetter;

public class Score {
	private int kor;
	private int eng;
	private int math;
	
	public int getKor() {
	      return kor;
	   }
	   
   public void setKor(int kor) {
      if(kor < 0 || kor > 100) {
         System.out.println("점수는 0 ~ 100 사이여야 합니다.");
      }
      this.kor = kor;
   }
   
   public int getEng() {
      return eng;
   }
   
   public void setEng(int eng) {
      if(eng < 0 || eng > 100) {
         System.out.println("점수는 0 ~ 100 사이여야 합니다.");
      }
      this.eng = eng;
   }
   
   public int getMath() {
      return math;
   }
   
   public void setMath(int math) {
      if(math< 0 || math > 100) {
         System.out.println("점수는 0 ~ 100 사이여야 합니다.");
      }
      this.math = math;
   }
   
	
	public int getKorScore() {
		return this.kor;
	}
	public int getEngScore() {
		return this.eng;
	}
	public int getMathScore() {
		return this.math;
	}
	
	//총점 getTotal
	public int getTotal() {
		return this.kor + this.eng + this.math;
	}
	public double getAverage() {
		return getTotal()/3.0;
	}
}
