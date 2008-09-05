package negocio;

import javax.swing.UIManager;

import visao.Tela;

/**
 * @author Fabio
 * @version 1.0
 * @created 22-mai-2008 19:52:54
 */
public class Main {
	public Tela m_Tela;
	
	public static void main( String args[] ) {
		try{
			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
			System.out.print( " " );
		} catch( Exception ex ){
			ex.printStackTrace();
		}
		new Tela().setVisible( true );
	}
}