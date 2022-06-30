package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Elementos e = new Elementos();
	Metodos m = new Metodos();
	
	@Given("^que acesse a url \"([^\"]*)\"$")
	public void que_acesse_a_url(String arg1) throws Throwable {
	  m.abrirNavegador(arg1);
		
	}

	@Given("^selecione o botao abrir conta$")
	public void selecione_o_botao_abrir_conta() throws Throwable {
	  m.clicar(e.getBtnCookies());
	  m.clicar(e.getBtnAbraSuaConta());
	  
	  
	}

	@When("^preenhcer o formulario de abertura de conta$")
	public void preenhcer_o_formulario_de_abertura_de_conta() throws Throwable {
	m.pausa(2000);   
	m.preencher("Samuel xavier", e.getCampoNome());
	m.pausa(2000);
	m.preencher("11958639487", e.getCampoTelefone());
	m.preencher("samuca_rds@teste.com.br", e.getCampoEmail());
	   m.preencher("39642887568", e.getCampoCpf());
	   m.preencher("21021950", e.getCampoDataNascimento());
	   m.clicar(e.getCheckbox());
	   m.clicar(e.getBtnContinuar());
		
	}

	@Then("^Valido se formulario foi enviado$")
	public void valido_se_formulario_foi_enviado() throws Throwable {
	   m.pausa(3000);
		m.validarTexto(e.getTextoValidacao(), "Prontinho! Recebemos os seus dados.");
		String evidencia = "validar abertura de conta";
		m.print("./evidencia/" + evidencia + ".png");
		m.fecharNavegador();
	}
 
	
 }

	

