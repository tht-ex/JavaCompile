/*
 * Copyright (c) 2005, 2011, Oracle and/or its affiliates. All rights reserved.
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

import java.util.List;

import javax.lang.model.element.Name;

/**
 * A tree node for a type parameter.
 * <p>
 * For example:
 * <pre>
 *   <em>name</em>
 *
 *   <em>name</em> extends <em>bounds</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 4.4
 * @since 1.6
 */
public interface TypeParameterTree extends Tree {
    Name getName();

    List<? extends Tree> getBounds();
}
