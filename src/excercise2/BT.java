package excercise2;

public class BT implements MoneyProvider{
    private static final String NAME_OF_PROVIDER = "BT";
    private Integer amountToWithdraw;
    private Integer amountToDeposit;

    public BT(Integer amountToWithdraw, Integer amountToDeposit) {
        this.amountToWithdraw = amountToWithdraw;
        this.amountToDeposit = amountToDeposit;
    }

    public Integer getAmountToWithdraw() {
        return amountToWithdraw;
    }

    public Integer getAmountToDeposit() {
        return amountToDeposit;
    }

    @Override
    public String getName() {
        return NAME_OF_PROVIDER;
    }

    @Override
    public Integer withdrawAmount() {
        return amountToWithdraw;
    }

    @Override
    public Integer depositAmount() {
        return amountToDeposit;
    }
}
