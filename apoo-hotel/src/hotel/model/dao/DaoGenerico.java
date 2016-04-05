package hotel.model.dao;

import java.io.Serializable;
import java.util.List;

public interface DaoGenerico<E extends Serializable, ID extends Serializable> {
	public void inserirAtualizar(E e);
	public void excluir(E e);
	public E buscar(ID id);
	public List<E> buscarTodos();
}
