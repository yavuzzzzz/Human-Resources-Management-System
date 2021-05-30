package kodlamaio.Human.Resources.Management.System.hrms.core.MernisAdapter;

import org.springframework.stereotype.Component;

import tr.gov.nvi.tckimlik.WS.KPSPublicLocator;

@Component
public class MernisAdapter {
	public boolean isValidPerson(String TCNO, String name, String surname, short birthYear) {

		try {
			return new KPSPublicLocator().getKPSPublicSoap().TCKimlikNoDogrula(Long.parseLong(TCNO), name, surname,
					birthYear);
		} catch (Exception exception) {
			System.out.println(exception);
			return false;
		}

	}

}
