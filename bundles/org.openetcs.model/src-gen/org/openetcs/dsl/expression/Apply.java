/**
 */
package org.openetcs.dsl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.dsl.expression.Apply#getApplyExpr <em>Apply Expr</em>}</li>
 *   <li>{@link org.openetcs.dsl.expression.Apply#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.dsl.expression.ExpressionPackage#getApply()
 * @model
 * @generated
 */
public interface Apply extends Expression
{
  /**
   * Returns the value of the '<em><b>Apply Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apply Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Apply Expr</em>' containment reference.
   * @see #setApplyExpr(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getApply_ApplyExpr()
   * @model containment="true"
   * @generated
   */
  Expression getApplyExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Apply#getApplyExpr <em>Apply Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Apply Expr</em>' containment reference.
   * @see #getApplyExpr()
   * @generated
   */
  void setApplyExpr(Expression value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expression)
   * @see org.openetcs.dsl.expression.ExpressionPackage#getApply_Expr()
   * @model containment="true"
   * @generated
   */
  Expression getExpr();

  /**
   * Sets the value of the '{@link org.openetcs.dsl.expression.Apply#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expression value);

} // Apply
