package src.main.java.br.pucrs.fds.monopoly;

public class Die {
	public int getRoll() {
		return (int)(Math.random() * 6) + 1;
	}
}
