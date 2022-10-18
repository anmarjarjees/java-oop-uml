package p03_encapsulation;

public class Member {
    // class fields should be private to enforce the idea of encapsulation:
    private String memberName;
    private String membershipType;

    // The Member constructor:
    public Member(String name, String type) {
        this.memberName = name;
        this.membershipType = type;
    }

    // Getter and Setter:

    // getter
    public String getMemName() {
        // return this.memberName;
        // OR:
        return memberName;
    }

    // getter
    public String getMemType() {
        // return this.memberType;
        // OR:
        return membershipType;
    }
}
