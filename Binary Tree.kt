 data class BinaryNode (
    var value : Any,
    var left : BinaryNode? = null,
    var right : BinaryNode? = null
)

private fun preOrder(root : BinaryNode?){
    if(root == null){
        return
    }else{
        print(root.value)
        preOrder(root.left)
        preOrder(root.right)
    }
}


private fun postOrder(root: BinaryNode?){
    if(root == null){
        return
    }else{
        preOrder(root.left)
        preOrder(root.right)
        print(root.value)
    }
}

private fun inOrder(root: BinaryNode?){
    if(root == null){
        return
    }else{
        preOrder(root.left)
        print(root.value)
        preOrder(root.right)
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
    
    preOrder(rootNode)
    inOrder(rootNode)
    postOrder(rootNode)
}
