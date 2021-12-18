package daos;

import java.util.List;

public interface WhiskeyDAO {

   public Whiskey findById(int id);
   public List findAll();
   public Whiskey update(Whiskey dto);
   public Whiskey create(Whiskey dto);
   public void delete(int id);

}
