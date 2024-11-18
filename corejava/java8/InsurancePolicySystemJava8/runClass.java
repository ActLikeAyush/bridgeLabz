package InsurancePolicySystemJava8;

import java.security.Policy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Double.sum;

public class runClass {
    public static void main(String[] args) {
        List<InsurancePolicy> policies= Arrays.asList(
                new InsurancePolicy("P1002", "b", 900),
                new InsurancePolicy("P1003", "c", 2200),
                new InsurancePolicy("P1001", "a", 1500),
                new InsurancePolicy("P1004", "d", 1300)
        );



        System.out.println(" filter and retrieve a" +
                " list of policies with a premium amount greater than $1,200.");
        List<InsurancePolicy> IP=policies.stream()
                .filter(i->i.getPremiumAmount()>1200)
                .collect(Collectors.toList());

        for(InsurancePolicy obj:IP){
            System.out.println("name: "+obj.getHolderName() +" Premium is: "+obj.getPremiumAmount());


            System.out.println(" sort the policies\n" +
                    " alphabetically by the holder's name.");

            List<InsurancePolicy> IP1=policies.stream()
                    .sorted(Comparator.comparing(p->p.getHolderName()))
                    .collect(Collectors.toList());
            for(InsurancePolicy i:IP1){
                System.out.println("Policy Holder Name: "+i.getHolderName());
            }

            System.out.println("//////////");
            double totalPremium = policies.stream()
                    .map(i->i.getPremiumAmount())
                    .reduce(0.0,(a,b)->a+b);

            System.out.println("Total Premium: $" + totalPremium);

            System.out.println(" print out the details of all policies in a" +
                    " formatted manner");
            policies.forEach(p-> System.out.println("Name: "+p.getHolderName()+", policey number: "+p.getPolicyNumber()+", PremiumAmount: "+p.getPremiumAmount()));
            System.out.println("o filter out policies where the premium amount is" +
                    " between $1,000 and $2,000");
            List<InsurancePolicy> ls=policies.stream()
                    .filter(i-> i.getPremiumAmount() >1000 && i.getPremiumAmount()<2000)
                    .collect(Collectors.toList());
            for(InsurancePolicy i:ls){
                System.out.println("name: "+i.getHolderName()+" , premium Account : $"+i.getPremiumAmount());
            }

            System.out.println(" identify the policy with the highest premium" +
                    " amount from a list of insurance policies.");
            InsurancePolicy ll=policies.stream()
                    .max(Comparator.comparing(InsurancePolicy::getPremiumAmount))
                    .orElse(null);
            System.out.println(ll.getHolderName()+" "+ll.getPremiumAmount());

            System.out.println(" insurance policies by premium amount in" +
                    " ascending order and print their details");
            List<InsurancePolicy> IPL=policies.stream()
                    .sorted(Comparator.comparing(p->p.getHolderName()))
                    .collect(Collectors.toList());
            for(InsurancePolicy i:IPL){
                System.out.println("Name: "+i.getHolderName()+", policey number: "+i.getPolicyNumber()+", PremiumAmount: "+i.getPremiumAmount());
            }



        }
    }
}
