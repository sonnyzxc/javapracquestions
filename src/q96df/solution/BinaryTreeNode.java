package q96df.solution;

public class BinaryTreeNode<E> extends AbstractTreeNode<E> {

  private TreeNode<E> left;
  private TreeNode<E> right;

  @Override
  public int getNumberOfChildren() {
    return 2;
  }

  @Override
  public TreeNode<E> getChildren(int childIndex) {
    return childIndex == 0 ? left : right;
  }

  @Override
  public void setChild(int childIndex, TreeNode<E> child) {
    if (childIndex == 0) {
      left = child;
    } else if (childIndex == 1) {
      right = child;
    }
  }
}
