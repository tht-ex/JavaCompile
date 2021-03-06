/*
 * Copyright (c) 2005, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.source.tree;

/**
 * A tree node for a binary expression.
 * Use {@link #getKind getKind} to determine the kind of operator.
 * <p>
 * For example:
 * <pre>
 *   <em>leftOperand</em> <em>operator</em> <em>rightOperand</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls sections 15.17 to 15.24
 * @since 1.6
 */
public interface BinaryTree extends ExpressionTree {
    ExpressionTree getLeftOperand();

    ExpressionTree getRightOperand();
}
