class Solution {
    public String countAndSay(int n) {
        if (n < 1) 
			return "";
		String res = "1";
		while (n > 1) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < res.length(); i++) {
				int count = 1;
				while (i + 1 < res.length() && res.charAt(i) == res.charAt(i + 1)) {
					count++;
					i++;
				}
				sb.append(count).append(res.charAt(i));
			}
			res = sb.toString();
			n--;
		}
        return res;
    }
}