package Factory;

public class GetIspFactory {
    public ISP getInternetPlan(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("SMALL")) {
            return new smallInternetPlan();
        } else if (type.equalsIgnoreCase("MEDIUM")) {
            return new mediumInternetPlan();
        } else if (type.equalsIgnoreCase("BIG")) {
            return new bigInternetPlan();
        }
        return null;
    }
}
