package cp.fileUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import javax.swing.*;

public class FileTools {

	public static void savaFile(JTextArea jTextArea2, String inSrc) {

		BufferedWriter bw = null;
		OutputStreamWriter osw = null;
		try {
			OutputStream os = new FileOutputStream(inSrc);
			osw = new OutputStreamWriter(os, "utf-8");
			bw = new BufferedWriter(osw);
			for (String value : jTextArea2.getText().split("\n")) {
				bw.write(value);
				bw.newLine();// »»ÐÐ
			}
			// bw.write(jTextArea2.getText());
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {

			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void readFile(JTextArea jTextArea3, String source) {
		File file = new File(source);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String hasRead = null;
			while ((hasRead = br.readLine()) != null) {
				jTextArea3.append(hasRead + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void changeSystemOut(String desc) {
		FileOutputStream fileOutputStream = null;
		PrintStream printStream = null;
		try {
			fileOutputStream = new FileOutputStream(desc);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		printStream = new PrintStream(fileOutputStream);
		System.setOut(printStream);
	}

}
