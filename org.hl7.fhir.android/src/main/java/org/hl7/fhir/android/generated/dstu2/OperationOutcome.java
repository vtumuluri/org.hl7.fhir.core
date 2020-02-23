package org.hl7.fhir.android.generated.dstu2;

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
// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.List;
import ca.uhn.fhir.model.api.annotation.Block;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseOperationOutcome;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueType;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueSeverity;
import org.hl7.fhir.android.generated.dstu2.OperationOutcomeEnum.IssueSeverityEnumFactory;

/**
 * A collection of error, warning or information messages that result from a system action.
 */
@ResourceDef(name = "OperationOutcome", profile = "http://hl7.org/fhir/Profile/OperationOutcome")
public class OperationOutcome extends DomainResource implements IBaseOperationOutcome {

    @Block()
    public static class OperationOutcomeIssueComponent extends BackboneElement implements IBaseBackboneElement {

        /**
         * Indicates whether the issue indicates a variation from successful processing.
         */
        @Child(name = "severity", type = { CodeType.class }, order = 1, min = 1, max = 1, modifier = true, summary = true)
        @Description(shortDefinition = "fatal | error | warning | information", formalDefinition = "Indicates whether the issue indicates a variation from successful processing.")
        protected Enumeration<IssueSeverity> severity;

