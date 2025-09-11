package review;

public enum AuthGrade {
    GUEST(1,"손님"),
    MANAGER(2,"매니져"),
    ADMIN(3,"최고관리자");
    private final int level;
    private final String desc;

    AuthGrade(int level, String desc) {
        this.level = level;
        this.desc = desc;
    }

    public int getLevel() {
        return level;
    }

    public String getDesc() {
        return desc;
    }
}
