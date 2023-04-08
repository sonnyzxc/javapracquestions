package q6346;

public class MulExpr implements Expr {
  private final Expr left;
  private final Expr right;

  public MulExpr(Expr left, Expr right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int eval() {
    return left.eval() * right.eval();
  }

  @Override
  public int literalCount() {
    return left.literalCount() + right.literalCount();
  }

  @Override
  public int depth() {
    return 1 + Math.max(left.depth(), right.depth());
  }
}
