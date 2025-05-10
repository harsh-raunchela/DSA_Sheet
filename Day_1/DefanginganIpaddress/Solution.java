package Day_1.DefanginganIpaddress;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
