  data class BinaryNode (
        var value : Int,
        var left : BinaryNode? = null,
        var right : BinaryNode? = null
    )

    private fun levelOrder(root : BinaryNode?){

        if(root == null){
            return
        }else{
            if(root.left != null && root.right != null){
                if(root.left?.value!! > root.right?.value!!){
                    print(root.left!!.value)
                }else{
                    print(root.right!!.value)
                }
            }

            levelOrder(root.left)
            levelOrder(root.right)
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
