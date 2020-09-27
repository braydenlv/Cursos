class Driver extends Account{

    String typeLicense;

    public Driver(String name, String document, String typeLicense) {
        super(name, document);
        this.typeLicense=typeLicense;
    }

    
}
