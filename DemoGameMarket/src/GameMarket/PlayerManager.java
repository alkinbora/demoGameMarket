package GameMarket;

public class PlayerManager implements PlayerService{
	
	PlayerCheckService playerCheckService;
	
	
	public  PlayerManager(PlayerCheckService playerCheckService) {
		this.playerCheckService = playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(playerCheckService.validate(player)) {
			System.out.println("Oyuncu Sisteme Ba�ar�yla Kay�t Oldu!!");
			System.out.println("Ho�geldin " + player.getFirstName());
			System.out.println("-------------------------------------------------------------");
		}else {
			System.out.println("Bilgileriniz Yanl�� L�tfen Kontrol Ediniz. " + player.firstName);
		}
		
	}

	@Override
	public void delete(Player player) {
			System.out.println("Kullan�c� Silindi: " + player.getFirstName());
		
	}

	@Override
	public void update(Player player) {
		System.out.println("Kullan�c� Bilgileri G�ncellendi: " + player.getFirstName());
		
	}

}
