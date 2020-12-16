package by.academy.lesson13.classwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class XFiles {

	public static void main(String[] args) throws IOException {
		File dir = new File("files");

		if (!dir.exists()) {
			dir.mkdir();
		}

		File src = new File("text.txt");

		if (!src.exists()) {
			return;
		}
		char[] arr = new char[1024];
		StringBuilder str = new StringBuilder();

		try (BufferedReader fr = new BufferedReader(new FileReader(src))) {

			while (fr.read(arr) > 0) {
				str.append(arr);
			}
		}

		System.out.println(str);

		String[] words = str.toString().split(" ");
		System.out.println(words.length);
		int counter = 0;
		for (int i = 0; i < 20; i++) {
			File file = new File(dir, (i + 1) + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {
				fw.write(words[counter++] + " ");
				fw.write(words[counter++] + " ");
				fw.write(words[counter++] + " " + "\n");
				LocalDateTime date = LocalDateTime.now();
				fw.write(date.toString());
			}

		}

	}

}
