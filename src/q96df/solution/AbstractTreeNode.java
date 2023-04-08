package q96df.solution;

public abstract class AbstractTreeNode<E> implements TreeNode<E> {
  private E key;
  @Override
  public E getKey() {
    return key;
  }

  @Override
  public void setKey(E key) {
    this.key = key;
  }
}
