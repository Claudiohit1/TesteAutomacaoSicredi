package runaction;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosWebGet;
import metodos.MetodosTest;

public class RunnerAction {

	MetodosTest metodos = new MetodosTest();
	ElementosWebGet el = new ElementosWebGet();

	@Before
	public void setUp() throws Exception {
		metodos.abrirBrowser("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

	}

	@After
	public void tearDown() throws Exception {
		metodos.fecharBrowser();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		metodos.selecionarVersao(el.selectVersion);
		metodos.clicarAddCustomer(el.clicarAddCustomer);
		metodos.inserirName(el.preencherName, "Teste sicredi");
		metodos.inserirLastName(el.preencherLastName, "Teste");
		metodos.inserirContFirstName(el.preencherContFirstName, "José Claudio de Souza");
		metodos.digitarPhone(el.preencherPhone, "51 9999-9999");
		metodos.inserirAddress1(el.preencherAddress1, "Av Assis Brasil, 3970");
		metodos.inserirAddress2(el.preencherAddress2, "Torre D");
		metodos.inserirCity(el.preencherCity, "Porto Alegre");
		metodos.inserirState(el.preencherState, "RS");
		metodos.inserirPostalCode(el.preencherPostalCode, "91000-000");
		metodos.inserirCountry(el.preencherCountry, "Brasil");
		metodos.clicarEmployeer(el.clicarCampoEmployeer);
		metodos.selecionarEmployeer(el.digitarEmployeer);
		metodos.inserirEmployeer(el.inserirEmployeer);
		metodos.inserirCreditLimit(el.preencherCredit, "200");
		metodos.scroll(0, 280);
		metodos.clicarEnviar(el.clicarEnviar);
		metodos.validarMsg(el.validarMsg, "Your data has been successfully stored into the database.");
		metodos.takesScrs("Ct01 - el");
		

	}

}
