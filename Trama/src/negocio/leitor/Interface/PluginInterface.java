package negocio.leitor.Interface;

import java.util.LinkedList;

/**
 * Interface necess�ria para qualquer plugin que deseje funcionar com o aplicativo Trama.
 * 
 * @author Fabio Marmitt
 */
public interface PluginInterface {
	
	/**
	 * M�todo utilizado para buscar os nomes das extens�es que o plugin pode trabalhar.
	 * 
	 * @return a lista com os nomes das extens�es.
	 */
	public String getNome();
	
	/**
	 * M�todo usado para se conhecer o nome dos arquivos que o plugin pode trabalhar.
	 * 
	 * @return o nome.
	 */
	public LinkedList< String > getExtensoes();
	
	/**
	 * Metodo usado para extrair os objetos dos arquivos.
	 * 
	 * @return lista de objetos extra�dos.
	 */
	public LinkedList< String > getObjetos( String arquivo );
}
