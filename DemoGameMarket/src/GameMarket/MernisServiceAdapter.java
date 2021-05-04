package GameMarket;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean validate(Player player) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), 
					player.getDateOfBirth());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}

}
