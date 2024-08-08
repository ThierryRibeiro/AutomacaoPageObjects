package Steps;

import Elementos.ElementosTelaHome;
import Metodos.MetodosDeTela;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Teste {
	ElementosTelaHome e = new ElementosTelaHome ();
	MetodosDeTela m = new MetodosDeTela ();
	
	@Dado("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
		m.abrirNavegador(url);
		m.pausar(10000);
	}

	@Quando("^eu clicar nos produtos da tela home$")
	public void eu_clicar_nos_produtos_da_tela_home() throws Throwable {
		m.clicar(e.getProdutoSpeaker());
	}

	@Entao("^devera ser redirecionado para a tela do produto clicado$")
	public void devera_ser_redirecionado_para_a_tela_do_produto_clicado() throws Throwable {
	}
}

