package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetInternetPlan {
    public static void main(String[] args) throws IOException {
        GetIspFactory ispFactory = new GetIspFactory();
        System.out.println("Pick an internet plan (Small, Medium, Big): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String internetPlanName = reader.readLine();
        System.out.println("Insert number of moths: ");
        int numMonths = Integer.parseInt(reader.readLine());
        ISP internetPlan = ispFactory.getInternetPlan(internetPlanName);
        System.out.println("Monthly price for the " + internetPlanName + " plan is: ");
        internetPlan.getSpeed();
        internetPlan.calculatePrice(numMonths);

    }
}
