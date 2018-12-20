//Mohamed Ameen Omar
//u16055323

//DONE IMPLEMENTATION FOR TASK 1 - PRACTICAL 5

//TREAPS KEYS ARE ORGANIZED THROUGH NORMAL BST, IE LEFT IS SMALLER AND RIGHT
//IS GREATER


public class TreapOperations
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
