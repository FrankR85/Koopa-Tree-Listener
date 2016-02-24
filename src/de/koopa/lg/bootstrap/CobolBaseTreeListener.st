package $package$;

import koopa.core.trees.Tree;
import de.koopa.lg.treewalker.KoopaTreeHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class CobolBaseTreeListener<T> implements CobolTreeListener<T>{
	private boolean isListening = true;
	private int procedureDivisionCount = 0;
	private static final Logger logger = LogManager.getLogger();
	
	public CobolBaseTreeListener() {	
	}
	public void enter(Tree tree) {	
		switch(KoopaTreeHelper.getType(tree)) {
$Mapping:{mapEntry | 
			case "$mapEntry$": enter_$mapEntry$(tree); break;
}$
			default: return;
		}
	}

public void exit(Tree tree) {
		switch(KoopaTreeHelper.getType(tree)) {
$Mapping:{mapEntry | 
			case "$mapEntry$": exit_$mapEntry$(tree); break;
}$
			default: return;
		}
	}
	protected void checkProcedureDivisionCount() {
		procedureDivisionCount++;
		if (procedureDivisionCount > 1) {
			isListening = false;
		}
	}
	public boolean isListening() {
		return isListening;
	}


$Mapping:{mapEntry | 
	public void enter_$mapEntry$(Tree tree) { $closingCurlyBraclet$
	public void exit_$mapEntry$(Tree tree) { $closingCurlyBraclet$
}$   
}