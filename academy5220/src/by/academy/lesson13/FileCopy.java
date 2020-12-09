package by.academy.lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static final String INPUT_FILE_PATH = "src\\io\\file.txt";
	public static final String OUTPUT_FILE_PATH = "src\\io\\copied_file.txt";

	public static void main(String[] args) throws IOException {

		File inputFile = new File(INPUT_FILE_PATH);
		if (!inputFile.exists()) {
			inputFile.createNewFile();
		}

		File outputFile = new File(OUTPUT_FILE_PATH);
		if (!outputFile.exists()) {
			outputFile.createNewFile();
		}

		try (FileInputStream fileIn = new FileInputStream(inputFile);
				FileOutputStream fileOut = new FileOutputStream(outputFile)) {
			int a;
			while ((a = fileIn.read()) != -1) {
				fileOut.write(a);
			}
		}
	}
}