package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseOperationOutcome;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueSeverityEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueSeverity;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueType;

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
 * A collection of error, warning or information messages that result from a system action.
 */
public class OperationOutcome extends DomainResource implements IBaseOperationOutcome {

    /**
     * An error, warning or information message that results from a system action.
     */
    protected List<OperationOutcomeIssueComponent> issue;

    private static final long serialVersionUID = -152150052L;

    /*
   * Constructor
   */
    public OperationOutcome() {
        super();
    }

    /**
     * @return {@link #issue} (An error, warning or information message that results from a system action.)
     */
    public List<OperationOutcomeIssueComponent> getIssue() {
        if (this.issue == null)
            this.issue = new ArrayList<OperationOutcomeIssueComponent>();
        return this.issue;
    }

    public boolean hasIssue() {
        if (this.issue == null)
            return false;
        for (OperationOutcomeIssueComponent item : this.issue) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #issue} (An error, warning or information message that results from a system action.)
     */
    // syntactic sugar
    public OperationOutcomeIssueComponent addIssue() {
        // 3
        OperationOutcomeIssueComponent t = new OperationOutcomeIssueComponent();
        if (this.issue == null)
            this.issue = new ArrayList<OperationOutcomeIssueComponent>();
        this.issue.add(t);
        return t;
    }

    // syntactic sugar
    public OperationOutcome addIssue(OperationOutcomeIssueComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.issue == null)
            this.issue = new ArrayList<OperationOutcomeIssueComponent>();
        this.issue.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("issue", "", "An error, warning or information message that results from a system action.", 0, java.lang.Integer.MAX_VALUE, issue));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("issue"))
            this.getIssue().add((OperationOutcomeIssueComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("issue")) {
            return addIssue();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "OperationOutcome";
    }

    public OperationOutcome copy() {
        OperationOutcome dst = new OperationOutcome();
        copyValues(dst);
        if (issue != null) {
            dst.issue = new ArrayList<OperationOutcomeIssueComponent>();
            for (OperationOutcomeIssueComponent i : issue) dst.issue.add(i.copy());
        }
        ;
        return dst;
    }

    protected OperationOutcome typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OperationOutcome))
            return false;
        OperationOutcome o = (OperationOutcome) other;
        return compareDeep(issue, o.issue, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof OperationOutcome))
            return false;
        OperationOutcome o = (OperationOutcome) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (issue == null || issue.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.OperationOutcome;
    }
}
