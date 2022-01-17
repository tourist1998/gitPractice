package Module;

public class Person {
    private String Name;
    private String MobNo;
    private Address address;
    public static class PersonBuilder {
        private String Name;
        private String MobNo;
        private Address Address;
        public PersonBuilder setName(String Name) {
                this.Name = Name;
                return this;
        }
        public PersonBuilder setMobNo(String MobNo) {
            this.MobNo = MobNo;
            return this;
        }
        public PersonBuilder setAddress(Address Address) {
            this.Address = Address;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
    private Person(PersonBuilder personBuilder) {
        this.address = personBuilder.Address;
        this.MobNo = personBuilder.MobNo;
        this.Name = personBuilder.Name;
    }
    String getName() {
        return this.Name;
    }
    String getMobNo() {
        return this.MobNo;
    }
    Address getAddress() {
        return this.address;
    }
}
