package br.com.livro.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

// define o caminho do servico
// como o Jersey foi configurado para /rest/* no web.xml, o caminho completo do servico
//sera /rest/hello
@Path("/hello")
public class HelloResource {

	// as anotacoes @GET, @POST, @PUT e @DELETE
	// se houver alguma chamada HTTP com esses metodos, automaticamentos
	// os metados anotados serao chamados respectivamente.

	@GET
	public String Get() {
		return "Http Get";
	}

	@POST
	public String Post() {
		return "Http Post";
	}

	@PUT
	public String Put() {
		return "Http Put";
	}

	@DELETE
	public String Delete() {
		return "Http Delete";
	}
}
