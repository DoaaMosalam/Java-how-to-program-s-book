package MakkingDifferent;

public class Emergency  {
    private String name;
    private String address;
    private String phoneNumber;
    private String pSAP;

    // default constructor non_argument.
//    public Emergency(){
//
//    }

    public Emergency(String name, String address, String phoneNumber, String pSAP) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pSAP = pSAP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getpSAP() {
        return pSAP;
    }

    public void setpSAP(String pSAP) {
        this.pSAP = pSAP;
    }

    @Override
    public String toString() {
        return "Emergency{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pSAP='" + pSAP + '\'' +
                '}';
    }
}
