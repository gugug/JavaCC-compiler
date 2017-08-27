package cp.jpy;

import java.io.FileInputStream;
import java.io.IOException;

import org.python.util.PythonInterpreter;

public class JPyUtil {

	public static void execPYFile(String inSrc) {
		FileInputStream filepy = null;
		PythonInterpreter interpreter = new PythonInterpreter();
		try {
			
			filepy = new FileInputStream(inSrc);
			interpreter.execfile(filepy);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (filepy != null) {
				try {
					filepy.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public static void main(String[] args) throws IOException, InterruptedException {
	
	}

}
