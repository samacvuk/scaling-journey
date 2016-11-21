package src.main.java.br.pucrs.fds.monopoly.gui;

import src.main.java.br.pucrs.fds.monopoly.Cell;

public class CCCellInfoFormatter implements CellInfoFormatter {
	
    public String format(Cell cell) {
        return "<html><font color='white'><b>" + cell.getName() + "</b></font></html>";
    }
}