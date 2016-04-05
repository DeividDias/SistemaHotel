package hotel.model.dao.jpa;

import javax.persistence.EntityManager;

public class EM {
	private static ThreadLocal<EntityManager> emLocal = new ThreadLocal<EntityManager>();

	// se ja existir uma EntityManager instanciada para a thread local, retorna-a. Se nao 
	// existir ainda, instancia a EntityManager armazenando-a na thread local e a retorna.
	public static synchronized EntityManager get(){
		EntityManager em = emLocal.get();
		if(em == null){
			em = EMF.get().createEntityManager();
			emLocal.set(em);
		}
		return em;
	}

	// Fecha a EntityManager da thread local e define a mesma como null
	public static void close(){
		EntityManager em = emLocal.get();
		if (em != null) {
			emLocal.get().close();
			emLocal.set(null);
		}
	}
}
