package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import entity.Pessoa;
import persistence.PessoaDao;

@Path("/pessoa")
public class PessoaService {

	     //webService vem como String
	@GET
	@Path("/gravar/{nome}/{sexo}/{idade}")
	 @Produces("text/plain")
	 public String gravar(@PathParam("nome")String nome, 
			                        @PathParam("sexo" )String sexo,
			                        @PathParam("idade") String idade
			                       ){
		 try{
		   Pessoa p= new Pessoa (null, nome, sexo, new Integer(idade));
		  new PessoaDao().create(p);
		    return "Dados Gravados ...";
		 }catch(Exception ex){
			 return "Error : " + ex.getMessage();
		 }
		 
	 }
	 
	@GET
	@Path("/listar")
	 @Produces("Application/json")
	 public String listar(){
		 try{
		return  new Gson().toJson(new PessoaDao().findAll()) ;
		 }catch(Exception ex){
			 return "Error : " + ex.getMessage();
		 }
	 }
	
	@GET
	@Path("/buscarCodigo/{codigo}")
	 @Produces("application/json")
	 public String buscarCodigo(@PathParam("codigo")String codigo){
		 try{
		return  new Gson().toJson(new PessoaDao().findByCode(new Integer(codigo))) ;
		 }catch(Exception ex){
			 return "Error : " + ex.getMessage();
		 }
	 }
	
	
	@GET
	@Path("/excluir/{codigo}")
	 @Produces("text/plain")
	 public String excluir(@PathParam("codigo") String codigo){
		 try{
		     new PessoaDao().delete(new Integer(codigo));
		     return "Registro Excluido pelo Codigo";
		 }catch(Exception ex){
			 return "Error : " + ex.getMessage();
		 }
	 }
	
	
	
	

}

