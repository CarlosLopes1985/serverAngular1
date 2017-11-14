package persistence;
import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class PessoaDao  extends Dao{

	public void create(Pessoa p) throws Exception{
		  open(); 
		    stmt = con.prepareStatement("insert into pessoa values (null,?,?,?)");
		       stmt.setString(1, p.getNome());
		       stmt.setString(2, p.getSexo());
		       stmt.setInt(3 ,  p.getIdade());
		     stmt.execute();
		  close();
	 }
	 
	public List<Pessoa> findAll() throws Exception{
		  open(); 
		    stmt = con.prepareStatement("select * from pessoa");
		       rs = stmt.executeQuery();
		       List<Pessoa> lst = new ArrayList<Pessoa>();
		       while(rs.next()){
		    	   Pessoa p = new Pessoa(rs.getInt(1),
		    			                                 rs.getString(2),
		    			                                 rs.getString(3),
		    	                                        rs.getInt(4));
		    	   lst.add(p);
		       }
		  close();
		  return lst;
     }
	
	public Pessoa findByCode(Integer cod) throws Exception{
		  open(); 
		    stmt = con.prepareStatement("select * from pessoa where codigo = ?");
		    stmt.setInt(1, cod);
		       rs = stmt.executeQuery();
		       Pessoa p = null;
		       if(rs.next()){
		    	  p = new Pessoa(rs.getInt(1),
		    			                      rs.getString(2),
		    			                      rs.getString(3),
		    	                              rs.getInt(4));
		       }
		  close();
		  return p;
   }
	public void delete(Integer cod) throws Exception{
		  open(); 
		    stmt = con.prepareStatement("delete from pessoa where codigo=?"); 
		      stmt.setInt(1,cod);
		     stmt.execute();
		  close();
	 }

	
	
	
	 

}
