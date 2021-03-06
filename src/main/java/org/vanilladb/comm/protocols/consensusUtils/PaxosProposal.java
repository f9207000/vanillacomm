/*******************************************************************************
 * Copyright 2016 vanilladb.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.vanilladb.comm.protocols.consensusUtils;

import java.io.Serializable;

/**
* All proposals to consensus must derive from this class, to force them to be
* serializable and implement the "compareTo" method, allowing them to be
* comparable and thus permitting the choice of the lowest value by consensus.
* 
* @author Luis Sardinha and Alexandre Pinto DI - FCUL
*/
public class PaxosProposal implements Serializable, Comparable<PaxosProposal> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean abort;
    public int epoch;
    public int sn;

    public int compareTo(PaxosProposal o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
