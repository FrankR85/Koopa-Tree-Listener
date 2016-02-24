package de.koopa.lg.listener;

import java.util.ArrayList;
import java.util.List;

import koopa.core.trees.Tree;
import de.koopa.lg.treewalker.CobolBaseTreeListener;

public class ProcedureDivisionListener extends CobolBaseTreeListener<List<String>> {
	private boolean listenToDataReference = false;
	private boolean listenToDataName = false;
	private List<String> result = new ArrayList<>();

	@Override
	public void enter_usingOrChainingPhrase(Tree tree) {
		listenToDataReference = true;
	}

	@Override
	public void exit_usingOrChainingPhrase(Tree tree) {
		listenToDataReference = false;
	}

	@Override
	public void enter_dataReference(Tree tree) {
		if (listenToDataReference) {
			listenToDataName = true;
		}
	}

	@Override
	public void exit_dataReference(Tree tree) {
		if (listenToDataReference) {
			listenToDataName = false;
		}
	}

	@Override
	public void enter_dataName(Tree tree) {
		if (listenToDataName) {
			result.add(tree.getProgramText());
		}
	}

	@Override
	public List<String> getResult() {
		return result;
	}


}
