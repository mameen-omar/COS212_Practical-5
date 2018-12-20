/*Mohamed Ameen Omar
u16055323*/
public class Node
{
	private int key_;
	private int priority_;
	private String value_;

	public Node parent_ = null;
	public Node leftChild_ = null;
	public Node rightChild_ = null;

	public Node(int key, int priority, String value)
	{
		key_ = key;
		priority_ = priority;
		value_ = value;
	}

	public String getValue()
	{
		return value_;
	}

	public int getKey()
	{
		System.out.println("Accessed key of " + value_);
		return key_;
	}

	public int getPriority()
	{
		System.out.println("Accessed priority of " + value_);
		return priority_;
	}
}
