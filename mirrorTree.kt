data class BinaryNode (
        var value : Int,
        var left : BinaryNode? = null,
        var right : BinaryNode? = null
    )
  
    fun mirrorTree(root : BinaryNode?){
        if(root == null){
            return
        }else{
            mirrorTree(root?.left)
            mirrorTree(root?.right)
            var temp = root?.left
            root?.left = root?.right
            root?.right = temp
        }
    }
 


    fun main() {
        var rootNode = BinaryNode(1)
        rootNode.left = BinaryNode(2)
        rootNode.right = BinaryNode(3)
        rootNode.left?.left = BinaryNode(4)
        rootNode.left?.right = BinaryNode(8)
        rootNode.right?.left = BinaryNode(6)
        rootNode.right?.right = BinaryNode(7)
      
        print(rootNode)
        mirrorTree(rootNode)
        print("\n $rootNode")
    }
