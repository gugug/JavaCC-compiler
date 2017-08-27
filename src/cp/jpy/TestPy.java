package cp.jpy;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class TestPy {
	public static void main(String args[]) {

		PythonInterpreter interpreter = new PythonInterpreter();
//		interpreter.exec("days=('mod','Tue','Wed','Thu','Fri','Sat','Sun'); ");
//		interpreter.exec("print days[1];");
//
//		// 运行python语句
//		interpreter.exec("a = \"hello, Jython\"");
//		interpreter.exec("print a");
//		
//		execPYFile(interpreter);
		
		 interpreter.execfile("input.txt");
//		 PyFunction pyFunction = interpreter.get("adder", PyFunction.class);
//		 int a = 2015, b = 2;
//		 PyObject pyObj = pyFunction.__call__(new PyInteger(a),new PyInteger(b));
//		 System.out.println("answer: "+pyObj.toString());
		 
	}// main
	
	
	public static void execPYFile(PythonInterpreter interpreter){
		interpreter.exec("a=3; b=5;");
		try {
			InputStream filepy = new FileInputStream(
					"E:\\大三下\\Compilers\\input.py");
			interpreter.execfile(filepy);
			filepy.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
