package video17;

public class tuna {
	public tuna(String name){
		girlName = name;
	}
	private String girlName;
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("your first gf was %s", getName());
	}
}

