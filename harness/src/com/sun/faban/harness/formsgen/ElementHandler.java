/* The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://www.sun.com/cddl/cddl.html or
 * install_dir/legal/LICENSE
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at install_dir/legal/LICENSE.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Copyright 2009 Sun Microsystems Inc. All Rights Reserved
 */
package com.sun.faban.harness.formsgen;

import org.w3c.dom.Node;

/**
 * Interface for all element type handlers. These are cases known to Faban
 * and should be handled appropriately, unlike generic elements.
 * @author Sheetal Patil
 */
public interface ElementHandler {

    /**
     * Returns a buffer containing the xform code block for the given node.
     * @param eNode The node to be handled
     * @param id The element identifier
     * @return The buffer with the XForms code block
     */
    public StringBuilder getBuffer(Node eNode, String id);

}
