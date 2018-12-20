/* Mohamed Ameen Omar
	u16055323
	Practical 5 - Task 1 */
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

class TreapOperations
{
	public static Node findKey(Node root, int key)
	{
			Node traversalNode = root;

			//run an infinite loop
			while(true)
			{
				//not found because we've reached null
				if(traversalNode == null)
				{
					return null;
				}

				int currentKey = traversalNode.getKey();

				//if key is less than current go left
				if(key < currentKey)
				{
						traversalNode = traversalNode.leftChild_;
				}


				//else if key is greater than current go right
				else if(key > currentKey )
				{
						traversalNode = traversalNode.rightChild_;
				}

				else if(key == currentKey)
				{
					return traversalNode;
				}

				//SHOULDN'T RUN, BUT IN CASE
				else
				{
					return null;
				}

			}


	}


}