        /**
         * Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
         */
        @Child(name = "code", type = { CodeType.class }, order = 2, min = 1, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Error or warning code", formalDefinition = "Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.")
        protected Enumeration<IssueType> code;

        /**
         * Additional details about the error. This may be a text description of the error, or a system code that identifies the error.
         */
        @Child(name = "details", type = { CodeableConcept.class }, order = 3, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Additional details about the error", formalDefinition = "Additional details about the error. This may be a text description of the error, or a system code that identifies the error.")
        protected CodeableConcept details;

        /**
         * Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
         */
        @Child(name = "diagnostics", type = { StringType.class }, order = 4, min = 0, max = 1, modifier = false, summary = true)
        @Description(shortDefinition = "Additional diagnostic information about the issue", formalDefinition = "Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.")
        protected StringType diagnostics;

        /**
         * A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.
         */
        @Child(name = "location", type = { StringType.class }, order = 5, min = 0, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
        @Description(shortDefinition = "XPath of element(s) related to issue", formalDefinition = "A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.")
        protected List<StringType> location;

        private static final long serialVersionUID = 930165515L;

        /*
     * Constructor
     */
        public OperationOutcomeIssueComponent() {
            super();
        }

        /*
     * Constructor
     */
        public OperationOutcomeIssueComponent(Enumeration<IssueSeverity> severity, Enumeration<IssueType> code) {
            super();
            this.severity = severity;
            this.code = code;
        }

        /**
         * @return {@link #severity} (Indicates whether the issue indicates a variation from successful processing.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
         */
        public Enumeration<IssueSeverity> getSeverityElement() {
            if (this.severity == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create OperationOutcomeIssueComponent.severity");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.severity = new Enumeration<IssueSeverity>(new IssueSeverityEnumFactory());
            return this.severity;
        }

        public boolean hasSeverityElement() {
            return this.severity != null && !this.severity.isEmpty();
        }

        public boolean hasSeverity() {
            return this.severity != null && !this.severity.isEmpty();
        }

        /**
         * @param value {@link #severity} (Indicates whether the issue indicates a variation from successful processing.). This is the underlying object with id, value and extensions. The accessor "getSeverity" gives direct access to the value
         */
        public OperationOutcomeIssueComponent setSeverityElement(Enumeration<IssueSeverity> value) {
            this.severity = value;
            return this;
        }

        /**
         * @return Indicates whether the issue indicates a variation from successful processing.
         */
        public IssueSeverity getSeverity() {
            return this.severity == null ? null : this.severity.getValue();
        }

        /**
         * @param value Indicates whether the issue indicates a variation from successful processing.
         */
        public OperationOutcomeIssueComponent setSeverity(IssueSeverity value) {
            if (this.severity == null)
                this.severity = new Enumeration<IssueSeverity>(new IssueSeverityEnumFactory());
            this.severity.setValue(value);
            return this;
        }

        /**
         * @return {@link #code} (Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public Enumeration<IssueType> getCodeElement() {
            if (this.code == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create OperationOutcomeIssueComponent.code");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.code = new Enumeration<IssueType>(new IssueTypeEnumFactory());
            return this.code;
        }

        public boolean hasCodeElement() {
            return this.code != null && !this.code.isEmpty();
        }

        public boolean hasCode() {
            return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.). This is the underlying object with id, value and extensions. The accessor "getCode" gives direct access to the value
         */
        public OperationOutcomeIssueComponent setCodeElement(Enumeration<IssueType> value) {
            this.code = value;
            return this;
        }

        /**
         * @return Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
         */
        public IssueType getCode() {
            return this.code == null ? null : this.code.getValue();
        }

        /**
         * @param value Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.
         */
        public OperationOutcomeIssueComponent setCode(IssueType value) {
            if (this.code == null)
                this.code = new Enumeration<IssueType>(new IssueTypeEnumFactory());
            this.code.setValue(value);
            return this;
        }

        /**
         * @return {@link #details} (Additional details about the error. This may be a text description of the error, or a system code that identifies the error.)
         */
        public CodeableConcept getDetails() {
            if (this.details == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create OperationOutcomeIssueComponent.details");
                else if (Configuration.doAutoCreate())
                    // cc
                    this.details = new CodeableConcept();
            return this.details;
        }

        public boolean hasDetails() {
            return this.details != null && !this.details.isEmpty();
        }

        /**
         * @param value {@link #details} (Additional details about the error. This may be a text description of the error, or a system code that identifies the error.)
         */
        public OperationOutcomeIssueComponent setDetails(CodeableConcept value) {
            this.details = value;
            return this;
        }

        /**
         * @return {@link #diagnostics} (Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.). This is the underlying object with id, value and extensions. The accessor "getDiagnostics" gives direct access to the value
         */
        public StringType getDiagnosticsElement() {
            if (this.diagnostics == null)
                if (Configuration.errorOnAutoCreate())
                    throw new Error("Attempt to auto-create OperationOutcomeIssueComponent.diagnostics");
                else if (Configuration.doAutoCreate())
                    // bb
                    this.diagnostics = new StringType();
            return this.diagnostics;
        }

        public boolean hasDiagnosticsElement() {
            return this.diagnostics != null && !this.diagnostics.isEmpty();
        }

        public boolean hasDiagnostics() {
            return this.diagnostics != null && !this.diagnostics.isEmpty();
        }

        /**
         * @param value {@link #diagnostics} (Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.). This is the underlying object with id, value and extensions. The accessor "getDiagnostics" gives direct access to the value
         */
        public OperationOutcomeIssueComponent setDiagnosticsElement(StringType value) {
            this.diagnostics = value;
            return this;
        }

        /**
         * @return Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
         */
        public String getDiagnostics() {
            return this.diagnostics == null ? null : this.diagnostics.getValue();
        }

        /**
         * @param value Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.
         */
        public OperationOutcomeIssueComponent setDiagnostics(String value) {
            if (Utilities.noString(value))
                this.diagnostics = null;
            else {
                if (this.diagnostics == null)
                    this.diagnostics = new StringType();
                this.diagnostics.setValue(value);
            }
            return this;
        }

        /**
         * @return {@link #location} (A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.)
         */
        public List<StringType> getLocation() {
            if (this.location == null)
                this.location = new ArrayList<StringType>();
            return this.location;
        }

        public boolean hasLocation() {
            if (this.location == null)
                return false;
            for (StringType item : this.location) if (!item.isEmpty())
                return true;
            return false;
        }

        /**
         * @return {@link #location} (A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.)
         */
        // syntactic sugar
        public StringType addLocationElement() {
            // 2
            StringType t = new StringType();
            if (this.location == null)
                this.location = new ArrayList<StringType>();
            this.location.add(t);
            return t;
        }

        /**
         * @param value {@link #location} (A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.)
         */
        public OperationOutcomeIssueComponent addLocation(String value) {
            // 1
            StringType t = new StringType();
            t.setValue(value);
            if (this.location == null)
                this.location = new ArrayList<StringType>();
            this.location.add(t);
            return this;
        }

        /**
         * @param value {@link #location} (A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.)
         */
        public boolean hasLocation(String value) {
            if (this.location == null)
                return false;
            for (StringType v : this.location) if (// string
            v.equals(value))
                return true;
            return false;
        }

        protected void listChildren(List<Property> childrenList) {
            super.listChildren(childrenList);
            childrenList.add(new Property("severity", "code", "Indicates whether the issue indicates a variation from successful processing.", 0, java.lang.Integer.MAX_VALUE, severity));
            childrenList.add(new Property("code", "code", "Describes the type of the issue. The system that creates an OperationOutcome SHALL choose the most applicable code from the IssueType value set, and may additional provide its own code for the error in the details element.", 0, java.lang.Integer.MAX_VALUE, code));
            childrenList.add(new Property("details", "CodeableConcept", "Additional details about the error. This may be a text description of the error, or a system code that identifies the error.", 0, java.lang.Integer.MAX_VALUE, details));
            childrenList.add(new Property("diagnostics", "string", "Additional diagnostic information about the issue.  Typically, this may be a description of how a value is erroneous, or a stack dump to help trace the issue.", 0, java.lang.Integer.MAX_VALUE, diagnostics));
            childrenList.add(new Property("location", "string", "A simple XPath limited to element names, repetition indicators and the default child access that identifies one of the elements in the resource that caused this issue to be raised.", 0, java.lang.Integer.MAX_VALUE, location));
        }

        @Override
        public void setProperty(String name, Base value) throws FHIRException {
            if (name.equals("severity"))
                // Enumeration<IssueSeverity>
                this.severity = new IssueSeverityEnumFactory().fromType(value);
            else if (name.equals("code"))
                // Enumeration<IssueType>
                this.code = new IssueTypeEnumFactory().fromType(value);
            else if (name.equals("details"))
                // CodeableConcept
                this.details = castToCodeableConcept(value);
            else if (name.equals("diagnostics"))
                // StringType
                this.diagnostics = castToString(value);
            else if (name.equals("location"))
                this.getLocation().add(castToString(value));
            else
                super.setProperty(name, value);
        }

        @Override
        public Base addChild(String name) throws FHIRException {
            if (name.equals("severity")) {
                throw new FHIRException("Cannot call addChild on a primitive type OperationOutcome.severity");
            } else if (name.equals("code")) {
                throw new FHIRException("Cannot call addChild on a primitive type OperationOutcome.code");
            } else if (name.equals("details")) {
                this.details = new CodeableConcept();
                return this.details;
            } else if (name.equals("diagnostics")) {
                throw new FHIRException("Cannot call addChild on a primitive type OperationOutcome.diagnostics");
            } else if (name.equals("location")) {
                throw new FHIRException("Cannot call addChild on a primitive type OperationOutcome.location");
            } else
                return super.addChild(name);
        }

        public OperationOutcomeIssueComponent copy() {
            OperationOutcomeIssueComponent dst = new OperationOutcomeIssueComponent();
            copyValues(dst);
            dst.severity = severity == null ? null : severity.copy();
            dst.code = code == null ? null : code.copy();
            dst.details = details == null ? null : details.copy();
            dst.diagnostics = diagnostics == null ? null : diagnostics.copy();
            if (location != null) {
                dst.location = new ArrayList<StringType>();
                for (StringType i : location) dst.location.add(i.copy());
            }
            ;
            return dst;
        }

        @Override
        public boolean equalsDeep(Base other) {
            if (!super.equalsDeep(other))
                return false;
            if (!(other instanceof OperationOutcomeIssueComponent))
                return false;
            OperationOutcomeIssueComponent o = (OperationOutcomeIssueComponent) other;
            return compareDeep(severity, o.severity, true) && compareDeep(code, o.code, true) && compareDeep(details, o.details, true) && compareDeep(diagnostics, o.diagnostics, true) && compareDeep(location, o.location, true);
        }

        @Override
        public boolean equalsShallow(Base other) {
            if (!super.equalsShallow(other))
                return false;
            if (!(other instanceof OperationOutcomeIssueComponent))
                return false;
            OperationOutcomeIssueComponent o = (OperationOutcomeIssueComponent) other;
            return compareValues(severity, o.severity, true) && compareValues(code, o.code, true) && compareValues(diagnostics, o.diagnostics, true) && compareValues(location, o.location, true);
        }

        public boolean isEmpty() {
            return super.isEmpty() && (severity == null || severity.isEmpty()) && (code == null || code.isEmpty()) && (details == null || details.isEmpty()) && (diagnostics == null || diagnostics.isEmpty()) && (location == null || location.isEmpty());
        }

        public String fhirType() {
            return "OperationOutcome.issue";
        }
    }

    /**
     * An error, warning or information message that results from a system action.
     */
    @Child(name = "issue", type = {}, order = 0, min = 1, max = Child.MAX_UNLIMITED, modifier = false, summary = true)
    @Description(shortDefinition = "A single issue associated with the action", formalDefinition = "An error, warning or information message that results from a system action.")
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

    @Override
    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("issue"))
            this.getIssue().add((OperationOutcomeIssueComponent) value);
        else
            super.setProperty(name, value);
    }

    @Override
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

    @Override
    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof OperationOutcome))
            return false;
        OperationOutcome o = (OperationOutcome) other;
        return compareDeep(issue, o.issue, true);
    }

    @Override
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

    @Override
    public ResourceType getResourceType() {
        return ResourceType.OperationOutcome;
    }
}
