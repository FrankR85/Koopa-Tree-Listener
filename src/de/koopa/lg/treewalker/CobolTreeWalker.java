package de.koopa.lg.treewalker;

import java.util.ArrayList;

import koopa.core.trees.Tree;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CobolTreeWalker {
	private Tree tree;
	private static final Logger logger = LogManager.getLogger();
	private ArrayList<CobolTreeListener<?>> observer;

	public CobolTreeWalker(Tree tree) {
		this.tree = tree;
		observer = new ArrayList<CobolTreeListener<?>>();
	}

	public void addListener(CobolTreeListener<?> listener) {
		logger.trace("Added Listener " + listener);
		observer.add(listener);
	}

	public void removeListener(CobolTreeListener<?> listener) {
		logger.trace("Removed Listener " + listener);
		observer.remove(listener);
	}

	public void walk() {
		if (tree == null) {
			logger.error("Walking null tree");
		} else {
			walk(tree);
		}
	}

	private void walk(Tree node) {
		enter(node);
		for (int i = 0; i < node.getChildCount(); i++) {
			if (node.getChild(i) == null) {
				logger.error("Child " + i + " is null for " + node.toString());
			}
			walk(node.getChild(i));
		}
		exit(node);
	}

	private void enter(Tree node) {
		for (CobolTreeListener<?> listener : observer) {
			if (listener.isListening()) {
				listener.enter(node);
			}
		}
	}

	private void exit(Tree node) {
		for (CobolTreeListener<?> listener : observer) {
			if (listener.isListening()) {
				listener.exit(node);
			}
		}
	}

}
