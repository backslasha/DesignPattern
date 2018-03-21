package example.phone_criterion;

public abstract class PhoneFactory {
    private static final int LEVEL_THOUSAND = 1000;
    private static final int LEVEL_MEDIUM = 2000;
    private static final int LEVEL_HIGH_END = 3000;
    private static final int LEVEL_LUXURY = 5000;

    public abstract Phone createThousandPhone();

    public abstract Phone createMediumPhone();

    public abstract Phone createHighEndPhone();

    public abstract Phone createLuxuryPhone();
}
