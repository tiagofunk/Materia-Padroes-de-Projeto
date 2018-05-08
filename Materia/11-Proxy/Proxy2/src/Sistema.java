import java.util.List;

public class Sistema {

	public static void main(String[] args) throws Exception {
		ClientesDao cDao = new ClientesDao();
		List<Cliente> clientes = cDao.carregarClientes();
		
		System.out.println(clientes.get(3).getCodigo());
		System.out.println(clientes.get(50).getCodigo());
		System.out.println(clientes.get(3).getCodigo());

	}

}
