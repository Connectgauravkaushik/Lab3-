
import java.util.*;

class FindSumPair {
	public Node insert(Node root, int key) 
	{
		if(root == null) 
			return new Node(key);
		if(key < root.nodeData)
			root.leftNode = insert(root.leftNode ,key);
		else
			root.rightNode = insert(root.rightNode, key);
		return root;
	}
	
		public boolean findpairUtil(Node root, int sum, HashSet<Integer> set)
	    {  
			if( root == null)
				return false;
			if(findpairUtil(root.leftNode, sum , set))
				return true;
			if(set.contains(sum - root.nodeData)){
				System.out.println("pair is found (" 
			                       +(sum - root.nodeData)+ " ,"
			                       + root.nodeData + ")");
				return true;
			}
			else
				set.add(root.nodeData);
			return findpairUtil(root.rightNode, sum, set);
				
		}

	public void findpairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		if(!findpairUtil(root, sum, set))
			System.out.println("pairs do not exit" + "\n");;
		
	}
}
