//Mohamed Ameen Omar
//u16055323

//DONE IMPLEMENTATION FOR TASK 4 - PRACTICAL 5

//TREAPS KEYS ARE ORGANIZED THROUGH NORMAL BST, IE LEFT IS SMALLER AND RIGHT
//IS GREATER


public class TreapOperations
{
	public static Node findKey(Node root, int key)
	{

			if(root == null)
			{
				return root;
			}
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

			}//eol


	}//eof



	public static void rotateRight(Node focus)
	{
		if(focus == null)
		{
			return;
		}

		//it is the root
		else if(focus.parent_ == null)
		{
			if(focus.leftChild_ == null)
			{
				return;
			}

			else
			{
				Node left = focus.leftChild_;
				focus.leftChild_ = left.rightChild_;
				if(left.rightChild_ != null)
				{
					left.rightChild_.parent_ = focus;
				}
				left.rightChild_ = focus;
				focus.parent_ = left;
				left.parent_ = null;
			}
		}

		//if it is a right child
		else if(focus.parent_.rightChild_ == focus)
		{
			if(focus.leftChild_ == null)
			{
				return;
			}

			else
			{
				Node left = focus.leftChild_;
				focus.leftChild_ = left.rightChild_;
				if(focus.leftChild_ != null)
				{
					focus.leftChild_.parent_ = focus;
				}
				focus.parent_.rightChild_ = left;
				left.parent_ = focus.parent_;
				left.rightChild_ = focus;
				focus.parent_ = left;
			}
		}

		//it is a left child
		else if(focus.parent_.leftChild_ == focus)
		{
			if(focus.leftChild_ == null)
			{
				return;
			}

			else
			{
				Node left = focus.leftChild_;
				left.parent_ = focus.parent_;
				focus.parent_.leftChild_ = left;
				focus.leftChild_ = left.rightChild_;
				if(left.rightChild_ != null)
				{
					left.rightChild_.parent_ = focus;
				}
				left.rightChild_ = focus;
				focus.parent_ = left;
			}
		}
	}//eof

	public static void rotateUp(Node focus)
	{
		if(focus == null)
		{
			return;
		}

		else
		{
			if(focus.parent_.rightChild_ == focus)
			{
				rotateLeft(focus.parent_);
			}

			else
			{
				rotateRight(focus.parent_);
			}
		}
	}

	public static void rotateDown(Node focus)
	{

		if(focus == null)
		{
			return;
		}

		else if(focus.rightChild_ == null && focus.leftChild_ == null)
		{
			return;
		}

		else if(focus.leftChild_ == null && focus.rightChild_ != null)
		{
			rotateLeft(focus);
		}

		else if(focus.leftChild_ != null && focus.rightChild_ == null)
		{
			rotateRight(focus);
		}

		else
		{
			int leftPriority = focus.leftChild_.getPriority();
			int rightPriority = focus.rightChild_.getPriority();
			if(leftPriority > rightPriority)
			{
				rotateRight(focus);
			}

			else
			{
				rotateLeft(focus);
			}
		}
	}


	//it is the right child
	public static void rotateLeft(Node focus)
	{

		//if null
		if(focus == null)
		{
			return;
		}

		//focus is our root
		else if(focus.parent_ == null)
		{
				Node right = focus.rightChild_;
				if(right == null)
				{
					return;
				}
				Node leftChild = right.leftChild_;
				right.leftChild_ = focus;
				focus.parent_ = right;
				focus.rightChild_ = leftChild;

				if(leftChild != null)
				{
					leftChild.parent_ = focus;
				}
				right.parent_ = null;

		}

		//it is a left child
		else if(focus.parent_.leftChild_ == focus )
		{
				Node right = focus.rightChild_;

				if(right == null)
				{
					return;
				}

				else
				{
					right.parent_ = focus.parent_;
					focus.parent_.leftChild_ = right;
					focus.rightChild_ = right.leftChild_;

					if(focus.rightChild_ != null)
					{
						focus.rightChild_.parent_ = focus;
					}
					right.leftChild_ = focus;
					focus.parent_ = right;

				}
		}

		//it is a right child
		else if(focus.parent_.rightChild_ == focus)
		{
			if(focus.rightChild_ == null)
			{
				return;
			}

			else
			{
				Node right = focus.rightChild_;
				right.parent_ = focus.parent_;
				focus.parent_.rightChild_ = right;
				focus.rightChild_ = right.leftChild_;

				if(right.leftChild_ != null)
				{
					right.leftChild_.parent_ = focus;
				}
				right.leftChild_ = focus;
				focus.parent_ = right;
			}
		}

	}//eof

	public static void addNode(Node root, Node temp)
	{
		if(root == null)
		{
			root = temp;
			return;
		}

		Node focus = root;

		while(true)
		{
			int	tempKey = temp.getKey();
			int focusKey = focus.getKey();


			//go left
			if(tempKey < focusKey)
			{
				//its added as a left child
				if(focus.leftChild_ == null)
				{
							focus.leftChild_ = temp;
							temp.parent_ = focus;

							int priorityTemp = temp.getPriority();
							int priorityFocus = focus.getPriority();

							while(true)
							{
								if(priorityTemp > priorityFocus)
								{
										rotateUp(temp);
										focus = temp.parent_;
										priorityFocus = focus.getPriority();
								}

								else
								{
									break;
								}

							}

							break;

				}

				else
				{
							focus = focus.leftChild_;
				}

			}//end of if

			//go right
			else
			{
					if(focus.rightChild_ == null)
					{
						focus.rightChild_ = temp;
						temp.parent_ = focus;

						int priorityTemp = temp.getPriority();
						int priorityFocus = focus.getPriority();

						while(true)
						{
							if(priorityTemp > priorityFocus)
							{
									rotateUp(temp);
									focus = temp.parent_;
									priorityFocus = focus.getPriority();
							}

							else
							{
								break;
							}

						}

					break;

				}//end of if

				else
				{
					focus = focus.rightChild_;
				}
		}//end of else

	}//end of the outer while


}//eof

public static void removeNode(Node temp)
{
	if(temp == null)
	{
		return;
	}

	else
	{

		while(true)
		{
			//it is the root
			if(temp.parent_ == null)
			{
				rotateDown(temp);
			}


			else if(temp.leftChild_ == null && temp.rightChild_ != null)
			{
				//if it is a left child
				if(temp.parent_.leftChild_ == temp)
				{
						temp.parent_.leftChild_ = temp.rightChild_;
						temp.rightChild_.parent_ = temp.parent_;
						break;
				}

				//it is a right child
				else
				{

					temp.parent_.rightChild_ = temp.rightChild_;
					temp.rightChild_.parent_ = temp.parent_;
					break;

				}
			}

			else if(temp.leftChild_ != null && temp.rightChild_ == null)
			{
				//if it is a left child
				if(temp.parent_.leftChild_ == temp)
				{
					temp.parent_.leftChild_ = temp.leftChild_;
					temp.leftChild_.parent_ = temp.parent_;
					break;
				}

				//it is a right child
				else
				{
					temp.parent_.rightChild_ = temp.leftChild_;
					temp.leftChild_.parent_ = temp.parent_;
					break;
				}
			}

			else if(temp.leftChild_ == null && temp.rightChild_ == null)
			{
				if(temp.parent_.leftChild_ == temp)
				{
					temp.parent_.leftChild_ = null;
					break;
				}

				else
				{
					temp.parent_.rightChild_ = null;
					break;
				}
			}

			else
			{
				rotateDown(temp);
			}
		}



	}//eof outer else
}//eof

}
