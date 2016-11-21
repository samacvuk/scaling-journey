package src.main.java.br.pucrs.fds.monopoly.gui;

import src.main.java.br.pucrs.fds.monopoly.Cell;

public class FreeParkingCellInfoFormatter implements CellInfoFormatter {
    
    public static final String FP_CELL_LABEL = "<html><b>Free Parking</b></html>";
    
    public String format(Cell cell) {
        return FP_CELL_LABEL;
    }
}
