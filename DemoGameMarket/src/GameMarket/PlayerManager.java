package GameMarket;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	
	public  PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.validate(player)) {
			System.out.println("Oyuncu Sisteme Baþarýyla Kayýt Oldu!!");
			System.out.println("Hoþgeldin " + player.getFirstName());
			System.out.println("-------------------------------------------------------------");
		}else {
			System.out.println("Bilgileriniz Yanlýþ Lütfen Kontrol Ediniz. " + player.firstName);
		}
		
	}

	@Override
	public void delete(Player player) {
			System.out.println("Kullanýcý Silindi: " + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Kullanýcý Bilgileri Güncellendi: " + player.getFirstName());
		
	}

}
