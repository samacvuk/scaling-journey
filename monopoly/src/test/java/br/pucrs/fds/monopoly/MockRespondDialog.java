package src.test.java.br.pucrs.fds.monopoly;
import src.main.java.br.pucrs.fds.monopoly.*;

public class MockRespondDialog implements RespondDialog {
    public MockRespondDialog(TradeDeal deal) {
    }

    public boolean getResponse() {
        return true;
    }
}
