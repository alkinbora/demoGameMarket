package GameMarket;

public class Main {

	public static void main(String[] args) {
		
		
		Player player = new Player(1, "Alk�n Bora", "U�ak", "51928326680", 2000);
		Player player2 = new Player(2, "Engin", "Demiro�", "11111111111", 1992);
		Player player3 = new Player(3, "Serhat", "Dokumac�", "35011220970", 1999);
		
		Game game = new Game(1, "Age of Empires", 40);
		Game game2 = new Game(2, "Squad", 50);
		Game game3 = new Game(3, "Guild Wars 2", 100);

		Campaign campaign = new Campaign(1, "Yaz �ndirimi", 15);
		Campaign campaign2 = new Campaign(2, "Yeni �ye �ndirimi", 5);
		Campaign campaign3 = new Campaign(3, "Pandemide S�k�lma Bu F�rsat� Ka��rma", 50);
		
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(player);
		
		GameManager gameManager = new GameManager();
		System.out.println("OYUN L�STES�");
		gameManager.add(game);
		gameManager.add(game2);
		gameManager.add(game3);
		System.out.println("-------------------------------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		System.out.println("KULLANAB�LECE��N�Z KAMPANYALAR");
		campaignManager.add(campaign);
		campaignManager.add(campaign3);
		campaignManager.delete(campaign2);
		System.out.println("-------------------------------------------------------------");
		
		OrderManager orderManager = new OrderManager();
		orderManager.buyWithDiscountedPrice(player, game2, campaign3);
		
		System.out.println("��k�� Yap�ld�...");
		System.out.println("-------------------------------------------------------------");
		
		playerManager.add(player2);
		playerManager.delete(player2);
		System.out.println("-------------------------------------------------------------");
		
		
		playerManager.add(player3);
		System.out.println("OYUN L�STES�");
		gameManager.add(game);
		gameManager.delete(game2);
		gameManager.add(game3);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("KULLANAB�LECE��N�Z KAMPANYALAR");
		campaignManager.add(campaign);
		campaignManager.update(campaign2);
		campaignManager.add(campaign2);
		campaignManager.add(campaign3);
		System.out.println("-------------------------------------------------------------");
		
		orderManager.buy(player3, game3);
		
	}

}
