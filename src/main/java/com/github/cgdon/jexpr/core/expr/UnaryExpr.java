package com.github.cgdon.jexpr.core.expr;

import com.github.cgdon.jexpr.core.Expr;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 成国栋 on 2017-07-22 23:34:00.
 */
public class UnaryExpr extends Expr {
  int rator;
  Expr rand;

  public UnaryExpr(int rator, Expr rand) {
    this.rator = rator;
    this.rand = rand;
  }

  public double value() {
    double arg = rand.value();
    switch (rator) {
      case ABS:
        return Math.abs(arg);
      case ACOS:
        return Math.acos(arg);
      case ASIN:
        return Math.asin(arg);
      case ATAN:
        return Math.atan(arg);
      case CEIL:
        return Math.ceil(arg);
      case COS:
        return Math.cos(arg);
      case EXP:
        return Math.exp(arg);
      case FLOOR:
        return Math.floor(arg);
      case LOG:
        return Math.log(arg);
      case NEG:
        return -arg;
      case ROUND:
        return Math.rint(arg);
      case SIN:
        return Math.sin(arg);
      case SQRT:
        return Math.sqrt(arg);
      case TAN:
        return Math.tan(arg);
      default:
        throw new RuntimeException("BUG: bad rator");
    }
  }

  public int getRator() {
    return rator;
  }

  public Expr getRand() {
    return rand;
  }

  @Override
  public List<Expr> childExpr() {
    return Arrays.asList(rand);
  }
}
