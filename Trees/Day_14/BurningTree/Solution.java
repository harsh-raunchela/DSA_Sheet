package Day_14.BurningTree;

/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  */
class Solution {
    public static int minTime(Node root, int target) {
        // code here
        Map<Node, Node> parent = new HashMap<>();
        Node targetNode = mapParents(root, parent, target);
        return bfsToBurn(parent, targetNode);
    }

    static Node mapParents(Node root, Map<Node, Node> parent, int target){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node res = null;

        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data == target)res = curr;
            if(curr.left != null){
                parent.put(curr.left, curr);
                q.add(curr.left);
            }
            if(curr.right != null){
                parent.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        return res;
    }

    static int bfsToBurn(Map<Node, Node> parent, Node start){
        Set<Node> visited = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.add(start);
        visited.add(start);
        int time = 0;

        while(!q.isEmpty()){
            int size = q.size();
            boolean burnt = false;
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                for(Node nbr : Arrays.asList(curr.left, curr.right, parent.get(curr))){
                    if(nbr != null && !visited.contains(nbr)){
                        burnt = true;
                        visited.add(nbr);
                        q.add(nbr);
                    }
                }
            }
            if(burnt) time++;
        }
        return time;
    }
}
