public class User {
    public User(String name) {
    }

    public static class Address {
        private String city;
        private String state;
        private String zipCode;

        public Address(String city, String state, String zipCode) {
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        public void displayAddress() {
            System.out.println("City: " + city + ", State: " + state + ", Zip Code: " + zipCode);
        }

        public String getName() {
            return getName();
        }
    }
}