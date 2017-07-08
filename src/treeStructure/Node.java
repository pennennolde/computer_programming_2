package treeStructure;

public class Node {
	private String name;
	private Node parent;
	private Node leftChild;
	private Node rightChild;

	public Node( String name ) {
		this.name = name;
		parent = null;
		leftChild = null;
		rightChild = null;
	}

	public void setParent( Node node ) {
		parent = node;
	}

	public void setLeft( Node node ) {
		leftChild = node;
		if( node != null ) node.setParent( this );
	}

	public void setRight( Node node ) {
		rightChild = node;
		if( node != null ) node.setParent( this );
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Node getParent() {
		return parent;
	}

	public Node getLeft() {
		return leftChild;
	}

	public Node getRight() {
		return rightChild;
	}

/*	public Node getSibling() {
		if( isRoot() == true ) return null;	// == true は省ける
		if( isLeft() ) {
			return getParent().getRight();
		} else {
			return getParent().getLeft();
		}
	}
*/

	public boolean isRoot() {
		return ( getParent() == null );
	}

	public boolean isLeft() {
		return ( getParent() != null && this == getParent().getLeft() );
	}

	public boolean isLeaf() {
		return ( getLeft() == null && getRight() == null );
	}

	public boolean equals( Node otherNode ) {
		return ( (this.getName()).equals(otherNode.getName()) );
	}

	public boolean isSmall( Node otherNode ) {
		return ( (this.getName()).compareTo(otherNode.getName()) < 0 );
	}

}
