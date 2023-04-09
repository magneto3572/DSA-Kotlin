  data class BinaryNode (
        var value : Int,
        var left : BinaryNode? = null,
        var right : BinaryNode? = null
    )
  
  
  
  class Depth{
       companion object {
      		var leftCount = 0
      		var rightCount = 0
            var height = 0
  		}
      
       fun depthOfTree(root : BinaryNode?){
        if(root == null){
            return
        }else{
           
            if(root.left != null){
                leftCount = leftCount + 1
                depthOfTree(root.left)
            }
            
            if(root.right != null){
                rightCount = rightCount + 1
                depthOfTree(root.right)
            }
            
            if(root.left == null && root.right== null){
                if(leftCount > rightCount){
                       height = leftCount
                }else{
                       height = rightCount
                } 	
              }
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
        rootNode.right?.right?.left = BinaryNode(6)
        rootNode.right?.right?.right = BinaryNode(7)
        var c =  Depth()
        c.depthOfTree(rootNode)
        print(Depth.height)
    }
