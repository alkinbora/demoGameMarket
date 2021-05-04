package GameMarket;

public interface OrderService {
	
	void buy(Player player, Game game);
	void buyWithDiscountedPrice(Player player, Game game, Campaign campaign);

}
