public abstract class Member {
    public Member(String firstName, String lastName, String memberId, int age, double height, double weight, String membershipType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberId = memberId;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.membershipType = membershipType;
    }

    public String  firstName;
    public String  lastName;
    public String  memberId; // standard members"SD", Premium member id starts with "PD",
                             // chars are going to be random digits(total = 20 characters)
    public int age;
    public double height;
    public double weight;
    public String membershipType; // Standard and Premium

    public abstract void workingOut(String duration);
    public abstract void scanning();
    public abstract void buyingProducts(double money); // depending on the membership, there can be %50 discount

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}
