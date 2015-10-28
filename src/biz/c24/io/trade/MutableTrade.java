package biz.c24.io.trade;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;

/**
 * User: John Davies (John.Davies@C24.biz)
 * Date: 03/09/2014
 * Time: 13:13
 */
public interface MutableTrade extends ImmutableTrade {
    public BasicTrade parse(String line) throws ParseException;

    public void setAmount1(BigDecimal amount1);

    public void setAmount2(BigDecimal amount2);

    public void setBuySell(String buySell);

    public void setCurrency1(String currency1);

    public void setCurrency2(String currency2);

    public void setExchangeRate(double exchangeRate);

    public void setId(long id);

    public void setSettlementDate(Date settlementDate);

    public void setTradeDate(Date tradeDate);
}
