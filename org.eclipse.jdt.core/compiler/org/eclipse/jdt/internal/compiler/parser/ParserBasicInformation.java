/*******************************************************************************
 * Copyright (c) 2000, 2014 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.internal.compiler.parser;

/*An interface that contains static declarations for some basic information
 about the parser such as the number of rules in the grammar, the starting state, etc...*/
public interface ParserBasicInformation {

	public final static int

	ERROR_SYMBOL = 129,
					MAX_NAME_LENGTH = 41,
					NUM_STATES = 1166,

					NT_OFFSET = 129,
					SCOPE_UBOUND = 297,
					SCOPE_SIZE = 298,
					LA_STATE_OFFSET = 16993,
					MAX_LA = 1,
					NUM_RULES = 867,
					NUM_TERMINALS = 129,
					NUM_NON_TERMINALS = 398,
					NUM_SYMBOLS = 527,
					START_STATE = 1591,
					EOFT_SYMBOL = 60,
					EOLT_SYMBOL = 60,
					ACCEPT_ACTION = 16992,
					ERROR_ACTION = 16993;
}
