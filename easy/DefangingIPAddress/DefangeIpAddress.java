// PS :https://leetcode.com/problems/defanging-an-ip-address/submissions/
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}