public class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Boolean purchaseParkingPass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPurchaseParkingPass() {
        return purchaseParkingPass;
    }

    public void setPurchaseParkingPass(Boolean purchaseParkingPass) {
        this.purchaseParkingPass = purchaseParkingPass;
    }

    class Address {
        private String street;
        private String city;
        private String state;
        private String postalCode;
        private String country;
        private Boolean validate;
        private String outputAsLabel;

        public String getStreet() {

            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostalCode() {
            return postalCode;
        }

        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public Boolean getValidate() {
            return validate;
        }

        public void setValidate(Boolean validate) {
            this.validate = validate;
        }

        public String getOutputAsLabel() {
            return outputAsLabel;
        }

        public void setOutputAsLabel(String outputAsLabel) {
            this.outputAsLabel = outputAsLabel;
        }
    }
}
