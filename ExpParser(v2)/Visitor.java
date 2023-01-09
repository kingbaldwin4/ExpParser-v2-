interface Visitor {
  public Object visit(Exp e);
  public Object visit(Plus e);
  public Object visit(Minus e);
  public Object visit(Merge e);
  public Object visit(Power e);   
  public Object visit(Num e);
  public Object visit(ID e);
  }
