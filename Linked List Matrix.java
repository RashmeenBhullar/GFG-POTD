class Solution {
    static Node construct(int arr[][]) {
        if (arr.length == 0) return null;

        int n = arr.length;
        Node[][] nodes = new Node[n][n];

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nodes[i][j] = new Node(arr[i][j]);
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Link right
                if (j < n - 1) {
                    nodes[i][j].right = nodes[i][j + 1];
                }
                // Link down
                if (i < n - 1) {
                    nodes[i][j].down = nodes[i + 1][j];
                }
            }
        }

    
        return nodes[0][0];
    }
}
