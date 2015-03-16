import java.io.InputStream;

/**
 * Klasa pomagaj�ca pobra� okre�lon� ikon� dla talii kart z grafik umieszczonych w pliku .jar
 * @author Piotr Wrona
 * @version 1.0
 * @see GUI
 */
public class ZrodloIkon {

	/**
	 * Pobiera okre�lon� �cie�k� pliku (ikony)
	 * @param path adres �cie�ki w .jar
	 * @return adres �cie�ki do wykorzystania
	 */
	public static InputStream load(String path){
		InputStream input = ZrodloIkon.class.getResourceAsStream(path);
		if (input==null){
			input = ZrodloIkon.class.getResourceAsStream("/"+path);
		}
		return input;
	}
	
}
