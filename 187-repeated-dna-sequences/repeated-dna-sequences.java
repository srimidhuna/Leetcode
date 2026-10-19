class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        Set<String> set = new HashSet<>();
        Set<String> Added = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        List<String> ans = new ArrayList<>();

        int n = s.length();
        int l = 0;

        while(l < n)
        {
            sb.append(s.charAt(l));

            if(sb.length() > 10)
            {
                sb.deleteCharAt(0);
            }

            if(sb.length() == 10)
            {
                String cur = sb.toString();

                if(set.contains(cur) && !Added.contains(cur))
                {
                    Added.add(cur);
                    ans.add(cur);
                }
                else
                {
                    set.add(cur);
                }
            }

            l++;
        }

        return ans;
    }
}