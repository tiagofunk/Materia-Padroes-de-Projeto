import java.util.List;

public class ClientesDao {

	public List<Cliente> carregarClientes() throws Exception {
		return new LazzyList<Cliente>("cliente", Cliente.class);
	}
}
