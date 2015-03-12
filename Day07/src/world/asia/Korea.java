package world.asia;

public class Korea {
	
	private int population;	// 인구
	String capital;	// 수도
	private String[] specialList = {"진주실크", "대구사과", "천안호도과자"};	// 지역특산물
	public int i;	// public 테스트용
	
	public void setPopulation(int p) {
		population = p;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public String[] getList() {
		return specialList;
	}
	
	void test() {
		capital = "서울";
		i = 10;
		System.out.println(Math.PI);
	}
	
}
