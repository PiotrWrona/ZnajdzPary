import java.io.InputStream;

/**
 * Klasa pomagaj¹ca pobraæ okreœlon¹ ikonê dla talii kart z grafik umieszczonych w pliku .jar
 * @author Piotr Wrona
 * @version 1.0
 * @see GUI
 */
public class ZrodloIkon {

	/**
	 * Pobiera okreœlon¹ œcie¿kê pliku (ikony)
	 * @param path adres œcie¿ki w .jar
	 * @return adres œcie¿ki do wykorzystania
	 */
	public static InputStream load(String path){
		InputStream input = ZrodloIkon.class.getResourceAsStream(path);
		if (input==null){
			input = ZrodloIkon.class.getResourceAsStream("/"+path);
		}
		return input;
	}
	
}
