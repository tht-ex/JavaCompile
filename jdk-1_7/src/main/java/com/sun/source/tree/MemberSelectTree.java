/*
 * Copyright (c) 2005, 2006, Oracle and/or its affiliates. All rights reserved.
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

import javax.lang.model.element.Name;

/**
 * A tree node for a member access expression.
 * <p>
 * For example:
 * <pre>
 *   <em>expression</em> . <em>identifier</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls sections 6.5, 15.11,and 15.12
 * @since 1.6
 */
public interface MemberSelectTree extends ExpressionTree {
    ExpressionTree getExpression();

    Name getIdentifier();
}
