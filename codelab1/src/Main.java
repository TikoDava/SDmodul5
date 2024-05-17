public class Main {
    public node root;

    public Main() {
        root = null;
    }

    // Fungsi untuk menambahkan node secara manual ke tree
    public void addRoot(int data) {
        root = new node(data);
    }

    public void inOrder(node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }

    public void preOrder(node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();

        // Menentukan struktur tree secara manual
        tree.addRoot(20); // Root
        tree.root.left = new node(2); // Menambahkan node ke kiri root
        tree.root.right = new node(25); // Menambahkan node ke kanan root
        tree.root.left.left = new node(37); // Menambahkan node ke kiri dari node kiri root
        tree.root.left.right = new node(12); // Menambahkan node ke kanan dari node kiri root
        tree.root.right.right = new node(16); // Menambahkan node ke kanan dari node kanan root

        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }
}