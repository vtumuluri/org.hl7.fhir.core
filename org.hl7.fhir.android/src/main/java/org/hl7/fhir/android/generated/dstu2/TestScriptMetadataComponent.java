package org.hl7.fhir.android.generated.dstu2;

// Generated on Wed, Jul 13, 2016 05:32+1000 for FHIR v1.0.2
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatus;
import org.hl7.fhir.android.generated.dstu2.EnumerationsEnum.ConformanceResourceStatusEnumFactory;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionOperatorType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionDirectionType;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypesEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.AssertionResponseTypes;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentTypeEnumFactory;
import org.hl7.fhir.android.generated.dstu2.TestScriptEnum.ContentType;

public class TestScriptMetadataComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * A link to the FHIR specification that this test is covering.
     */
    protected List<TestScriptMetadataLinkComponent> link;

    /**
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     */
    protected List<TestScriptMetadataCapabilityComponent> capability;

    private static final long serialVersionUID = 745183328L;

    /*
     * Constructor
     */
    public TestScriptMetadataComponent() {
        super();
    }

    /**
     * @return {@link #link} (A link to the FHIR specification that this test is covering.)
     */
    public List<TestScriptMetadataLinkComponent> getLink() {
        if (this.link == null)
            this.link = new ArrayList<TestScriptMetadataLinkComponent>();
        return this.link;
    }

    public boolean hasLink() {
        if (this.link == null)
            return false;
        for (TestScriptMetadataLinkComponent item : this.link) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptMetadataLinkComponent addLink() {
        // 3
        TestScriptMetadataLinkComponent t = new TestScriptMetadataLinkComponent();
        if (this.link == null)
            this.link = new ArrayList<TestScriptMetadataLinkComponent>();
        this.link.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptMetadataComponent addLink(TestScriptMetadataLinkComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.link == null)
            this.link = new ArrayList<TestScriptMetadataLinkComponent>();
        this.link.add(t);
        return this;
    }

    /**
     * @return {@link #capability} (Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.)
     */
    public List<TestScriptMetadataCapabilityComponent> getCapability() {
        if (this.capability == null)
            this.capability = new ArrayList<TestScriptMetadataCapabilityComponent>();
        return this.capability;
    }

    public boolean hasCapability() {
        if (this.capability == null)
            return false;
        for (TestScriptMetadataCapabilityComponent item : this.capability) if (!item.isEmpty())
            return true;
        return false;
    }

    // syntactic sugar
    public TestScriptMetadataCapabilityComponent addCapability() {
        // 3
        TestScriptMetadataCapabilityComponent t = new TestScriptMetadataCapabilityComponent();
        if (this.capability == null)
            this.capability = new ArrayList<TestScriptMetadataCapabilityComponent>();
        this.capability.add(t);
        return t;
    }

    // syntactic sugar
    public TestScriptMetadataComponent addCapability(TestScriptMetadataCapabilityComponent t) {
        // 3
        if (t == null)
            return this;
        if (this.capability == null)
            this.capability = new ArrayList<TestScriptMetadataCapabilityComponent>();
        this.capability.add(t);
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("link", "", "A link to the FHIR specification that this test is covering.", 0, java.lang.Integer.MAX_VALUE, link));
        childrenList.add(new Property("capability", "", "Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.", 0, java.lang.Integer.MAX_VALUE, capability));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("link"))
            this.getLink().add((TestScriptMetadataLinkComponent) value);
        else if (name.equals("capability"))
            this.getCapability().add((TestScriptMetadataCapabilityComponent) value);
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("link")) {
            return addLink();
        } else if (name.equals("capability")) {
            return addCapability();
        } else
            return super.addChild(name);
    }

    public TestScriptMetadataComponent copy() {
        TestScriptMetadataComponent dst = new TestScriptMetadataComponent();
        copyValues(dst);
        if (link != null) {
            dst.link = new ArrayList<TestScriptMetadataLinkComponent>();
            for (TestScriptMetadataLinkComponent i : link) dst.link.add(i.copy());
        }
        ;
        if (capability != null) {
            dst.capability = new ArrayList<TestScriptMetadataCapabilityComponent>();
            for (TestScriptMetadataCapabilityComponent i : capability) dst.capability.add(i.copy());
        }
        ;
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof TestScriptMetadataComponent))
            return false;
        TestScriptMetadataComponent o = (TestScriptMetadataComponent) other;
        return compareDeep(link, o.link, true) && compareDeep(capability, o.capability, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof TestScriptMetadataComponent))
            return false;
        TestScriptMetadataComponent o = (TestScriptMetadataComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (link == null || link.isEmpty()) && (capability == null || capability.isEmpty());
    }

    public String fhirType() {
        return "TestScript.metadata";
    }
}
