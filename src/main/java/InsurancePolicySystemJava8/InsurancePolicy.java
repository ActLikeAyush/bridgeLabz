package InsurancePolicySystemJava8;

public class InsurancePolicy {
    private String policyNumber;
    private String holderName;
    private double premiumAmount;

    public InsurancePolicy(String policyNumber, String holderName, double premiumAccount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.premiumAmount = premiumAccount;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getHolderName() {
        return holderName;
    }


}
