package String;

import java.util.*;

public class Group_anagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sort = new String (chars);

            if(!map.containsKey(sort)){
                map.put(sort,new ArrayList<>());
            }

            map.get(sort).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Group_anagram obj = new Group_anagram();

        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
