package biz.c24.io.trade;

/**
 * User: John Davies (John.Davies@C24.biz)
 * Date: 15/09/2014
 * Time: 17:23
 */
public class TradeFactory {
    public static ImmutableTrade createTrade(biz.c24.io.trade.TradeType type) {
        switch( type ) {
            case BINARY_TRADE: {
                return biz.c24.io.trade.TradeUtils.createRandomTrade(new BinaryTrade());
            }
            case OBJECT_TRADE: {
                return biz.c24.io.trade.TradeUtils.createRandomTrade(new ObjectTrade());
            }
            default:
                throw new RuntimeException("TradeType not recognised.");
        }
    }
}
