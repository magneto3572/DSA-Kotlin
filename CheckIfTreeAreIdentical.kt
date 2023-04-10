data class BinaryNode (
        var value : Int,
        var left : BinaryNode? = null,
        var right : BinaryNode? = null
    )
  
    fun identicalTree(rootA : BinaryNode?, rootB : BinaryNode?){
        if(rootA == null && rootB == null){
            return
        }else{
          if(rootA?.value == rootB?.value ){
              identicalTree(rootA?.left, rootB?.left)
              identicalTree(rootA?.right, rootB?.right)
              print("node are identical  ")
          }else{
              var valueA = rootA?.value
              var valueB = rootB?.value
              print("$valueA and $valueB of Tree are not identical  ")
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
       
        
        var rootNodeB = BinaryNode(1)
        rootNodeB.left = BinaryNode(2)
        rootNodeB.right = BinaryNode(3)
        rootNodeB.left?.left = BinaryNode(4)
        rootNodeB.left?.right = BinaryNode(5)
        rootNodeB.right?.left = BinaryNode(6)
        rootNodeB.right?.right = BinaryNode(8)
        identicalTree(rootNode, rootNodeB)
    }
