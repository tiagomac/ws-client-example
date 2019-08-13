package github.tiagomac;

import java.net.URI;
import java.net.URL;

import github.tiagomac.ws.correios.AtendeClienteService;
import github.tiagomac.ws.correios.EnderecoERP;

public class Main {

	private static final String WSDL_URL = "https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl";

	public static void main(String[] args) {
		try {
			URL url = new URL(WSDL_URL);
			AtendeClienteService atendeClienteService = new AtendeClienteService(url);
			EnderecoERP consultaCEP = atendeClienteService.getAtendeClientePort().consultaCEP("70150903");
			System.out.println(consultaCEP);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
