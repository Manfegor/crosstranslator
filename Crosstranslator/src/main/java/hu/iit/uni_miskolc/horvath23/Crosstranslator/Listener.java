package hu.iit.uni_miskolc.horvath23.Crosstranslator;

import java.awt.event.MouseAdapter;
import java.io.StringReader;
import java.util.List;

import hu.iit.uni_miskolc.horvath23.Crosstranslator.lexer.Scanner;
import hu.iit.uni_miskolc.horvath23.Crosstranslator.parser.Parser;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ScannerBuffer;
import java_cup.runtime.Symbol;

public class Listener extends MouseAdapter {
	
	Listener(){
	}

	public List<Symbol> scanText(String text, String goalLanguage) {
		Scanner scanner = new Scanner(new StringReader(text));
    	ScannerBuffer buffer = new ScannerBuffer(scanner);
		Parser parser = new Parser(buffer, new ComplexSymbolFactory());
		try {
			parser.parse();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		return buffer.getBuffered();
	}
}
