package Day_1.DefanginganIpAddress;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
