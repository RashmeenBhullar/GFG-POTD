
class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BSTs in a sorted order.
    public List<Integer> merge(Node root1, Node root2) {
        // Step 1: Get the inorder traversal of both BSTs.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        inorder(root1, list1); // Get sorted list from the first BST.
        inorder(root2, list2); // Get sorted list from the second BST.
        
        // Step 2: Merge both sorted lists.
        return mergeSortedLists(list1, list2);
    }

    // Helper function to perform inorder traversal of a BST and store the result in a list.
    private void inorder(Node root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }

    // Function to merge two sorted lists into one sorted list.
    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        // Merge the two sorted lists.
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add any remaining elements from list1.
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add any remaining elements from list2.
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
