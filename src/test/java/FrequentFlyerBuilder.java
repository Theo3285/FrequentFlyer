import com.kata.tdd.domain.FrequentFlyer;

public class FrequentFlyerBuilder {
    private FrequentFlyer member;
    private String firstName = "John";
    private String lastName = "Doe";
    private String status = "Bronze";
    private int points = 0;
    private int earned = 0;

    public static FrequentFlyerBuilder aMember() {
        return new FrequentFlyerBuilder();
    }

    public FrequentFlyerBuilder named(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }

    public FrequentFlyerBuilder withStatus(String status) {
        this.status = status;
        return this;
    }

    public FrequentFlyerBuilder andPoints(int points) {
        this.points = points;
        return this;
    }

    public FrequentFlyerBuilder earned(int earnedPoints) {
        this.earned = earnedPoints;
        return this;
    }

    public FrequentFlyer build() {
        member = new FrequentFlyer(firstName, lastName, status);
        member.setPoints(points);
        member.earnsExtraPoints(earned);
        return member;
    }
}
