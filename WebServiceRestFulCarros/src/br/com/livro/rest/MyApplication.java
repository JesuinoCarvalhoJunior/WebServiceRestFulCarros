package br.com.livro.rest;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.jettison.JettisonFeature;

public class MyApplication extends Application {

	// metodo responsavel por adicionar funcionalidades ao Jersey
	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();

		// drive do jettison para gerar Json
		// JettisonFeature faz a configuacao para permitir qe o jersey retorne dados em Json
		singletons.add(new JettisonFeature());
		return singletons;
	}

	// metodo responsavel por configurar a propriedade 
	// que indica ao jersey em qal pacote estao as classes do webservices
	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();

		// configura o pacote para fazer scan das classes com anotacoes REST.
		properties.put("jersey.config.server.provider.packages", "br.com.livro");

		return properties;

	}

}
