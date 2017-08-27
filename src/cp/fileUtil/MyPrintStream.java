package cp.fileUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.JTextArea;

public class MyPrintStream extends PrintStream {  
    private JTextArea jta;  
    private static final OutputStream DUMMY_OUT = new ByteArrayOutputStream(0);  

    public MyPrintStream(JTextArea jta){  
        super(DUMMY_OUT);  
        this.jta = jta;  
    }  
  
    public void print(String s) {  
        if (s == null) {  
            s = "null";  
        }  
        jta.append(s);  
    }   
   
    public void println(String s) {  
        if (s == null) {  
            s = "null";  
        }  
        jta.append(s+"\n");  
    }   
}  
