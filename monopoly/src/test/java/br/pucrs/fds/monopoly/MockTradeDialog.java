package src.test.java.br.pucrs.fds.monopoly;
import src.main.java.br.pucrs.fds.monopoly.*;

public class MockTradeDialog implements TradeDialog {

    public TradeDeal getTradeDeal() {
        TradeDeal deal = new TradeDeal();
        deal.setAmount(200);
        deal.setSellerIndex(0);
        deal.setPropertyName(GameMaster.instance().getGameBoard().getCell(1).toString());
        return deal;
    }
}
