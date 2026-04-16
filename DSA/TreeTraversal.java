class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class TreeTraversal {

    TreeNode root;

    // Insert (BST)
    TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Preorder
    void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Inorder
    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Postorder
    void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        TreeTraversal t = new TreeTraversal();

        t.root = t.insert(t.root, 5);
        t.root = t.insert(t.root, 3);
        t.root = t.insert(t.root, 7);
        t.root = t.insert(t.root, 2);
        t.root = t.insert(t.root, 4);

        System.out.print("Preorder: ");
        t.preorder(t.root);

        System.out.print("\nInorder: ");
        t.inorder(t.root);

        System.out.print("\nPostorder: ");
        t.postorder(t.root);
    }
}