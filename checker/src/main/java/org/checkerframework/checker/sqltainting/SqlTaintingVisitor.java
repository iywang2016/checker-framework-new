package org.checkerframework.checker.sqltainting;

import javax.lang.model.element.ExecutableElement;
import org.checkerframework.common.basetype.BaseAnnotatedTypeFactory;
import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.common.basetype.BaseTypeVisitor;
import org.checkerframework.framework.type.AnnotatedTypeMirror.AnnotatedExecutableType;

/** Visitor for the {@link SqlTaintingChecker}. */
public class SqlTaintingVisitor extends BaseTypeVisitor<BaseAnnotatedTypeFactory> {

  /**
   * Creates a {@link SqlTaintingVisitor}.
   *
   * @param checker the checker that uses this visitor
   */
  public SqlTaintingVisitor(BaseTypeChecker checker) {
    super(checker);
  }

  /**
   * Don't check that the constructor result is top. Checking that the super() or this() call is a
   * subtype of the constructor result is sufficient.
   */
  @Override
  protected void checkConstructorResult(
      AnnotatedExecutableType constructorType, ExecutableElement constructorElement) {}
}
