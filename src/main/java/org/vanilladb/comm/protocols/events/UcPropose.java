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
package org.vanilladb.comm.protocols.events;

import org.vanilladb.comm.protocols.consensusUtils.PaxosProposal;

import net.sf.appia.core.AppiaEventException;
import net.sf.appia.core.Channel;
import net.sf.appia.core.Event;
import net.sf.appia.core.Session;

public class UcPropose extends Event {
    /**
     * The value proposed for consensus.
     */
    public PaxosProposal value;

    public UcPropose() {
        super();
    }

    public UcPropose(PaxosProposal value) {
        super();
        this.value = value;
    }

    public UcPropose(Channel channel, int direction, Session src)
            throws AppiaEventException {
        super(channel, direction, src);
    }
}
