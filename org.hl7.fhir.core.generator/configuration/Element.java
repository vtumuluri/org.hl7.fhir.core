 @Override
  public String getIdBase() {
    return getId();
  }
  
  @Override
  public void setIdBase(String value) {
    setId(value);
  }
  
  public void addExtension(String url, DataType value) {
    if (disallowExtensions)
      throw new Error("Extensions are not allowed in this context");
    Extension ex = new Extension();
    ex.setUrl(url);
    ex.setValue(value);
    getExtension().add(ex);    
  }

 
  /**
   * Returns an extension if one (and only one) matches the given URL.
   * 
   * Note: BackbdoneElements override this to look in matching Modifier Extensions too
   * 
   * @param theUrl The URL. Must not be blank or null.
   * @return the matching extension, or null
   */
   public Extension getExtensionByUrl(String theUrl) {
     org.apache.commons.lang3.Validate.notBlank(theUrl, "theUrl must not be blank or null");
     ArrayList<Extension> retVal = new ArrayList<Extension>();
     for (Extension next : getExtension()) {
       if (theUrl.equals(next.getUrl())) {
         retVal.add(next);
       }
     }
     if (retVal.size() == 0)
       return null;
     else {
       org.apache.commons.lang3.Validate.isTrue(retVal.size() == 1, "Url "+theUrl+" must have only one match");
       return retVal.get(0);
     }
   }
  
   /**
    * Remove any extensions that match (by given URL).
    * 
    * Note: BackbdoneElements override this to remove from Modifier Extensions too
    * 
    * @param theUrl The URL. Must not be blank or null.
    */
   public void removeExtension(String theUrl) {
     for (int i = getExtension().size()-1; i >= 0; i--) {
       if (theUrl.equals(getExtension().get(i).getUrl()))
         getExtension().remove(i);
     }
   }
   
   /**
    * This is used in the FHIRPath engine to record that no extensions are allowed for this item in the context in which it is used.
    * todo: enforce this....
    */
    private boolean disallowExtensions;

    public boolean isDisallowExtensions() {
      return disallowExtensions;
    }

    public Element setDisallowExtensions(boolean disallowExtensions) {
      this.disallowExtensions = disallowExtensions;
      return this;
    }

    public Element noExtensions() {
      this.disallowExtensions = true;
      return this;
    }
  
   /**
    * Returns an unmodifiable list containing all extensions on this element which 
    * match the given URL.
    * 
    * Note: BackbdoneElements override this to add matching Modifier Extensions too
    * 
    * @param theUrl The URL. Must not be blank or null.
    * @return an unmodifiable list containing all extensions on this element which match the given URL
    */
   public List<Extension> getExtensionsByUrl(String theUrl) {
     org.apache.commons.lang3.Validate.notBlank(theUrl, "theUrl must not be blank or null");
     ArrayList<Extension> retVal = new ArrayList<Extension>();
     for (Extension next : getExtension()) {
       if (theUrl.equals(next.getUrl())) {
         retVal.add(next);
       }
     }
     return java.util.Collections.unmodifiableList(retVal);
   }
   
   /**
    * Returns an true if this element has an extension that matchs the given URL.
    * 
    * Note: BackbdoneElements override this to check Modifier Extensions too
    * 
    * @param theUrl The URL. Must not be blank or null.
    */
   public boolean hasExtension(String theUrl) {
     return !getExtensionsByUrl(theUrl).isEmpty(); 
   }

   /**
    * Returns the value as a string if this element has only one extension that matches the given URL, and that can be converted to a string.
    * 
    * Note: BackbdoneElements override this to check Modifier Extensions too
    * 
    * @param theUrl The URL. Must not be blank or null.
    */
  public String getExtensionString(String theUrl) throws FHIRException {
    List<Extension> ext = getExtensionsByUrl(theUrl); 
    if (ext.isEmpty()) 
      return null; 
    if (ext.size() > 1) 
      throw new FHIRException("Multiple matching extensions found");
    if (!ext.get(0).getValue().isPrimitive())
      throw new FHIRException("Extension could not be converted to a string");
    return ext.get(0).getValue().primitiveValue();
  }
