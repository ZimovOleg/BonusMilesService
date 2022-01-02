public class BonusMilesService {
    public int calculate (int price) {
        int payment = 20;
        int miles = price / payment;
        return miles;
    }
}
