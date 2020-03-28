package org.hl7.fhir.android.generated.dstu2;

import java.util.List;
import org.hl7.fhir.instance.model.api.INarrative;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.xhtml.XhtmlNode;
import org.hl7.fhir.android.generated.dstu2.NarrativeEnum.NarrativeStatus;
import org.hl7.fhir.android.generated.dstu2.NarrativeEnum.NarrativeStatusEnumFactory;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/
/**
 * A human-readable formatted text, including images.
 */
public class Narrative extends BaseNarrative implements INarrative {

    /**
     * The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
     */
    protected Enumeration<NarrativeStatus> status;

    /**
     * The actual narrative content, a stripped down version of XHTML.
     */
    protected XhtmlNode div;

    private static final long serialVersionUID = 1463852859L;

    /*
   * Constructor
   */
    public Narrative() {
        super();
    }

    /*
   * Constructor
   */
    public Narrative(Enumeration<NarrativeStatus> status, XhtmlNode div) {
        super();
        this.status = status;
        this.div = div;
    }

    /**
     * @return {@link #status} (The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<NarrativeStatus> getStatusElement() {
        if (this.status == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Narrative.status");
            else if (Configuration.doAutoCreate())
                // bb
                this.status = new Enumeration<NarrativeStatus>(new NarrativeStatusEnumFactory());
        return this.status;
    }

    public boolean hasStatusElement() {
        return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() {
        return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Narrative setStatusElement(Enumeration<NarrativeStatus> value) {
        this.status = value;
        return this;
    }

    /**
     * @return The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
     */
    public NarrativeStatus getStatus() {
        return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.
     */
    public Narrative setStatus(NarrativeStatus value) {
        if (this.status == null)
            this.status = new Enumeration<NarrativeStatus>(new NarrativeStatusEnumFactory());
        this.status.setValue(value);
        return this;
    }

    /**
     * @return {@link #div} (The actual narrative content, a stripped down version of XHTML.)
     */
    public XhtmlNode getDiv() {
        if (this.div == null)
            if (Configuration.errorOnAutoCreate())
                throw new Error("Attempt to auto-create Narrative.div");
            else if (Configuration.doAutoCreate())
                // cc
                this.div = new XhtmlNode();
        return this.div;
    }

    public boolean hasDiv() {
        return this.div != null && !this.div.isEmpty();
    }

    /**
     * @param value {@link #div} (The actual narrative content, a stripped down version of XHTML.)
     */
    public Narrative setDiv(XhtmlNode value) {
        this.div = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("status", "code", "The status of the narrative - whether it's entirely generated (from just the defined data or the extensions too), or whether a human authored it and it may contain additional data.", 0, java.lang.Integer.MAX_VALUE, status));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("status"))
            // Enumeration<NarrativeStatus>
            this.status = new NarrativeStatusEnumFactory().fromType(value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("status")) {
            throw new FHIRException("Cannot call addChild on a primitive type Narrative.status");
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Narrative";
    }

    public Narrative copy() {
        Narrative dst = new Narrative();
        copyValues(dst);
        dst.status = status == null ? null : status.copy();
        dst.div = div == null ? null : div.copy();
        return dst;
    }

    protected Narrative typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Narrative))
            return false;
        Narrative o = (Narrative) other;
        return compareDeep(status, o.status, true) && compareDeep(div, o.div, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Narrative))
            return false;
        Narrative o = (Narrative) other;
        return compareValues(status, o.status, true);
    }

    public boolean isEmpty() {
        return super.isEmpty() && (status == null || status.isEmpty()) && (div == null || div.isEmpty());
    }
}
