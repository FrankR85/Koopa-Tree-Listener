import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import koopa.cobol.parser.ParseResults;
import koopa.core.trees.KoopaTreeBuilder;
import koopa.core.trees.Tree;

import org.junit.Test;

import de.koopa.lg.listener.ProcedureDivisionListener;
import de.koopa.lg.treewalker.CobolTreeWalker;

public class ProcedureUsing_Test {
	@Test
	public void parseSimple() throws IOException {
		koopa.cobol.parser.CobolParser parser = new koopa.cobol.parser.CobolParser();
		parser.setBuildTrees(true);
		parser.setPreprocessing(false);
		ParseResults r = parser.parse(new File("simple.cbl"));
		Tree tree = r.getParse().getTarget(KoopaTreeBuilder.class).getTree();
		CobolTreeWalker walker = new CobolTreeWalker(tree);
		ProcedureDivisionListener pdl = new ProcedureDivisionListener();
		walker.addListener(pdl);

		walker.walk();

		List<String> result = pdl.getResult();

		System.out.println(result);

		assertEquals(3, result.size());
	}
}
