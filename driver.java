import analysis.*;
import javafx.scene.transform.Translate;
import lexer.*;
import node.*;
import parser.*;
import java.io.*;

public class driver {
	public static void main(String[] arguments) throws Exception {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String line;
		if (arguments.length == 1) {
			readFile(arguments[0]);
		}
		// while ((line = stdin.readLine()) != null) {
		// 	readFile(line);
		// }
	}

	static void readFile(String file) throws Exception {
		FileReader in = new FileReader(file);
		try {
			PushbackReader preprocessor = new PushbackReader(new BufferedReader(in), 1024);

			System.out.println("Lexing " + file);
			Lexer lexer = new Lexer(new PushbackReader(preprocessor, 1024));
			System.out.println("Parsing " + file);
			Parser parser = new Parser(lexer);
			try {
				Start ast = parser.parse();
				System.out.println("Parsed successfully");
				TranslateGraph tg = new TranslateGraph();
				ast.apply(tg);
				tg.printTree();
				System.out.println("\n\nIs this graph acyclic? " + tg.isAcyclic + "\n");
			} catch (Exception e) {
				throw e;
			}
		} finally {
			in.close();
		}
	}
}