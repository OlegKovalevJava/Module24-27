package enums;

public enum StudyProfile {

    INTERNATIONAL_LAW("Международное право"),
    HISTORY_OF_RUSSIA("История России"),
    BANKING("Банковское дело"),
    INSURANCE_BUSINESS("Страховое дело"),
    ENGLISH_LITERATURE("Английская литература");

    private final String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return this.profileName;
    }
}