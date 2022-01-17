package com.company.day2;

public class day2 {

   /* Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.*/
    public static void reverseString(char[] s) {
    // Đối với bài này, nếu được dùng thêm bộ nhớ,
        // ta chỉ cần duyệt từ cuối, xong điền ngược lại là đc
        // tuy nhiên đối với bộ nhớ giới hạn, ta chỉ thay đổi trên mảng có sẵn
        // Lúc đấy ta đổi thứ tự chỗ của đầu tiên và cuối , lặp lại như thế cho đến hết

        int l=0;
        int r=s.length-1;
        while(l<r) {
            char term = s[l];
            s[l]=s[r];
            s[r]=term;
            l++;
            r--;
        }
        System.out.println(s);

    }


   /* Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
*/

    public static String  longestCommonPrefix(String[] strs) {
        //Ý tưởng bài này, ta sẽ gọi String ở vị trí đầu tiên là lính canh
        // sau đó kiểu tra lần lượt cái prefix chung đi qua từng chuối
        // sau khi nhân thấy nếu prefix empty lúc nào thì return lại empty
        // kết quả cuối cùng là  nhận được là prefix chung của tất các String
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }


//    Given an input string s, reverse the order of the words.
//
//    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
//
//    Return a string of the words in reverse order concatenated by a single space.
    public static String reverseWords(String s) {
        // Ý tưởng bài này là dùng 2 con trỏ duyệt các từ ngăn cách bởi dấu space
        // khi duyệt tới khoảng trắng, thì tiến hành add vào chuỗi từ i đến j
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if(s.charAt(i) == ' ') {
                i--;
            }
            else {
                int j = i;
                while(i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                if(sb.length()>0) {
                    sb.append(' ');
                }
                for(int k=i+1;k<=j;k++) {
                    sb.append(s.charAt(k));
                }
            }
        }


        return sb.toString();

    }





    public static void main(String[] args) {
        reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(reverseWords("hello minh la bao"));
    }

















































































}
