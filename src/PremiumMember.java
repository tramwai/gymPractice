public class PremiumMember extends Member implements MassageBed, TanningBed{
    public PremiumMember(String firstName, String lastName, String memberId, int age, double height, double weight, String membershipType) {
        super(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    public static final String membershipType = "Premium";
    @Override
    public void workingOut(String duration) {
        System.out.println("Premium member is working out for " + duration + ".");

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
                "\nYou do have % 50 discount!");
    }


    public static PremiumMember getPremiumMember(){
        String firstName = Values.firstNames.get(GeneratorUtils.getRandomNumber(0, Values.firstNames.size() - 1));
        String lastName = Values.lastNames.get(GeneratorUtils.getRandomNumber(0, Values.lastNames.size() - 1));
        String memberId = GeneratorUtils.getMemberId(membershipType);
        int age = GeneratorUtils.getAge();
        double height = GeneratorUtils.getHeight();
        double weight = GeneratorUtils.getWeight();

        return new PremiumMember(firstName, lastName, memberId, age, height, weight, membershipType);
    }

    public static void main(String[] args) {
        System.out.println(getPremiumMember());
        System.out.println();
        System.out.println(getPremiumMember());
        System.out.println();
        System.out.println(getPremiumMember());
    }

    @Override
    public void getMassage(String type, String intensity) {
        System.out.println("Type of the massage = " + type + "\nIntensity of the massage = " + intensity);
    }

    @Override
    public void getTanned(String duration, String shade) {
        System.out.println("Duration = " + duration + "\nShade chosen = " + shade);
    }
}
