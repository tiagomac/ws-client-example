package github.tiagomac;

import java.net.URI;
import java.net.URL;

import github.tiagomac.ws.correios.AtendeClienteService;
import github.tiagomac.ws.correios.EnderecoERP;

public class Main {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
			AtendeClienteService atendeClienteService = new AtendeClienteService(url);
			EnderecoERP consultaCEP = atendeClienteService.getAtendeClientePort().consultaCEP("40279080");
			System.out.println(consultaCEP);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
