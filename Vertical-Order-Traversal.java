    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        if(root.left == null && root.right == null){
            List<Integer> arr = new ArrayList<>();
            arr.add(root.val);
            list.add(arr);
            return list;
        }
        //we will perform a level order traversal 
        Queue<TreeNode> que = new ArrayDeque<>();
        que.add(root);
        //we will assign a row and column index to each node.
        HashMap<TreeNode, Integer> mapx = new HashMap<>();
        HashMap<TreeNode, Integer> mapy = new HashMap<>();
        mapx.put(root,0);
        mapy.put(root,0);
        int minCol = 1;
        int maxCol = -1;
        while(!que.isEmpty()){
            TreeNode current = que.poll();
            int x = mapx.get(current);
            int y = mapy.get(current);
            maxCol = Math.max(x,maxCol);
            minCol = Math.min(x,minCol);
            if(current.left != null){
                que.add(current.left);
                mapx.put(current.left,x-1);
                mapy.put(current.left,y+1);
            }
            if(current.right != null){
                que.add(current.right);
                mapx.put(current.right,x+1);
                mapy.put(current.right,y+1);
            }
        }

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i = minCol;i<=maxCol;i++){
            map.put(i,new ArrayList<Integer>());
        }

        que = new ArrayDeque<>();
        que.add(root);
        while(!que.isEmpty()){
            TreeNode current = que.poll();
            int x = mapx.get(current);
            ArrayList<Integer> toAddIn = map.get(x);
            toAddIn.add(current.val);
            if(current.left != null){
                que.add(current.left);
            }
            if(current.right != null){
                que.add(current.right);
            }
        }

        for(int i = minCol;i<=maxCol;i++){
            list.add(map.get(i));
        }
        return list;
    }
