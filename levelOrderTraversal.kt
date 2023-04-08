
data class BinaryNode (
    var value : Any,
    var left : BinaryNode? = null,
    var right : BinaryNode? = null
)

private fun levelOrder(root : BinaryNode?){
    var queue = ArrayList<BinaryNode>();
   
    if(root == null){
        return
    }else{
        queue.add(root)
        while(!queue.isEmpty()){
            var size = queue.size       
            while(size > 0){
                var front = queue[0]
                print(queue[0].value)
                queue.removeAt(0)
                
                if(front.left != null){
                    queue.add(front.left as BinaryNode)
                }
                
                if(front.right != null){
                    queue.add(front.right as BinaryNode)
                }
                size --
            }
            print("\n")
        }
    }
}


fun main() {
 var rootNode = BinaryNode(1)
    rootNode.left = BinaryNode(2)
    rootNode.right = BinaryNode(3)
    rootNode.left?.left = BinaryNode(4)
    rootNode.left?.right = BinaryNode(5)
    rootNode.right?.left = BinaryNode(6)
    rootNode.right?.right = BinaryNode(7)
    
	levelOrder(rootNode)
}
