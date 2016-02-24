package de.koopa.lg.bootstrap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import koopa.cobol.grammar.CobolBaseGrammar;
import koopa.cobol.grammar.CobolGrammar;
import koopa.core.parsers.ParserCombinator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.stringtemplate.v4.ST;

public class ListenerGenerator {
	private final static String pathToCobolTokens = "src/de/koopa/lg/bootstrap/Token.list";
	private final static String sourceDirectoryGenerates = "src/de/koopa/lg/treewalker/";
	private final static String sourceDirectoryStringTemplates = "src/de/koopa/lg/bootstrap/";
	private final static String baseListenerName = "CobolBaseTreeListener";
	private final static String cobolNodeEnumName = "CobolNode";
	private final static char stringTemplateDelimiter = '$';
	private final static String packageDeclaration = "de.koopa.lg.treewalker";
	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) throws Exception {
		logger.info("Start generating TreeWalker");
		ListenerGenerator generator = new ListenerGenerator();
		generator.generate();
	}

	public ListenerGenerator() {
	}

	public void generate() throws Exception {
		String[] cobolTokens = getContentFromFile(pathToCobolTokens).split("\\r?\\n");
		Map<String, String> cobolNodeTypes = new HashMap<String, String>();
		for (String cobolToken : cobolTokens) {
			cobolNodeTypes.put(getTokenName(cobolToken), getTokenContent(cobolToken));
		}
		extractCobolNodes(cobolNodeTypes, CobolGrammar.class);
		extractCobolNodes(cobolNodeTypes, CobolBaseGrammar.class);
		generateBaseListener(cobolNodeTypes);
		generateCobolNodeTypeEnum(cobolNodeTypes);
		System.out.println("Generating finished.");
	}

	private void extractCobolNodes(Map<String, String> cobolNodeTypes, Class<?> clazz) {
		for (Method m : clazz.getDeclaredMethods()) {
			if (m.getReturnType() == ParserCombinator.class) {
				cobolNodeTypes.put(m.getName(), m.getName());
			}
		}
	}

	private String getTokenName(String cobolToken) {
		int equalSignPos = cobolToken.indexOf("=");
		if (equalSignPos > 0) {
			return "TOKEN_" + cobolToken.substring(0, equalSignPos);
		}
		return "TOKEN_" + cobolToken;
	}

	private String getTokenContent(String cobolToken) {
		int equalSignPos = cobolToken.indexOf("=");
		if (equalSignPos > 0) {
			return cobolToken.substring(equalSignPos + 1);
		}
		return cobolToken;
	}

	private String getContentFromFile(String pathtocoboltokens) {
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(pathtocoboltokens));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private void generateBaseListener(Map<String, String> cobolNodeTypes) throws IOException, Exception {
		String interf = getBaseListener(cobolNodeTypes);
		saveToFile(sourceDirectoryGenerates + baseListenerName + ".java", interf);
	}

	private void generateCobolNodeTypeEnum(Map<String, String> cobolNodeTypes) throws Exception {
		String nodeTypeEnum = getCobolNodeTypeEnum(cobolNodeTypes);
		saveToFile(sourceDirectoryGenerates + cobolNodeEnumName + ".java", nodeTypeEnum);
	}

	private String getCobolNodeTypeEnum(Map<String, String> list) throws IOException {
		ST template = new ST(getStringTemplate(cobolNodeEnumName + ".st"), stringTemplateDelimiter, stringTemplateDelimiter);
		template.add("package", packageDeclaration);
		template.add("Mapping", list);
		return template.render();
	}

	private String getBaseListener(Map<String, String> list) throws IOException {
		ST template = new ST(getStringTemplate(baseListenerName + ".st"), stringTemplateDelimiter, stringTemplateDelimiter);
		template.add("package", packageDeclaration);
		template.add("closingCurlyBraclet", "}");
		template.add("Mapping", list);
		return template.render();
	}

	public String getStringTemplate(String templateName) throws IOException {
		FileInputStream template = new FileInputStream(sourceDirectoryStringTemplates + templateName);
		return fromStream(template);
	}

	public String fromStream(InputStream in) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		StringBuilder out = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		String line;
		while ((line = reader.readLine()) != null) {
			out.append(line);
			out.append(newLine);
		}
		return out.toString();
	}

	private void saveToFile(String filename, String content) throws Exception {
		BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
		try {
			outputStream.write(content);
		} catch (Exception e) {
			throw e;
		} finally {
			outputStream.close();
		}
	}

}
