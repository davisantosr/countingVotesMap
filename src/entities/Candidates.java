package entities;

public class Candidates {
	private String name;
	private int quantityVotes;
	
	public Candidates(String name, int quantityVotes) {
		
		this.name = name;
		this.quantityVotes = quantityVotes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantityVotes() {
		return quantityVotes;
	}
	

}
