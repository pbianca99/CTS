package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean potInvitaOameniiLaMasa(Masa masa) {
		if(OperatorMese.esteLibera(masa)) {
			Picolo jimmy = new Picolo("Jimmy");
			if(jimmy.esteDebarasata(masa)&&jimmy.esteAranjata(masa)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
