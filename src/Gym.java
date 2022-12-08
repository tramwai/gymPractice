import java.util.Random;

public class Gym {

    public static void main(String[] args) {

//        // 3 standard members
//        for (int i = 0; i < 3; i++) {
//            StandardMember member = StandardMember.getStandardMember();
//            // scan the member
//            member.scanning();
//            // let them workout
//           member.workingOut("30 minutes");
//            // make them buy products
//            member.buyingProducts(20.0);
//            // print the standard member
//            System.out.println(member);
//            System.out.println("==============================");
//        }
//        // 3 premium members
//        for (int i = 0; i < 3; i++) {
//            PremiumMember member = PremiumMember.getPremiumMember();
//            // scan the member
//            member.scanning();
//            // let them workout
//            member.workingOut("30 minutes");
//            // make them buy products
//            member.buyingProducts(20.0);
//            // get massage
//            member.getMassage("Gorilla", "Pounding");
//            // get tanned
//            member.getTanned("10 min", "Light");
//            // print the standard member
//            System.out.println(member);
//            System.out.println("==============================");
//        }


        // create 5 random members(standard or premium)  Use random number (0, 1)
        for (int i = 0; i < 5; i++) {
            int random01 = GeneratorUtils.getRandomNumber(0, 1);
            if (random01 == 0){
                StandardMember standardMember = StandardMember.getStandardMember();
                standardMember.scanning();
                standardMember.workingOut("35 minutes");
                standardMember.buyingProducts(30.5);
                System.out.println(standardMember);

            }else {
                PremiumMember premiumMember = PremiumMember.getPremiumMember();
                premiumMember.scanning();
                premiumMember.workingOut("1 hour 30 minutes");
                premiumMember.buyingProducts(50.55);
                premiumMember.getMassage("full body", "Medium");
                premiumMember.getTanned("10 minutes", "light");
                System.out.println(premiumMember);

            }
            System.out.println("============================");
        }
        // scan the member(modify)
        // let them workout
        // if the duration is 30 min or lower -> not a good workout
        // if the duration is between 30 min and 1 hour -> not bad
        // if the duration is more than 1 hour -> Beast mode
        // duration examples 30 minutes, 25 minutes, 1 hour 34 minutes
        // make them buy products
        // get massage(if it is a premium member)
        // get tanned(if it is a premium member)
        // print the member


    }

}
