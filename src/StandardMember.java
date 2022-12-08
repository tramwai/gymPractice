public class StandardMember extends Member{

    public StandardMember(String firstName, String lastName, String memberId, int age, double height, double weight, String membershipType) {
        super(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    public static final String membershipType = "Standard";
    @Override
    public void workingOut(String duration) {
        System.out.println("Standard member is working out for " + duration + ".");
        // duration = xx hour xx minutes || xx minutes

        if (duration.toLowerCase().contains("hour")){
            System.out.println("Beast Mode!");
        } else {
            int mins = Integer.parseInt(duration.substring(0, duration.indexOf(" ")));
            if (mins <= 30) {
                System.out.println("Not a good workout");
            }else {
                System.out.println("Not Bad");
            }
        }
    }

    @Override
    public void scanning() {
        System.out.println("Welcome " + firstName + " " + lastName + "!" +
                "\nMembership type = " + membershipType);
    }

    @Override
    public void buyingProducts(double money) {
        System.out.println("Amount due = " + money +
                "\nYou don't have any discounts!");
    }

    public static StandardMember getStandardMember(){
        String firstName = Values.firstNames.get(GeneratorUtils.getRandomNumber(0, Values.firstNames.size() - 1));
        String lastName = Values.lastNames.get(GeneratorUtils.getRandomNumber(0, Values.lastNames.size() - 1));
        String memberId = GeneratorUtils.getMemberId(membershipType);
        int age = GeneratorUtils.getAge();
        double height = GeneratorUtils.getHeight();
        double weight = GeneratorUtils.getWeight();

        return new StandardMember(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    public static void main(String[] args) {
        getStandardMember().workingOut("1 hour 20 minutes");
        getStandardMember().workingOut("20 minutes");
        getStandardMember().workingOut("40 minutes");
    }
}
