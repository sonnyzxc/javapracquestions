package q96df.solution;

public interface TreeNode<E> {
  int getNumberOfChildren();

  TreeNode<E> getChildren(int childIndex);

  void setChild(int childIndex, TreeNode<E> child);

  E getKey();

  void setKey(E key);
}
