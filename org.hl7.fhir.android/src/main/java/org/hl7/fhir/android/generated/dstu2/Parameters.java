package org.hl7.fhir.android.generated.dstu2;

import java.util.ArrayList;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.instance.model.api.IBaseParameters;
import org.hl7.fhir.exceptions.FHIRException;

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
 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
 */
public class Parameters extends Resource implements IBaseParameters {

    /**
     * A parameter passed to or received from the operation.
     */
    protected List<ParametersParameterComponent> parameter;

    private static final long serialVersionUID = -1495940293L;

    /*
   * Constructor
   */
    public Parameters() {
        super();
    }

    /**
     * @return {@link #parameter} (A parameter passed to or received from the operation.)
     */
    public List<ParametersParameterComponent> getParameter() {
        if (this.parameter == null)
            this.parameter = new ArrayList<ParametersParameterComponent>();
        return this.parameter;
    }

    public boolean hasParameter() {
        if (this.parameter == null)
            return false;
        for (ParametersParameterComponent item : this.parameter) if (!item.isEmpty())
            return true;
        return false;
    }

    /**
     * @return {@link #parameter} (A parameter passed to or received from the operation.)
     */
    // syntactic sugar
    public ParametersParameterComponent addParameter() {
        // 3
        ParametersParameterComponent t = new ParametersParameterComponent();
        if (this.parameter == null)
            this.parameter = new ArrayList<ParametersParameterComponent>();
        this.parameter.add(t);
        return t;
    }

    // syntactic sugar
    public Parameters addParameter(ParametersParameterComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.parameter == null)
            this.parameter = new ArrayList<ParametersParameterComponent>();
        this.parameter.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("parameter", "", "A parameter passed to or received from the operation.", 0, java.lang.Integer.MAX_VALUE, parameter));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("parameter"))
            this.getParameter().add((ParametersParameterComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("parameter")) {
            return addParameter();
        } else
            return super.addChild(name);
    }

    public String fhirType() {
        return "Parameters";
    }

    public Parameters copy() {
        Parameters dst = new Parameters();
        copyValues(dst);
        if (parameter != null) {
            dst.parameter = new ArrayList<ParametersParameterComponent>();
            for (ParametersParameterComponent i : parameter) dst.parameter.add(i.copy());
        }
        ;
        return dst;
    }

    protected Parameters typedCopy() {
        return copy();
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof Parameters))
            return false;
        Parameters o = (Parameters) other;
        return compareDeep(parameter, o.parameter, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof Parameters))
            return false;
        Parameters o = (Parameters) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (parameter == null || parameter.isEmpty());
    }

    public ResourceType getResourceType() {
        return ResourceType.Parameters;
    }
}
