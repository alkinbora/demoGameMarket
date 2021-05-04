package GameMarket;

public class OrderManager implements OrderService{

	@Override
	public void buy(Player player, Game game) {
		
		System.out.println(player.getFirstName() + " " + game.getName() + " oyununu " + game.getUnitPrice() + " TL'ye sat�n ald�.");
	}

	@Override
	public void buyWithDiscountedPrice(Player player, Game game, Campaign campaign) {
		System.out.println(player.getFirstName() + " " + game.getName() + " oyununu " + campaign.getName() + " kampanyas�ndan yararlanarak %" + campaign.getDiscount() + " indirimle " + (game.getUnitPrice()-((game.getUnitPrice()*campaign.getDiscount())/100)) + "TL'ye sat�n ald�.");
		
	}

}
