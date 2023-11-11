package excercise2;

public class ING implements MoneyProvider{

    private static final String NAME_OF_PROVIDER = "ING";
    private Integer amountToWithdraw;
    private Integer amountToDeposit;

    public ING(Integer amountToWithdraw, Integer amountToDeposit) {
        this.amountToWithdraw = amountToWithdraw;
        this.amountToDeposit = amountToDeposit;
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
