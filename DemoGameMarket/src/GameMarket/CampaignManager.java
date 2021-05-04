package GameMarket;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi: " + campaign.getName());
		System.out.println("Kampanyadan Kazanacaðýnýz Ýndirim: %" + campaign.getDiscount());
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Bitti " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi: " + campaign.getName() + ": %" + campaign.getDiscount());
		
	}

}
