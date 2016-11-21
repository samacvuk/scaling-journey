package src.main.java.br.pucrs.fds.monopoly.gui;

import src.main.java.br.pucrs.fds.monopoly.Cell;

public class JailCellInfoFormatter implements CellInfoFormatter {

    public static final String JAIL_CELL_LABEL = "<html><b>Jail</b></html>";

    public String format(Cell cell) {
		return JAIL_CELL_LABEL;
	}

}
