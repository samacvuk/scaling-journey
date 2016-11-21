package src.main.java.br.pucrs.fds.monopoly;

public abstract class Cell implements IOwnable {
	private boolean available = true;
	private String name;
	protected Player owner;

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see src.main.java.br.pucrs.fds.monopoly.IOwnable#getOwner()
	 */
	public Player getOwner() {
		return owner;
	}
	
	public int getPrice() {
		return 0;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see src.main.java.br.pucrs.fds.monopoly.IOwnable#setOwner(src.main.java.br.pucrs.fds.monopoly.Player)
	 */
	public void setOwner(Player owner) {
		this.owner = owner;
	}
    
    public String toString() {
        return name;
    }
}
