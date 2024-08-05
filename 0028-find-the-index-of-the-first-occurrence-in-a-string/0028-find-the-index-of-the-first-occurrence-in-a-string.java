class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length())
        {
            return -1;
        }
        char needfirstchar  = needle.charAt(0);
        for (int i = 0 ; i < haystack.length(); i++)
        {
            char hay = haystack.charAt(i);
            if (hay == needfirstchar && i + needle.length() <= haystack.length()  )
            {
                String s = haystack.substring(i,i + needle.length());
                boolean x  = s.equals(needle);
                if (x == true)
                {
                    return i;
                }
            }
            
        }
        return -1;
    }
}