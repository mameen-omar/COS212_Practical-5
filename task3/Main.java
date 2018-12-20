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

		Node root = new Node(99999, 999, "root");

		TreapOperations.addNode(root,node1);
		TreapOperations.addNode(root,node2);
		TreapOperations.addNode(root,node3);
		TreapOperations.addNode(root,node4);
		TreapOperations.addNode(root,node5);
		TreapOperations.addNode(root,node6);
		TreapOperations.addNode(root,node7);
		TreapOperations.addNode(root,node8);
		TreapOperations.addNode(root,node9);
		/* Output should be:
			Accessed key of hi
			Accessed key of root
			Accessed priority of hi
			Accessed priority of root
			Accessed key of hold
			Accessed key of root
			Accessed key of hold
			Accessed key of hi
			Accessed priority of hold
			Accessed priority of hi
			Accessed priority of root
			Accessed key of test
			Accessed key of root
			Accessed key of test
			Accessed key of hold
			Accessed priority of test
			Accessed priority of hold
			Accessed priority of root
			Accessed key of swing
			Accessed key of root
			Accessed key of swing
			Accessed key of test
			Accessed key of swing
			Accessed key of hold
			Accessed key of swing
			Accessed key of hi
			Accessed priority of swing
			Accessed priority of hi
			Accessed priority of hold
			Accessed priority of test
			Accessed key of bird
			Accessed key of root
			Accessed key of bird
			Accessed key of test
			Accessed priority of bird
			Accessed priority of test
			Accessed key of cat
			Accessed key of root
			Accessed key of cat
			Accessed key of test
			Accessed key of cat
			Accessed key of swing
			Accessed key of cat
			Accessed key of hold
			Accessed key of cat
			Accessed key of hi
			Accessed priority of cat
			Accessed priority of hi
			Accessed priority of hold
			Accessed priority of swing
			Accessed key of rocket
			Accessed key of root
			Accessed key of rocket
			Accessed key of test
			Accessed key of rocket
			Accessed key of bird
			Accessed priority of rocket
			Accessed priority of bird
			Accessed key of daisy
			Accessed key of root
			Accessed key of daisy
			Accessed key of test
			Accessed key of daisy
			Accessed key of swing
			Accessed key of daisy
			Accessed key of cat
			Accessed key of daisy
			Accessed key of hi
			Accessed priority of daisy
			Accessed priority of hi
			Accessed priority of cat
			Accessed priority of swing
			Accessed priority of test
			Accessed key of doggo
			Accessed key of root
			Accessed key of doggo
			Accessed key of test
			Accessed key of doggo
			Accessed key of daisy
			Accessed key of doggo
			Accessed key of cat
			Accessed key of doggo
			Accessed key of hold
			Accessed priority of doggo
			Accessed priority of hold
			Accessed priority of cat
			Accessed priority of daisy
			Accessed priority of test
			Accessed priority of root
		*/

		Node result = TreapOperations.findKey(root,23589);
		System.out.println("The first result is " + result.getValue());
		/*	Output should be:
			Accessed key of root
			Accessed key of doggo
			Accessed key of daisy
			Accessed key of swing
			The first result is swing
		*/

		result = TreapOperations.findKey(root,78394);
		System.out.println("The second result is " + result.getValue());
		/*	Output should be:
			Accessed key of root
			Accessed key of doggo
			Accessed key of test
			Accessed key of bird
			Accessed key of rocket
			The second result is rocket
		*/
	}
}
