/*Mohamed Ameen Omar
u16055323*/
public class Main
{
	public static void main(String[] args)
	{
		Node node1 = new Node(23687, 29, "hi");
		Node node2 = new Node(43546, 42, "hold");
		Node node3 = new Node(73487, 87, "test");
		Node node4 = new Node(23589, 49, "swing");
		Node node5 = new Node(98477, 48, "bird");
		Node node6 = new Node(30895, 47, "cat");
		Node node7 = new Node(78394, 23, "rocket");
		Node node8 = new Node(24511, 57, "daisy");
		Node node9 = new Node(51423, 97, "doggo");

		Node root = node9;
		node9.leftChild_ = node8; node8.parent_ = node9;
			node8.leftChild_ = node4; node4.parent_ = node8;
				node4.rightChild_ = node1; node1.parent_ = node4;
			node8.rightChild_ = node6; node6.parent_ = node8;
				node6.rightChild_ = node2; node2.parent_ = node6;
		node9.rightChild_ = node3; node3.parent_ = node9;
			node3.rightChild_ = node5; node5.parent_ = node3;
				node5.leftChild_ = node7; node7.parent_ = node5;

		Node result = TreapOperations.findKey(root,23687);
		System.out.println("The first result is " + result.getValue());
		/*	Output should be:
			Accessed key of doggo
			Accessed key of daisy
			Accessed key of swing
			Accessed key of hi
			The first result is hi
		*/

		TreapOperations.removeNode(node8);
		/*	Output should be:
			Accessed priority of swing
			Accessed priority of cat
			Accessed priority of hi
			Accessed priority of cat
		*/

		result = TreapOperations.findKey(root,23687);
		System.out.println("The second result is " + result.getValue());
		/*	Output should be:
			Accessed key of doggo
			Accessed key of swing
			Accessed key of cat
			Accessed key of hi
			The second result is hi
		*/
	}
}
