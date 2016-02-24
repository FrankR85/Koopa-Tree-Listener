package de.koopa.lg.treewalker;

import java.util.ArrayList;

import koopa.core.trees.Tree;

public class CobolTreeWalker {
	private Tree tree;
	private ArrayList<CobolTreeListener<?>> observer;

	public CobolTreeWalker(Tree tree) {
		this.tree = tree;
		observer = new ArrayList<CobolTreeListener<?>>();
	}

	public void addListener(CobolTreeListener<?> listener) {
		observer.add(listener);
	}

	public void removeListener(CobolTreeListener<?> listener) {
		observer.remove(listener);
	}

	public void walk() {
		walk(tree);
	}

	private void walk(Tree node) {
		enter(node);
		for (int i = 0; i < node.getChildCount(); i++) {
			walk(node.getChild(i));
		}
		exit(node);
	}

	private void enter(Tree node) {
		for (CobolTreeListener<?> listener : observer) {
			listener.enter(node);
		}
	}

	private void exit(Tree node) {
		for (CobolTreeListener<?> listener : observer) {
			listener.exit(node);
		}
	}

}
