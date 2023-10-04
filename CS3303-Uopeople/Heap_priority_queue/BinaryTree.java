import java.util.Scanner;


public class BinaryTree {
    public class BinaryNode {
        public int data;
        public BinaryNode left = null;
        public BinaryNode right = null;

        public BinaryNode(int data) {
            this.data = data;
        }
    }

    public BinaryNode root = null;

    public void insertEle(int data) {
        root = insertRec(root, data);
    }

    private BinaryNode insertRec(BinaryNode root, int data) {
        if (root == null) {
            root = new BinaryNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(BinaryNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for (int i = 0; i < 9; i++){
            System.out.println("Insert element number " + (i + 1));
            Scanner in = new Scanner(System.in);
            int searchValue = in.nextInt();
            tree.insertEle(searchValue);
        }

	for (int i = 0; i < 3; i++)
	{
		System.out.println("Search for an element if it is in the tree or not");
            	Scanner in = new Scanner(System.in);
            	int searchValue = in.nextInt();
		if (tree.search(searchValue) == true)
			System.out.println("The element is present in the tree");
		else
			System.out.println("The element is not present in the tree");
	}
    }
}
