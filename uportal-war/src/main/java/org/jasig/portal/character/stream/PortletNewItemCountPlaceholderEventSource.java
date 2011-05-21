/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.character.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;

import org.jasig.portal.character.stream.events.CharacterEvent;
import org.jasig.portal.character.stream.events.PortletNewItemCountPlaceholderEvent;
import org.jasig.portal.character.stream.events.PortletNewItemCountPlaceholderEventImpl;

/**
 * Generates a {@link PortletNewItemCountPlaceholderEvent} for a regular expression match
 * 
 * @author Jen Bourey
 * @version $Revision$
 */
public class PortletNewItemCountPlaceholderEventSource extends PortletPlaceholderEventSource {
    
    @Override
    protected List<CharacterEvent> getCharacterEvents(String subscribeId, MatchResult matchResult) {
        return Arrays.asList((CharacterEvent)new PortletNewItemCountPlaceholderEventImpl(subscribeId));
    }
}
