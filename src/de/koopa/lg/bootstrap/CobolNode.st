package $package$;
import java.util.Optional;
public enum CobolNode {
$Mapping:{mapEntry | 
			$mapEntry$("$mapEntry$", "$Mapping.(mapEntry)$"),}$;

	private String nodeType, text;
	private CobolNode(String nodeType, String text) {
		this.nodeType = nodeType;
		this.text = text;
	}
	public String getType() {
		return nodeType;
	}
	public String getText() {
		return text;
	}
	
	public static Optional<CobolNode> getNode(String text) {
		for (CobolNode node : values()) {
			if (node.getText().equals(text)) {
				if (isAlsoAType(text)) {
					return Optional.empty();
				}
				return Optional.of(node);
			}
		}
		return Optional.empty();
	}

	private static boolean isAlsoAType(String text) {
		for (CobolNode node : values()) {
			if (node.getType().equals(text)) {
				return true;
			}
		}
		return false;
	}
}
