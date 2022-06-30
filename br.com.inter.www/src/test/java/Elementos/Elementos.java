package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnCookies = By.id("onetrust-accept-btn-handler");
	private By btnAbraSuaConta = By.cssSelector(
			"#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)");

	private By campoNome = By.name("nome");

	private By campoTelefone = By.name("celular");

	private By campoEmail = By.id("email");

	private By campoCpf = By.id("cpf");

	private By campoDataNascimento = By.id("dataNascimento");

	private By checkbox = By.cssSelector(
			"body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label");

	private By btnContinuar = By.cssSelector(
			"body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button");

	
	
	private By textoValidacao = By.cssSelector("body > div.modal-container > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p");
	
	public By getTextoValidacao() {
		return textoValidacao;
	}

	public By getBtnCookies() {
		return btnCookies;
	}

	public By getBtnAbraSuaConta() {
		return btnAbraSuaConta;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoTelefone() {
		return campoTelefone;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getCampoDataNascimento() {
		return campoDataNascimento;
	}

	public By getCheckbox() {
		return checkbox;
	}

	public By getBtnContinuar() {
		return btnContinuar;
	}

}
