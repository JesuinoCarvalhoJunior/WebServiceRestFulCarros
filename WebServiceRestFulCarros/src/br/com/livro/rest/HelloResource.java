package br.com.livro.rest;

import javax.ws.rs.Consumes;
//import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import br.com.livro.domain.Response;

// define o caminho do servico
// como o Jersey foi configurado para /rest/* no web.xml, o caminho completo do servico
//sera /rest/hello

// classe criada com o noem HelloResource e nao HelloServico pois este é o padrao do REST
// o padrao usa  a palavra (Resource) RECURSO no lugar de (Service) SERVICO
// para o REST tudo é RECURSO.

@Path("/hello")
public class HelloResource {

	// as anotacoes @GET, @POST, @PUT e @DELETE
	// se houver alguma chamada HTTP com esses metodos, automaticamentos
	// os metados anotados serao chamados respectivamente.

	
	//@Consumes - define o tipo de conteudo que o metodo consome
	//@Produces - define o tipo de conteudo que o metodo retorna
	// as anotacoes foram colocadas em cada metodo, mas tambem podera ser a nivel de classe
	// e dizer qe todos os metodos utilizarao as anotacoes
	
	@GET
	@Consumes(MediaType.TEXT_HTML)
	@Produces(MediaType.TEXT_HTML + ";charset=utf-8")
	public String helloHTML() {
		return "<b>Olá mundo HTML!</b>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloTextPlain() {
		return "Olá mundo Texto!";
	}

	@GET
	@Consumes({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	@Produces({ MediaType.APPLICATION_XML, MediaType.TEXT_XML })
	public Response helloXML() {
		return Response.Ok("Olá mundo XML!");
	}

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloJSON() {
		return Response.Ok("Olá mundo JSON!");
	}
	/*	
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
	*/
}
